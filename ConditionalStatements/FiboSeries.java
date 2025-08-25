import java.util.Scanner;
public class FiboSeries {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        if (n == 0) {
            System.out.println("Fibonacci number at position 0 = 0");
        } else if (n == 1) {
            System.out.println("Fibonacci number at position 1 = 1");
        } else {
            int a = 0, b = 1, c = 0;

           
            for (int i = 2; i <= n; i++) {
                c = a + b; 
                a = b;     
                b = c;
            }

            System.out.println("Fibonacci number at position " + n + " = " + b);
        }

        sc.close();
    }
}

    

