// 정수 배열(int array)가 주어지면 가장 큰 이어지는 원소들의 합을 구하시오. 단, 시간복잡도는 O(n).
const arr = [1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 6]
let curSum = arr[0]
let maxSum = arr[0]
for (let i = 0; i < arr.length; i++) {
    curSum = Math.max(curSum + arr[i], arr[i])
    maxSum = Math.max(curSum, maxSum)
}