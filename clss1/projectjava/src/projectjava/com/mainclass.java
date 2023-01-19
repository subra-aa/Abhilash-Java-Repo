package projectjava.com;


import projectjava2.com.auto;
import projectjava2.com.bike;
import projectjava2.com.car;

public class mainclass {
	public static void main(String[] args) {
        bike b=new bike();
        b.fourwheeler();
        b.threewheeler();
        b.twowheeler();
        auto a=new auto();
        a.threewheeler();
        car c=new car();
        c.fourwheeler();
    }

}
