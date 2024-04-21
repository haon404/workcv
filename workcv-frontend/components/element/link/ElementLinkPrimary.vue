<script setup lang="ts">

</script>

<template>
<nuxt-link class="hover:text-green transition-colors duration-300">
  <slot></slot>
</nuxt-link>
</template>

<style scoped>
.router-link-exact-active {
@apply text-purple
}
</style>