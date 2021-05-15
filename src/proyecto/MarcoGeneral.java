//David Blanco, Sergi Pifarr� y Daniel Romero
package proyecto;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;
import java.awt.FlowLayout;

public class MarcoGeneral extends JFrame {

	private PanelInicio pInicio;
	public static FondoPanel fondo;

	//************************************************************************************
	//** Nombre del m�todo: MarcoGeneral
	//** Explicaci�n de lo que hace el m�todo: constructor del marco general
	//** Par�metros de entrada: -
	//** Par�metros de salida: -
	//************************************************************************************
	public MarcoGeneral() {
		setBounds(40, 10, 1280, 720); // x, y, width, height
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // m�todo para que pare el programa al cerrar el marco
		this.setResizable(false);
//        this.setExtendedState(MAXIMIZED_BOTH);

		fondo = new FondoPanel();
		this.setContentPane(fondo);
		fondo.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		pInicio = new PanelInicio();
		getContentPane().add(pInicio);

		setVisible(true); // para que se haga visible todo lo configurado anteriormente (siempre se pone
							// al final)

	}

	//************************************************************************************
	//** Nombre del m�todo: FondoPanel
	//** Explicaci�n de lo que hace el m�todo: muestra la imagen que se quiera como fondo
	//** del marco general.
	//** Par�metros de entrada: -
	//** Par�metros de salida: -
	//************************************************************************************
	public static class FondoPanel extends JPanel {
		private Image imagen;
		public static String picture = "/imagenes/fondo3.jpg";

		@Override
		public void paint(Graphics g) {
			imagen = new ImageIcon(getClass().getResource(picture)).getImage();

			g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

			setOpaque(false);

			super.paint(g);

		}
	}
}
