
public class Caneta
{
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	
	void status() {
	    System.out.println("Uma caneta "+ this.cor);
	    System.out.println("Uma caneta do modelo "+ this.modelo);
	    System.out.println("Uma caneta com ponta "+ this.ponta);
	    System.out.println("A caneta esta tampada ? "+ this.tampada);
	}
	
	void rabiscar() {
	    if (this.tampada == true){
	    System.out.println("A caneta está tampada");
	    }else{
	        System.out.println("A caneta está destampada");
	    }
	    
	}
	
	void tampar(){
	    this.tampada=true;
	}
	
	void destampar () {
	    this.tampada=false;
	} 
	
}
