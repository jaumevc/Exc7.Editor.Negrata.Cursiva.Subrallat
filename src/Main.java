import javax.swing.JFrame;


//Ejercicio Uno:
//Realizar una aplicación con una ventana que tenga un cuadro en donde recibe texto y 
//que se seleccione con el mouse y tenga 3 opciones. Negrita, Cursiva y subrayado.
//Entonces si seleccionas un texto y al dar clic a negrita el texto cambie a negritas y así con cada una de ellas.

public class Main {
	public static void main(String[] args){
		VentanaEditor ventana = new VentanaEditor();
		ventana.setVisible(true);
		ventana.setLocation(600,100);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
