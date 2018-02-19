/**
 * @author [KSH-Code]
 * @email [tjdgnsqn133@gmail.com]
 * @create date 2017-08-26 12:00:56
 * @modify date 2017-08-26 12:00:56
 * @desc [https://www.acmicpc.net/problem/4344]
*/
#include <stdio.h>
int main(void)
{
    int length, i, pl, j, abcd;
    int apl[1000];
    float ap[1000], avg;
    scanf("%d", &length);
    for (i = 0; i < length; i++)
    {
        scanf("%d ", &pl);
        for (j = 0; j < pl; j++)
        {
            if (j + 1 >= pl)
                scanf("%d ", &apl[j]);
            else
                scanf("%d", &apl[j]);
        }
        avg = 0;
        for (j = 0; j < pl; j++)
        {
            avg += apl[j];
        }
        avg /= (float)pl;
        abcd = 0;
        for (j = 0; j < pl; j++)
        {
            if (avg < apl[j])
            {
                abcd++;
            }
        }
        ap[i] = (float)abcd / pl * 100;
    }
    for (i = 0; i < length; i++)
    {
        printf("%.3f%%\n", ap[i]);
    }
    return 0;
}
