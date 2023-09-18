package com.GUSTAV.demo;

import com.GUSTAV.demo.model.Student;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        //instanciate

        Student benny = new Student("Benny", 15, true);
        Student frida = new Student("Frida",22, false);


        System.out.println(benny.name);
        System.out.println(benny.age);
        System.out.println(benny.isTired);
        if (benny.isTired){
            System.out.println("Dang, i'm tired bruh");
        }else{
            System.out.println("Dang, i'm not tired bruh");
        }

        System.out.println(frida.name);
        System.out.println(frida.age);
        System.out.println(frida.isTired);
        if (frida.isTired){
            System.out.println("Dang, i'm tired bruh");
        }else{
            System.out.println("Dang, i'm not tired bruh");
        }











     /*int sum = 0;
        System.out.println(addition(15,15));
        sum = addition(15,15);

        System.out.println(sum);

        /*#1 Visibility, Modifier : public, protected. no-mod, private
          #2 Static: exclude if not needed
          #3 DataType to return: Send data
          #4 Name: camelCase (addTwoNumbers) followed by (){}
         */
    }

     public static int addition (int x, int y){ //"Static int" returnerar int


        return x + y; // Returnerar helt tal x + y


    }
}
