#include <stdio.h>

void addtwo(int a,int b) {
	
	printf("%d\n",a+b);
}

void addthree(int a, int b, int c) {
	
	printf("%d\n",a+b+c);
}

void main() {
	
	addtwo(10,20);
	addthree(10,20,30);
}
