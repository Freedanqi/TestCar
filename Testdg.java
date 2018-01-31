public class Testdg {
   public static void main(String[] args) {
      System.out.println(fanzhuan("javaabcdlinuxdcba"));      
   }

   public static String fanzhuan(String s) {  
      int length = s.length();  
      if (length <= 1)  {
          return s;  
      }
      String left = s.substring(0, length / 2);  
      String right = s.substring(length / 2, length);  
      return fanzhuan(right) + fanzhuan(left);   

   }
}
