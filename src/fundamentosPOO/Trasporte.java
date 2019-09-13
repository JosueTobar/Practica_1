package fundamentosPOO;


public class Trasporte {
	private String nombre;
	private float capasidaCarga; 
	private float peso;
	private String estado;
	
	public Trasporte() {
		
	}
	
	public Trasporte(String nombre, float capasidaCarga, float peso , String estado  ) {
		this.nombre = nombre;
		this.capasidaCarga = capasidaCarga;
		this.peso = peso;
		this.estado = estado;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getCapasidaCarga() {
		return capasidaCarga;
	}

	public void setCapasidaCarga(float capasidaCarga) {
		this.capasidaCarga = capasidaCarga;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void encender() {
		System.out.println("Encender (Clase padre)");
		this.estado = "encendido"; 
	}
	public void avanzar() {
		System.out.println("avanzar (Clase padre)");
		this.estado = "avanzando"; 
	} 
	public void frenar() {
		System.out.println("frenar (Clase padre)");
		this.estado = "fernado"; 
	} 
	
}
