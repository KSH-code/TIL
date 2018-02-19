/**
 * @author [KSH-Code]
 * @email [tjdgnsqn133@gmail.com]
 * @create date 2017-08-26 12:25:14
 * @modify date 2017-08-26 12:25:14
 * @desc [https://www.acmicpc.net/problem/4673]
*/
#include <stdio.h>
void abcd(int dd[], int nnum);
int main(void)
{
    int ab[10001], i;
    for (i = 1; i <= 10000; i++)
        abcd(ab, i);
    for (i = 1; i <= 10000; i++)
    {
        if (ab[i] > -1)
        {
            printf("%d\n", i);
        }
    }
    return 0;
}

void abcd(int dd[], int nnum)
{
    int temp;
    temp = nnum;
    temp += (nnum / 1000) + ((nnum % 1000) / 100) + ((nnum % 100) / 10) + (nnum % 10);

    if (temp > 10000)
    {
        return;
    }
    dd[temp] = -1;
}