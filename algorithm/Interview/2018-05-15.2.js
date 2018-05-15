// 정수(int)가 주어지면, 팰린드롬(palindrome)인지 알아내시오. 팰린드롬이란, 앞에서부터 읽으나 뒤에서부터 읽으나 같은 단어를 말합니다. 단, 정수를 문자열로 바꾸면 안됩니다.
for (let i = 1; i <= 10000; i++) {
    if (isPalidrome(i)) console.log(i)
}
function isPalidrome (n) {
    const arr = []
    while (n > 0) {
        arr.push(n % 10)
        n = parseInt(Math.floor(n / 10))
    }
    for (let i = 0; i < arr.length / 2; i++) {
        if (arr[i] !== arr[arr.length - i - 1]) return false
    }
    return true
}