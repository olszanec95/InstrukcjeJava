package com.Bryla_Sztywna;

/**
 * Created by Notebook on 2017-03-18.
 */
public class Rod extends Point {
    //klasa pręt
    private double rozmiar;

    public void opisPreta()
    {   //wypisywanie wiadomosci o precie
        if(this.odleglosc!=0)
            System.out.println("Pret o wadze "+this.masa+" Glowny moment bezwladnosci "
                    +this.moment+" Twierdzenie Steinera "+this.momentSteiner);
        else
            System.out.println("Pret o wadze "+this.masa+" Glowny moment bezwladnosci "
                    +this.moment+" Twierdzenie Steinera -brak nowej osi");
    }
    private double momentBezwladnosci()
    {   //obliczanie glownego momentu bezwladnosci wzgl srodka co rowne zero
        this.moment=this.masa*Math.pow(this.rozmiar,2);
        this.moment=this.moment/(12);
        return this.moment;

    }
    //akcesory
    public void setRozmiar(double rozmiar)
    {
        this.rozmiar=rozmiar;
        this.momentBezwladnosci();
        if(this.odleglosc!=0)
            this.momentBezwladnosci(this.odleglosc);
    }
    public double getRozmiar()
    {
        return this.rozmiar;
    }


    Rod()
    {
        super();
        this.rozmiar=3;
        this.moment=this.momentBezwladnosci();
        System.out.println(this.moment);
    }
    Rod(double masa, double rozmiar)
    {

        super(masa);
        this.rozmiar=rozmiar;
        this.moment=this.momentBezwladnosci();
    }
}
