<script setup lang="ts">
import ElementButtonRecruit from '~/components/element/button/ElementButtonRecruit.vue'
import ElementIconWebsite from '~/components/element/icon/ElementIconWebsite.vue'
import Navigation from '~/components/frame/Navigation.vue'

const {authenticated} = storeToRefs(useAuth())
</script>

<template>
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
      <element-link-secondary to="/login" v-if="!authenticated">
        Login
      </element-link-secondary>
      <element-button-recruit v-if="authenticated">
        Recruit
      </element-button-recruit>
    </template>
  </navigation>
  <slot></slot>
</template>

<style scoped>

</style>