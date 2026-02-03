public class StringShortestpath {
    public static float shoterstPat(String str){
        int x=0,y=0;
        int n=str.length();
        for (int i=0; i<n;i++){
           if(str.charAt(i) =='S'){
            --y;
        }
           else if(str.charAt(i) =='N'){
            ++y;
           }
           else if(str.charAt(i) =='W'){
            --x;
        }
       else{
            ++x;
    }
    
}
  int x2=(x*x);
  int y2=(y*y);
     return (float)Math.sqrt(x2+y2);
    }
    public static void main(String args[]){
        String str="WNEENESENNN";
       System.out.println(  shoterstPat(str));
    }
}

