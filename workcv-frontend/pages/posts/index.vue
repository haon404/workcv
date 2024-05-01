<script setup lang="ts">

import ModuleCardPost from '~/components/module/card/ModuleCardPost.vue'

</script>

<template>
<!--Bread-crumbs-->
  <div class="flex flex-col justify-center my-16 space-y-5">
    <div class="text-sm mx-auto">Home Page > Posts</div>
    <div class="text-5xl mx-auto">Posts List</div>
  </div>
  <div class="flex flex-col bg-white text-black p-5">
    <element-button-secondary class="w-fit" @click="navigateTo('/posts/new')">New Post +</element-button-secondary>
    <div class="flex justify-center">
      <module-card-post class="min-w-[900px]">
        <template #desc>Full Time</template>
        <template #title>Recruit .NET Developers</template>
        <template #company>Fpt Software</template>
        <template #location>Da Nang</template>
      </module-card-post>
    </div>
  </div>
</template>

<style scoped>

</style>