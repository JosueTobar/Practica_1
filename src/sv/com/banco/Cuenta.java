package sv.com.banco;

public class Cuenta {
 private String nombreCiente;
 private String numeroCuenta;
 private Double tipoInteres;
 private Double saldo;
 
 //Constructor por defecto 
 public Cuenta() { }	
 
 //Constructor por copia  
 public Cuenta (Cuenta obj) {
	this.nombreCiente = obj.getNombreCiente();
	this.numeroCuenta = obj.getNumeroCuenta();
	this.tipoInteres  = obj.getTipoInteres();
	this.saldo 		  = obj.getSaldo();
 }
 //constructor con parametros
 public Cuenta(String nombreCiente , String numeroCuenta ,  Double tipoInteres, Double saldo ) {
		 this.nombreCiente = nombreCiente;
		 this.numeroCuenta = numeroCuenta;
		 this.tipoInteres = tipoInteres;
		 this.saldo = saldo;
	 }
 //metodos get and set 
 
 	public String getNombreCiente() {
 		return nombreCiente;
 	}
	public void setNombreCiente(String nombreCiente) {
		this.nombreCiente = nombreCiente;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public Double getTipoInteres() {
		return tipoInteres;
	}
	public void setTipoInteres(Double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
}
