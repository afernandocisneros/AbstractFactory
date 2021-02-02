import ICelular.ICelular;
import IComputadora.IComputadora;
import IReloj.IReloj;
import ITablet.ITablet;

public interface IAbstractFactory {

    IComputadora crearComputadora();
    ITablet crearTablet();
    ICelular crearCelular();
    IReloj crearReloj();

}
