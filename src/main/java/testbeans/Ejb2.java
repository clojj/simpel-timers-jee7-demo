package testbeans;

import cdiextension.SimpleTimer;

import javax.ejb.Stateless;

@Stateless
public class Ejb2 {

    public Ejb2() {
    }

    @SimpleTimer(value = "0/2 * * * * ?")
    public void ejb2Method() {
        System.out.println("ejb2Method in thread " + Thread.currentThread().getName());
        Utils.sleep(2000);
    }

}
