// 피보나치 배열은 0과 1로 시작하며, 다음 피보나치 수는 바로 앞의 두 피보나치 수의 합이 된다. 정수 N이 주어지면, N보다 작은 모든 짝수 피보나치 수의 합을 구하여라.
const arr = [0, 1]
const N = 12
let i = 0
let sum = 0
while (1) {
    const nextNumber = arr[i] + arr[i + 1]
    if (nextNumber >= N) break
    if (nextNumber % 2 === 0) sum += nextNumber
    arr.push(nextNumber)
    i++
}
console.log(sum)