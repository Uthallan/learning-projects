
// Instruction for the preprocessor
#include <stdio.h>



int add3(int a, int b, int c) {
    int result = a + b + c;
    return result;
}

int x = 5;
int y = 7;
int z = 11;

int main(void)
{
    int num = add3(x,y,z);
    printf("You can add numbers together! For example, %i, %i, and %i.\n",x,y,z);
    printf("The new number is %i\n", num);
    puts("Hello, World");
    return 0;
}