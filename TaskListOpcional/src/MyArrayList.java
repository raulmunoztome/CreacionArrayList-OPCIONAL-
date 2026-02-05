
public class MyArrayList {
	private int tamV;
	private String[] vector1;
	private int size;

	public MyArrayList(int tam) throws Exception {
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
	@Override
	public String toString() {
		String respuesta ="";
		for(int i = 0; i< tamV; ++i) {
			respuesta+=i+": "+vector1[i]+", ";
		}
		return respuesta;
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
			tamV *= 2;
	
		}
		vector1[size] = contenido;
		++size;
	}
	
	public void add(int index, String conten) throws Exception {
		
		if(index < 0 || index > size) throw new Exception("Índice fuera de rango");

	    if(size == tamV) {
	        String[] extendido = new String[tamV * 2];
	        for(int i = 0; i < tamV; i++) {
	            extendido[i] = vector1[i];
	        }
			
	        vector1 = extendido;
	        tamV *= 2;
	    }
	
	    for(int i = size; i > index; i--) {
	        vector1[i] = vector1[i - 1];
	    }
	
	    vector1[index] = conten;
	    size++;
	}
	
	public void set(int posicion, String info) throws Exception {
		
		if(posicion < 0)throw new Exception("Error en indice negativo");
		if(posicion >= tamV) throw new Exception("Posicion fuera de rango");
		vector1[posicion] = info;	
	}
	
	public String get(int indice) throws Exception {
		
		if(indice < 0)throw new Exception("Error en indice negativo");
		if(indice >= tamV) throw new Exception("Posicion fuera de rango");
		return vector1[indice];
	}
	
	public int getPos(String buscar) throws Exception {
		int in = 0;
		boolean localizado = false;
		while(in < tamV && !localizado) {
			if(buscar.equals(vector1[in])) localizado = true;
			else ++in;
		}
		if(localizado) return in;
		else throw new Exception("Elemento no ubicado en la lista");
	}
	//remove sin parametros
	public String remove() throws Exception {
		
		if(size < 1) throw new Exception("No hay elementos para borrar");
		
		String devolver = vector1[size-1];
		vector1[size-1] = null;
		--size;
		
		return devolver;
		
	}
	//remove con String
	public int remove(String elemento) throws Exception {
		int in = 0;
		boolean localizado = false;
		while(in < tamV && !localizado) {
			
			if(elemento.equals(vector1[in])) localizado = true;
			else ++in;
		}
		if(localizado) {
			vector1[in] = null;
			--size;
			return in;
		}
		throw new Exception("Elemento no localizado");
		
	}
	//remove con int
	public String remove(int indice) throws Exception {
		
		if(size < 1) throw new Exception("No hay elementos para borrar");
		if(indice < 0)throw new Exception("Error en indice negativo");
		if(indice >= tamV) throw new Exception("Posicion fuera de rango");
		
		String guardo = vector1[indice];
		vector1[indice] = null;
		--size;
		return guardo;
		
	}
}
