import type { Applicant } from '~/entity/Applicant'
import type { Recruiter } from '~/entity/Recruiter'

export const useUserStore = defineStore('user', () => {
    const { role } = storeToRefs(useAuth())
    const user = ref<Applicant | Recruiter>({
        id: 0,
        description: '',
        email: '',
        fullName: '',
        address: '',
        phoneNumber: '',
        role: '',
    })
    
    async function getUserDetail(){
        console.log(role.value)
        if (role.value == 'APPLICANT') {
            await useHttp<Applicant>('/applicant', {
                method: 'GET',
            }).then(r => {
                console.log(r)
                return user.value = r
            })
        } else if (role.value == 'RECRUITER') {
            await useHttp<Applicant>('/recruiter', {
                method: 'GET',
            }).then(r => {
                console.log(r)
                return user.value = r
            })
        }
        
    }
    
    return { user, getUserDetail }
}, {
    persist: true,
})