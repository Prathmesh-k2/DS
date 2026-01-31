import java .util.*;
public class Sorting {
          public static void bubblesort (int arr[]){
            int n=arr.length;
            for(int i=0; i<n-1;i++){
                for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printArray(int arr[]){
        for (int n : arr) {
            System.out.print(n +" ");
        }
        System.out.println();

    }

    public static void selectionsort(int arr[]){
        for (int i=0; i<arr.length-2;i++){
              int minpos=i;
            for (int j=i+1; j<arr.length;j++){
                     if (arr[minpos] >arr[j]) {
                          minpos=j;
                     }
            }
            //swap
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }

    public static void InsertionSort(Integer arr[]){
        for(int i=1; i<arr.length;i++){
            int cuurent =arr[i];
            int  prev = i-1;
            while(prev >= 0 && arr[prev] > cuurent){
                      arr[prev+1]=arr[prev];
                      prev--;

            }
            arr[prev+1] = cuurent;

        }
    }

    //count sort
    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        //sorting 
        int j=0;
        for (int i=0; i<count.length;i++){
             while (count[i]>0){
                arr[j] =i;
                j++;
                count[i]--;

             }
        }
    }
    public static void main(String args[]){
        int  arr[]={5,4,1,3,2};
        // bubblesort(arr);
        // printArray(arr);
        // selectionsort(arr);
        // InsertionSort(arr);
       // Arrays.sort(arr);// nlog n
       // Arrays.sort(arr,Collections.reverseOrder());
       countingSort(arr);
        printArray(arr);
    }
}
