package projectjava2.com;

import projectjava.com.vehciles;

public class car implements vehciles {
    @Override
    public void twowheeler() {
        System.out.println("car is not a two wheeler");
    }

    @Override
    public void threewheeler() {
        System.out.println("car is not a three wheeler");

    }

    @Override
    public void fourwheeler() {
        System.out.println("car is a four wheeler");

    }
}
