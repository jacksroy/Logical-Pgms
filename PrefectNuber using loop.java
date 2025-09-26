import java.util.*;
public class Logical {
    public static void main(String args[]){
        System.out.println("Enter the Number:");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int result=0;
        for(int i=1;i<a/2;i++){  //using a/2 is better to reduce the no.of loop and work load on system
            if(a%i==0){
                result +=i;
            }
            
        }
        System.out.println(result);
        String output = (a==result)?"Prefect Number":"Not A prefect Number";
        System.out.println(output);

    }

    
}

