import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MiInterfaceRemota extends Remote {
    public void MiMetodo1() throws RemoteException;
    public int miMetodo2() throws RemoteException;
}
