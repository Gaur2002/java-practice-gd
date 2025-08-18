import java.util.Scanner;
public class SumandAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int size=sc.nextInt();

        System.out.println("Enter elements: ");
        int a[]=new int [size];

        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }

        int sum=0;
        int avg=0;

        for(int i=0;i<size;i++){
            sum=sum+a[i];
            
        }
        avg=sum/size;

        System.out.println("Sum :"+sum);
        System.out.println("Average: "+avg);

        
    }

    
}
