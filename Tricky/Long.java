//what Happen when we use L in long and without l 

public class Long {
    public static void main(String[] args) {
        long a =231455676;
        long b = 231456243;
        long c =a*b; // without L it will overflow and treat as int only when it was long data type
        System.out.println(c);

        //so when we use L it will treat as long only
        long d =2314556724356786546L; //we can use  small(l) also but it is not recommended
        long e = 231456234567234543L;   // L means long  
        long f =d*e;
        System.out.println(f);
    }
}
