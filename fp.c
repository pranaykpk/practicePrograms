#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int i = 4;
    double d = 4.0;
    char s[] = "HackerRank ";

    
    // Declare second integer, double, and String variables.
    int x;
    double y;
    char ch[100];
    
    // Read and save an integer, double, and String to your variables.
    scanf("%d",&x);
    scanf("%1lf",&y);
    scanf("\n");
    scanf("%[^\n]",ch);
    
    // Print the sum of both integer variables on a new line.
    printf("%d\n",i+x);
    printf("%1lf\n",d+y);
    strcat(s,ch);
    printf("%s\n",s);
    
    // Print the sum of the double variables on a new line.
    
    // Concatenate and print the String variables on a new line
    // The 's' variable above should be printed first.
    

    return 0;
}