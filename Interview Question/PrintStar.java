	/*
			* * * *
			* * * *
			* * * *
			* * * *
			
	*/
		/*
						import java.util.Scanner;
						class PrintStar{
						public static void main(String []args){
							Scanner sc = new Scanner(System.in);
							System.out.println("Enter the number");
							int num = sc.nextInt();
							for(int i=0;i<num;i++){
								for(int j=0;j<num;j++){
									System.out.print(" * ");
								}
								System.out.println(" ");
							}
						}
						}
		*/
		
	/*
		1 1 1 1
		2 2 2 2
		3 3 3 3
		4 4 4 4 
	*/	

			/*
						import java.util.Scanner;
						class PrintStar{
							public static void main(String []args){
								Scanner sc = new Scanner(System.in);
								System.out.println("Enter the number for pattern");
								int num = sc.nextInt();
								for(int i=0;i<num;i++){
									for(int j=0;j<num;j++){
										System.out.print(" "+i);
									}
									System.out.println(" ");
								}
							}
						}
			*/


	/*
			1 2 3 4
			1 2 3 4
			1 2 3 4
			1 2 3 4
	*/
				
	/*			
				import java.util.Scanner;
				class PrintStar{
					public static void main(String[]args){
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter the Size");
						int n = sc.nextInt();
						for(int i=1;i<=n;i++){
							for(int j=1;j<=n;j++){
								System.out.print(" "+ j);
							}
							System.out.println();
						}
					}
				}
			
	*/

		
		/*
			1 2 3 
			4 5 6 
			7 8 9
		*/

		/*
				
			import java.util.Scanner;
				class PrintStar{
				public static void main(String[] args){
					Scanner sc = new Scanner (System.in);
					System.out.println("Enter the Size");
					int n = sc.nextInt();
					int count =1;
					for(int i=0;i<n;i++){
						for(int j=0;j<n;j++){
							System.out.print(" "+count);
							count++;
							
						}
						System.out.println();
					}
				}
			}
			
	*/		
			
		/* 
			A B C D
			E F G H
			I J K L 
		*/
			
		/*	
				import java.util.Scanner;
					class PrintStar{
						public static void main(String []args){
							Scanner sc = new Scanner(System.in);
							System.out.println("Enter the Size");
							int n = sc.nextInt();
							char ch ='A';
							for(int i=0;i<n;i++){
								for(int j=0;j<n;j++){
									System.out.print(" "+ch);
									ch++;
								}
								System.out.println();
							}
						}
					}
					
	    */



			/* 
				*
				* *
				* * *
				* * * *
				* * * * *
			*/

			/*
				import java.util.Scanner;
				class PrintStar{
					public static void main(String []args){
						Scanner sc = new Scanner(System.in);
						System.out.println("Enter the Size");
						int n = sc.nextInt();
						for(int i=0;i<n;i++){
							for(int j=0;j<i+1;j++){
								System.out.print(" "+"*");
							}
							System.out.println();
						}
					}
				}
				
	*/

			
		/*
			1 
			2 2
			3 3 3
			4 4 4 4
		*/

	/*
			import java.util.Scanner;
			class PrintStar{
				public static void main(String []args){
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter the Size");
					int n = sc.nextInt();
					for(int i=1;i<=n;i++){
						for(int j=1;j<i+1;j++){
							System.out.print(" "+i);
						}
						System.out.println();
					}
				}
			}
			
	*/

			
			/*
				A 
				B B 
				C C C
				D D D D 
			*/

	/*			
				import java.util.Scanner;
				class PrintStar{
					public static void main(String []args){
						Scanner sc = new Scanner(System.in);
						System.out.println("Enter the Size");
						int n = sc.nextInt();
						char ch = 'A';
						for(int i=0;i<n;i++){
							ch++;
							for(int j=0;j<i+1;j++){
								
								System.out.print(" "+ch);
								
							}
							System.out.println();
								
						}
					}
				}
				
	*/

			/*
				Reverse Triangle
				
				1
				2 1
				3 2 1
				4 3 2 1
			*/

		
		/*
				import java.util.Scanner;
				class PrintStar{
					public static void main(String []args){
						Scanner sc = new Scanner(System.in);
						System.out.println("Enter the Size");
						int n = sc.nextInt();
						for(int i=0;i<n;i++){
							for(int j=i+1;j>0;j--){
								System.out.print(" "+j);
							}
							System.out.println();
						}						
					}
				}
				
		*/

			
			/*
				1 
				2 3
				4 5 6
				7 8 9 10
			*/

	/*		
			
			import java.util.Scanner;
				class PrintStar{
					public static void main(String []args){
						Scanner sc = new Scanner(System.in);
						System.out.println("Enter the Size");
						int n = sc.nextInt();
						int num =1;
						for(int i=1;i<=n;i++){
							for(int j=1;j<i+1;j++){
								System.out.print(" "+num);
								num++;
							}
							System.out.println();
						}
					}
				}
	*/


			/*
				Reverse of triangle pattern of character
				A 
				B A 
				C B A 
				D C B A 
			*/

				import java.util.Scanner;
				class PrintStar{
					public static void main(String []args){
						Scanner sc = new Scanner(System.in);
						System.out.println("Enter the Size");
						int n = sc.nextInt();
						char ch = 'A';
						for(int i=0;i<n;i++){
							for(int j=i+1;j>0;j--){
								System.out.print(" "+ch[j--]);
								ch++;
								
							}
							System.out.println();
						}
					}
				}