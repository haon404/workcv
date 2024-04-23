<script setup lang="ts">
definePageMeta({
  layout: false
})

const loggedIn = useCookie('loggedIn', {
  default: () => false
})

function login() {
  loggedIn.value = true
  navigateTo("/")
}
</script>

<template>
  <div class="h-screen content-center">
    <h1 class="mb-10 text-center text-5xl">Login</h1>
    <form
        class="mx-auto flex max-w-screen-sm flex-col border-4 px-6 py-3"
        @submit.prevent="login"
    >
      <label for="email">Email:</label>
      <input type="text" name="email" class="text-black" />
      <label for="password">Password:</label>
      <input type="password" name="password" class="text-black" />
      <input
          type="submit"
          value="Submit"
          class="my-5 w-1/4 border-4 text-center hover:cursor-pointer hover:border-green hover:text-green"
      />
    </form>
  </div>
</template>

<style scoped>

</style>