<script lang="ts" setup>
import type { Company } from '~/entity/Company'

withDefaults(defineProps<{
  amount: number
  company: Company
}>(), {
  amount: 0,
})
</script>

<template>
  <div class="bg-white text-black">
    <div class="mx-auto flex max-w-screen-lg flex-row space-x-20">
      <div class="flex w-3/4 flex-col">
        <div class="text-purple text-sm uppercase">
          Most applied job
        </div>
        <div class="text-3xl font-bold">
          Popular job posts
        </div>
        <div class="h-5"></div>
        <div class="flex flex-col">
          <slot name="cards"></slot>
        </div>
      </div>
      <div class="w-1/4">
        <div class="text-2xl font-bold">
          Popular company
        </div>
        <div class="h-2"></div>
        <div class="h-[8rem]">
          <slot name="companyImage"></slot>
        </div>
        <div class="h-2"></div>
        <div class="text-xl font-bold">
          <slot name="companyName"></slot>
        </div>
        <div class="flex flex-row space-x-2">
          <div class="text-purple text-sm">
            {{ amount }}
          </div>
          <div class="text-sm">
            {{ amount > 1 ? 'positions' : 'position' }}
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>

</style>