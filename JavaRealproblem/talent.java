import java.util.*;
public class talent{
      static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
      }
      static int sumDigit(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
      }
    static int frq(int arr[],int value){
        int count =0;
        for(int x:arr){
            if(x==value){
                count++;
            }
           
        }

        return count;
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int max = Integer.MIN_VALUE;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];

            if (arr[i] > max)
                max = arr[i];
        }
    
double avg= (double)sum/n;
 int result = 0;
 for(int i=0 ;i<n;i++){
    if(arr[i]<=avg){
        continue;
    }
    if(!isPrime(arr[i])){
        continue;
    }
    if(sumDigit(arr[i]) % 2!=0){
continue;
    } 
    if(arr[i] == max)
    continue;
        if (frq(arr, arr[i]) != 1)
                continue;
         result++;
 }
 System.out.println(result);
}
}
