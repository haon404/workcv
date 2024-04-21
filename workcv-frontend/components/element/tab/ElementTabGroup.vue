<template>
  <div class="mx-auto flex max-w-screen-lg flex-col">
    <div class="mx-auto flex flex-row text-2xl">
      <slot name="titles"></slot>
    </div>
    <div class="border-4">
      <slot name="panels"></slot>
    </div>
  </div>
</template>

<script lang="ts" setup>
import { tabs } from "~/keys.js";

const currentTab = ref(0);
const tabTitleAmount = ref(0);
const tabPanelAmount = ref(0);

provide(tabs, {
  currentTab,
  tabTitleAmount,
  tabPanelAmount,
});
</script>

<style></style>
