package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your test score: ");
       double score = scan.nextInt();

        if( score % 10== 7 || score % 10== 8 ||score % 10== 9 )
            System.out.print("A+");
        else if( score % 10== 0 || score % 10==1 ||score % 10==2)
           System.out.print("A-");
        else if (score>60 && score<69)
            System.out.print("D");
        else if( score % 10== 3 || score % 10==4 ||score % 10==5 ||score % 10==6 )
            System.out.print("");
       /* Enter the grades example above. Modify the program so a student could get a 'D'
        if they score between 60 and 69. Also, modify the program to print a + or - after the letter grade based on the last digit of the score.
                If the last digit is between 0 and 2 then print a - after the grade. If the last digit is 7,8 or 9 then print a + after the grade.
        Otherwise don't print a + or - if the last digit is between 3 and 6. Change the output to print the student's grade.*/

    }
}
