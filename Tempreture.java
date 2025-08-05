import java.util.Scanner; 
public class Tempreture{
       
    public static void main(String[] args){
        double f;
        
        System.out.println("Enter temprature in celsius: ");
        Scanner sc= new Scanner(System.in);
        int c=sc.nextInt();

        f = ((9/5 * c) + 32);
        //c=5/9 * (f - 32)) 
        System.out.println("Temperature in Faranite: "+f);

    }
}
     
