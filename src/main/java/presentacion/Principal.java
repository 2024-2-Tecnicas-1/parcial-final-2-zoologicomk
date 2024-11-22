
package presentacion;

import logicaNegocio.Delfin;
import logicaNegocio.Leon;
import logicaNegocio.Perro;


public class Principal {

    public static void main(String[] args) {
        Leon leon = new Leon();
        Delfin delfin = new Delfin();
        Perro perro = new Perro();
        
        
        System.out.println("El sonido del delfin es "+delfin.emitirSonido()+" y su dieta es "+delfin.obtenerDieta());
        System.out.println("El sonido del león es "+leon.emitirSonido()+" y su dieta es "+leon.obtenerDieta());
        System.out.println("El sonido del perro es "+perro.emitirSonido()+ " y su dieta es "+perro.obtenerDieta());
        System.out.println("El perro interactúa con un humano como:  "+ perro.interactuarConHumano());
    }
    
}
