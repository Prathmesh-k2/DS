public class Array {
     public static void printArr(int[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         System.out.print(var0[var1] + " ");
      }

      System.out.println();
   }

   public static void changeArr(int arr[],int i, int val){
    //base
      if(i==arr.length){
        printArr(arr);
        return;
      }
    arr[i]=val;
    printArr(arr);
    changeArr(arr, i+1, val+1);
    arr[i]=arr[i]-2;
    printArr(arr);
   }

    public static void main(String[] args) {
        int arr[]=new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
