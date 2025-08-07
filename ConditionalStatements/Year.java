import java.util.Scanner;
public class Year {
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter year: ");
          int n=sc.nextInt();
        if((n%4==0 && n%100!=0 )||(n%400==0)){
            System.out.println("Year is leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
        

    }
    
}
