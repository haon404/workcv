<script lang="ts" setup>
import type { Category } from '~/entity/Category'

//Section popular company
import type { Company } from '~/entity/Company'
import type { Recruitment } from '~/entity/Recruitment'

const company = ref<Company>()
await useHttp<Company>('/company/popular')
    .then(r => company.value = r)
    .catch(e => console.log(e))

const recruitment = ref<Recruitment>()
await useHttp<Recruitment>('/recruitment/popular')
    .then(r => recruitment.value = r)
    .catch(e => console.log(e))
const recruitmentCompany = ref<Company>()
await useHttp<Company>(`/company/${ recruitment.value?.companyId }`)
    .then(r => recruitmentCompany.value = r)
    .catch(e => console.log(e))

// Section categories
const popularCategories = ref<Category[]>()
await useHttp<Category[]>('/category/populars')
    .then(r => popularCategories.value = r)
    .catch(e => console.log(e))
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
      <module-card-job v-for="category in popularCategories" :amount="category.recruitmentIds.length">
        <template #category>{{ category.name }}</template>
      </module-card-job>
    </template>
  </section-job>
  
  <section-description class="py-24">
    <template #card>
      <module-card-description>
        <template #icon>
          <ElementIconApplicant/>
        </template>
        <template #title> Find million of jobs</template>
        <template #desc>
          Lorem ipsum dolor, sit amet consectetur adipisicing elit. Expedita,
          recusandae quos corrupti maiores soluta odio.
        </template>
      </module-card-description>
      <module-card-description>
        <template #icon>
          <ElementIconApplicant/>
        </template>
        <template #title> Easy work management</template>
        <template #desc>
          Lorem ipsum dolor, sit amet consectetur adipisicing elit. Expedita,
          recusandae quos corrupti maiores soluta odio.
        </template>
      </module-card-description>
      <module-card-description>
        <template #icon>
          <ElementIconApplicant/>
        </template>
        <template #title> Top jobs</template>
        <template #desc>
          Lorem ipsum dolor, sit amet consectetur adipisicing elit. Expedita,
          recusandae quos corrupti maiores soluta odio.
        </template>
      </module-card-description>
      <module-card-description>
        <template #icon>
          <ElementIconApplicant/>
        </template>
        <template #title> Find million of jobs</template>
        <template #desc>
          Lorem ipsum dolor, sit amet consectetur adipisicing elit. Expedita,
          recusandae quos corrupti maiores soluta odio.
        </template>
      </module-card-description>
    </template>
  </section-description>
  
  <section-popular :amount="recruitmentCompany?.recruitments.length" class="py-24">
    <template #cards>
      <module-card-popular>
        <template #desc> {{ recruitment?.description }}</template>
        <template #title> {{ recruitment?.title }}</template>
        <template #company> {{ recruitmentCompany?.name }}</template>
        <template #location> {{ recruitment?.address }}</template>
      </module-card-popular>
    </template>
    <!--    TODO: change logo to actual picture-->
    <template #companyImage>{{ company?.logo }}</template>
    <template #companyName> {{ company?.name }}</template>
  </section-popular>

</template>

<style scoped>

</style>