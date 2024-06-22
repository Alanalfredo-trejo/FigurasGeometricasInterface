<<<<<<< HEAD

public class Triangulo implements FiguraGeometrica {
	private String nombre;
	private double base;
	private double altura;
	private double lado;
	public Triangulo(String nombre, double base, double altura, double lado) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}//constructor
	
	public double calcularArea() {
		return (base*altura)/2;
	}//calcularArea
	
	public double calcularPerimetro() {
		return (lado+lado+lado);
	}//calcularPerimetro
	
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
		return "Triangulo [nombre=" + nombre + ", base=" + base + ", altura=" + altura + ", lado=" + lado + "]";
	}//toString
	
	
	//1.- Constructor
	//2.- Getter and Setters
	//3.- toString
	
	
=======
public class Triangulo implements FiguraGeometrica{
	private String name;
	private double base;
	private double altura;
	private double lado;
	public Triangulo(String name, double base, double altura, double lado) {
		super();
		this.name = name;
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}//Constructor
	
	public double calcularArea() {
		return (getBase() * getAltura())/2;	
	}//calcularArea
	public double calcularPerimetro() {
		return (getLado() + getLado() + getLado());
	}// calcularPerimetro
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	@Override
	public String toString() {
		return "Triángulo [name=" + name + ", base=" + base + ", altura=" + altura + ", lado=" + lado + "]";
	}//toString
	
		
>>>>>>> 12977c9dfdd866033734f156f90b91b00b6914fe
}//class Triangulo
