<script lang="ts" setup>
import { ErrorMessage, Field, Form } from 'vee-validate'
import * as yup from 'yup'
import type { Applicant } from '~/entity/Applicant'
import type { Company } from '~/entity/Company'
import type { Recruiter } from '~/entity/Recruiter'

const { user } = storeToRefs(useUserStore())
const company = ref(<Company>{
  address: '',
  description: '',
  email: '',
  name: '',
  phoneNumber: '',
})

function isRecruiter(user: Applicant | Recruiter | undefined): user is Recruiter{
  if (!user) {
    return false
  }
  return user.role == 'RECRUITER'
}

if (isRecruiter(user.value) && user.value.companyId) {
  await useHttp<Company>(`/company/${ user.value.companyId }`)
      .then(r => company.value = r)
      .catch(e => console.log(e))
}

const userSchema = yup.object({
  email: yup.string().email('Invalid email').required('This field is required'),
  fullName: yup.string().required('This field is required'),
  address: yup.string().required('This field is required'),
  phoneNumber: yup.string().required('This field is required'),
})
const companySchema = yup.object({
  email: yup.string().email('Invalid email').required('This field is required'),
  name: yup.string().required('This field is required'),
  address: yup.string().required('This field is required'),
  phoneNumber: yup.string().required('This field is required'),
})

function submit(){
  console.log(isRecruiter(user.value))
}

</script>

<template>
  <!--  Profile picture-->
  <div class="flex flex-col content-center space-y-4 my-5">
    <div class="text-5xl mx-auto">Profile</div>
    <ElementButtonUpdate class="mx-auto" @click="submit">Update</ElementButtonUpdate>
  </div>
  <!--  Information-->
  <div class="flex flex-row justify-center">
    <!--    Personal-->
    <div class="flex flex-col mx-20">
      <div class="flex flex-col space-y-3 justify-center my-5">
        <div class="mx-auto">Profile picture</div>
        <div class="h-36 w-36 bg-white mx-auto">
          <img alt="placeholder" src="#">
        </div>
        <element-button-secondary class="mx-auto">Change</element-button-secondary>
      </div>
      <div class="text-3xl">Personal Information</div>
      <div class="border-2 px-6 py-3">
        <Form :validation-schema="userSchema" class="flex flex-col" @submit.prevent="submit">
          <label for="email">Email:</label>
          <ErrorMessage class="text-red-500 text-xl" name="email"/>
          <Field v-model="user.email" class="text-black" name="email" placeholder="xyz@abc.com" type="text"/>
          <label for="fullName">Full Name:</label>
          <ErrorMessage class="text-red-500 text-xl" name="fullName"/>
          <Field v-model="user.fullName" class="text-black" name="fullName" placeholder="John Wick" type="text"/>
          <label for="address">Address:</label>
          <ErrorMessage class="text-red-500 text-xl" name="address"/>
          <Field v-model="user.address" class="text-black" name="address" placeholder="Somewhere Some-country"
                 type="text"/>
          <label for="phoneNumber">Phone Number:</label>
          <ErrorMessage class="text-red-500 text-xl" name="phoneNumber"/>
          <Field v-model="user.phoneNumber" class="text-black" name="phoneNumber" placeholder="0XXX-XXX-XXX"
                 type="text"/>
          <label for="description">Introduction:</label>
          <ErrorMessage class="text-red-500 text-xl" name="description"/>
          <textarea v-model="user.description" class="text-black" name="description" rows="2"></textarea>
        </Form>
      </div>
    </div>
    <!--    Company-->
    <div v-if="isRecruiter(user)" class="flex flex-col mx-20">
      <div class="flex flex-col space-y-3 my-5">
        <div class="mx-auto">Company Logo</div>
        <div class="h-36 w-36 bg-white mx-auto">
          <img alt="placeholder" src="#">
        </div>
        <element-button-secondary class="mx-auto">Change</element-button-secondary>
      </div>
      <div class="text-3xl">Company Information</div>
      <div class="border-2 px-6 py-3">
        <Form :validation-schema="companySchema" class="flex flex-col" @submit.prevent="submit">
          <label for="email">Email:</label>
          <ErrorMessage class="text-red-500 text-xl" name="email"/>
          <Field v-model="company.email" class="text-black" name="email" placeholder="xyz@abc.com" type="text"/>
          <label for="name">Company Name:</label>
          <ErrorMessage class="text-red-500 text-xl" name="name"/>
          <Field v-model="company.name" class="text-black" name="name" placeholder="ABC Software" type="text"/>
          <label for="address">Address:</label>
          <ErrorMessage class="text-red-500 text-xl" name="address"/>
          <Field v-model="company.address" class="text-black" name="address" placeholder="Somewhere Some-country"
                 type="text"/>
          <label for="phoneNumber">Phone Number:</label>
          <ErrorMessage class="text-red-500 text-xl" name="phoneNumber"/>
          <Field v-model="company.phoneNumber" class="text-black" name="phoneNumber" placeholder="0XXX-XXX-XXX"
                 type="text"/>
          <label for="description">Company Introduction:</label>
          <ErrorMessage class="text-red-500 text-xl" name="description"/>
          <textarea id="description" v-model="company.description" class="text-black" rows="2"></textarea>
        </Form>
      </div>
    </div>
  </div>
  <div class="min-h-28"></div>
</template>

<style scoped>

</style>