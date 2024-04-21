<template>
  <div class="w-1/5 border-4 px-6 py-3">
    <div class="text-6xl text-white">
      <slot name="icon"></slot>
    </div>
    <div class="h-2"></div>
    <div class="text-lg font-bold">
      <slot name="title"></slot>
    </div>
    <div class="h-2"></div>
    <div class="text-xs">
      <slot name="desc"></slot>
    </div>
  </div>
</template>

<script lang="ts" setup></script>

<style scoped></style>
