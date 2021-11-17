package helloword;

public abstract class Animal {
	private String tipo;
	
	abstract public void som(int numToque);
	
	
	public Animal(String tipo)
	{
		this.tipo = tipo;
	}


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
