// Print the smaller and larger number

import java.util.*;
class largerOrsmall{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();
        System.out.println("Enter another number: ");
        int num0 = s.nextInt();
        if(num > num0)
            System.out.println(num+" is greater");
        else 
            System.out.println(num0+" is greater");
      }
}
