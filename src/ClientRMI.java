import java.rmi.Naming;

public class ClientRMI {
    public static void main(String[] args) {
        try {
            System.out.println("Iniciando el Cliente");
            MiInterfaceRemota mir =
                    (MiInterfaceRemota)Naming.lookup("//" +
                            args[0] + ":" + args[1] + "/PruebaRMI");

// Imprimimos miMetodo1() tantas veces como devuelva miMetodo2()
            for (int i = 1; i <= mir.miMetodo2(); i++) mir.MiMetodo1();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
