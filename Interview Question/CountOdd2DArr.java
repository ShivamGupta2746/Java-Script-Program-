	import java.util.*;
	class CountOdd2DArr{
		public static void main(String []args){
			Scanner sc = new Scanner(System.in);
			int count;
			System.out.println("Enter the First Array Size");
			int n = sc.nextInt();
			System.out.println("Enter the Second Array Size");
			int m = sc.nextInt();
			int arr[][] = new int[n][m];
			System.out.println("Enter the value in Array");
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr.length;j++){
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println();
			for(int i=0;i<arr.length;i++){
				count = 0;
				for(int j=0;j<arr.length;j++){
					if(arr[i][j] % 2 ==0){
						System.out.println("Even : "+ arr[i][j]);
						count++;
						break;
					}
					
				}
			}
		}
	}