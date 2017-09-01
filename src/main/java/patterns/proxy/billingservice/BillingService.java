package patterns.proxy.billingservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Этот интерфейс объявляет методы для работы с пластиковыми картами
 */
public interface BillingService extends Remote{

    // определение/добавление новой карты
    void addNewCard(String personName, String card) throws RemoteException;

    // добавить денежные средства на карту
    void addMoney(String card, double money) throws RemoteException;

    // снять деньги с карты
    void subMoney(String card, double money) throws RemoteException;

    // получить баланс карты
    double getCardBalance(String card) throws RemoteException;

    void hello();
}
