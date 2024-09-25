	import java.util.Scanner;
	class SumOfDigit{
		public static void main(String[]args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int num = sc.nextInt();
			int sum = 0;
			while(num>0){
				int last_dig = num%10;
				num/=10;
				sum +=last_dig;
			}
			System.out.println("The Sum of digit is :" + sum);
		}
	}