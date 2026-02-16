public class toUpperString{
    public static String upper(String str){
        StringBuilder sb= new StringBuilder("");
        
        char ch=Character.toUpperCase(str.charAt(0));
      sb.append(ch);

      for (int i=1; i<str.length(); i++){
     if(str.charAt(i)==' ' && i<str.length()-1){
        sb.append(str.charAt(i));
        i++;
        sb.append(Character.toUpperCase(str.charAt(i)));

     }
     else{
        sb.append(str.charAt(i));
     }
    
      }
       return sb.toString();
       
    }

    //String compression
    public static String compression(String str){
        StringBuilder sb= new StringBuilder("");
         for (int i=0; i<str.length();i++){
            Integer count=1;
            while (i<str.length()-1&& str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count  > 1){
                sb.append(count.toString());
            }
         }
         return sb.toString();
    }
    public static void main(String args[]){
    String str="i am happy";
  System.out.println(upper(str));

  String  str2="aaabbbcccdd";
  System.out.println(compression(str2));

    }

}