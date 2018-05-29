// 간격(interval)로 이루어진 배열이 주어지면, 겹치는 간격 원소들을 합친 새로운 배열을 만드시오. 간격은 시작과 끝으로 이루어져 있으며 시작은 끝보다 작거나 같습니다.

function merge (array) {
    array.sort((a, b) => a[0] - b[0])
    const newArray = [array[0]]
    for (let i = 1; i < array.length; i++) {
        if (newArray[newArray.length - 1][1] > array[i][0]) newArray[newArray.length - 1][1] = Math.max(array[i][1], newArray[newArray.length - 1][1])
        else newArray.push(array[i])
    }
    return newArray
}
console.log(merge([[2, 4], [1, 5], [7, 9]]))
console.log(merge([[3, 6], [1, 3], [2, 4]]))