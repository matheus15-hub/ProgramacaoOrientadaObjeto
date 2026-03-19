package At2;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo("azul");
        Circulo circulo1 = new Circulo("rosa");
        retangulo1.setCalculoArea(35.50, 15.66);
        System.out.println("Retangulo \n"+ retangulo1.getMostrarArea());
        circulo1.setCalculoArea(10.50);
        System.out.println("Circulo \n"+ circulo1.getMostrarArea());
    }
}
