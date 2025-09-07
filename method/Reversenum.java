import java.util.Scanner;

public class Reversenum {
   public static void m1(int n){
    int rev=0;

    int digit=n%10;
    rev=rev+n*10+digit;
    n=n/10;
   System.out.println("Revesrse number: "+rev);
   }
    
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int m=sc.nextInt();
        m1(m);
 
    }
}
