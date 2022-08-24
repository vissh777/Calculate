package com.SADTLab.Calculator;
import java.util.Scanner;
public class Application 
{
    public static void main(String[] args) 
    {
        System.out.println("Simple Calculator");
        App cal = new App();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        cal.add(a, b);
        cal.mul(a, b);
        cal.sub(a, b);
        cal.div(a, b);
        sc.close();
    }
}
