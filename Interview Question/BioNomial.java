  import java.util.Scanner;
  class BioNomial{
	  public static void main(String[]args){
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the N value");
		  int n = sc.nextInt();
		  System.out.println("Enter the R value");
		  int r = sc.nextInt();
		  int factn = 1;
		  int factr = 1;
		  int subFact = 1;
		  for(int i=1;i<=n;i++){
			  factn *=i;
		  }
		  for(int i=1;i<=r;i++){
			  factr *=i;
		  }
		  int subMinus = n-r;
		  for(int i=1;i<=subMinus;i++){
			  subFact *=i;
		  }
		  float bioNomial = factn/(factr*subFact);
		  System.out.println("The BioNomial Number is :" + bioNomial);
	  }
  }