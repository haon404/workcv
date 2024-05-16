// https://nuxt.com/docs/api/configuration/nuxt-config
export default defineNuxtConfig({
    devtools: { enabled: true },
    modules: [
        '@nuxtjs/tailwindcss',
        '@pinia/nuxt',
        '@vee-validate/nuxt',
        '@pinia-plugin-persistedstate/nuxt',
    ],
    tailwindcss: {
        editorSupport: true,
        configPath: '~/tailwind.config.js',
    },
})