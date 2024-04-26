<script setup lang="ts">

</script>

<template>
<!--  Profile picture-->
  <div class="flex flex-col content-center space-y-4 my-5">
    <div class="text-5xl mx-auto">Profile</div>
  </div>
<!--  Information-->
  <div class="flex flex-row justify-center">
<!--    Personal-->
    <div class="flex flex-col mx-20">
      <div class="flex flex-col space-y-3 justify-center my-5">
        <div class="mx-auto">Profile picture</div>
        <div class="h-36 w-36 bg-white mx-auto">
          <img src="#" alt="placeholder">
        </div>
        <element-button-secondary class="mx-auto">Change</element-button-secondary>
      </div>
      <div class="text-3xl">Personal Information</div>
      <div class="border-2 px-6 py-3">
        <form class="flex flex-col" @submit.prevent>
          <label for="email">Email:</label>
          <input class="text-black" id="email" type="text" placeholder="xyz@abc.com">
          <label for="full-name">Full Name:</label>
          <input class="text-black" id="full-name" type="text" placeholder="John Wick">
          <label for="address">Address:</label>
          <input class="text-black" id="address" type="text" placeholder="Somewhere Some-country">
          <label for="phone-number">Phone Number:</label>
          <input class="text-black" id="phone-number" type="text" placeholder="0XXX-XXX-XXX">
          <label for="introduction">Introduction:</label>
          <textarea class="text-black" id="introduction" rows="2"></textarea>
        </form>
      </div>
    </div>
<!--    Company-->
    <div class="flex flex-col mx-20">
      <div class="flex flex-col space-y-3 my-5">
        <div class="mx-auto">Company Logo</div>
        <div class="h-36 w-36 bg-white mx-auto">
          <img src="#" alt="placeholder">
        </div>
        <element-button-secondary class="mx-auto">Change</element-button-secondary>
      </div>
      <div class="text-3xl">Company Information</div>
      <div class="border-2 px-6 py-3">
        <form class="flex flex-col" @submit.prevent>
          <label for="email">Email:</label>
          <input class="text-black" id="email" type="text" placeholder="xyz@abc.com">
          <label for="company-name">Company Name:</label>
          <input class="text-black" id="company-name" type="text" placeholder="ABC Software">
          <label for="address">Address:</label>
          <input class="text-black" id="address" type="text" placeholder="Somewhere Some-country">
          <label for="phone-number">Phone Number:</label>
          <input class="text-black" id="phone-number" type="text" placeholder="0XXX-XXX-XXX">
          <label for="introduction">Company Introduction:</label>
          <textarea class="text-black" id="introduction" rows="2"></textarea>
        </form>
      </div>
    </div>
  </div>
  <div class="min-h-28"></div>
</template>

<style scoped>

</style>