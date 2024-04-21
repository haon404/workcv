<template>
  <div class="relative w-full self-center">
    <element-icon-search class="absolute left-4 top-2 text-black"></element-icon-search>
    <input
        type="text"
        class="focus:outline-3 focus:outline-green w-full indent-16 text-black placeholder:text-slate-400"
        placeholder="Search..."
    />
  </div>
</template>

<script lang="ts" setup>
import ElementIconSearch from '~/components/element/icon/ElementIconSearch.vue'
</script>

<style scoped></style>
