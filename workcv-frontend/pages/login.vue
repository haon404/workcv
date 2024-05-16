<script lang="ts" setup>
import { useUserStore } from '~/stores/useUserStore'

definePageMeta({
  layout: false,
})

const username = ref('')
const password = ref('')

const { authenticateUser } = useAuth()
const { authenticated, error } = storeToRefs(useAuth())

const { user } = storeToRefs(useUserStore())
const { getUserDetail } = useUserStore()

async function login(){
  await authenticateUser(username.value, password.value)
  if (authenticated.value) {
    await getUserDetail()
    navigateTo('/')
  }
}

</script>

<template>
  <div class="h-screen content-center">
    <h1 class="mb-10 text-center text-5xl">Login</h1>
    <form
        class="mx-auto flex max-w-screen-sm flex-col border-4 px-6 py-3"
        @submit.prevent="login"
    >
      <label v-if="error" class="text-red-500">Wrong email or password</label>
      <label for="email">Email:</label>
      <input v-model="username" class="text-black" name="email" type="text"/>
      <label for="password">Password:</label>
      <input v-model="password" class="text-black" name="password" type="password"/>
      <input
          class="my-5 w-1/4 border-4 text-center hover:cursor-pointer hover:border-green hover:text-green"
          type="submit"
          value="Submit"
      />
    </form>
    <div class="text-center my-3">
      Doesn't have an account?
      <NuxtLink class="text-green hover:text-purple hover:cursor-pointer" to="/register">Register
      </NuxtLink>
    </div>
  </div>
</template>

<style scoped>

</style>