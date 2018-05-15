// 정수 n이 주어지면, n개의 여는 괄호 "("와 n개의 닫는 괄호 ")"로 만들 수 있는 괄호 조합을 모두 구하시오. (시간 복잡도 제한 없습니다).
const N = 3
const list = []
function bruteforce (i, j, str = '', isOpen = true) {
    if (isOpen) {
        if (i === N) return
        i++
        str += '('
    } else if (j < N && i > j) {
        j++
        str += ')'
        if (j === N) {
            list.push(str)
            return
        }
    } else return
    bruteforce(i, j, str, true)
    bruteforce(i, j, str, false)
}
bruteforce(0, 0, '', true)
console.log(list)