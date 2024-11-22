package logicaNegocio;

public class Leon extends Animal {
     private TipoHabitat habitat = TipoHabitat.TERRESTRE;

     @Override
    public TipoHabitat getHabitat() {
        return habitat;
    }
    
     
    @Override
    public String emitirSonido() {
        return "Rugido";
    }

    @Override
    public String obtenerDieta() {
       return "Carnívoro";
    }
    // TODO: Aquí va tu código
}
