//Remove duplicates from String

import java.util.Scanner;
public class Removedup {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        
        String str=sc.nextLine();

        StringBuilder result=new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);

            if(result.indexOf(String.valueOf(ch))==-1)
                 { 
                    result.append(ch);
        
        }

    }
    System.out.println("After removing duplicates: "+result);
    }
}
