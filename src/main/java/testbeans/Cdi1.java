package testbeans;

import cdiextension.SimpleTimer;

import javax.inject.Named;

@Named
public class Cdi1 {

    @SimpleTimer(value = "0/5 * * * * ?")
    public void cdiMethod() {
        System.out.println("cdiMethod in thread " + Thread.currentThread().getName());
        Utils.sleep(5000);
    }
}
