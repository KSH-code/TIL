/**
 * @author [KSH-Code]
 * @email [tjdgnsqn133@gmail.com]
 * @create date 2017-08-27 06:43:21
 * @modify date 2017-08-27 06:43:21
 * @desc [https://www.acmicpc.net/problem/1065]
*/
#include <stdio.h>
int h(n)
{
    int n1, n2, n3;
    n1 = n % 10;
    n2 = (n / 10) % 10;
    n3 = (n / 100);
    if (n >= 100)
    {
        if (n1 - n2 == n2 - n3)
        {
            return 1;
        }
    }
    else
    {
        return 1;
    }
    return -10;
}
int main(void)
{
    int length, count = 0, i = 1;
    scanf("%d", &length);
    for (; i <= length; i++)
    {
        if (h(i) == 1)
        {
            count++;
        }
    }
    printf("%d", count);
    return 0;
}
