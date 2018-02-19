/**
 * @author [KSH-Code]
 * @email [tjdgnsqn133@gmail.com]
 * @create date 2017-08-26 10:53:14
 * @modify date 2017-08-26 10:53:14
 * @desc [https://www.acmicpc.net/problem/11720]
*/
#include <stdio.h>
int main(void)
{
    int length;
    int sum = 0;
    char temp;
    scanf("%d\n", &length);
    while (length)
    {
        scanf("%c", &temp);
        sum += (int)temp-48;
        length--;
    }
    printf("%d", sum);
    return 0;
}