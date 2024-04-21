<template>
  <div
      :active="active"
      @click="currentTab = tabNum"
      @mouseover.stop
      class="p-active:border-purple p-active:border-r-4 p-active:text-purple hover: hover:text-green hover:border-green border-4 border-b-0 border-r-0 px-4 py-2 last:border-r-4 hover:cursor-pointer"
  >
    <slot></slot>
  </div>
</template>

<script lang="ts" setup>
import { tabs } from "~/keys";

const tabNum = ref(0);

const { currentTab, tabTitleAmount } = inject(tabs) as {
  currentTab: globalThis.Ref<number>;
  tabTitleAmount: globalThis.Ref<number>;
};

onMounted(() => {
  tabTitleAmount.value++;
  tabNum.value = tabTitleAmount.value - 1;
});

const active = computed(() => currentTab.value == tabNum.value);
</script>

<style></style>
