public class BitManipulation {

    public static void oddeven(int n){
        int bitMask=1;
        if( (n & bitMask)==0){
            System.out.println("even Number");
        }
        else{
             System.out.println("Odd Number");
        }
        }
    
    public static void main(String args[]){
   oddeven(5);
   oddeven(7);
   oddeven(8);
    }
}
