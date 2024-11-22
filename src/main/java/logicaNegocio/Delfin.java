package logicaNegocio;

public class Delfin extends Animal {
     private TipoHabitat habitat = TipoHabitat.ACUATICO;

     @Override
    public TipoHabitat getHabitat() {
        return habitat;
    }
    

    @Override
    public String emitirSonido() {
        return "Chirrido";
    }

    @Override
    public String obtenerDieta() {
       return "Pescado";
    }
}
