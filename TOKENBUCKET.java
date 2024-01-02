import java.util.Scanner;
public class TOKENBUCKET{
    public static void main(String[] args) throws InterruptedException{
        int tokens=0,rate=5,capacity=10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of cycles: ");
        int n=sc.nextInt();
        int requests[] = new int[n];
        System.out.println("Enter the no. of packets to forward per cycle: ");
        for(int i=0;i<n;i++){
            requests[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            tokens = Math.min(tokens+rate,capacity);
           Thread.sleep(1000);
            System.out.print("tokens intially: "+tokens+" ");
            if(tokens>=requests[i]){
                tokens-=requests[i];
                System.out.println("Request granted,"+"tokens remaining: "+tokens+" ");
            }else{
                System.out.println("Request denied,"+"tokens remaining: "+tokens+" ");
            }
        }
        sc.close();
    }
}
