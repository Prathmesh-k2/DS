import java.util.*;
public class MultiList {
      //multidimension Arraylist 
      public static void main(String[] args) {
        
      
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        // //ArrayList<Integer> list1=new ArrayList<>();

        //    list1.add(10);
        //    list1.add(20);
        // //   ArrayList<Integer> list2=new ArrayList<>();
        //     list2.add(30);
        //    list2.add(40);

        // //    mainList.add(list1);
        // //     mainList.add(list2);

        //     for(int i=0; i<mainList.size();i++){
        //         ArrayList<Integer> cureeList=mainList.get(i);
        //         for(int j=0; j<cureeList.size();j++){
        //             System.out.print(cureeList.get(j)+" ");
        //         }
        //         System.out.println();
        //     }
            System.out.println(mainList);
             ArrayList<Integer> list1=new ArrayList<>();
            ArrayList<Integer> list2=new ArrayList<>();
            ArrayList<Integer> list3=new ArrayList<>();
            for(int i=1; i<5;i++){
                list1.add(i*1);
                list2.add(i*2);
                list3.add(i*3);
            }
            mainList.add(list1);
            mainList.add(list2);
            mainList.add(list3);
            mainList.add(list1);

            System.out.println(mainList);


    
}
}
