import java.util.ArrayList;
import java.util.Iterator;


public abstract class TextConverterBuilder {
	
	private ArrayList<String> textoConvertido;
	
	public TextConverterBuilder() {
		this.textoConvertido = new ArrayList<String>();
	}
	
	abstract void converteCaracter(char c);
	abstract void converteFonte(String fonte);
	abstract void converteParagrafo();
	
	public void mostraTextoConvertido() {
		Iterator<String> iterator = textoConvertido.iterator();
		System.out.println(":: Texto Convertido :: \n");
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.print(string+";");
			
		}
	}

	public ArrayList<String> getTextoConvertido() {
		return textoConvertido;
	}

	public void setTextoConvertido(ArrayList<String> textoConvertido) {
		this.textoConvertido = textoConvertido;
	}
	
	
	
	
	
}
