#include<stdio.h>

int unlock(int num){
    int arr[10], index=0, size, result=0, temp, i;
    while(num){
        arr[index] = num%10;
        index++;
        num=num/10;
    }
    
size = index;
for(i=1;i<=size-1;i++) {
    for(index=1;index<n;index++) {
        if(arr[index-1] > arr[index]) {
            int temp=arr[index];
            arr[index]=arr[index-1];
            arr[index-1]=temp;
        }
    }
}

index=0;
while(arr[index]==0)  index++;
temp=arr[index];
arr[index]=arr[0];
arr[0]=temp;

for(index=0;index<n;index++)    result=result*10+arr[index];
return result;
}

int main(){
  int num,res;
  scanf("%d",&num);
  res=unlock(num);
  printf("%d",res);
  return 0;
}

/*

Problem Statement:-
Write a program that takes an integer as input and performs the following operations:

The program should separate each digit of the input number and store them in an array in reverse order.
Sort the digits of the number in ascending order, excluding any leading zeros.
Swap the first non-zero digit with the digit at the first position in the array.
Finally, reassemble the digits into a single integer and output the result.

Input format :-
The input consists of a locking key as an integer. 

Output format :-
The output returns an integer representing the unlocking key.

Code constraints :-
-107 <= locking key <= 107

Sample test cases :-
Input 1 :-
621540
Output 1 :-
102456

Input 2 :-
75259
Output 2 :-
25579

*/
