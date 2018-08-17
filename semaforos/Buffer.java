package semaforos;


public class Buffer {

    private int contador;

    public void escreveBuffer(int valor) {
       System.out.println("Produção  " + valor);
        this.contador = valor;
    }

    public int lerBuffer() {
       System.out.println("Consumo " + contador);
       return this.contador;
    }
    
    public int getContador() {
		return contador;
	}
    
    public void setContador(int contador) {
		this.contador = contador;
	}

}
