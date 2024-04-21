<script setup lang="ts">

</script>

<template>
  <div class="bg-white text-black">
    <div class="mx-auto flex max-w-screen-lg flex-col">
      <span class="text-purple mx-auto text-sm uppercase">
        Lorem ipsum dolor sit.
      </span>
      <span class="mx-auto text-3xl">
        Lorem ipsum dolor.
      </span>
      <div class="h-10"></div>
      <div class="flex flex-row">
        <slot name="card"></slot>
      </div>
    </div>
  </div>
</template>

<style scoped>

</style>