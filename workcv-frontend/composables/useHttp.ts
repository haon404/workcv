export function useHttp<T>(url: string, options?: any){
    const token = useCookie<string>('token')
    if (token.value == null) {
        return $fetch<T>('http://localhost:8080/api/v1' + url,
            {
                ...options,
            })
    }
    return $fetch<T>('http://localhost:8080/api/v1' + url,
        {
            ...options,
            headers: {
                Authorization: 'Bearer ' + token.value,
            },
        })
}