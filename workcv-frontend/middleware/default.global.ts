export default defineNuxtRouteMiddleware((to) => {

    const loggedIn = useCookie('loggedIn', {
        default: () => false
    })
    console.log(to.path !== '/login')
    if(to.path !== '/' && to.path !== '/login' && !loggedIn.value) {
        console.log("?")
        return navigateTo('/login')
    }
})