//Static returntype argument

import java.util.Scanner;
public class MethodExseven {
    public static String m1(String name){
        System.out.println("Welcome");
        return name;
    }
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username: ");
        String username=sc.nextLine();
        System.out.println("Hello " + m1(username));
    
}
}

    
