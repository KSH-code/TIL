// 주어진 string 에 모든 단어를 거꾸로 하시오.

function reverse (str) {
    let characterList = []
    let returnString = ''
    for (let i = 0; i < str.length; i++) {
        const character = str.charAt(i)
        if (character !== ' ') characterList.push(character)
        else fuck()
    }
    if (characterList.length) fuck()
    return returnString
    function fuck () {
        for (let j = 0; j < characterList.length; j++) returnString += characterList[characterList.length - j - 1]
        returnString += ' '
        characterList = []
    }
}
console.log(reverse('abc 123 apple'))