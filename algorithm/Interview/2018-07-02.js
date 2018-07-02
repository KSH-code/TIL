// 길이가 같은 두 문자열(string) A 와 B가 주어지면, A 가 B 로 1:1 암호화 가능한지 찾으시오.
function isEncryptedString (A, B) {
    const strForA = {}
    const strForB = {}
    if (A.length !== B.length) return false
    for (let i = 0; i < A.length; i++) {
        const charA = A.charAt(i)
        const charB = B.charAt(i)
        if (!strForA[charA]) strForA[charA] = charB
        if (!strForB[charB]) strForB[charB] = charA
        if (strForA[charA] !== charB || strForB[charB] !== charA) return false
    }
    return true
}
console.log(isEncryptedString('ABBA', 'BCCB'))
console.log(isEncryptedString('ABBA', 'BCCBC'))
console.log(isEncryptedString('APPLE', 'ABBLC'))
console.log(isEncryptedString('APPLE', 'AAAAA'))