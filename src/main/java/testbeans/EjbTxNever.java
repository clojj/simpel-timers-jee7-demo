package testbeans;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

@Stateless
public class EjbTxNever {

    @TransactionAttribute(TransactionAttributeType.NEVER)
    public void ejb2() {
        System.out.println("ejb2");
    }
}
