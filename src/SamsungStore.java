import GalaxyTab.GalaxyTab;
import IComputadora.IComputadora;
import ITablet.ITablet;
import NotebookOdyssey.NotebookOdyssey;

public class SamsungStore implements IAbstractFactory{

    public static int numComputadorasVendidas = 0;

    public SamsungStore() {
        numComputadorasVendidas++;
    }

    @Override
    public IComputadora crearComputadora() {
        return new NotebookOdyssey();
    }

    @Override
    public ITablet crearTablet() {
        return new GalaxyTab();
    }

    public static int getNumComputadorasVendidas() {
        return numComputadorasVendidas;
    }
}