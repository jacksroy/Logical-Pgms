

public class Min {
    public static void main(String[] args) {

    /*  what is greater  than MIN_VALUE and 0.0D;
    what is greater  than MIN_VALUE and 0.0F;
     
    */
        System.out.println( "Double Min value : "+Double.MAX_VALUE); // it will gives the positive value
         System.out.println( "Float Min value : "+Float.MAX_VALUE);
        System.out.println("Integer Min Value : "+Integer.MIN_VALUE); // Will always give -ve value

        System.out.println( "Long Min Value : "+java.lang.Long.MIN_VALUE); // Will always give -ve values


        System.out.println(Math.min(Double.MIN_VALUE, 0.0D));// Double.Min_value is positive > 0.0D
        System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY)); // Double.MIN_VALUE > the -Infinity
        System.out.println(Math.min(Double.MIN_VALUE, Double.POSITIVE_INFINITY));
    }
}
