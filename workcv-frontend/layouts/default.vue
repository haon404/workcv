<script setup lang="ts">

import ElementIconWebsite from '~/components/element/icon/ElementIconWebsite.vue'
import Navigation from '~/components/frame/Navigation.vue'
</script>

<template>
<!--TODO: Navbar here-->
  <navigation>
    <template #icon>
      <ElementIconWebsite/>
    </template>
    <template #link>
      <element-link-primary to="/">
        HomePage
      </element-link-primary>
      <element-link-primary to="/jobs">
        Jobs
      </element-link-primary>
      <element-link-primary to="/applicants">
        Applicants
      </element-link-primary>
      <element-link-secondary to="/login">
        Login
      </element-link-secondary>
    </template>
  </navigation>
  <slot></slot>
</template>

<style scoped>

</style>