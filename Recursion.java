public class Recursion {
    //decresing num orint
    public static void DecPrint(int n){

        if(n==1){
            System.out.println(" "+ n);
            return ;
        }
        System.out.print(" "+n);
        DecPrint(n-1);
    }
 //incresing num print 
        public static void IncPrint(int n){

        if(n==1){
            System.out.print(n );
            return ;
        }
         IncPrint(n-1);
        System.out.print(" "+n);
        
         
    }
    //factorial
    public static int  factorial(int n)
    { if (n==0) {
           return 1;
    }
   int fnm1=factorial(n-1);
     int ft= n*fnm1;
     return ft;
    }

//natural numbers sum 
public static int  naturalSum(int n){

    if(n==1){
    
       return 1;  
    }
    int sum=n + naturalSum(n-1);
    System.out.println(sum);
    return sum;

}
//fib number
    public static int fib(int n){
        if(n==0){
        return 0;
        }
        else if(n==1){
            return 1;
        }
        // int fib1=fib(n-1);
        // int fib2=fib(n-2);
        // int fibfinal=fib1+fib2;
        int fibfinal=fib(n-1)+fib(n-2);
        return fibfinal;
    }
    //first occurance 
    public static int firstOccurance(int arr[],int key , int i){ 
        if(i==arr.length){
            return -1;
        }
    if(arr[i]==key){
        return i;
    }
   return firstOccurance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int n=18;
        //DecPrint(n);
        //IncPrint(n);
      //  System.out.println(factorial(n));
        // naturalSum(n);
     //  System.out.println(fib(n));
     int arr[]={1,5,9,45,15,18};
     System.out.println(firstOccurance(arr, n, 0));
    }


    
    
}
