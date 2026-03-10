import java.util.*;

public class pairsum1 {
    public static boolean pairsum(ArrayList<Integer>List, int target){
        for(int i=0; i<List.size();i++){
            for(int j=1; j<List.size(); j++){
                if((List.get(i) + List.get(j)==target)){
                      return true;
                }
            }
        }

        return false;
    }
    //2 pointer Apporch
      public static boolean pairsum2(ArrayList<Integer>List, int target){
        int lp =0;
        int rp=List.size()-1;
        while(lp < rp){
            if((List.get(lp) + List.get(rp)==target)){
                      return true;
        }
        //updation
        else if((List.get(lp) + List.get(rp) > target)){
                       rp--; 
                }
                else{
                    lp++;
                }
    }
     return false;
}
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

       list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
System.out.println(pairsum2(list, 9));

    }
    
}

