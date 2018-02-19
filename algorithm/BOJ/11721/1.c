/**
 * @author [KSH-Code]
 * @email [tjdgnsqn133@gmail.com]
 * @create date 2017-08-26 10:59:54
 * @modify date 2017-08-26 10:59:54
 * @desc [https://www.acmicpc.net/problem/11721]
*/
#include <stdio.h>
int main(void)
{
    char temp;
    int i = 0;
    while ((temp = getchar()) != EOF)
    {
        if (i == 10)
        {
            i = 0;
            printf("\n");
        }
        putchar(temp);
        i++;
    }
    return 0;
}