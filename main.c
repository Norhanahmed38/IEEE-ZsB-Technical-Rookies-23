#include <stdio.h>
#include <stdlib.h>

int main()
{
   int i,t;
    scanf("%d",&t);
    for(i=0;i<t;i++)
    {
       unsigned long long n,n2;
       int i=0,term;
       scanf("%llu",&n);
       n2 = n;
       while(n2 > 0)
       {
           term = n2%10;
           if(term!= 0 && n%term==0) i++;
           n2 /= 10;
       }
       printf("%d\n",i);
    }
    return 0;
}
