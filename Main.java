package com.Bryla_Sztywna;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Rod pret=new Rod(12,5);
        pret.momentBezwladnosci(2.5);
        pret.opisPreta();
        Ball kula=new Ball(5,2);
        kula.momentBezwladnosci(1);
        kula.opisKuli();
        Roller walec=new Roller(2,2);
        walec.momentBezwladnosci(1);
        walec.opisWalca();
        System.out.println("Teraz bedziemy wyswietlac tablice");
        int iloscElemntow =6;
        //tworze tablice
        Rod[] tablicaPretow=new Rod[iloscElemntow];
        Ball[] tablicaKul=new Ball[iloscElemntow];
        Roller[] tablicaWalcow=new Roller[iloscElemntow];
        //przypisanie wartosci i wyswietlenie
        for(int i=0;i<iloscElemntow;i++)
        {
            tablicaKul[i]=new Ball((i*(3%(i+1))+1),((i+1)*(2+i)));
            tablicaWalcow[i]=new Roller((i*(i%2)+2),((i+2)+(2*i)));
            tablicaPretow[i]=new Rod((i*i+(i+1)),(i+2));
            System.out.println("\nObiekty w tablicach numer "+i);
            tablicaKul[i].opisKuli();
            tablicaPretow[i].opisPreta();
            tablicaWalcow[i].opisWalca();
        }
        double nowaOs=17.2;
        System.out.println("Teraz wyswietlimy tablice nasze wzgl nowej osi");
        for(int i=0;i<iloscElemntow;i++)
        {
            tablicaKul[i].momentBezwladnosci(nowaOs);
            tablicaPretow[i].momentBezwladnosci(nowaOs);
            tablicaWalcow[i].momentBezwladnosci(nowaOs);

            System.out.println("\nObiekty w tablicach numer "+i);
            tablicaKul[i].opisKuli();
            tablicaPretow[i].opisPreta();
            tablicaWalcow[i].opisWalca();
        }
        System.out.println("ZADANIE NA 5 !!!!!!!!!");


        BufferedReader odczyt=new BufferedReader(new InputStreamReader(System.in));
        double rozmiar=0,masa = 0,odleglosc=0;
        String wybor;

        do {
            System.out.println("Witam dzis bedziemy tworzyc rozne obiekty.\nWpisz co chcesz stworzyc ");
            System.out.println("Pret- A Walec- B Kula- C Koniec Obliczen- K ");
            wybor=odczyt.readLine();
            if(!Objects.equals(wybor, String.valueOf('K')))
            {
                System.out.println("\nPodaj mase");
                masa = Double.parseDouble(odczyt.readLine());
                System.out.println("\nPodaj rozmiar");
                rozmiar = Double.parseDouble(odczyt.readLine());
                System.out.println("\nPodaj odleglosc osi od srodka obiekt");
                odleglosc = Double.parseDouble(odczyt.readLine());
            }
            switch (wybor) {
                case "A":
                    Roller walec1 = new Roller(masa, rozmiar);
                    walec1.momentBezwladnosci(odleglosc);
                    walec1.opisWalca();
                    break;
                case "B":
                    Rod pret1 = new Rod(masa, rozmiar);
                    pret1.momentBezwladnosci(odleglosc);
                    pret1.opisPreta();
                    break;
                case "C":
                    Ball kula1 = new Ball(masa, rozmiar);
                    kula1.momentBezwladnosci(odleglosc);
                    kula1.opisKuli();
                    break;
                case "K":
                    System.out.println("Papa");
                    break;
                default:
                    System.out.println("Zly wybor hahaha Try again");
            }

        }while(!Objects.equals(wybor, String.valueOf('K')));

    }
}
