import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class RTFReaderDirector {
	
	private TextConverterBuilder builder;
	
	public RTFReaderDirector(TextConverterBuilder builder) {
		this.setBuilder(builder);
	}
	
	public void readText() throws IOException{
		 try {
		        BufferedReader in = new BufferedReader(new FileReader("/home/jefferson/workspace/Builder/src/texto"));
		        String str;
	            while (in.ready()) {
	                str = in.readLine();
	                process(str);
	            }
	            in.close();
		    } catch (IOException e) {
		    	throw e;
		    }
	}

	private void process(String str) {
		System.out.println("\n\nTexto: " + str + "\n\n");
		String tokens[] = str.split(";");
		for(String t:tokens){
			System.out.println("Token : " + t);
			builder.converteFonte(t);
		}
	}

	/**
	 * @param builder the builder to set
	 */
	public void setBuilder(TextConverterBuilder builder) {
		this.builder = builder;
	}

	/**
	 * @return the builder
	 */
	public TextConverterBuilder getBuilder() {
		return builder;
	}
	
	
	
	
}
