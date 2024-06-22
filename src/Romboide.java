
public class Romboide implements FiguraGeometrica {
    private String nombre;
    private double base;
    private double altura;
    private double lado;

    public Romboide(String nombre, double base, double altura, double lado) {
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }//constructor

    @Override
    public double calcularArea() {
        return base * altura;
    }//calcularArea

    @Override
    public double calcularPerimetro() {
        return 2 * (base + lado);
    }//calcularPerimetro

    @Override
    public String getNombre() {
        return nombre;
    }//getNombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//setNombre

    public double getBase() {
        return base;
    }//getBase

    public void setBase(double base) {
        this.base = base;
    }//setBase

    public double getAltura() {
        return altura;
    }//getAltura

    public void setAltura(double altura) {
        this.altura = altura;
    }//setAltura

    public double getLado() {
        return lado;
    }//getLado

    public void setLado(double lado) {
        this.lado = lado;
    }//setLado

    @Override
    public String toString() {
        return "Romboide [nombre=" + nombre + ", base=" + base + ", altura=" + altura + ", lado=" + lado + "]";
    }//toString
    
}//class Romboide

