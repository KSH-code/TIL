// String이 주어지면, 중복된 char가 없는 가장 긴 서브스트링 (substring)의 길이를 찾으시오.  
function result (str) {
    let check = {}
    let result = 0
    for (let i = 0; i < str.length; i++) {
        if (check[str.charAt(i)]) {
            result = Math.max(Object.keys(check).length, result)
            check = {}
        } else {
            check[str.charAt(i)] = true
        }
    }
    return Math.max(Object.keys(check).length, result)
}
console.log(result('abababababab'))
console.log(result('abcdabccdd'))
console.log(result('aaa'))
console.log(result('abcdefg'))