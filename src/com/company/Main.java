package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int counter = 0;
        System.out.print("Enter a string to check: ");

        Scanner read = new Scanner(System.in);
        String userIn = read.nextLine();
        char[] vowel = new char[]{'a','A','e','E','i','I','o','O','u','U','y','Y'};

        for(int i=0;i<userIn.length();i++){
            if(vowelExist(vowel,userIn.charAt(i),userIn.length())){
                counter++;
            }
        }
        System.out.println("Number of vowels is " + counter);
    }
    static boolean vowelExist(char a[],char letter, int size){
        for(int i=0;i<a.length;i++){
            if(letter == a[i]){
                return true;
            }
        }
        return false;
    }
}
