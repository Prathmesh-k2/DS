public class Substring {
    public static String printSunString(String str,int si,int li){
       String subset="";
        for(int i=si;i<li;i++){
            subset+=str.charAt(i);
        }
        return subset;
    }
    public static void main(String args[]){
        String str="Hello world";
        System.out.println(printSunString(str, 0, 4));
    }
}
        