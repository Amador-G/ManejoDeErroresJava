package creandoExecpciones;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		try
		{
		String correo = JOptionPane.showInputDialog("Ingrese correo electronico: ");
	    Mail.validarMail(correo);
	    
		}
		catch(FaltaArrobaException e) //debemos crear mediante una clase, estas excepciones
		{
			System.out.println("Error falta arroba ");
			e.printStackTrace();
		}
		catch(FaltaPuntoException e)
		{
			System.out.println("Error Falta Punto ");
			e.printStackTrace();
		}

	}

}
