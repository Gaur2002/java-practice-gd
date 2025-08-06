import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        int n1=sc.nextInt();
        System.out.println("Enter n1: ");

        int n2=sc.nextInt();
        System.out.println("Enter n2: ");

        char operator =sc.next().charAt(0);
        System.out.println("Enter ");

        switch(operator){

            case '+' :
            int r=n1+n2;
            System.out.println("Addition: "+r);

            case '-' :
            r=n1-n2;
            System.out.println("Addition: "+r);

            case '*' :
            r=n1*n2;
            System.out.println("Addition: "+r);

            case '/' :

            if(n2!=0)
            {
              r=n1/n2;
              System.out.println("Addition: "+r);
            }
            else{
                System.out.println("Invalid ");
            }

            default:
            System.out.println("Invalid entry ");
        }

    }
}

