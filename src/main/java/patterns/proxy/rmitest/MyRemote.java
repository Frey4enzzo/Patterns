package patterns.proxy.rmitest;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Этот интерфейс будет использоваться для поддержки удаленных вызовов
 */

public interface MyRemote extends Remote{

    public String sayHello() throws RemoteException;

    public String sayBye() throws RemoteException;
}
