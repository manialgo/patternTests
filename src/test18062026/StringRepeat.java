package test18062026;

import java.util.Scanner;
public class StringRepeat {
/*
    public static void firstArrival(String[] strArr){
        int size = strArr.length;
        boolean flag = false;
        for(int i=0; i<size; i++){//need to traverse until the last word what if the
        	//last word itself the first unique so i--> last one too
            for(int j=i+1; j<size; j++){
                if(strArr[i].equals(strArr[j]))break;
                else {
                    if(j==size-1) System.out.println(strArr[i]);
                    flag = true;
                    break ;
                }
            }
        }
        if(!flag)
            System.out.println("-1");
    }
*/
	public static void firstArrival(String[] strArr) {
		int size = strArr.length;
		for (int i = 0; i < size; i++) {
		    int count = 0;
		    for (int j = 0; j < size; j++) {
		        if (strArr[i].equals(strArr[j]))
		            count++;          // count every occurrence
		    }
		    if (count == 1) {         // unique only if exactly 1
		        System.out.println(strArr[i]);
		        return;
		    }
		}
		System.out.println("-1");
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        firstArrival(strArr);
        sc.close();
    }
/*
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chArr = str.toCharArray();
        int count=0, j=0;
        for(int i=0; i<chArr.length; i++)   if(chArr[i] ==' ') count++;
        String[] strArr = new String[count+1];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(chArr[i] != ' '){
                sb.append(chArr[i]);
            }
            else {
                strArr[j] = sb.toString();
                sb.delete(0,sb.length());
                j++;
            }
        }
        firstArrival(strArr);
        sc.close();
    }
*/
}