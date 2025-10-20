package org.example;


public class Main {
    public static void main(String[] args) {
        
        int num1 = 0;  
        int num2 = 1;  
        int actual = num1 + num2;

        for (int i = 0; i < 10; i++) {
            System.out.println(num1);
            actual = num1 + num2;
            num1 = num2;
            num2 = actual;
        }
    }
}