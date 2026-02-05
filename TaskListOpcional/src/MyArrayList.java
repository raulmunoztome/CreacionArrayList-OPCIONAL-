
public class MyArrayList {
	private int tamV;
	private String[] vector1;
	private int size;

	public MyArrayList(int tam) {
		if(tam < 1) throw new Exception("Tamaño mínimo de 1");
		tamV = tam;
		vector1 = new String[tamV];
		size = 0;
		
	}
	
	public MyArrayList() {
		tamV = 10;
		vector1 = new String[tamV];
		size = 0;
		
	}
	public void setTamV(int valor) {
		tamV = valor;
	}

	
	public int length() {
		return tamV;
	}
	
	public int getSize() {
		return size;
	}
	
	public void  setSize(int cantidad) {
		size = cantidad; 
	}
	
	public void add(String contenido) {

		if(size == tamV) {
			String[] extendido = new String[tamV*2];
			for(int i = 0; i < tamV; ++i) {
				extendido[i] = vector1[i];
			}
			
			vector1 = extendido;
			tamV = tamV*2;
			vector1[size] = contenido;
			
		}
		else {
			vector1[size] = contenido;
		}
		
		++size;
	}
	
	public void add(int index, String conten) {
		
		if(index < 0)throw new Exception("Error en indice negativo");
		if(index > tamV) throw new Exception("Posicion fuera de rango");
		vector1[index] = conten;
	}
	
	public void set(int posicion, String info) throws Exception {
		
		if(posicion < 0)throw new Exception("Error en indice negativo");
		if(posicion > tamV) throw new Exception("Posicion fuera de rango");
		vector1[posicion] = info;	
	}
	
	public String get(int indice) {
		
		if(indice < 0)throw new Exception("Error en indice negativo");
		if(indice < )
	}
}
