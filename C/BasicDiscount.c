#include <stdio.h>

float discount(float price, int percentage);

int main(void)
{
    float regular;
    int percent_off;
    printf("Regular Price: ");  
    scanf("%f", &regular);
    printf("Percent Off: ");  
    scanf("%d", &percent_off);
    float sale = discount(regular, percent_off); // get function discount to use = discount(variable regular that user input and percent off that user input and then perform calculate in discount)
    printf("Sale Price: %.2f\n", sale);
}

float discount(float price, int percentage)
{
    return price * (100 - percentage) / 100;
}
