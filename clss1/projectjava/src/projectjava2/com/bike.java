package projectjava2.com;

import projectjava.com.vehciles;

public class bike implements vehciles {
    public void twowheeler() {
        System.out.println("auto is not a twowheeler");
    }

    @Override
    public void threewheeler() {
        System.out.println("auto is a threewheeler");

    }

    @Override
    public void fourwheeler() {
        System.out.println("auto is not a fourwheeler");

    }
}

