package principal;


import view.tela_main;
import javax.swing.JTextPane;

public class Main {
	
	public static void main(String[] args) {	
	
        tela_main tela1 = new tela_main();
          tela1.setVisible(true);

	}
public static int extrairID(String texto) {
    try {
        texto = texto.replace("ID:", "").trim();
        String numero = texto.split("\\|")[0].trim();
        return Integer.parseInt(numero);
        
    } catch (Exception e) {
        return -1;
    }
}
public static void clean(JTextPane[] campos) {
    for (JTextPane campo : campos) {
        campo.setText("");  
    }
}


}
