import java.util.Scanner;
//Leetcode Problem 1
// Sum of the 2 digit numbers equal to target
public class Solution {

    public static int[] twoSum(int[] num, int target) {
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i] +num[j] ==target ){
                    System.out.println( i +"," +j);
                    return new int [] {i,j};
                    
                }
            }
        }
        return  new int[] {};
    }


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n =sc.nextInt();
            int[] num = new int[n];
            
            if(n <2) {
                System.out.println();
            }
            for(int i=0;i<num.length;i++){
                num[i] =sc.nextInt();
            }
            int target= sc.nextInt();
            twoSum(num,target);
            // if(res.length ==2){
            //     System.out.println(res[0] +"," +res[1]);
            // }
            // else {
            //     System.out.println("No two sum solution found.");
            // }
        }

    }
}
  