#include<stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
#include <ctype.h>

int main(){
    int n;
    scanf("%d",&n);
    int *arr=(int*)malloc(n*sizeof(int));
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    for(int i=n-1;i>=0;i--)
    if(arr[i]==9){
        if(i==0){
            int carry =1;
            printf("%d ",carry);
            arr[i]=0;
        }
        arr[i-1]+1;
        arr[i]=0;
        continue;
    }else{
        arr[i]++;
        break;
    }
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
}