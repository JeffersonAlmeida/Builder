public class TexConverter extends TextConverterBuilder {
	
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
		getTextoConvertido().add(fonte+"Tex");
	}

}
