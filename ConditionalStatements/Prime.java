import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number: ");
        int n=sc.nextInt();

        int count=0;

        if(n<=1){
            System.out.println("It is not a prime number");
        }

        else{

        for(int i=2;i<n;i++){
        if(n%i==0){
           count++;
           break;
        }
        }
    

        if(count==0)
        {
         System.out.println("It is primr number "+n);   
        }

       else
       {
         System.out.println("It is not a prime number "+n);
       }
    }
}
    
}

