package fundamentosPOO;

public class Auto extends Trasporte {
	//Atributos 
	private String tipo;
	private Integer catPuertas;
	private Integer catCaballos;
	
	//Constructores 
	public Auto() {
		
	}
	public Auto(String tipo ,Integer catPuertas,Integer catCaballos) {
		this.tipo = tipo;
		this.catPuertas = catPuertas;
		this.catCaballos = catCaballos;
		
	}
	//Metodos get and set 
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getCatPuertas() {
		return catPuertas;
	}
	public void setCatPuertas(Integer catPuertas) {
		this.catPuertas = catPuertas;
	}
	public Integer getCatCaballos() {
		return catCaballos;
	}
	public void setCatCaballos(Integer catCaballos) {
		this.catCaballos = catCaballos;
	}
	
	//sobre escribiendo el metodo encender y aplicado el polimorfismo 
	@Override
	   public void encender() {
	      System.out.println("Encender Auto (Clase hija)");
	   }	 

	@Override
	   public void avanzar() {
	      System.out.println("Auto (Clase hija)");
	   }
}
