import java.util.Scanner;
public class Palindromenum {
    public static void m1(int m){
        int rev=0;
        int digit=m%10;
        rev=rev*10+digit;
        m=m/10;

        if(rev==m){
            System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
    }

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n=sc.nextInt();
    m1(n);

}
}
