//Static-void argument
import java.util.Scanner;
public class MethodExfive {
    public static void m1(String name){
        System.out.println("Hello"+" "+name);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username: ");
        String username=sc.nextLine();
        m1(username);
    
}
}
