 import java.util.Scanner;
 class Print2DArr{
 public static void main(String []args){
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the row value");
	 int n = sc.nextInt();
	 System.out.println("Enter the column value");
	 int m = sc.nextInt();
	 int arr[][] = new int[n][m];
	  System.out.println("Enter the value in array");
	 for(int i=0;i<arr.length;i++){
		 for(int j=0;j<arr.length;j++){
			 arr[i][j] = sc.nextInt();
		 }
	 }
	 System.out.println("The Array is the :");
	 for(int i=0;i<arr.length;i++){
		 for(int j=0;j<arr.length;j++){
			 System.out.print(" "+arr[i][j]);
		 }
		 System.out.println(" ");
	 }
 }
 }