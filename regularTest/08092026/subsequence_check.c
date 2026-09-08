#include <stdio.h>
#include <stdbool.h>

bool has_sequence(int N, int n, int S[N], int F[n]){
    int i, j;
    for(i=0; i<=N-n; i++){
        for(j=0; j<n; j++) if(S[i+j] != F[j]) break;
        if(j==n) return true;
    }
    return false;
}

int main(){
    int N, n;
    
    if(scanf("%d", &N) != 1 || N <= 0){
        printf("User input mismatch !");
        return 1;
    }
    
    int S[N];
    for(int i=0; i<N; i++) scanf("%d", &S[i]);
    
    if(scanf("%d", &n) != 1 || n <=0){
        printf("User input mismatch !");
        return 1;
    }
    
    int F[n];
    for(int j=0; j<n; j++) scanf("%d", &F[j]);
    
    bool result = has_sequence(N, n, S, F);
    if(result) printf("Yes");
    else printf("No");
    
    return 0;
}

/*

Problem Statement:-
Single File Programming Question
	:- Favorite Sequence

Lucarnos Film Festival is an annual film festival and is also known for being a prestigious platform for art house films. Lucy, being a movie lover visits the Lucarnos Film Festival. There were many films screened in the show, of which Lucy somehow choose the best movie of her choice and set off to watch it.

The movie which Lucy chose to watch has N sequences. A sequence is defined as a series of scenes in a movie that form a distinct narrative unit. Lucy likes a sequence better if the sequence contains her favorite sequence in the movie as a substring.

Given the sequence and Lucy’c favorite sequence(F) check whether her favorite sequence is contained in the sequence.

Input format :-
The first line of the input contains an integer N, which corresponds to the length of the sequence.
The second line of the input contains N space-separated integers, which corresponds to the sequence.
The third line of the input contains an integer n, which corresponds to the length of favorite sequence F.
The last line of the input contains n space-separated integers, which corresponds to the favorite sequence.

Output format :-
Print "Yes" (Without quotes)if the sequence contains Lucy’s favorite sequence otherwise print "No" (Without quotes).

Sample test cases :-
Input 1 :-
6
1 2 3 4 5 6
3
2 3 4
Output 1 :-
Yes

*/
