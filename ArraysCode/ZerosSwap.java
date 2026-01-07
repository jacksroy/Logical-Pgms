import java.util.Scanner;

//Swap the zeros at the right of the array

class ZerosSwap {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num=sc.nextInt();
            int[] arr = new int[num];
            int[] arr1 =new int[arr.length];
            int count =0;
            if(arr.length ==0){
                System.out.println("Array is Empty");
            }
            for(int i=0;i<arr.length;i++){
                arr[i] =sc.nextInt();
                if(arr.length ==1){
                    System.out.println(arr[i]);
                }
                else if(arr[i] !=0){
                    arr1[count] =arr[i];
                    count ++;
                }
            }
            for(int n:arr1){
                System.out.print(n + " ");
            }

        }
    }
}