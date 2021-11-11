package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
         String myName ;
//        String address = "Kommunisticheskaya 17";
//        System.out.println("Name:" + myName + " , addess:" + address);

        final int NUM = 16;
        String word = "Друзья";
        System.out.println(NUM);
        myName= NUM + word;
        System.out.println(myName);
        if (NUM<0){
            System.out.println("Вы сохранили отрицательное число");
        }else if (NUM>0){
            System.out.println( " Вы сохранили положительное число");
        }
        else {
            System.out.println("Вы сохраниои нуль");
        }
        System.out.println("Введите ваше имя:");

        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.print("Здравствуйте"+ " " + name);




    }
}
