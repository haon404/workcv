<script setup lang="ts">
withDefaults(defineProps<{
  amount: number
}>(), {
  amount: 0,
})
</script>

<template>
<div class="flex flex-row space-x-2">
  <div class="text-5xl">
    <slot name="icon"></slot>
  </div>
  <div class="flex flex-col">
    <div class="text-lg">
      {{ amount }}
    </div>
    <div class="text-sm">
      <slot name="description"></slot>
    </div>
  </div>
</div>
</template>

<style scoped>

</style>