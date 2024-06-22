
public class Rectangulo implements FiguraGeometrica {
<<<<<<< HEAD
    private String nombre;
    private double base;
    private double altura;

    public Rectangulo(String nombre, double base, double altura) {
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
    }//constructor

    @Override
    public double calcularArea() {
        return base * altura;
    }//calcularArea

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
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

    @Override
    public String toString() {
        return "Rectangulo [nombre=" + nombre + ", base=" + base + ", altura=" + altura + "]";
    }//toString
    
}//class Rectangulo

=======
	private String nombre;
	private double base;
	private double altura;
	
	public Rectangulo(String nombre, double base, double altura) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
	}//constructor
	@Override
	public String getName() {
		return this.nombre;
	}
	@Override
	public double calcularPerimetro() {
		return (getBase()*2) + (getAltura()*2);
	}// calcularPerimetro
	@Override
	public double calcularArea() {
			return getBase()*getAltura();
	}//calcularArea
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "Rectangulo [nombre=" + nombre + ", base=" + base + ", altura=" + altura + "]";
	}//toString

	
	
}//class Rectangulo
>>>>>>> 12977c9dfdd866033734f156f90b91b00b6914fe
