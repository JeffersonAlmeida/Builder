import java.util.ArrayList;
import java.util.Iterator;


public class TextWidgetConverter implements TextConverterBuilder{

	private ArrayList<String> produto;
	
	public TextWidgetConverter() {
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
		System.out.println("Converte : " + fonte + "WIDGET" + "\n");
		produto.add(fonte+"WIDGET");
	}

	/**
	 * @param produto the produto to set
	 */
	public void setProduto(ArrayList<String> produto) {
		this.produto = produto;
	}

	/**
	 * @return the produto
	 */
	public ArrayList<String> getProduto() {
		return produto;
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
