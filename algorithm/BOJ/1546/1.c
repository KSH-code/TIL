/**
 * @author [KSH-Code]
 * @email [tjdgnsqn133@gmail.com]
 * @create date 2017-08-26 11:04:46
 * @modify date 2017-08-26 11:04:46
 * @desc [https://www.acmicpc.net/problem/1546]
*/
#include <stdio.h>
int main(void)
{
    int s[1000];
    int m = 0;
    int length;
    int i = 0;
    float temp = 0;
    float sum = 0;
    scanf("%d", &length);
    for (i = 0; i < length; i++)
    {
        if (i + 1 == length)
        {
            scanf("%d", &s[i]);
        }
        else
            scanf("%d ", &s[i]);
        if (m < s[i])
        {
            m = s[i];
        }
    }
    for (i = 0; i < length; i++)
    {
        sum += ((float)s[i] / m) * 100;
    }
    sum /= length;
    printf("%.2f", sum);
    return 0;
}