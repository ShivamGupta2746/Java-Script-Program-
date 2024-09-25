	import java.util.*;
	class SumElement2DArr{
		public static void main(String []args){
			Scanner sc = new Scanner(System.in);
			int sum = 0;
			System.out.println("Enter the Size of first array");
			int n = sc.nextInt();
			System.out.println("Enter the Size of second Array");
			int m = sc.nextInt();
			int arr[][] = new int[n][m];
			System.out.println("Enter the value in array");
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr.length;j++){
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println();
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr.length;j++){
					sum += arr[i][j];
				}
			}
			System.out.println("The Sum of Element is : "+ sum);
		}
	}