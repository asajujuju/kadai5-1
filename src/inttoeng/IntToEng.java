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
		if(n==0)number = "zero";
		if(n<10) {
			number = oneplace(n);
		}
		else if(n<20){ //10〜19まで
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
			number = tenplace(n/10)+oneplace(n%10);	
		}
		else if(n<1000) {//99~1000まで
			number = oneplace(n/100)+"hundred"+tenplace(n/10)+oneplace(n%10);	
		}
		return number;
	}
	
	static String oneplace(int n) {
		String number = "";
		 //１〜9まで
		String[] num = {"","one","two","three","four","five","six","seven","eight","nine"};
		return number=num[n];
	}
	static String tenplace(int n) {
		String number = "";
		 //20~90まで
		String[] num = {"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
			return number=num[n-2];
	}
	
}
