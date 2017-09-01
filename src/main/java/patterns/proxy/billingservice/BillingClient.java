package patterns.proxy.billingservice;


import java.rmi.Naming;
import java.rmi.RemoteException;

public class BillingClient {
    public static void main(String[] args) throws Exception{

        String objectName = "//localhost/Server";
        System.out.println("Понеслась....\n");

        BillingService bs = (BillingService) Naming.lookup(objectName);
        System.out.println("готово");

        bs.hello();

        for (int i = 0; i < 10000; i++) {
            try {
                bs.addMoney("1", 1);
            } catch (RemoteException e) {
                bs.addNewCard("Piter", "1");
            }

            try {
                bs.addMoney("2", 1);
            } catch (RemoteException e) {
                bs.addNewCard("Alex", "2");
            }

            try {
                bs.addMoney("3", 1);
            } catch (RemoteException e) {
                bs.addNewCard("Olga", "3");
            }
        }


        System.out.println("1: " + bs.getCardBalance("1"));
        System.out.println("2: " + bs.getCardBalance("2"));
        System.out.println("3: " + bs.getCardBalance("3"));
    }
}
