public class Two {
   public static void main(String[] args) {
  

    // but in case of floating point it will show Infinity
    System.out.println(0.0/0.0); // It will show NaN
    System.out.println(12.0/0.0); // It will show Infinity
    System.out.println(-12/0.0); // It will show -Infinity
    //because floating point follow IEEE 754 standard for floating point arithmetic because it can round off the value and some other things with floating point arithmetic 


      System.out.println(0/0); // It will show the  Exception ArithmeticException: / by zero
    System.out.println(12/0); // It will show the  Exception ArithmeticException: / by zero
   } 
}
