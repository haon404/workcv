<template>
  <div
      class="relative mx-5 flex flex-col space-y-4 border-2 border-black px-14 py-2 transition-colors duration-300"
      :class="purpleText"
      ref="hoverElement"
  >
    <div class="text-center text-xl">
      <slot name="category"></slot>
    </div>
    <div class="flex flex-row space-x-2 text-sm">
      <div class="text-purple" :class="purpleText">
        {{ amount }}
      </div>
      <div class="">
        {{ amount > 1? "positions" : "position" }}
      </div>
    </div>
    <element-icon-goto
        :class="purpleText"
        class="absolute right-2 text-transparent transition-colors duration-300"
    ></element-icon-goto>
  </div>
</template>

<script lang="ts" setup>
import { useElementHover } from "@vueuse/core";
import ElementIconGoto from '~/components/element/icon/ElementIconGoto.vue'
const hoverElement = ref();
const isHovered = useElementHover(hoverElement);

const purpleText = computed(() => (isHovered.value ? "purple-on-hover" : ""));

withDefaults(defineProps<{
  amount: number
}>(), {
  amount: 0,
})
</script>

<style scoped>
.purple-on-hover {
  @apply text-purple border-purple cursor-pointer;
}
</style>
