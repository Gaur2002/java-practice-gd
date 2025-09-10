import java.util.Scanner;
public class Evenorodd{

    public static void m1(int n){
        if(n%2==0){
            System.out.println("It is an even number");
        }
        else {
            System.out.println("It is an odd number");
        }

    }

public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number: ");
    int m=sc.nextInt();
    m1(m);

}
}