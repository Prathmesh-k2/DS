public class quickSort {
     public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quickSort1(int arr[] ,int si,int ei){
        if(si>=ei){
            return;
        }
      //last element
      int piIndex=parttion(arr, si, ei);
      quickSort1(arr, si, piIndex-1);
      quickSort1(arr, piIndex+1, ei);
    }
    public static int  parttion(int arr[] ,int si,int ei){
         int pivot=arr[ei];
         int i=si-1;
         for(int j=si; j<ei;j++){
            if(arr[j] <= pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
         }
          i++;
                int temp=pivot;
                arr[ei]=arr[i];
                arr[i]=temp;
                return i;

    }
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
       quickSort1(arr, 0,arr.length-1);
       printArr(arr);

        
    }
}
