package creandoExecpciones;

public class FaltaArrobaException extends Exception {//el extends indicate que es hija de exception
	
	public FaltaArrobaException() {
		
	}

	@Override
	public String getMessage() {
		
		return "Falta colocar el @";
	}	

}
