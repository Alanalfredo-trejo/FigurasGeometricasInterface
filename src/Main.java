
public class Main {

    public static void main(String[] args) {
        Triangulo bermudas = new Triangulo("Bermudas", 20, 10, 15);
        Triangulo t = new Triangulo("TrianguloTE", 250, 175, 145);
        Cuadrado c1 = new Cuadrado("Cuadrado1", 5);
        Cuadrado c2 = new Cuadrado("Cuadrado2", 10);
        Rectangulo r1 = new Rectangulo("Rectangulo1", 10, 5);
        Rombo ro1 = new Rombo("Rombo1", 12, 8, 7);
        Romboide rom1 = new Romboide("Romboide1", 10, 6, 7);
        Trapecio tr1 = new Trapecio("Trapecio1", 10, 6, 5, 4, 4);

        imprimirCalculo(bermudas);
        imprimirCalculo(t);
        imprimirCalculo(c1);
        imprimirCalculo(c2);
        imprimirCalculo(r1);
        imprimirCalculo(ro1);
        imprimirCalculo(rom1);
        imprimirCalculo(tr1);
    }//main

    public static void imprimirCalculo(FiguraGeometrica f) {
        System.out.println(f.toString());
        System.out.println("+==========================");
        System.out.println("| El área de [" + f.getNombre() + "] es: " + f.calcularArea());
        System.out.println("| El perímetro de [" + f.getNombre() + "] es: " + f.calcularPerimetro());
        System.out.println("+==========================");
    }//imprimirCalculo
}//class Main
