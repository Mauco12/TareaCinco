public class Cafetera {
    private double agua;
    private double cafe;
    private double crema;
    private double vasos;

    public Cafetera() {
    }

    public Cafetera(double agua, double cafe, double crema, double vasos) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vasos = vasos;
    }

    public double getAgua() {
        return agua;
    }

    public void setAgua(double agua) {
        this.agua = agua;
    }

    public double getCafe() {
        return cafe;
    }

    public void setCafe(double cafe) {
        this.cafe = cafe;
    }

    public double getCrema() {
        return crema;
    }

    public void setCrema(double crema) {
        this.crema = crema;
    }

    public double getVasos() {
        return vasos;
    }

    public void setVasos(double vasos) {
        this.vasos = vasos;
    }

    @Override
    public String toString() {
        return "La cafetera tiene: \n" +
                "Agua=" + agua + " ml\n" +
                "Cafe=" + cafe + " g\n" +
                "Crema=" + crema + " ml\n" +
                "Vasos=" + vasos +
                "";
    }


    public void prepararCafe(Cafetera cafetera) {
        if (revisarIngrediente(cafetera)) {
            this.agua -= cafetera.agua;
            this.cafe -= cafetera.cafe;
            this.crema -= cafetera.crema;
            this.vasos -= 1;
        }
    }

    public boolean revisarIngrediente(Cafetera cafetera) {
        if (this.agua - cafetera.agua < 0) {
            System.out.println("No hay suficiente agua para preparar tu bebida");
            return false;
        } else if (this.cafe - cafetera.cafe < 0) {
            System.out.println("No hay suficiente cafe para preparar tu bebida");
            return false;
        } else if (this.crema - cafetera.crema < 0) {
            System.out.println("No hay suficiente crema para preparar tu bebida");
            return false;
        } else if (this.vasos == 0) {
            System.out.println("No hay vasos donde poner tu bebida");
            return false;
        }
        return true;
    }
}

class Americano extends Cafetera {
    public Americano(){
        super(180,15,0,0);
    }
}
class Expreso extends Cafetera {
    public Expreso(){
        super(120,20,0,0);
    }
}
class Capuchino extends Cafetera {
    public Capuchino(){
        super(100,14,70,0);
    }
}



