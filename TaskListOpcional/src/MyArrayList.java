
public class MyArrayList {
	private int tamV;
	private String[] vector1;
	private int size;

	public MyArrayList(int tam) {
		tamV = tam;
		vector1 = new String[tam];
		size = 0;
		
	}
	
	public MyArrayList() {
		tamV = 10;
		vector1 = new String[tamV];
		size = 0;
		
	}
	public void setTamV(int valor) {
		this.tamV = valor;
	}
	public int getTamV() {
		return this.tamV;
	}
	
	public int length() {
		return this.getTamV();
	}
	
	public int getSize() {
		return size;
	}
	
	public void  setSize(int cantidad) {
		this.size = cantidad; 
	}
	
	public void add(String contenido) {
		int ocupado = this.getSize();
		int largo = this.length();
		
		if(ocupado == largo) {
			String[] extendido = new String[vector1.length*2];
			for(int i = 0; i < largo; ++i) {
				extendido[i] = vector1[i];
			}
			
			vector1 = extendido;
			this.setTamV(extendido.length);
			vector1[this.getTamV()] = contenido;
			
		}
		else {
			vector1[this.getSize()] = contenido;
		}
		
		this.setSize(this.getSize()+1);
	}
	
	public void add(int index, String conten) {
		add(conten);
	}
	
	public void set(int posicion, String info) throws Exception {
		if(posicion > vector1.length) throw new Exception("Posicion fuera de rango");
		vector1[posicion] = info;	
	}
	
	public String get(int indice) {
		
		if(indice<0)throw new Exception("Error en indice negativo");
		if(indice<)
	}
}
