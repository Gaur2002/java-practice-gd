import java.util.Scanner;
public class Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String: ");
        String str=sc.nextLine();

        System.out.println("Enter Sub String: ");
        String sub=sc.nextLine();

        int count=0;
        int index=0;

        while((index=str.indexOf(sub,index))!=-1)
        {
            count++;
            index++;

        }
        System.out.println("Count = " + count);  
    }
}
