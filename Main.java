package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int num2 = num;
	int reversed = 0;
	for(; num!=0; num/=10){
	  int digit = num%10;
	  reversed = reversed*10+digit;
    }
	if(num2==reversed){
	   System.out.println(num2+" is a palindrome number");
	}
	else{
		System.out.println(num2+" is not palindrome number");
	}
    }
}
