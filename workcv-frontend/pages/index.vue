<script setup lang="ts">
import ButtonPrimary from '~/components/element/button/ButtonPrimary.vue'
</script>

<template>
  <section-banner class="py-12">
    <template #card>
      <module-card-banner :amount="2">
        <template #icon>
          <ElementIconApplicant/>
        </template>
        <template #description>Lorem ipsu</template>
      </module-card-banner>
      <module-card-banner :amount="2">
        <template #icon>
          <ElementIconApplicant/>
        </template>
        <template #description>Lorem ipsu</template>
      </module-card-banner>
      <module-card-banner :amount="2">
        <template #icon>
          <ElementIconApplicant/>
        </template>
        <template #description>Lorem ipsu</template>
      </module-card-banner>
    </template>
    <template #searchTab>
      <element-tab-group>
        <template #titles>
          <element-tab-title>Lorem ipsum.</element-tab-title>
          <element-tab-title>Lorem ipsum.</element-tab-title>
          <element-tab-title>Lorem ipsum.</element-tab-title>
        </template>
        <template #panels>
          <element-tab-panel>
            <ElementInputSearch/>
            <button-primary>Search</button-primary>
          </element-tab-panel>
          <element-tab-panel>
            <ElementInputSearch/>
            <button-primary>Search</button-primary>
          </element-tab-panel>
          <element-tab-panel>
            <ElementInputSearch/>
            <button-primary>Search</button-primary>
          </element-tab-panel>
        </template>
      </element-tab-group>
    </template>
  </section-banner>
  
  <section-job class="py-12">
    <template #card>
      <module-card-job :amount="1">
        <template #category>Lorem.</template>
      </module-card-job>
      <module-card-job :amount="2">
        <template #category>Lorem.</template>
      </module-card-job>
      <module-card-job :amount="1">
        <template #category>Lorem.</template>
      </module-card-job>
      <module-card-job :amount="2">
        <template #category>Lorem.</template>
      </module-card-job>
    </template>
  </section-job>
  
</template>

<style scoped>

</style>