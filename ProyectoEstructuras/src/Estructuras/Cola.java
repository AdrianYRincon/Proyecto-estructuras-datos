package Estructuras;

public class Cola <O> extends Lista<O> {

	public void enqueque(O elemento) {
		if (this.full() == false) {
			this.top ++;
			this.lista[this.top] = (O) elemento;
		} else {
			System.out.println("La cola está llena, no se puede encolar");
		}
	}
	
	public void dequeue() {
		if (this.empty() == false) {
			for (int i = 0; i < top; i++) {
				this.lista[i] = this.lista[i + 1];
			} 
			this.top --;
		} else {
			System.out.println("La cola está vacia, no se puede desencolar");
		}
	}

	public Cola(int dimension) {
		super(dimension);
		// TODO Auto-generated constructor stub
	}	
}
