//Write a program to sort frames using appropriate sorting techniques
//import java.util.ArrayList; import java.util.List; import java.util.Scanner; import java.util.Random; import java.util.Collections;
//( we can use * instead of importing all these seperately)
import java.util.*;
public class framesort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int n;
        List<int[]> frames = new ArrayList<>();
        System.out.println("enter the number of frames to be sorted:");
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("enter the data for the frame "+i+" :");
            int data = sc.nextInt();
            int seqnum = rand.nextInt(1000);//assigning random number below 1000 to seqnum
            frames.add(new int[]{seqnum,data});
        }
        System.out.println("before sorting");
        for(int[] i : frames){
            System.out.println("seqnum->"+i[0]+"data->"+i[1]);
        }
        frames=sortframe(frames);
        System.out.println("after sorting");
        for(int[] i : frames){
            System.out.println("seqnum->"+i[0]+"data->"+i[1]);
        }
        }
        public static List<int []> sortframe(List<int []> frames){
            Collections.sort(frames,(a,b)->Integer.compare(a[0],b[0]));
            return frames;
        }
        }
/*output
 enter the number of frames to be sorted:
5
enter the data for the frame 1 :
12
enter the data for the frame 2 :
143
enter the data for the frame 3 :
12
enter the data for the frame 4 :
122
enter the data for the frame 5 :
12
before sorting
seqnum->64data->12
seqnum->464data->143
seqnum->932data->12
seqnum->586data->122
seqnum->660data->12
after sorting
seqnum->64data->12
seqnum->464data->143
seqnum->586data->122
seqnum->660data->12
seqnum->932data->12
*/
//the frames get sorted according to sequence numbers(seqnum)
