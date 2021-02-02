import AppleWatch.AppleWatch;
import ICelular.ICelular;
import IComputadora.IComputadora;
import IPhone.IPhone;
import IReloj.IReloj;
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

    @Override
    public ICelular crearCelular() {
        return new IPhone();
    }

    @Override
    public IReloj crearReloj() {
        return new AppleWatch();
    }
}
