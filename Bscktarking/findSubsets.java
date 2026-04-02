public class findSubsets {
    public static void subSet(String str,String ans,int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
        
            }
            else {
       System.out.println(ans);
    
            }
               return;
        }
        //recursion
        //yes choise
       
       
        //System.out.println(ans);
        //no choice
        subSet(str, ans, i+1);
         subSet(str, ans+str.charAt(i), i+1);
       // System.out.println(ans);
    }
    public static void main(String[] args) {
        String str="abc";
        subSet(str, "", 0);
    }
    
}
