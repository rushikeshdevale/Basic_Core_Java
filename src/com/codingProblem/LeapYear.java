package com.codingProblem;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
            System.out.println("Enter the year");
            Scanner sc = new Scanner(System.in);
            int year = sc.nextInt();
            sc.close();
            if(year>999 && year<9999) {
                if (((year%4==0) && (year%100!=0)) || (year%400==0)) {
                    System.out.println("This year is leap year");
                }
                else {
                    System.out.println("This year is Not-leap year");
                }
            }else {
                System.out.println("Enter valid year");
            }

        }
}
