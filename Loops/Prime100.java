public class Prime100{
    public static void main(String [] args){
        System.out.println("Prime numbers from 1 to 100:");
        int count =0;
        for(int n=2;n<=100;n++){
            for(int i=2;i<n;i++){
                if(n/i==0){
                    count++;
                    break;
                }
            }
        
        if(count==0){
            System.out.println(" "+n);
        }
    }
    }
}