<script lang="ts" setup>
import { onClickOutside } from '@vueuse/core'
import ElementDropdown from '~/components/element/dropdown/ElementDropdown.vue'

const show = ref(false)
const target = ref(null)
const loggedIn = useCookie('loggedIn')

onClickOutside(target, () => show.value = false)
function logout() {
loggedIn.value = 'false'
}
</script>

<template>
  <div class="relative inline-block" ref="target">
    <button
        @click="show=!show"
        class="border-purple text-purple hover:text-green hover:border-green hover:cursor-pointer border-4 px-4 py-2 transition-colors duration-300">
      <slot></slot>
    </button>
    <div
        v-if="show"
        class="flex flex-col absolute origin-top-right right-0 border-4 border-white mt-5 hover:border-green">
      <element-dropdown>
        <nuxt-link to="/profile">Profile</nuxt-link>
      </element-dropdown>
      <element-dropdown>
        <nuxt-link to="/posts">Posts</nuxt-link>
      </element-dropdown>
      <element-dropdown>
        <button @click="logout">Logout</button>
      </element-dropdown>
    </div>
  </div>
</template>

<style scoped>

</style>