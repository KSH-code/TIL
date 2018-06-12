// 정수 배열(int array)이 주어지면 두번째로 큰 값을 프린트하시오.
function getSecondMaxNumber (arr) {
    let max1 = -10000000000
    let max2 = -10000000000
    for (let i = 0; i < arr.length; i++) {
        if (max1 < arr[i]) {
            max2 = max1
            max1 = arr[i]
        } else {
            if (max1 != arr[i] && max2 < arr[i]) {
                max2 = arr[i]
            }
        }
    }
    return max2
}
console.log(getSecondMaxNumber([10, 1, 2, 3, 4, 5, 6]))
console.log(getSecondMaxNumber([3, 3, 3]))
console.log(getSecondMaxNumber([3, 1, 2, 4]))
console.log(getSecondMaxNumber([4, 1, 2, 3, 4, 5]))
console.log(getSecondMaxNumber([5, 4, 3, 2, 1, 5]))
console.log(getSecondMaxNumber([10, 1, 2, 3, 1, 2, 3, 10]))