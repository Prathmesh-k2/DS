import java.util.*;
public class Classroom {
     
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        //add
        list.add(5);
        list.add(15);
        list.add(45);
        list.add(45);

        System.out.println(list);
        //get element
        int ele=list.get(2);

         System.out.println(ele);
         //remove or delete
         System.out.println(list.remove(3));
         
        System.out.println(list);
        //set
        list.set(1,10 );
            
        System.out.println(list);
       //contains
       System.out.println(list.contains(5));
       //size
        System.out.println(list.size());

        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //reverse array listprint
      for(int i=list.size()-1; i>=0;i--){
            System.out.print(list.get(i)+" ");
        }   
    }
}
