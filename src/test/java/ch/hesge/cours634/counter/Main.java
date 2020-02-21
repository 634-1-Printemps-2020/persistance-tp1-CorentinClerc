package ch.hesge.cours634.counter;
import ch.hesge.cours634.counter.*;

import java.util.zip.CheckedOutputStream;

public class Main {

    public static void main(String[] args) {
        Counter cpt = new Counter();
        UpperLimitedPositiveCounter ulpCpt = new UpperLimitedPositiveCounter(5);
        System.out.println("Compteur : " + cpt.getValue());
        try{
            cpt.inc();
        }
        catch (CounterException e){
            System.out.println("incrémentation ratée");
        }
        System.out.println("Compteur : " + cpt.getValue());
        try{
            cpt.add(2);
        }
        catch (CounterException e){
            System.out.println("Exception, sans rien avoir throw, hônnetement si on en arrive là...");
        }
        System.out.println("Compteur : " + cpt.getValue());
        try{
            ulpCpt.inc();
        }
        catch(CounterException e) {
            System.out.println("incrémentation ratée");
        }
        System.out.println("UlpCpt : " + ulpCpt.getValue());
        try{
            ulpCpt.add(10);
        }
        catch (CounterException e){
            System.out.println("Exception : dépassement de la limite du compteur");
        }
        try {
            ulpCpt.add(-1);
        }
        catch (CounterException e){
            System.out.println("Exception : compteur limité avec valeur négative");
        }
        System.out.println("UlpCpt : " + ulpCpt.getValue());
        try{
            ulpCpt.add(4);
        }
        catch (CounterException e){
            System.out.println("Exception : dépassement de la limite du compteur (pas normale ici)");
        }
        try{
            ulpCpt.inc();
        }
        catch (CounterException e){
            System.out.println("Exception : dépassement de la limite du compteur");
        }
        System.out.println("UlpCpt : " + ulpCpt.getValue());
    }
}
