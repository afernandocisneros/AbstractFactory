import ICelular.ICelular;
import IComputadora.IComputadora;
import ITablet.ITablet;

public interface IAbstractFactory {

    IComputadora crearComputadora();
    ITablet crearTablet();
    ICelular crearCelular();

}
