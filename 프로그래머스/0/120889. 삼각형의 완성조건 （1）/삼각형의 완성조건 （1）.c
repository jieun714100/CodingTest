#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// sides_len은 배열 sides의 길이입니다.
int solution(int sides[], size_t sides_len) {
    int answer = 0;
    int a = sides[0];
    int b = sides[1];
    int c = sides[2];
    if(a + b > c && a + c > b && b + c > a){
        answer=1;
    }else {
        answer=2;
    }
    return answer;
}