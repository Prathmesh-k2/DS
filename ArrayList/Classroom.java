import java.util.*;
public class Classroom {
     
    //swping fuction
    public static void swping(ArrayList<Integer> list,int  idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        //add
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
         list.add(9);


        // System.out.println(list);
        // //get element
        // int ele=list.get(2);

    //      System.out.println(ele);
    //      //remove or delete
    //      System.out.println(list.remove(3));
         
    //     System.out.println(list);
    //     //set
    //     list.set(1,10 );
            
    //     System.out.println(list);
    //    //contains
    //    System.out.println(list.contains(5));
    //    //size
    //     System.out.println(list.size());

    //     for(int i=0; i<list.size();i++){
    //         System.out.print(list.get(i)+" ");
    //     }
    //     System.out.println();
    //     //reverse array listprint
    //   for(int i=list.size()-1; i>=0;i--){
    //         System.out.print(list.get(i)+" ");}

            //maximu number in array list
            int max=Integer.MIN_VALUE;
            for(int i=0; i<list.size();i++)        {
             if ( list.get(i)>max) {
                 max=list.get(i);
             }
}
System.out.println("Max number is :"+max);
int idx1=2, idx2=0;
System.out.println(list);
         swping(list, idx1, idx2);
         System.out.println(list);
         Collections.sort(list);
          System.out.println(list);
         
          
        }
      





        }   
    

