package patterns.proxy.rmitest;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Реализация интерфейса удаленного доступа
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{

    // конструктор
    public MyRemoteImpl() throws RemoteException {}

    @Override
    public String sayHello() throws RemoteException {
        return "Server say's Hello ALesha";
    }

    @Override
    public String sayBye() throws RemoteException {
        return "Server say's GoodBye Alesha";
    }

    public static void main(String[] args) throws RemoteException {

        MyRemoteImpl remote = new MyRemoteImpl();
    }
}
