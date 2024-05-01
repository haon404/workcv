<script setup lang="ts">

</script>

<template>
  <!--Bread-crumbs-->
  <div class="flex flex-col justify-center my-16 space-y-5">
    <div class="text-sm mx-auto">Home Page > Posts > Update Post</div>
    <div class="text-5xl mx-auto">Post Update</div>
  </div>
  <div class="">
    <div class="max-w-screen-md mx-auto">
      <div class="flex flex-row justify-between">
        <h3 class="text-4xl my-5">Post Detail</h3>
        <input class="border-4 px-6 py-3 hover:text-green hover:border-green hover:cursor-pointer transition-colors duration-300" type="submit" value="Submit">
      </div>
      <form @submit.prevent class="flex flex-col">
        <label for="title">Title</label>
        <input class="text-black" type="text" name="title" id="title">
        <label for="desc">Description</label>
        <textarea class="text-black" name="desc" id="desc" rows="3"></textarea>
        <label for="exp">Experience</label>
        <input class="text-black" type="text" name="exp" id="exp">
        <label for="amount">Recruit Amount</label>
        <input class="text-black" type="text" name="amount" id="amount">
        <label for="address">Company Address</label>
        <input class="text-black" type="text" name="address" id="address">
        <label for="due">Due Date</label>
        <input class="text-black" type="date" name="due" id="due">
        <label for="salary">Salary</label>
        <input class="text-black" type="text" name="salary" id="salary">
        <label for="job-type">Job Type</label>
        <select class="text-black" name="job-type" id="job-type">
          <option value="full-time">Full Time</option>
          <option value="part-time">Part Time</option>
          <option value="freelance">Freelancer</option>
        </select>
        <label for="job-category">Job Category</label>
        <select class="text-black" name="job-category" id="job-category">
          <option value="full-time">NodeJS</option>
          <option value="part-time">Java</option>
          <option value="freelance">Php</option>
        </select>
      </form>
    </div>
  </div>
</template>

<style scoped>

</style>