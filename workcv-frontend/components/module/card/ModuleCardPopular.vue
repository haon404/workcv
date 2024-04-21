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
    <element-button-secondary class="absolute bottom-4 right-4"
    >Apply Job
    </element-button-secondary>
  </div>
</template>

<style scoped>

</style>