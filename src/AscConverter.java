public class AscConverter extends TextConverterBuilder{	
	
	@Override
	public void converteCaracter(char c) {				
	}

	
	@Override
	public void converteParagrafo() {		
	}

	@Override
	public void converteFonte(String fonte) {
		System.out.println("Converte : " + fonte + "ASC" + "\n");
		getTextoConvertido().add(fonte+"ASC");
	}
	
}
