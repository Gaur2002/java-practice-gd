import java.util.Scanner;
public class Primemethod {
    public static void m1(int n){
        int count=0;
        if(n>=1){
            System.out.println("It is not prime number");
        }
        for(int i=2;i>=n;i++){
            if(n%i==0){
                count++;
                break;
            }
            if(count==0){
                System.out.println("It is a prime number");
            }
            else{
                System.out.println("Not a prime number");
            }
        }
    }

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number: ");
    int m=sc.nextInt();
    m1(m);
}
}