public class TextWidgetConverter extends TextConverterBuilder{
	
	@Override
	public void converteCaracter(char c) {
			
	}

	@Override
	public void converteParagrafo() {
			
	}

	@Override
	public void converteFonte(String fonte) {
		System.out.println("Converte : " + fonte + "WIDGET" + "\n");
		getTextoConvertido().add(fonte+"WIDGET");
	}	
}
