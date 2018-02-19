/**
 * @author [KSH-Code]
 * @email [tjdgnsqn133@gmail.com]
 * @create date 2017-08-26 11:42:58
 * @modify date 2017-08-26 11:42:58
 * @desc [https://www.acmicpc.net/problem/1110]
*/
#include <stdio.h>
int main(void)
{
    int o, c, temp1, temp2, length = 0;
    scanf("%d", &o);
    c = o;
    while (1)
    {

        temp2 = (c / 10 + c % 10) % 10;
        temp1 = c % 10 * 10;
        c = temp1 + temp2;
        length++;
        if (o == c)
        {
            break;
        }
    }
    printf("%d", length);
    return 0;
}