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

    //power of 2^n

    public static int  powerOF2(int n){
        if(n==0){
            return 1;
        }
        int pow=2*powerOF2(n-1);
        return pow;
    }
    //optimized power
    public static double optimizedPower(int a,int n){
        if(n==0){
            return 1;
        }
       double  halfpow= optimizedPower(a ,n/2);
        double halfpowsq=halfpow*halfpow;
        
        if(n%2!= 0){
            halfpowsq=a*halfpowsq;
        }
        return halfpowsq;
    }

//Tiling problem
public static int TilingProblem(int n){//2 * n (size of floor)
   if (n==0||n==1) {
    return 1;
   }
   //vertical choice
   int nm1=TilingProblem(n-1);
   //horizontal choice
   int nm2=TilingProblem(n-2);
   int total=nm1+nm2;
    return total;
}

//Remove duplicates 
public static void removeDuplicates(String str,int idx,StringBuilder newstr,boolean map[]){
   //base
    if(idx ==str.length()){
        System.out.println(newstr);
        return;
    }
    //kaam
    char currentChar =str.charAt(idx);
    if(map[currentChar-'a']==true){
        removeDuplicates(str, idx+1, newstr, map);
    }
    else{
        map[currentChar-'a']= true;
        removeDuplicates(str, idx, newstr.append(currentChar), map);
    }
}
    public static void main(String[] args) {
        int n=64;
        int a =2;
         //DecPrint(n);
         //IncPrint(n);
         //  System.out.println(factorial(n));
         // naturalSum(n);
         //  System.out.println(fib(n));
         // int arr[]={1,5,9,45,15,18};
         //  System.out.println(firstOccurance(arr, n, 0));
         //System.out.println(powerOF2(n));
         // System.out.println(optimizedPower(a, n));
          ///System.out.println(TilingProblem(4));
          String str="Prathmeshp";
          removeDuplicates(str, 0, new StringBuilder(), new boolean[26]);
    }


    
    
}
