//Non static Return type argument

import java.util.Scanner;
public class MethodExeigth {
    public String m1(String name){
        System.out.println("Welcome");
        return  "hello"+" "+name;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username: ");
        String username=sc.nextLine();

        MethodExeigth obj=new MethodExeigth();
        obj.m1(username);
    }
}
