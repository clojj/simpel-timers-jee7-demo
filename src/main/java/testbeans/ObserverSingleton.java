package testbeans;

import cdiextension.TimerFiredEvent;

import javax.ejb.Singleton;
import javax.enterprise.event.Observes;

@Singleton
public class ObserverSingleton {

    public void observeTimers(@Observes TimerFiredEvent timerFiredEvent) {
        System.out.println("timerFiredEvent = " + timerFiredEvent);
    }

}
