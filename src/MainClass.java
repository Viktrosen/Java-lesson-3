 class MainClass {

     public static void main(String[] args) {
          String s = "Hello world";
          String s1 = "";
          Stack stack = new Stack(s.length());
          for (int i = 0; i < s.length(); i++) {
               stack.push(s.charAt(i));
          }

          for (int i = 0; i < s.length(); i++) {
               s1 = s1 + stack.pop();
          }
          System.out.println(s1);

     }
}
