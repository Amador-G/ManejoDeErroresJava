package creandoExecpciones;

public class FaltaPuntoException extends Exception{
	
	public FaltaPuntoException() {}

	@Override
	public String getMessage() {
		
		return "Falta colocalr un "+".";
	}
	
}
