// 정수 배열(int array)이 주어지면 0이 아닌 정수 순서를 유지하며 모든 0을 배열 오른쪽 끝으로 옮기시오. 단, 시간복잡도는 O(n), 공간복잡도는 O(1)여야 합니다.
// [0, 5, 0, 3, -1]
// [5, 3, -1, 0, 0]
function sort (arr) {
    let idx = 0
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] !== 0) {
            const temp = arr[i]
            arr[i] = arr[idx]
            arr[idx] = temp
            idx++
        }
    }
    return arr
}
console.log(sort([0, 5, 0, 3, -1]))
console.log(sort([0, 0, 0, 3, -1]))
console.log(sort([0, 0, 0, 0, -1]))