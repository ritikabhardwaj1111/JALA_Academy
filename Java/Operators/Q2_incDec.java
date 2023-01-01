// Write a method for increment and decrement operators(++, --)

import java.util.*;
class incDec{
    public static int inc(int a){
        return (++a);
    }
    public static int dec(int a){
        return (--a);
    }
  
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num0 = s.nextInt();
        System.out.println("Increment: "+(inc(num0)));
        System.out.println("Decrement: "+(dec(num0)));
     
    }
}
