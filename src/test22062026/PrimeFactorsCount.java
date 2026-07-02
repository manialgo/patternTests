package test22062026;

import java.util.Scanner;

public class PrimeFactorsCount {
    private static int countFactors(int N, int P) {
    	int power = 0;
    	while(N > 0 && N % P ==0) {
    		N /= P;
    		power++;
    	}
    	return power;
    }
    
    private static int getCount(int L, int R, int P) {
    	int count=0;
    	for(int i=L; i<=R; i++) {
    		count += countFactors(i, P);
    	}
    	return count;
    }
    
    private static boolean isPrime(int P) {
    	if(P < 2)	return false;
    	for(int i=2; i<=P/2; i++) {
    		if(P % i == 0)	return false;
    	}
    	return true;
    }
	/*
	private static int countFactors(int L, int R, int P){
        int getCount=0;
        boolean flag = false;
        while(L <= R){
            int digitCheck = L;
            while(digitCheck % P == 0){
                getCount++;
                digitCheck /= P;
                flag = true;
            }
            if(flag) L += P;
            else    L++;
        }
        return getCount;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int P = sc.nextInt();
        System.out.println(countFactors(L, R, P));
        sc.close();
    }
    */
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int P = sc.nextInt();
        if(!isPrime(P))	System.out.println(P+" is not a prime");
        else System.out.println(getCount(L, R, P));
        sc.close();
    }
}