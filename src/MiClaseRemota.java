import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MiClaseRemota extends UnicastRemoteObject implements MiInterfaceRemota {
    protected MiClaseRemota() throws RemoteException {
    }


    @Override
    public void MiMetodo1() throws RemoteException {
        //Aqui ponemos el codigo que queramos
        System.out.println("Estoy en mi Metodo1");
    }

    @Override
    public int miMetodo2() throws RemoteException {
        return 5;
    }

    public static void main(String[] args) {

        try {
            System.out.println("Iniciando Servidor");
            Registry registry = LocateRegistry.createRegistry(
                    Integer.parseInt(args[0]));

            MiInterfaceRemota mir = new MiClaseRemota();

            java.rmi.Naming.rebind("//" +
                    java.net.InetAddress.getLocalHost().getHostAddress() +
                    ":" + args[0] + "/PruebaRMI", mir);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
