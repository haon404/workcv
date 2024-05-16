export default defineNuxtRouteMiddleware((to) => {
    const { authenticated } = storeToRefs(useAuth())
    const token = useCookie<string>('token')
    
    if (token.value) {
        authenticated.value = true
    }
    
    if (token.value && to.path == '/login') {
        return navigateTo('/')
    }
    
    if (to.path !== '/' && to.path !== '/login' && to.path !== '/register' && !authenticated) {
        return navigateTo('/login')
    }
})