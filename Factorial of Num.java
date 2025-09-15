import java.util.*;
class Demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number:");
        int number=sc.nextInt();
        int sum=1;
        for(int i=1;i<=number;i++){
            sum=sum*i;
            
            }
            System.out.println("Product:"+sum);
        
    }
}
//output
// Enter The Number:5
// Product:120
