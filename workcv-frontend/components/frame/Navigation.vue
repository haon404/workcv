<script setup lang="ts">

</script>

<template>
<!--TODO Icon and links-->
  <div class="flex flex-row place-content-between">
    <div class="py-3 px-6">
      <slot name="icon"></slot>
    </div>
    <div class="py-3 px-6 space-x-3">
      <slot name="link"></slot>
    </div>
  </div>
</template>

<style scoped>

</style>