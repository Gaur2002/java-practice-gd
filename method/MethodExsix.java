//Non-static-void argument
import java.util.Scanner;
public class MethodExsix {
    public void m1(String name){
        System.out.println("Hello"+ " "+name);
    }
    public static void main(String args[]){
        System.out.println("Enter username: ");
        Scanner sc=new Scanner(System.in);
        String username=sc.nextLine();

        MethodExsix obj=new MethodExsix();
        obj.m1(username);
        


    }

    
}
