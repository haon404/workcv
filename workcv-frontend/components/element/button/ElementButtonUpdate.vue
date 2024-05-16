<script lang="ts" setup>
</script>

<template>
  <div ref="target" class="relative inline-block">
    <button
        class="text-xl border-purple text-purple hover:text-green hover:border-green hover:cursor-pointer border-4 px-4 py-2 transition-colors duration-300">
      <slot></slot>
    </button>
  </div>
</template>

<style scoped>

</style>