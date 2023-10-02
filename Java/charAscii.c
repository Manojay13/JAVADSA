#include<stdio.h>
#include<stdlib.h>
#define TRUE 1

int main(void){
	char choice;
	while(TRUE)){
	printf("Do you want enter character::[Yes:y No:N]\n");
	scanf("%c",&choice);
	if(choice!=('y'))
		break;
	printf("%d",getchar());
	
	}
	exit(0);
}

