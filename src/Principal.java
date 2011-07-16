import java.io.IOException;


public class Principal {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
	
		TextConverterBuilder builderTex = new TexConverter();
		TextConverterBuilder builderASC = new AscConverter();
		TextConverterBuilder builderWidget = new TextWidgetConverter();
		
		
		RTFReaderDirector director =  new RTFReaderDirector(builderTex);
		director.readText();
		director.getBuilder().showResult();		
		
		
		director.setBuilder(builderASC);
		director.readText();
		director.getBuilder().showResult();		
		
		
		director.setBuilder(builderWidget);
		director.readText();
		director.getBuilder().showResult();
		
		
		
	}

}
