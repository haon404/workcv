export function useHttp<T> (url: string, options: any) {
    const token = useCookie("token")
    return $fetch<T>("http://localhost:8080/api/v1" + url,
        {
            ...options,
            headers: {
                Authorization: "Bearer " + token.value
            }
        })
}