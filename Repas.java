import java.time.LocalDate;

class Repas{
	
	
	private int numero;
	private LocalDate date;
	
	Repas(int numero, LocalDate date){
	this.numero = numero;
	this.date = date;

  }
	public int getNumero(){
		return this.numero;
	}
	public void setNumero(numero){
		this.numero=numero;
	}
	
}
