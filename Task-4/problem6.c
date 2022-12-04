#include<stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
#include <ctype.h>
#define min(X, Y)  ((X) < (Y) ? (X) : (Y))
#define max(X, Y)  ((X) > (Y) ? (X) : (Y))
#define pi 3.14159265359
void swap(int *a,int*b){
    int tmp=*a;
    *a=*b;
    *b=tmp;
}
void bubblesort(int *arr,int size){
    for(int i=0;i<size-1;i++){
        for (int j = 0; j < size-i-1; j++)
        {
            if(arr[j]>arr[j+1]){
            swap(&arr[j],&arr[j+1]);
            }
        }
        
    }
}
int main(){
int num=0;
scanf("%d",&num);
int arr[4];
for(int i=0;i<4;i++){
    arr[i]=num%10;
    num/=10;
}

int i=0;
int diff;
while(diff!=6174){
i++;
bubblesort(arr,4);
int back=arr[3]*1000+arr[2]*100+arr[1]*10+arr[0];
int straight=arr[0]*1000+arr[1]*100+arr[2]*10+arr[3];
int m=max(back,straight);
int mi=min(back,straight);
diff=m-mi;
if(diff==6174){
    break;
}else{

for(int i=0;i<4;i++){
    arr[i]=diff%10;
    diff/=10;
}
}
}
printf("%d",i);
}