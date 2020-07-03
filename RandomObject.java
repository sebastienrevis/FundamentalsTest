package be.vdab.FundamentalsTest;

import java.util.Random;

public class RandomObject {
    public static void main( String args[]){

        for (int i = 0; i < 25;) {
            Random number = new Random(); //instance of random class
            int upperbound = 1001;
            //generate random values from 0-24
            int int_random = number.nextInt(upperbound);
            System.out.println(int_random);
            if (int_random < 250)
                System.out.println("PIEF");
            if (int_random >= 250 && int_random < 500)
                System.out.println("POEF");
            if (int_random >= 500)
                System.out.println("PAF");
            i++;
        }
    }
}

