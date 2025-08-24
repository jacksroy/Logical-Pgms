public class Star{
    public static void main(String args[]){
        int num=5;
        int a=1;
        for(int i=1;i<=num;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


//output
// 1
// 12
// 123
// 1234
// 12345
