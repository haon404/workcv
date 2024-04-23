<script setup lang="ts">
const hover = ref(false)
const color = computed(() => hover.value? 'highlight-green':'')
</script>

<template>
<div class="relative" @mouseover="hover=true" @mouseout="hover=false">
  <ElementIconGoto class="absolute left-4 top-4 text-transparent"
    :class="color"
  />
  <div class="py-2 pr-4 pl-16 text-right"
    :class="color"
  >
    <slot></slot>
  </div>
</div>
</template>

<style scoped>
.highlight-green {
  @apply text-green transition-colors duration-200
}
</style>