package inttoeng;

import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int imput  = sc.nextInt();
		
		System.out.println(translateEng(imput));

	}
	
	//数値を英訳する変更メソッド
	static String translateEng(int n){
		String number = "";
		if(n>=10 && n<20){ //10〜19まで
			
			if(n==10) number = "ten";
			else if(n==11) number = "eleven";
			else if(n==12) number = "twelve";
			else if(n==13) number = "thirteen";
			else if(n==14) number = "fourteen";
			else if(n==15) number = "fifteen";
			else if(n==16) number = "sixteen";
			else if(n==17) number = "seventeen";
			else if(n==18) number = "eighteen";
			else number = "nineteen";
		}
		else if(n<100){ //20~99まで
			String tenplace ="";
			if(n/10 == 2) { //20~29
			    tenplace = "twenty";
				if(n%10 == 1) number = tenplace+"one";
			}
			
		}
		return number;
	}
	
	static String oneplace(int n) {
		String number = "";
		if(n<10){ //１〜9まで
			if(n == 1) number = "one";
			else if(n==2) number = "two";
			else if(n==3) number = "three";
			else if(n==4) number = "four";
			else if(n==5) number = "five";
			else if(n==6) number = "six";
			else if(n==7) number = "seven";
			else if(n==8) number = "eight";
			else  number = "nine";
		}
		return number;
	}

}
