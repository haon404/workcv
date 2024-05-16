<script lang="ts" setup>

definePageMeta({
  layout: false,
})

function submit(){
  console.log('submitted')
}
</script>

<template>
  <div class="h-screen content-center">
    <h1 class="mb-10 text-center text-5xl">Register</h1>
    <form
        class="mx-auto flex max-w-screen-sm flex-col border-4 px-6 py-3"
        @submit.prevent="submit"
    >
      <label for="email">Email:</label>
      <input class="text-black" name="email" type="text"/>
      <label for="name">Full name:</label>
      <input class="text-black" name="name" type="text"/>
      <label for="password">Password:</label>
      <input class="text-black" name="password" type="password"/>
      <label for="password">Verify password:</label>
      <input class="text-black" name="password" type="password"/>
      <label for="role">Role:</label>
      <select class="py-2 text-black" name="role">
        <option value="user">Applicant</option>
        <option value="recruiter">Recruiter</option>
      </select>
      <input
          class="my-5 w-1/4 border-4 text-center hover:cursor-pointer hover:border-green hover:text-green"
          type="submit"
          value="Submit"
      />
    </form>
    <div class="text-center my-3">
      Already had an account?
      <NuxtLink class="text-green hover:text-purple hover:cursor-pointer" to="/login">Login
      </NuxtLink>
    </div>
  </div>
</template>

<style scoped>

</style>