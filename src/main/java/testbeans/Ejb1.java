package testbeans;

import cdiextension.SimpleTimer;

import javax.ejb.Stateless;

@Stateless
public class Ejb1 {

    public Ejb1() {
    }

    @SimpleTimer(value = "ejb1")
    public void ejb1() {
        System.out.println("ejb1");
    }

}
