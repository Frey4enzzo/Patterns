package patterns.proxy.billingservice;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Hashtable;

/**
 * Реализует удаленный интерфейс BillingService для предоставления
 * удаленного объекта BillingService
 */

public class BillingServiceImpl extends UnicastRemoteObject implements BillingService{

    // таблица для хранения карт
    private Hashtable<String, Double> hashtable;

    // инициализация сервера
    public BillingServiceImpl() throws RemoteException {
        super();
        hashtable = new Hashtable();
    }

    @Override
    public void addNewCard(String personName, String card) throws RemoteException {
        hashtable.put(card, new Double(0.0));
    }

    @Override
    public void addMoney(String card, double money) throws RemoteException {
        Double d = hashtable.get(card);
        if (d != null) {
            hashtable.put(card, new Double(d + money));
        } else {
            throw new NotExistsCardOperation();
        }
    }

    @Override
    public void subMoney(String card, double money) throws RemoteException {
        Double d = hashtable.get(card);
        if (d != null) {
            if (d < money) {
                System.out.println("Недостаточно средств");
            } else {
                hashtable.put(card, new Double(d - money));
            }
        } else {
            throw new NotExistsCardOperation();
        }
    }

    @Override
    public double getCardBalance(String card) throws RemoteException {
        Double d = hashtable.get(card);
        if (d != null) {
            return d;
        } else {
            throw new NotExistsCardOperation();
        }
    }

    public void hello() {
        System.out.println("Hello Frey");
    }

    // запуск удаленного объекта BillingService
    public static void main(String[] args) throws Exception {
        System.out.println("Инициализация BillingService ....");

        // создание удаленного объекта
        BillingService billingService = new BillingServiceImpl();

        // задаем имя удаленного объекта
        String serviceName = "rmi://localhost/BillingService";

        // регистрация удаленного объекта BillingService в реестре rmiregistry
        Naming.rebind(serviceName, billingService);
//        Naming.rebind("//localhost/Server", new BillingServiceImpl());
        System.out.println("ready!");

    }
}
