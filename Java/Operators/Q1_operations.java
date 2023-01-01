// Write a function for arithmetic operators(+,-,*,/)

import java.util.*;
class operations{
    public static int add(int a , int b){
        return (a+b);
    }
    public static int sub(int a , int b){
        return (a-b);
    }
    public static int mul(int a , int b){
        return (a*b);
    }
    public static int div(int a , int b){
        return (a/b);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first num: ");
        int num0 = s.nextInt();
        System.out.println("Enter the second num: ");
        int num1 = s.nextInt();
        System.out.println(add(num0,num1));
        System.out.println(sub(num0,num1));
        System.out.println(mul(num0,num1));
        System.out.println(div(num0,num1));
    }
}
