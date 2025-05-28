#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n, int k) {
    int freeDrink=n/10;
    int paidDrink=k-freeDrink;
    
    int answer = ((n*12000)+(paidDrink*2000));
    return answer;
}