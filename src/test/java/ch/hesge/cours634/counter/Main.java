package ch.hesge.cours634.counter;
import ch.hesge.cours634.counter.*;

import java.util.zip.CheckedOutputStream;

public class Main {

    public static void main(String[] args) {
        /*
        System.out.println("Test normal");
        TestCounter(cpt);
        System.out.println("Test UpperLimited");
        TestCounter(ulpCpt);
        */
    }
    // Remplacé par les classes Test
    /*
    private static void TestCounter(ICounter cpt){
        // Faux dans les 2 cas
        try{ cpt.add(-100); }
        catch (CounterException e){
            System.out.println("OK");
        }
        // Faux si upperLimited[...], correct si counter simple
        try{
            cpt.add(100);
            System.out.println(cpt.getClass() == Counter.class?"OK":"NOK");
        }
        catch (CounterException e){
            System.out.println(cpt.getClass() != Counter.class?"OK":"NOK");
        }
        // Faux si upperLimited[...], correct si counter simple
        for(int i = 0; i < 6; i++){
            try{ cpt.inc(); }
            catch (CounterException e){
                System.out.println(cpt.getClass() != Counter.class?"OK":"NOK");
            }
        }
    }*/
}
