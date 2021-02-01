import IComputadora.IComputadora;
import ITablet.ITablet;

public class MacStore implements IAbstractFactory{

    @Override
    public IComputadora crearComputadora() {
        return new MacBookPro();
    }

    @Override
    public ITablet crearTablet() {
        return new IPad();
    }
}
