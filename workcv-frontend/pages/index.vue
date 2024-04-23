<script setup lang="ts">

</script>

<template>
  <section-banner class="py-24">
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
            <element-button-primary>Search</element-button-primary>
          </element-tab-panel>
          <element-tab-panel>
            <ElementInputSearch/>
            <element-button-primary>Search</element-button-primary>
          </element-tab-panel>
          <element-tab-panel>
            <ElementInputSearch/>
            <element-button-primary>Search</element-button-primary>
          </element-tab-panel>
        </template>
      </element-tab-group>
    </template>
  </section-banner>
  
  <section-job class="py-24">
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
  
  <section-description class="py-24">
    <template #card>
      <module-card-description>
        <template #icon>
          <ElementIconApplicant/>
        </template>
        <template #title> Find million of jobs </template>
        <template #desc>
          Lorem ipsum dolor, sit amet consectetur adipisicing elit. Expedita,
          recusandae quos corrupti maiores soluta odio.
        </template>
      </module-card-description>
      <module-card-description>
        <template #icon>
          <ElementIconApplicant/>
        </template>
        <template #title> Easy work management </template>
        <template #desc>
          Lorem ipsum dolor, sit amet consectetur adipisicing elit. Expedita,
          recusandae quos corrupti maiores soluta odio.
        </template>
      </module-card-description>
      <module-card-description>
        <template #icon>
          <ElementIconApplicant/>
        </template>
        <template #title> Top jobs </template>
        <template #desc>
          Lorem ipsum dolor, sit amet consectetur adipisicing elit. Expedita,
          recusandae quos corrupti maiores soluta odio.
        </template>
      </module-card-description>
      <module-card-description>
        <template #icon>
          <ElementIconApplicant/>
        </template>
        <template #title> Find million of jobs </template>
        <template #desc>
          Lorem ipsum dolor, sit amet consectetur adipisicing elit. Expedita,
          recusandae quos corrupti maiores soluta odio.
        </template>
      </module-card-description>
    </template>
  </section-description>
  
  <section-popular class="py-24">
    <template #cards>
      <module-card-popular>
        <template #desc> Full time </template>
        <template #title> .NET Developers recruitment </template>
        <template #company> FPT Software </template>
        <template #location> Da Nang </template>
      </module-card-popular>
    </template>
    <template #companyImage> </template>
    <template #companyName> FPT Software </template>
  </section-popular>
  
</template>

<style scoped>

</style>