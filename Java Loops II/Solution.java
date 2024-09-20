import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int count=0;
            int sum=0;
            int cons=0;
            while(count<n){
              if(count==0){
                  cons=1;
                  sum=a+(cons*b)+sum;
              }
              else{
                  cons=cons*2;
                  sum=(cons*b)+sum;
              }
                  System.out.print(sum+" ");
                  count++;
            
           
            }
             System.out.println();
        }
        in.close();
    }
}