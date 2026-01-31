import java.util.*;
public class SubArray
{ 
    public static void MAxSubArraysum(int arr[])
     {
        int n=arr.length;
        int maxsum=Integer.MIN_VALUE;
        int currentSum=0;
        for (int i=0;i<n;i++)
            {
            int start=i;
          for(int j=i;j<n; j++)
             {
            int end=j;
            currentSum=0;
         for(int k=start; k<=end;k++)
               {
             currentSum+=arr[k];
               }
               System.out.println(currentSum);
               if(maxsum <currentSum){
                maxsum=currentSum;
               }
            }
            // System.out.println("maxsum is :"+maxsum);
        }
        System.out.println("maxsum is :"+maxsum);
    }
//prefix Array
    public static void MAxSubArraysump(int arr[])
     {
        int n=arr.length;
        int maxsum=Integer.MIN_VALUE;
        int currentSum=0;
        int prefix[]=new int[arr.length];
         prefix[0] = arr[0];
        //calculate prefix array
    
for(int i = 1; i < prefix.length; i++){
    prefix[i] = prefix[i-1] + arr[i];
}

        for (int i=0;i<n;i++)
            {
            int start=i;
          for(int j=i;j<n; j++)
             {
            int end=j;
            currentSum= start == 0? prefix[end]:prefix[end]-prefix[start-1];
       
               System.out.println(currentSum);
               if(maxsum <currentSum){
                maxsum=currentSum;
               }
            }
            // System.out.println("maxsum is :"+maxsum);
        }
        System.out.println("maxsum is :"+maxsum);
    }
 public static void kadanes(int num[]){
    int ms = Integer.MIN_VALUE;
    int cs =0;

    for (int i=0; i<num.length;i++){
        cs = cs+num[i];
        if(cs < 0){
            cs =0;
        }
        ms =Math.max(cs ,ms);
    }
    System.out.println("max subarray is :"+ms);
 }

public static void main(String[] args) {
     int Arr[]={-2,-3,4,-1 ,-2, 1,5 ,-3};
   //MAxSubArraysump(Arr);
   int ms = Integer.MIN_VALUE;
    // System.out.println(ms);
kadanes(Arr);

}
}