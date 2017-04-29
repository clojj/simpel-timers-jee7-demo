package testbeans;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

@Stateless
public class Ejb2 {

    @TransactionAttribute(TransactionAttributeType.NEVER)
    public void ejb2() {
        System.out.println("ejb2");
    }
}
