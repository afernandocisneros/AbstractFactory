import ICelular.ICelular;
import IComputadora.IComputadora;
import IReloj.IReloj;
import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {

        MacStore apple = new MacStore();
        IComputadora myLaptop = apple.crearComputadora();
        System.out.println(myLaptop);

        SamsungStore laptop1 = new SamsungStore();
        IComputadora myNotebook = laptop1.crearComputadora();
        System.out.println(myNotebook);

        System.out.println(SamsungStore.getNumComputadorasVendidas());

        SamsungStore laptop2 = new SamsungStore();
        IComputadora myNotebook2 = laptop2.crearComputadora();
        System.out.println(myNotebook2);

        System.out.println(SamsungStore.getNumComputadorasVendidas());

        System.out.println("Tienda");

        MacStore cell = new MacStore();
        ICelular myCell = cell.crearCelular();
        System.out.println(myCell);

        SamsungStore reloj = new SamsungStore();
        IReloj miReloj = reloj.crearReloj();
        System.out.println(miReloj);

        System.out.println("Probando conexion con Jenkins");
        System.out.println("Nueva prueba");

    }

}



