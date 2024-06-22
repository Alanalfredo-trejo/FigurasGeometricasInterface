<<<<<<< HEAD

public class Cuadrado implements FiguraGeometrica {
    private String nombre;
    private double lado;

    public Cuadrado(String nombre, double lado) {
        this.nombre = nombre;
        this.lado = lado;
    }//constructor

    @Override
    public double calcularArea() {
        return lado * lado;
    }//calcularArea

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }//calcularPerimetro

    @Override
    public String getNombre() {
        return nombre;
    }//getNombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//setNombre

    public double getLado() {
        return lado;
    }//getLado

    public void setLado(double lado) {
        this.lado = lado;
    }//setLado

    @Override
    public String toString() {
        return "Cuadrado [nombre=" + nombre + ", lado=" + lado + "]";
    }//toString
    
}//class Cuadrado

=======
public class Cuadrado implements FiguraGeometrica{
	private String name;
	private double lado;
	public Cuadrado(String name, double lado) {
		super();
		this.name = name;
		this.lado = lado;
	}//constructor
    public double calcularArea() {
    	return (getLado() * getLado());
    }//calcularArea
	public double calcularPerimetro() {
		return (getLado()*4);
	}//calcularPerimetro
	public String getName() {
		return name;
	}//setName
	public void setName(String name) {
		this.name = name;
	}//getName
	public double getLado() {
		return lado;
	}//getLado
	public void setLado(double lado) {
		this.lado = lado;
	}//setLado
	@Override
	public String toString() {
		return "Cuadrado [name=" + name + ", lado=" + lado + "]";
	}//toString
} //class Cuadrado
>>>>>>> 12977c9dfdd866033734f156f90b91b00b6914fe
