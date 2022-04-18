package manejoDeErrores;


import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class IOexecption {

	public static void main(String[] args) {
		//Errores en tiemmpo de compilacion
		
		//String Nombre;
		//Nombre = 88888;
		
		//Errores en tiempo de ejecucion
		
		//int num1 = 9;
		//int num2 = 0;
		//int result = num1 / num2;
		//esto devuelve un error de ejecucion ya que no puede dividr por 0 pero la sintaxis esta bien; 
		//tambien se denomina execpcion
		
		//IOexception = error que se produce al trabajar por ejemplo con imagenes,
		//El siguiente codigo arroja un error "no esta controlando la excepcion ioexeption"
		
		//Image imagen = ImageIO.read(new File("src/imagen-gif"));
		
		//todo lo que pueda devolver un ioexception debe ir dentrode un try y catch
		
		try {//intenta realizar la accion
			Image imagen = ImageIO.read(new File("C:\\Users\\eleme\\Desktop\\Ama\\axie2.ng"));
		} catch (IOException e) {//controla en caso de error
			e.printStackTrace(); //obtengo mas informacion sobre el error
			System.out.println("No se pudo acceder a la imagen");
		}finally {//siempre se va a ejecutar
			System.out.println("ME ejecuto igual");
		}
	}

}
