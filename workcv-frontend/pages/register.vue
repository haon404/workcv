<script lang="ts" setup>

definePageMeta({
  layout: false,
})

import { ErrorMessage, Field, Form } from 'vee-validate'
import * as yup from 'yup'

const schema = yup.object({
  email: yup.string().email('Invalid email').required('This field is required'),
  fullName: yup.string().required('This field is required'),
  password: yup.string().min(6, 'Password must be 6 or more characters').required('This field is required'),
  verifyPassword: yup.string().oneOf([ yup.ref('password') ], 'Password must match'),
})

const role = ref<string>()

async function submit(values: any){
  const { verifyPassword, ...fields } = values
  const user = { ...fields, role: role.value }
  
  await useHttp('/register', {
    method: 'POST',
    body: user,
    //   TODO: create popup showing successful/failed account creation
  }).then(r => {
    console.log(r)
    navigateTo('/login')
  })
      .catch(e => console.log(e.response._data))
}
</script>

<template>
  <div class="h-screen content-center">
    <h1 class="mb-10 text-center text-5xl">Register</h1>
    <Form
        :validation-schema="schema"
        class="mx-auto flex max-w-screen-sm flex-col border-4 px-6 py-3"
        @submit="submit"
    >
      <label for="email">Email:</label>
      <ErrorMessage class="text-red-500 text-xl" name="email"/>
      <Field class="text-black" name="email"/>
      <label for="fullName">Full name:</label>
      <ErrorMessage class="text-red-500 text-xl" name="fullName"/>
      <Field class="text-black" name="fullName" type="text"/>
      <label for="password">Password:</label>
      <ErrorMessage class="text-red-500 text-xl" name="password"/>
      <Field class="text-black" name="password" type="password"/>
      <label for="verifyPassword">Verify password:</label>
      <ErrorMessage class="text-red-500 text-xl" name="verifyPassword"/>
      <Field class="text-black" name="verifyPassword" type="password"/>
      <label for="role">Role:</label>
      <select v-model="role" class="py-2 text-black" name="role">
        <option value="APPLICANT">Applicant</option>
        <option value="RECRUITER">Recruiter</option>
      </select>
      <input
          class="my-5 w-1/4 border-4 text-center hover:cursor-pointer hover:border-green hover:text-green"
          type="submit"
          value="Submit"
      />
    </Form>
    <div class="text-center my-3">
      Already had an account?
      <NuxtLink class="text-green hover:text-purple hover:cursor-pointer" to="/login">Login
      </NuxtLink>
    </div>
  </div>
</template>

<style scoped>

</style>