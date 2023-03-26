public enum Seleccion {
    noEncontrado(0), AMERICANO(1),CAPUCHINO(2),EXPRESO(3);

    private final int seleccion;

    Seleccion (int select){
        seleccion=select;
    }


    public static Seleccion buscarSeleccion (int selection){
        for(Seleccion select : values()){
            if(selection == select.seleccion){
                return select;
            }
        }
        return Seleccion.noEncontrado;

    }


}
