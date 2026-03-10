import java.util.*;
public class Waterstore {
    //brute force apporch
    public static int StoreWater(ArrayList<Integer>height){
        int maxWater=0;
        for(int i=0 ;i<height.size(); i++){
            for(int j=0; j<height.size();j++){
                int ht=Math.min(height.get(i),height.get(j));
                int width=j-i;
                int cureeWater=ht*width;
                maxWater=Math.max(maxWater,cureeWater);
            }

        }

        return maxWater;
    }

    //2pointer apporach
    public static int StoreWater2(ArrayList<Integer>height){
        int maxWater=0;
        int lp=0;
        int rp= height.size()-1;
        while(lp<rp){
             int ht=Math.min(height.get(lp),height.get(rp));
                int width=rp-lp;
                int cureeWater=ht*width;
                  maxWater=Math.max(maxWater,cureeWater);

                  //updation
                  if(height.get(lp) <  height.get(rp)){
                    lp++;
                  }
                  else{
                    rp--;
                  }
        }
       

        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        height.add(8);
        System.out.println(StoreWater2(height));

    }

    

}
