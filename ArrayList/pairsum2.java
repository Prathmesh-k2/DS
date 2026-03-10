import java.util.*;
public class pairsum2 {
    public static boolean pairsum21(ArrayList<Integer>list,int target) {
      int pi=-1;
      int n= list.size();
      for(int i=0; i<list.size()-1;i++){

        if(list.get(i) > list.get(i+1)){
                pi=i;
                break;
        }
      }
      int lp=pi+1;
      int  rp=pi;
      while(lp!=rp){
        if((list.get(lp) + list.get(rp))==target){
            return true;
        }
        else if((list.get(lp) + list.get(rp)) >target){
            rp= (n+rp-1)%n;
        }
        else{
            lp=(lp+1)%n;
        }
      }
      return false;
    }
    
     public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

       list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairsum21(list,2));
}
}