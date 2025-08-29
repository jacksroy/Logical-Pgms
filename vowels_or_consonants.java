import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Enter a NUmber");
      Scanner sc=new Scanner(System.in);
      char num=sc.next().charAt(0);
      char val='a',val2='e',val3='i',val4='o',val5='u';
      char vall='A',vall2='E',vall3='I',vall4='O',vall5='U';
      if(num == val || num == vall || num == val2 || num == vall2 || num==val3 || num== vall3 || num==val4 || num == vall4 || num==val5 || num== vall5){
          System.out.println("Character is Vowel");
      }
      else{
          System.out.println("Character is Consonant");
      }
      sc.close();
  }
}
//Enter the Character:A
//Character is vowel


import java.util.*;
public class Vowels{
    public static void main(String args[]){
        System.out.print("Enter the Character:");
        Scanner sc=new Scanner(System.in);
        char num=sc.next().charAt(0);
        if("aeiouAEIOU".indexOf(num)!=-1){
            System.out.println("Character is vowel");
        }
        else{
            System.out.println("Character is Consonnant");
        }
    }
}

//Enter the Character:A
//Character is vowel
