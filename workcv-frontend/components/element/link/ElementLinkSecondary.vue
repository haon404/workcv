<script lang="ts" setup>

</script>

<template>
  <nuxt-link class="inline-block hover:text-green hover:border-green border-4 px-4 py-2 transition-colors duration-300">
    <slot></slot>
  </nuxt-link>
</template>

<style scoped>
.router-link-exact-active {
  @apply text-purple
}
</style>