<script setup lang="ts"></script>

<template>
  <div class="container max-w-screen-lg mx-auto flex flex-col content-center space-y-8">
    <div class="text-sm text-center">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Natus, soluta.</div>
    <div class="text-5xl text-center max-w-screen-md mx-auto">Easiest way to get your new job</div>
    <div class="flex flex-row justify-around">
      <slot name="card"></slot>
    </div>
    <div class="">
      <slot name="searchTab"></slot>
    </div>
  </div>
</template>

<style scoped>

</style>