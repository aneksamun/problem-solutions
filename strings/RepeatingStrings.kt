/**
 * Counts character within string being repeated multiple times
 * @param pattern the string chunk being repeated
 * @param length the limit of the letters being repeated till
 * @param ch the character to lookup
 * Examples:
 * "aba" reapeated while contains 10 characters, should have 7 characters of 'a'
 * abaabaabaa
 */
fun countCharacterInRepeatingString(pattern: String, times: Int, ch: Char): Int {
    if (pattern.length == 1 && pattern[0] == ch)
        return times

    var count = pattern.count { it == ch }
    count *= times / pattern.length

    for (i in 0 until times % pattern.length)
        if (pattern[i] == ch)
            count++

    return count
}

fun test() {
    println(countCharacterInRepeatingString("a", 1000000000, 'a'))
    println(countCharacterInRepeatingString("aba", 10, 'a'))
}
