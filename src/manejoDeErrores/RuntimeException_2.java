package manejoDeErrores;

import javax.swing.JOptionPane;

public class RuntimeException_2 {

	public static void main(String[] args) {
		try
		{
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese num1"));	
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese num2"));	
		int res = num1/num2;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error por división por cero");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Error se necesita formato numérico");
		} 
		catch(Exception e) // si bien execption es padre de todas siempre combiene controlar en detalle el error
		{
			e.printStackTrace();
		}
		finally
		{
			
		}

	}//poniendo exception al final, primero identifica los primeros dos

}
