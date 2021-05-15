//David Blanco, Sergi Pifarré y Daniel Romero
package proyecto;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;

public class PanelCargar extends JPanel implements ActionListener {
	private JScrollPane scroll;
	private JList texto;
	public static DefaultListModel modelo;
	private JButton jugar;
	public static JButton eliminar;
	private JButton volver;
	public static JButton borrarTodo;
	
	private JLabel text;

	public static String fecha;
	public static boolean cargado = false;
	
	//************************************************************************************
	//** Nombre del método: PanelCargar
	//** Explicación de lo que hace el método: constructor del panel de cargar partida.
	//** Parámetros de entrada: -
	//** Parámetros de salida: -
	//************************************************************************************
	public PanelCargar() {
		this.setPreferredSize(new Dimension(1280, 720));
		this.setMinimumSize(new Dimension(1280, 720));
		this.setOpaque(false);

		texto = new JList();
		texto.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		modelo = new DefaultListModel();
		texto.setModel(modelo);
		DefaultListCellRenderer renderer = (DefaultListCellRenderer) texto.getCellRenderer();
		renderer.setHorizontalAlignment(JLabel.CENTER);
		texto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scroll = new JScrollPane(texto);
		scroll.setBounds(74, 189, 545, 359);
		scroll.setOpaque(false);
		scroll.getViewport().setOpaque(false);
//		scroll.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		Border border = new LineBorder(Color.GRAY, 3);
		scroll.setBorder(border);
		
		
		jugar = new JButton();
		jugar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jugar.setBounds(1087, 11, 171, 85);
		jugar.setOpaque(false);
		jugar.setContentAreaFilled(false);
		jugar.setBorder(null);
		jugar.setIcon(new ImageIcon(PanelInicio.class.getResource("/imagenes/jugar.png")));
		jugar.setFocusable(false);

		eliminar = new JButton();
		eliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		eliminar.setBounds(1099, 582, 171, 85);
		eliminar.setOpaque(false);
		eliminar.setContentAreaFilled(false);
		eliminar.setBorder(null);
		eliminar.setIcon(new ImageIcon(PanelInicio.class.getResource("/imagenes/eliminar.png")));
		eliminar.setFocusable(false);

		volver = new JButton();
		volver.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		volver.setBounds(24, 5, 171, 85);
		volver.setOpaque(false);
		volver.setContentAreaFilled(false);
		volver.setBorder(null);
		volver.setIcon(new ImageIcon(PanelInicio.class.getResource("/imagenes/volver.png")));
		volver.setFocusable(false);
		
		borrarTodo = new JButton();
		borrarTodo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		borrarTodo.setBounds(24, 582, 210, 85);
		borrarTodo.setOpaque(false);
		borrarTodo.setContentAreaFilled(false);
		borrarTodo.setBorder(null);
		borrarTodo.setIcon(new ImageIcon(PanelInicio.class.getResource("/imagenes/borrar todo.png")));
		borrarTodo.setFocusable(false);
		
		jugar.addActionListener(this);
		eliminar.addActionListener(this);
		volver.addActionListener(this);
		borrarTodo.addActionListener(this);
		

		text = new JLabel("Partidas guardadas");
		text.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		text.setBounds(239, 128, 216, 50);

		setLayout(null);
		
		add(borrarTodo);
		add(jugar);
		add(eliminar);
		add(volver);
		add(scroll);
		add(text);
		setVisible(true);
	
	}

	//************************************************************************************
	//** Nombre del método: actionPerformed
	//** Explicación de lo que hace el método: para detectar la pulsación en los botones
	//** Parámetros de entrada: ActionEvent e
	//** Parámetros de salida: -
	//************************************************************************************
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == jugar) {
			cargado = true;
			try {
				fecha = texto.getSelectedValue().toString().substring(0, 19);
				Main.selectWithStatement(Main.con);
				if (Partida.equipos.size() > 1) {
					MarcoGeneral.FondoPanel.picture = Partida.fondos.get(Partida.i);
					JFrame pantalla = (JFrame) SwingUtilities.getWindowAncestor(this);
					pantalla.remove(this);
					pantalla.setContentPane(MarcoGeneral.fondo);
					pantalla.getContentPane().add(new PanelDecisionAD());
					Main.selectPartidas(Main.con);
					pantalla.setVisible(true);
				} else if(Partida.equipos.size() == 1){
					MarcoGeneral.FondoPanel.picture = "/imagenes/fondo bills 2.jpg";
					JFrame pantalla = (JFrame) SwingUtilities.getWindowAncestor(this);
					pantalla.remove(this);
					pantalla.setContentPane(MarcoGeneral.fondo);
					pantalla.getContentPane().add(new PanelGanador());
					pantalla.setVisible(true);
				} else {
					MarcoGeneral.FondoPanel.picture = "/imagenes/fondo bills.jpg";
					JFrame pantalla = (JFrame) SwingUtilities.getWindowAncestor(this);
					pantalla.remove(this);
					pantalla.setContentPane(MarcoGeneral.fondo);
					pantalla.getContentPane().add(new PanelGanador());
					pantalla.setVisible(true);
				}

			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "No has seleccionado ninguna partida", "Alerta",
						JOptionPane.ERROR_MESSAGE);
			}

		} else if (e.getSource() == eliminar) {
			try {
				int resp = 0;
				fecha = texto.getSelectedValue().toString().substring(0, 19);
				resp = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres eliminar esta partida?", "Confirmación",
						JOptionPane.YES_NO_OPTION);
				if (resp == JOptionPane.YES_OPTION) {
					fecha = texto.getSelectedValue().toString().substring(0, 19);
					Main.deleteStatement(Main.con);
					JOptionPane.showMessageDialog(null, "Partida eliminada", "Alerta", JOptionPane.ERROR_MESSAGE);
					MarcoGeneral.FondoPanel.picture = "/imagenes/cargar partida.png";
					JFrame pantalla = (JFrame) SwingUtilities.getWindowAncestor(this);
					pantalla.remove(this);
					pantalla.setContentPane(MarcoGeneral.fondo);
					pantalla.getContentPane().add(new PanelCargar());
					Main.selectPartidas(Main.con);
					pantalla.setVisible(true);
				}
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "No has seleccionado ninguna partida", "Alerta",
						JOptionPane.ERROR_MESSAGE);
			}
		} else if (e.getSource() == volver) {
			MarcoGeneral.FondoPanel.picture = "/imagenes/fondo3.jpg";
			JFrame marco = (JFrame) SwingUtilities.getWindowAncestor(this);
			marco.remove(this);
			marco.setContentPane(MarcoGeneral.fondo);
			marco.getContentPane().add(new PanelInicio());
			marco.setVisible(true);
		} else if (e.getSource() == borrarTodo) {
			int resp = 0;
			resp = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres eliminar todas las partidas?", "Confirmación",
					JOptionPane.YES_NO_OPTION);
			if(resp == JOptionPane.YES_OPTION) {
				Main.borrarTodo(Main.con);
				MarcoGeneral.FondoPanel.picture = "/imagenes/cargar partida.png";
				JFrame marco = (JFrame) SwingUtilities.getWindowAncestor(this);
				marco.remove(this);
				marco.setContentPane(MarcoGeneral.fondo);
				marco.getContentPane().add(new PanelCargar());
				Main.selectPartidas(Main.con);
				marco.setVisible(true);
			}
		}
	}
}
