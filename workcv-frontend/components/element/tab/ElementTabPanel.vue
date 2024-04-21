<template>
  <div :active="active" v-show="active" class="flex flex-row px-4 py-2">
    <slot></slot>
  </div>
</template>

<script lang="ts" setup>
import { tabs } from "~/keys";

const tabNum = ref(0);

const { currentTab, tabPanelAmount } = inject(tabs) as {
  currentTab: globalThis.Ref<number>;
  tabPanelAmount: globalThis.Ref<number>;
};

onMounted(() => {
  tabPanelAmount.value++;
  tabNum.value = tabPanelAmount.value - 1;
});

const active = computed(() => currentTab.value == tabNum.value);
</script>

<style></style>
