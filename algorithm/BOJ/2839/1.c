/**
 * @author [KSH-Code]
 * @email [tjdgnsqn133@gmail.com]
 * @create date 2017-08-25 08:51:14
 * @modify date 2017-08-25 08:51:14
 * @desc [https://www.acmicpc.net/problem/2839]
*/
#include <stdio.h>
int main(void)
{
    int a, k5, temp;
    scanf("%d", &a);
    k5 = a / 5;
    if (a == 3 || a == 5)
        printf("1");
    else
    {
        while (1)
        {
            temp = a;
            if ((temp - k5 * 5) % 3 == 0)
            {
                printf("%d", k5 + ((temp - k5 * 5) / 3));
                break;
            }
            else if (k5 == 0)
            {
                printf("-1");
                break;
            }
            k5--;
        }
    }
    return 0;
}
