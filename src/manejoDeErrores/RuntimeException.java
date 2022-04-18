package manejoDeErrores;

public class RuntimeException {

	public static void main(String[] args) {
		int [] vector = new int[5];
		try
		{
			vector[0]=10;
			vector[1]=35;
			vector[2]=40;
			vector[3]=50;
			vector[4]=30;
			vector[5]=30; // posicion inexistente si ejecutamos arroja error "arrayindexoutofboundsexception"
		}
		catch(ArrayIndexOutOfBoundsException e)//con esta excepcion controlamos este error (ver mas excepciones en la API)
		{
			System.out.println("Se está tratando de acceder a una posición inválida");
		}
		
		for(int i=0; i<5; i++)
		{
			System.out.println("Números: "+vector[i]);
		}
		
		
		
		
		
	}

}
