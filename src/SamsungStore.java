import GalaxyPhone.GalaxyPhone;
import GalaxyTab.GalaxyTab;
import GalaxyWatch.GalaxyWatch;
import ICelular.ICelular;
import IComputadora.IComputadora;
import IReloj.IReloj;
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

    @Override
    public ICelular crearCelular() {
        return new GalaxyPhone();
    }

    @Override
    public IReloj crearReloj() {
        return new GalaxyWatch();
    }

    public static int getNumComputadorasVendidas() {
        return numComputadorasVendidas;
    }
}
