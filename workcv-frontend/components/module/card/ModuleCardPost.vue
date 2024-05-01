<script setup lang="ts">
</script>

<template>
  <div
      class="relative mt-5 flex flex-col border-2 border-black px-4 py-5 leading-relaxed"
  >
    <div class="text-purple text-sm">
      <slot name="desc"></slot>
    </div>
    <div class="text-xl">
      <slot name="title"></slot>
    </div>
    <div class="flex flex-row space-x-3">
      <div class="flex flex-row items-center text-sm">
        <ElementIconApplicant/>
        <slot name="company"></slot>
      </div>
      <div class="flex flex-row items-center text-sm">
        <ElementIconApplicant/>
        <slot name="location"></slot>
      </div>
    </div>
    <div class="absolute bottom-4 right-4">
      <element-button-primary>Details</element-button-primary>
      <element-button-primary>Update</element-button-primary>
      <element-button-delete>Delete</element-button-delete>
    </div>
  </div>
</template>

<style scoped>

</style>