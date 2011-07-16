import java.util.ArrayList;
import java.util.Iterator;


public class TexConverter implements TextConverterBuilder {
	
	private ArrayList<String> produto;
	
	public TexConverter() {
		this.produto = new ArrayList<String>();
	}
	
	@Override
	public void converteCaracter(char c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void converteParagrafo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void converteFonte(String fonte) {
		System.out.println("Converte : " + fonte + "TEX" + "\n");
		produto.add(fonte+"Tex");
	}

	@Override
	public void showResult() {
		Iterator<String> iterator = produto.iterator();
		System.out.println(":: Texto Convertido :: \n");
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.print(string+";");
			
		}
	}

}
