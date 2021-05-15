//David Blanco, Sergi Pifarré y Daniel Romero
package proyecto;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PanelSalir extends JPanel {
	private int resp;

	//************************************************************************************
	//** Nombre del método: PanelSalir
	//** Explicación de lo que hace el método: constructor del panel para salir del juego
	//** Parámetros de entrada: -
	//** Parámetros de salida: -
	//************************************************************************************
	public PanelSalir() {
		resp = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres salir?", "Confirmación",
				JOptionPane.YES_NO_OPTION);
		if (resp == JOptionPane.YES_OPTION) {
			System.exit(0);
		} else {
			MarcoGeneral.FondoPanel.picture = "/imagenes/fondo3.jpg";
			JFrame pantalla = (JFrame) SwingUtilities.getWindowAncestor(MarcoGeneral.fondo);
			pantalla.remove(this);
			pantalla.setContentPane(MarcoGeneral.fondo);
			pantalla.add(new PanelInicio());
			pantalla.setVisible(true);
		}

	}
}
