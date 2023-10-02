#include<stdio.h>

void fun(int x){
	printf("%d\n",x);
	fun(++x);
}
int main(void){
	fun(1);
	return(0);
}
