import type { Recruitment } from '~/entity/Recruitment'

export interface Company{
    id: number
    address: string
    description: string
    email: string
    logo: string
    name: string
    phoneNumber: string
    recruitments: Recruitment[]
}