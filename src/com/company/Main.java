package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //code1();
        //code2();
        //code3();
        //code4();
    }
        public static void code1() {
            Random random = new Random();
            char[] favouriteChars = {'a', 'z', 'w', 'c'};

            for (char favouriteChar : favouriteChars) {
                System.out.println(favouriteChar);
            }
        }
        public static void code2() {
            Scanner input = new Scanner(System.in);
            int[] uArr = new int[5];
            for (int i = 0; i < uArr.length; i++) {
                System.out.println("Please input a number");
                int uInput = input.nextInt();
                uArr[i] = uInput;
            }
            Arrays.sort(uArr);
            System.out.println("Your array sorted is : " + Arrays.toString(uArr));
            System.out.println("The average of your array is : " + (uArr[0] + uArr[1] + uArr[2] + uArr[3] + uArr[4]) / 5);
        }
        public static void code3 () {
            char[] vowels = {'u', 'o', 'i', 'e', 'a'};
            char[] consonants = new char[21];

            int newChar = 0;
            boolean found;
            for (char i = 'a'; i <= 'z'; i++) {
                found = false;
                for (int j = 0; j < vowels.length; j++) {
                    if (vowels[j] == i) {
                        found = true;
                        break;
                    }
                }
                    if (!found){
                        consonants[newChar] = i;
                        newChar++;
                    }

            }
            Arrays.sort(vowels);
            System.out.println(Arrays.toString(vowels));
            System.out.println(Arrays.toString(consonants));
        }
        public static void code4(){
            Random random = new Random();
            int randPos =  random.nextInt(5);
            int randpos1 =  random.nextInt(5);
            String [][] board = new String[5][5];
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    board[i][j] = board[randPos][randpos1];
                }
                System.out.println(board);
                //doesnt work
            }
        }
    }



