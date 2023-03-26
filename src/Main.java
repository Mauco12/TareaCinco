import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    static Cafetera cafetera = new Cafetera(5000,1000,1500,50);
    final static Scanner scanner = new Scanner(System.in);

    static void elegirBebida(){
        String elegirBebida;
        Seleccion seleccion;
        do {
            System.out.println("Americano=1 \nCapuchino=2 \nExpreso=3 \nregresar a menu");
            elegirBebida = scanner.next();

            if(elegirBebida.equals("regresar")){
                return;
            }

            seleccion = Seleccion.buscarSeleccion(Integer.parseInt(elegirBebida));

            switch (seleccion){
                case AMERICANO:
                    Cafetera americano1 = new Americano();
                    cafetera.prepararCafe(americano1);
                    System.out.println("Tu cafe americano esta listo".toUpperCase());
                    break;
                case CAPUCHINO:
                    Cafetera capuchino1 = new Capuchino();
                    cafetera.prepararCafe(capuchino1);
                    System.out.println("Tu capuchino esta listo".toUpperCase());
                    break;
                case EXPRESO:
                    Cafetera expreso1 =new Expreso();
                    cafetera.prepararCafe(expreso1);
                    System.out.println("Tu expreso esta listo".toUpperCase());
                    break;
                default:
                    break;
            }

        }while(seleccion.name().equals("noEncontrado"));
    }

    public static void main(String[] args){
        String opcion;
        do{
            System.out.println("¿Que quieres hacer?: \nComprar \nRevisar si hay ingrediente suficientes \nSalir");
            opcion= scanner.next();
            switch (opcion){
                case"Comprar":
                    elegirBebida();

                    break;
                case "Revisar":
                        System.out.println(cafetera.toString());
                    break;
                default:
                    System.out.println("Invalio");
                    break;
                case "Salir":
                    System.out.println("Hasta luego");
                    System.exit(0);
                    break;


            }
        }while (!opcion.equals("salir"));

        System.out.println(cafetera.toString());

    }
}