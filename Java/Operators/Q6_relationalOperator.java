// Program for relational operators (<,<==, >, >==)

import java.util.*;
class relationalOperator{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();
        System.out.println("Enter another number: ");
        int num0 = s.nextInt();
        
        if(num > num0)
            System.out.println(num+" is greater");
        else if(num < num0)
            System.out.println(num0+" is greater");

        if(num >= 0)
            System.out.println(num+" is a positive number");

        if(num <= 0)
            System.out.println(num+" is less then or equal to 0");    

        
    }
}
