//David Blanco, Sergi Pifarré y Daniel Romero
package proyecto;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Component;
import java.awt.Cursor;

public class Jugadores extends JPanel implements ActionListener {
	private JTextField areadetexto1;
	private JTextField areadetexto2;
	private JTextField areadetexto3;
	private JTextField areadetexto4;
	private JTextField areadetexto5;
	private JTextField areadetexto6;
	private JTextField areadetexto7;
	private JTextField areadetexto8;
	private JTextField areadetexto9;
	private JTextField areadetexto10;

	private JComboBox desplegable1;
	private JComboBox desplegable2;
	private JComboBox desplegable3;
	private JComboBox desplegable4;
	private JComboBox desplegable5;
	private JComboBox desplegable6;
	private JComboBox desplegable7;
	private JComboBox desplegable8;
	private JComboBox desplegable9;
	private JComboBox desplegable10;

	private JLabel texto1;
	private JLabel texto2;
	private JLabel texto3;
	private JLabel texto4;
	private JLabel texto5;
	private JLabel texto6;
	private JLabel texto7;
	private JLabel texto8;
	private JLabel texto9;
	private JLabel texto10;

	private Imagen imagen1;
	private Imagen imagen2;
	private Imagen imagen3;
	private Imagen imagen4;
	private Imagen imagen5;
	private Imagen imagen6;
	private Imagen imagen7;
	private Imagen imagen8;
	private Imagen imagen9;
	private Imagen imagen10;

	private Imagen info;

	private JButton volver;
	private JButton continuar;
	private JButton info2;
	private JButton volver2;

	public static ArrayList<JTextField> nombres;
	public static ArrayList<JComboBox> desplegables;
	public static ArrayList<Imagen> imagenes;

	public static Partida partida;

	//************************************************************************************
	//** Nombre del método: Jugadores
	//** Explicación de lo que hace el método: constructor del panel donde se elige
	//** el nombre y el compañero de cada jugador.
	//** Parámetros de entrada: -
	//** Parámetros de salida: -
	//************************************************************************************
	public Jugadores() {

		setMinimumSize(new Dimension(1280, 720));
		setPreferredSize(new Dimension(1280, 720));
		this.setOpaque(false);

		areadetexto1 = new JTextField(20);
		areadetexto2 = new JTextField(20);
		areadetexto3 = new JTextField(20);
		areadetexto4 = new JTextField(20);
		areadetexto5 = new JTextField(20);
		areadetexto6 = new JTextField(20);
		areadetexto7 = new JTextField(20);
		areadetexto8 = new JTextField(20);
		areadetexto9 = new JTextField(20);
		areadetexto10 = new JTextField(20);

		desplegable1 = new JComboBox();
		desplegable1.setModel(new DefaultComboBoxModel(new String[] { "Selecciona tu compañero", "Buu", "Cell",
				"Duende Tortuga", "Freezer", "Gohan", "Goku", "Krilin", "Piccolo", "Trunks", "Vegeta" }));

		desplegable2 = new JComboBox();
		desplegable2.setModel(new DefaultComboBoxModel(new String[] { "Selecciona tu compañero", "Buu", "Cell",
				"Duende Tortuga", "Freezer", "Gohan", "Goku", "Krilin", "Piccolo", "Trunks", "Vegeta" }));

		desplegable3 = new JComboBox();
		desplegable3.setModel(new DefaultComboBoxModel(new String[] { "Selecciona tu compañero", "Buu", "Cell",
				"Duende Tortuga", "Freezer", "Gohan", "Goku", "Krilin", "Piccolo", "Trunks", "Vegeta" }));

		desplegable4 = new JComboBox();
		desplegable4.setModel(new DefaultComboBoxModel(new String[] { "Selecciona tu compañero", "Buu", "Cell",
				"Duende Tortuga", "Freezer", "Gohan", "Goku", "Krilin", "Piccolo", "Trunks", "Vegeta" }));

		desplegable5 = new JComboBox();
		desplegable5.setModel(new DefaultComboBoxModel(new String[] { "Selecciona tu compañero", "Buu", "Cell",
				"Duende Tortuga", "Freezer", "Gohan", "Goku", "Krilin", "Piccolo", "Trunks", "Vegeta" }));

		desplegable6 = new JComboBox();
		desplegable6.setModel(new DefaultComboBoxModel(new String[] { "Selecciona tu compañero", "Buu", "Cell",
				"Duende Tortuga", "Freezer", "Gohan", "Goku", "Krilin", "Piccolo", "Trunks", "Vegeta" }));

		desplegable7 = new JComboBox();
		desplegable7.setModel(new DefaultComboBoxModel(new String[] { "Selecciona tu compañero", "Buu", "Cell",
				"Duende Tortuga", "Freezer", "Gohan", "Goku", "Krilin", "Piccolo", "Trunks", "Vegeta" }));

		desplegable8 = new JComboBox();
		desplegable8.setModel(new DefaultComboBoxModel(new String[] { "Selecciona tu compañero", "Buu", "Cell",
				"Duende Tortuga", "Freezer", "Gohan", "Goku", "Krilin", "Piccolo", "Trunks", "Vegeta" }));

		desplegable9 = new JComboBox();
		desplegable9.setModel(new DefaultComboBoxModel(new String[] { "Selecciona tu compañero", "Buu", "Cell",
				"Duende Tortuga", "Freezer", "Gohan", "Goku", "Krilin", "Piccolo", "Trunks", "Vegeta" }));

		desplegable10 = new JComboBox();
		desplegable10.setModel(new DefaultComboBoxModel(new String[] { "Selecciona tu compañero", "Buu", "Cell",
				"Duende Tortuga", "Freezer", "Gohan", "Goku", "Krilin", "Piccolo", "Trunks", "Vegeta" }));

		texto1 = new JLabel("Jugador 1");
		texto1.setForeground(Color.WHITE);
		texto2 = new JLabel("Jugador 2");
		texto2.setForeground(Color.WHITE);
		texto3 = new JLabel("Jugador 3");
		texto3.setForeground(Color.WHITE);
		texto4 = new JLabel("Jugador 4");
		texto4.setForeground(Color.WHITE);
		texto5 = new JLabel("Jugador 5");
		texto5.setForeground(Color.WHITE);
		texto6 = new JLabel("Jugador 6");
		texto6.setForeground(Color.WHITE);
		texto7 = new JLabel("Jugador 7");
		texto7.setForeground(Color.WHITE);
		texto8 = new JLabel("Jugador 8");
		texto8.setForeground(Color.WHITE);
		texto9 = new JLabel("Jugador 9");
		texto9.setForeground(Color.WHITE);
		texto10 = new JLabel("Jugador 10");
		texto10.setForeground(Color.WHITE);

		imagen1 = new Imagen();
		imagen2 = new Imagen();
		imagen3 = new Imagen();
		imagen4 = new Imagen();
		imagen5 = new Imagen();
		imagen6 = new Imagen();
		imagen7 = new Imagen();
		imagen8 = new Imagen();
		imagen9 = new Imagen();
		imagen10 = new Imagen();

		volver = new JButton();
		volver.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		volver.setIcon(new ImageIcon(Jugadores.class.getResource("/imagenes/volver.png")));
		volver.setBounds(20, 22, 165, 63);
		volver.setContentAreaFilled(false);
		volver.setBorder(null);
		volver.setFocusable(false);
		
		continuar = new JButton();
		continuar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		continuar.setIcon(new ImageIcon(CantidadEquipos.class.getResource("/imagenes/continuar.png")));
		continuar.setOpaque(false);
		continuar.setContentAreaFilled(false);
		continuar.setBorder(null);
		continuar.setFocusable(false);
		continuar.setBounds(1089, 589, 169, 73);

		info2 = new JButton();
		info2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		info2.setIcon(new ImageIcon(CantidadEquipos.class.getResource("/imagenes/info2.png")));
		info2.setOpaque(false);
		info2.setContentAreaFilled(false);
		info2.setBorder(null);
		info2.setFocusable(false);
		info2.setBounds(1087, 11, 171, 85);

		volver2 = new JButton();
		volver2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		volver2.setIcon(new ImageIcon(Jugadores.class.getResource("/imagenes/volver.png")));
		volver2.setBounds(20, 22, 165, 63);
		volver2.setContentAreaFilled(false);
		volver2.setBorder(null);
		volver2.setFocusable(false);

		desplegables = new ArrayList<JComboBox>();
		imagenes = new ArrayList<Imagen>();
		nombres = new ArrayList<JTextField>();

		info = new Imagen();
		info.setLocation(0, 0);
		info.picture = "/imagenes/informacion2.png";
		info.setSize(new Dimension(1280, 720));
		
		desplegable1.addActionListener(this);
		desplegable2.addActionListener(this);
		desplegable3.addActionListener(this);
		desplegable4.addActionListener(this);
		desplegable5.addActionListener(this);
		desplegable6.addActionListener(this);
		desplegable7.addActionListener(this);
		desplegable8.addActionListener(this);
		desplegable9.addActionListener(this);
		desplegable10.addActionListener(this);

		volver.addActionListener(this);
		continuar.addActionListener(this);
		info2.addActionListener(this);
		volver2.addActionListener(this);
		
		setLayout(null);

		add(volver);
		add(continuar);
		add(info2);
		add(volver2);

		add(info);

		info.setVisible(false);
		volver2.setVisible(false);

		desplegables.add(desplegable1);
		desplegables.add(desplegable2);
		desplegables.add(desplegable3);

		imagenes.add(imagen1);
		imagenes.add(imagen2);
		imagenes.add(imagen3);

		nombres.add(areadetexto1);
		nombres.add(areadetexto2);
		nombres.add(areadetexto3);

		if (CantidadEquipos.desplegable1.getSelectedItem() == "3") {
			imagen1.setBounds(570, 150, 100, 100);
			imagen2.setBounds(570, 305, 100, 100);
			imagen3.setBounds(570, 460, 100, 100);
			add(imagen1);
			add(imagen2);
			add(imagen3);
			
			GroupLayout groupLayout = new GroupLayout(this);
			groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
					.createSequentialGroup().addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup().addComponent(texto1).addGap(10).addComponent(
									areadetexto1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup().addComponent(texto2).addGap(10).addComponent(
									areadetexto2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(texto3).addGap(10).addComponent(areadetexto3,
											GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
											GroupLayout.PREFERRED_SIZE)))
					.addGap(61)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addComponent(desplegable3, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(desplegable2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(desplegable1, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(782, Short.MAX_VALUE)));
			groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
					.createSequentialGroup().addGap(196)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addGroup(groupLayout.createSequentialGroup().addComponent(texto1).addGap(135))
							.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
											.addComponent(areadetexto1, GroupLayout.PREFERRED_SIZE,
													GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(desplegable1, GroupLayout.PREFERRED_SIZE,
													GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(132)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup().addGap(3).addComponent(texto2))
							.addGroup(groupLayout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
											.addComponent(areadetexto2, GroupLayout.PREFERRED_SIZE,
													GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(desplegable2, GroupLayout.PREFERRED_SIZE,
													GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup().addGap(131)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
											.addComponent(areadetexto3, GroupLayout.PREFERRED_SIZE,
													GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(desplegable3, GroupLayout.PREFERRED_SIZE,
													GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGroup(groupLayout.createSequentialGroup().addGap(134).addComponent(texto3)))
					.addGap(201)));
			setLayout(groupLayout);
		} else if (CantidadEquipos.desplegable1.getSelectedItem() == "4") {
			imagen1.setBounds(570, 90, 100, 100);
			imagen2.setBounds(570, 240, 100, 100);
			imagen3.setBounds(570, 390, 100, 100);
			imagen4.setBounds(570, 540, 100, 100);
			
			add(imagen1);
			add(imagen2);
			add(imagen3);
			add(imagen4);

			desplegables.add(desplegable4);
			imagenes.add(imagen4);
			nombres.add(areadetexto4);

			GroupLayout groupLayout = new GroupLayout(this);
			groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup().addGap(30)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(texto1)
											.addComponent(texto4))
									.addComponent(texto2).addComponent(texto3))
							.addGap(18)
							.addGroup(
									groupLayout.createParallelGroup(Alignment.LEADING, false).addComponent(areadetexto4)
											.addComponent(areadetexto2).addComponent(areadetexto3)
											.addComponent(areadetexto1))
							.addGap(60)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(desplegable2, GroupLayout.PREFERRED_SIZE, 171,
											GroupLayout.PREFERRED_SIZE)
									.addComponent(desplegable1, GroupLayout.PREFERRED_SIZE, 171,
											GroupLayout.PREFERRED_SIZE)
									.addComponent(desplegable3, GroupLayout.PREFERRED_SIZE, 171,
											GroupLayout.PREFERRED_SIZE)
									.addComponent(desplegable4, GroupLayout.PREFERRED_SIZE, 171,
											GroupLayout.PREFERRED_SIZE))
							.addGap(779)));
			groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
					.createSequentialGroup().addGap(129)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(texto1)
											.addComponent(areadetexto1, GroupLayout.PREFERRED_SIZE,
													GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(122)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
											.addComponent(areadetexto2, GroupLayout.PREFERRED_SIZE,
													GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(texto2)))
							.addGroup(groupLayout.createSequentialGroup()
									.addComponent(desplegable1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
											GroupLayout.PREFERRED_SIZE)
									.addGap(122).addComponent(desplegable2, GroupLayout.PREFERRED_SIZE,
											GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(123)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
							.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(areadetexto3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
											GroupLayout.PREFERRED_SIZE)
									.addComponent(texto3))
							.addGap(124)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(texto4)
									.addComponent(areadetexto4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
											GroupLayout.PREFERRED_SIZE)))
							.addGroup(groupLayout.createSequentialGroup()
									.addComponent(desplegable3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
											GroupLayout.PREFERRED_SIZE)
									.addGap(124).addComponent(desplegable4, GroupLayout.PREFERRED_SIZE,
											GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(142)));
			groupLayout.linkSize(SwingConstants.VERTICAL, new Component[] { areadetexto1, desplegable1, texto1 });
			groupLayout.linkSize(SwingConstants.VERTICAL, new Component[] { areadetexto4, desplegable4, texto4 });
			groupLayout.linkSize(SwingConstants.VERTICAL, new Component[] { areadetexto3, desplegable3, texto3 });
			groupLayout.linkSize(SwingConstants.VERTICAL, new Component[] { areadetexto2, desplegable2, texto2 });
			groupLayout.linkSize(SwingConstants.HORIZONTAL,
					new Component[] { desplegable1, desplegable2, desplegable3, desplegable4 });
			setLayout(groupLayout);
		} else if (CantidadEquipos.desplegable1.getSelectedItem() == "5") {
			imagen1.setBounds(570, 95, 90, 90);
			imagen2.setBounds(570, 210, 90, 90);
			imagen3.setBounds(570, 325, 90, 90);
			imagen4.setBounds(570, 440, 90, 90);
			imagen5.setBounds(570, 555, 90, 90);
			
			add(imagen1);
			add(imagen2);
			add(imagen3);
			add(imagen4);
			add(imagen5);
			
			desplegables.add(desplegable4);
			desplegables.add(desplegable5);

			imagenes.add(imagen4);
			nombres.add(areadetexto4);
			imagenes.add(imagen5);
			nombres.add(areadetexto5);
			
			GroupLayout groupLayout = new GroupLayout(this);
			groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
					.createSequentialGroup().addGap(38).addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(texto4).addComponent(texto3).addComponent(texto1).addComponent(texto5,
									GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addComponent(texto2))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(areadetexto1, 220, 220, 220)
							.addComponent(areadetexto2, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
							.addComponent(areadetexto3, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
							.addComponent(areadetexto4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE)
							.addComponent(areadetexto5, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE))
					.addGap(46)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(desplegable1, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable2, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable3, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable4, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable5, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(739, Short.MAX_VALUE)));
			groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
					.createSequentialGroup().addGap(136)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(texto1)
							.addComponent(areadetexto1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE))
					.addGap(84)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(texto2)
							.addComponent(areadetexto2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE))
					.addGap(90)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(texto3)
							.addComponent(areadetexto3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE))
					.addGap(93)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(texto4)
							.addComponent(areadetexto4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE))
					.addGap(82)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(texto5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(areadetexto5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(135, Short.MAX_VALUE)));
			groupLayout.linkSize(SwingConstants.VERTICAL,
					new Component[] { areadetexto4, desplegable4, desplegable5, areadetexto5 });
			groupLayout.linkSize(SwingConstants.VERTICAL, new Component[] { areadetexto2, desplegable2, texto2 });
			groupLayout.linkSize(SwingConstants.VERTICAL, new Component[] { areadetexto3, desplegable3, texto3 });
			groupLayout.linkSize(SwingConstants.VERTICAL, new Component[] { areadetexto1, desplegable1, texto1 });
			groupLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] { texto1, texto2, texto3, texto4, texto5 });
			groupLayout.linkSize(SwingConstants.HORIZONTAL,
					new Component[] { desplegable1, desplegable2, desplegable3, desplegable4, desplegable5 });
			groupLayout.linkSize(SwingConstants.HORIZONTAL,
					new Component[] { areadetexto1, areadetexto2, areadetexto3, areadetexto4, areadetexto5 });
			setLayout(groupLayout);
		}

		else if (CantidadEquipos.desplegable1.getSelectedItem() == "6") {
			imagen1.setBounds(570, 100, 75, 75);
			imagen2.setBounds(570, 190, 75, 75);
			imagen3.setBounds(570, 280, 75, 75);
			imagen4.setBounds(570, 370, 75, 75);
			imagen5.setBounds(570, 460, 75, 75);
			imagen6.setBounds(570, 550, 75, 75);
			
			add(imagen1);
			add(imagen2);
			add(imagen3);
			add(imagen4);
			add(imagen5);
			add(imagen6);

			desplegables.add(desplegable4);
			desplegables.add(desplegable5);
			desplegables.add(desplegable6);

			imagenes.add(imagen4);
			nombres.add(areadetexto4);
			imagenes.add(imagen5);
			nombres.add(areadetexto5);
			imagenes.add(imagen6);
			nombres.add(areadetexto6);
			
			GroupLayout groupLayout = new GroupLayout(this);
			groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
					.createSequentialGroup().addGap(38)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup().addComponent(texto3).addGap(18)
									.addComponent(areadetexto3, GroupLayout.PREFERRED_SIZE, 166,
											GroupLayout.PREFERRED_SIZE)
									.addGap(46).addComponent(desplegable3, GroupLayout.PREFERRED_SIZE, 171,
											GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup().addComponent(texto2).addGap(18)
									.addComponent(areadetexto2, GroupLayout.PREFERRED_SIZE, 174,
											GroupLayout.PREFERRED_SIZE)
									.addGap(46).addComponent(desplegable2, GroupLayout.PREFERRED_SIZE, 171,
											GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup().addComponent(texto1).addGap(18)
									.addComponent(areadetexto1, 220, 220, 220).addGap(46).addComponent(desplegable1,
											GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addGroup(groupLayout.createSequentialGroup()
													.addComponent(texto5, GroupLayout.PREFERRED_SIZE, 48,
															GroupLayout.PREFERRED_SIZE)
													.addGap(18).addComponent(areadetexto5, GroupLayout.PREFERRED_SIZE,
															166, GroupLayout.PREFERRED_SIZE))
											.addGroup(groupLayout.createSequentialGroup()
													.addComponent(texto6, GroupLayout.PREFERRED_SIZE, 48,
															GroupLayout.PREFERRED_SIZE)
													.addGap(18).addComponent(areadetexto6, GroupLayout.PREFERRED_SIZE,
															220, GroupLayout.PREFERRED_SIZE))
											.addGroup(groupLayout.createSequentialGroup().addComponent(texto4)
													.addGap(18).addComponent(areadetexto4, GroupLayout.PREFERRED_SIZE,
															GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addGap(46)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(desplegable4, GroupLayout.PREFERRED_SIZE, 171,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(desplegable6, GroupLayout.PREFERRED_SIZE, 171,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(desplegable5, GroupLayout.PREFERRED_SIZE, 171,
													GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(739, Short.MAX_VALUE)));
			groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
					.createSequentialGroup().addGap(136)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(texto1)
							.addComponent(areadetexto1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE))
					.addGap(61)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(texto2)
							.addComponent(desplegable2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE)
							.addComponent(areadetexto2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE))
					.addGap(60)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(texto3)
							.addComponent(areadetexto3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE))
					.addGap(64)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(texto4)
							.addComponent(areadetexto4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(62)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(texto5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(areadetexto5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(57)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(texto6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(areadetexto6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(160, Short.MAX_VALUE)));
			groupLayout.linkSize(SwingConstants.VERTICAL, new Component[] { texto1, texto2 });
			groupLayout.linkSize(SwingConstants.VERTICAL, new Component[] { areadetexto1, desplegable1 });
			groupLayout.linkSize(SwingConstants.VERTICAL, new Component[] { areadetexto3, desplegable3 });
			groupLayout.linkSize(SwingConstants.VERTICAL, new Component[] { areadetexto2, areadetexto4, desplegable2,
					desplegable4, desplegable5, areadetexto5, areadetexto6, desplegable6 });
			groupLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] { desplegable1, desplegable3 });
			groupLayout.linkSize(SwingConstants.HORIZONTAL,
					new Component[] { texto1, texto2, texto3, texto4, texto5, texto6 });
			groupLayout.linkSize(SwingConstants.HORIZONTAL,
					new Component[] { areadetexto1, areadetexto2, areadetexto3, areadetexto4 });
			groupLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] { areadetexto5, areadetexto6 });
			groupLayout.linkSize(SwingConstants.HORIZONTAL,
					new Component[] { desplegable2, desplegable4, desplegable5, desplegable6 });
			setLayout(groupLayout);
		} else if (CantidadEquipos.desplegable1.getSelectedItem() == "7") {
			imagen1.setBounds(570, 110, 65, 65);
			imagen2.setBounds(570, 190, 65, 65);
			imagen3.setBounds(570, 270, 65, 65);
			imagen4.setBounds(570, 345, 65, 65);
			imagen5.setBounds(570, 420, 65, 65);
			imagen6.setBounds(570, 490, 65, 65);
			imagen7.setBounds(570, 560, 65, 65);

			add(imagen1);
			add(imagen2);
			add(imagen3);
			add(imagen4);
			add(imagen5);
			add(imagen6);
			add(imagen7);

			desplegables.add(desplegable4);
			desplegables.add(desplegable5);
			desplegables.add(desplegable6);
			desplegables.add(desplegable7);

			imagenes.add(imagen4);
			nombres.add(areadetexto4);
			imagenes.add(imagen5);
			nombres.add(areadetexto5);
			imagenes.add(imagen6);
			nombres.add(areadetexto6);
			imagenes.add(imagen7);
			nombres.add(areadetexto7);
			
			GroupLayout groupLayout = new GroupLayout(this);
			groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
					.createSequentialGroup().addGap(38)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup().addComponent(texto3).addGap(18)
									.addComponent(areadetexto3, GroupLayout.PREFERRED_SIZE, 166,
											GroupLayout.PREFERRED_SIZE)
									.addGap(46).addComponent(desplegable3, GroupLayout.PREFERRED_SIZE, 171,
											GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup().addComponent(texto1).addGap(18)
									.addComponent(areadetexto1, 220, 220, 220).addGap(46).addComponent(desplegable1,
											GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup().addComponent(texto2).addGap(18)
									.addComponent(areadetexto2, GroupLayout.PREFERRED_SIZE, 174,
											GroupLayout.PREFERRED_SIZE)
									.addGap(46).addComponent(desplegable2, GroupLayout.PREFERRED_SIZE, 171,
											GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addGroup(groupLayout.createSequentialGroup().addComponent(texto4)
													.addGap(18).addComponent(areadetexto4, GroupLayout.PREFERRED_SIZE,
															GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGroup(groupLayout.createSequentialGroup()
													.addComponent(texto7, GroupLayout.PREFERRED_SIZE, 48,
															GroupLayout.PREFERRED_SIZE)
													.addGap(18).addComponent(areadetexto7, GroupLayout.PREFERRED_SIZE,
															220, GroupLayout.PREFERRED_SIZE))
											.addGroup(groupLayout.createSequentialGroup()
													.addComponent(texto6, GroupLayout.PREFERRED_SIZE, 48,
															GroupLayout.PREFERRED_SIZE)
													.addGap(18).addComponent(areadetexto6, GroupLayout.PREFERRED_SIZE,
															220, GroupLayout.PREFERRED_SIZE))
											.addGroup(groupLayout.createSequentialGroup()
													.addComponent(texto5, GroupLayout.PREFERRED_SIZE, 48,
															GroupLayout.PREFERRED_SIZE)
													.addGap(18).addComponent(areadetexto5, GroupLayout.PREFERRED_SIZE,
															166, GroupLayout.PREFERRED_SIZE)))
									.addGap(46)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(desplegable5, GroupLayout.PREFERRED_SIZE, 171,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(desplegable7, GroupLayout.PREFERRED_SIZE, 171,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(desplegable6, GroupLayout.PREFERRED_SIZE, 171,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(desplegable4, GroupLayout.PREFERRED_SIZE, 171,
													GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(739, Short.MAX_VALUE)));
			groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING,
					groupLayout.createSequentialGroup().addGap(141)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(texto1)
									.addComponent(areadetexto1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
											GroupLayout.PREFERRED_SIZE)
									.addComponent(desplegable1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
											GroupLayout.PREFERRED_SIZE))
							.addGap(50)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(texto2)
									.addComponent(desplegable2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
											GroupLayout.PREFERRED_SIZE)
									.addComponent(areadetexto2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
											GroupLayout.PREFERRED_SIZE))
							.addGap(54)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(texto3)
									.addComponent(areadetexto3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
											GroupLayout.PREFERRED_SIZE)
									.addComponent(desplegable3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
											GroupLayout.PREFERRED_SIZE))
							.addGap(49)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(texto4)
									.addComponent(areadetexto4, GroupLayout.PREFERRED_SIZE, 20,
											GroupLayout.PREFERRED_SIZE)
									.addComponent(
											desplegable4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addGap(52)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
									.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
											.addComponent(texto5, GroupLayout.PREFERRED_SIZE, 20,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(areadetexto5, GroupLayout.PREFERRED_SIZE, 20,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(desplegable5, GroupLayout.PREFERRED_SIZE, 20,
													GroupLayout.PREFERRED_SIZE))
									.addGap(45)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
											.addComponent(texto6, GroupLayout.PREFERRED_SIZE, 20,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(areadetexto6, GroupLayout.PREFERRED_SIZE, 20,
													GroupLayout.PREFERRED_SIZE))
									.addGap(48)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
											.addComponent(texto7, GroupLayout.PREFERRED_SIZE, 20,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(areadetexto7, GroupLayout.PREFERRED_SIZE,
													GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addGroup(groupLayout.createSequentialGroup().addGap(65)
											.addComponent(desplegable6, GroupLayout.PREFERRED_SIZE, 20,
													GroupLayout.PREFERRED_SIZE)
											.addGap(48).addComponent(desplegable7, GroupLayout.PREFERRED_SIZE, 20,
													GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(141, Short.MAX_VALUE)));
			groupLayout.linkSize(SwingConstants.VERTICAL, new Component[] { areadetexto2, areadetexto4, desplegable2,
					desplegable4, desplegable5, areadetexto5, areadetexto6, desplegable6, areadetexto7, desplegable7 });
			groupLayout.linkSize(SwingConstants.VERTICAL, new Component[] { areadetexto3, desplegable3 });
			groupLayout.linkSize(SwingConstants.VERTICAL, new Component[] { areadetexto1, desplegable1 });
			groupLayout.linkSize(SwingConstants.VERTICAL,
					new Component[] { texto1, texto2, texto3, texto4, texto5, texto6, texto7 });
			groupLayout.linkSize(SwingConstants.HORIZONTAL,
					new Component[] { desplegable2, desplegable4, desplegable5, desplegable6, desplegable7 });
			groupLayout.linkSize(SwingConstants.HORIZONTAL,
					new Component[] { areadetexto5, areadetexto6, areadetexto7 });
			groupLayout.linkSize(SwingConstants.HORIZONTAL,
					new Component[] { areadetexto1, areadetexto2, areadetexto3, areadetexto4 });
			groupLayout.linkSize(SwingConstants.HORIZONTAL,
					new Component[] { texto1, texto2, texto3, texto4, texto5, texto6, texto7 });
			groupLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] { desplegable1, desplegable3 });
			setLayout(groupLayout);
		} else if (CantidadEquipos.desplegable1.getSelectedItem() == "8") {
			imagen1.setBounds(570, 110, 60, 60);
			imagen2.setBounds(570, 180, 60, 60);
			imagen3.setBounds(570, 250, 60, 60);
			imagen4.setBounds(570, 315, 60, 60);
			imagen5.setBounds(570, 385, 60, 60);
			imagen6.setBounds(570, 450, 60, 60);
			imagen7.setBounds(570, 520, 60, 60);
			imagen8.setBounds(570, 590, 60, 60);
			
			add(imagen1);
			add(imagen2);
			add(imagen3);
			add(imagen4);
			add(imagen5);
			add(imagen6);
			add(imagen7);
			add(imagen8);

			desplegables.add(desplegable4);
			desplegables.add(desplegable5);
			desplegables.add(desplegable6);
			desplegables.add(desplegable7);
			desplegables.add(desplegable8);

			imagenes.add(imagen4);
			nombres.add(areadetexto4);
			imagenes.add(imagen5);
			nombres.add(areadetexto5);
			imagenes.add(imagen6);
			nombres.add(areadetexto6);
			imagenes.add(imagen7);
			nombres.add(areadetexto7);
			imagenes.add(imagen8);
			nombres.add(areadetexto8);
			
			GroupLayout groupLayout = new GroupLayout(this);
			groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
					.createSequentialGroup().addGap(
							38)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(Alignment.TRAILING,
									groupLayout.createSequentialGroup()
											.addComponent(texto8, GroupLayout.PREFERRED_SIZE, 48,
													GroupLayout.PREFERRED_SIZE)
											.addGap(18))
							.addGroup(Alignment.TRAILING,
									groupLayout.createSequentialGroup()
											.addComponent(texto7, GroupLayout.PREFERRED_SIZE, 48,
													GroupLayout.PREFERRED_SIZE)
											.addGap(18))
							.addGroup(
									groupLayout.createSequentialGroup()
											.addComponent(texto6, GroupLayout.PREFERRED_SIZE, 48,
													GroupLayout.PREFERRED_SIZE)
											.addGap(18))
							.addGroup(
									groupLayout.createSequentialGroup()
											.addComponent(texto5, GroupLayout.PREFERRED_SIZE, 48,
													GroupLayout.PREFERRED_SIZE)
											.addGap(18))
							.addGroup(groupLayout.createSequentialGroup().addComponent(texto4).addGap(18))
							.addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout
									.createParallelGroup(Alignment.LEADING).addComponent(texto2, Alignment.TRAILING)
									.addComponent(texto3, Alignment.TRAILING).addComponent(texto1, Alignment.TRAILING))
									.addGap(18)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addComponent(areadetexto2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 174,
									Short.MAX_VALUE)
							.addComponent(areadetexto1, Alignment.TRAILING)
							.addComponent(areadetexto5, Alignment.TRAILING)
							.addComponent(areadetexto4, Alignment.TRAILING)
							.addComponent(areadetexto3, Alignment.TRAILING)
							.addComponent(areadetexto8, Alignment.TRAILING)
							.addComponent(areadetexto7, Alignment.TRAILING)
							.addComponent(areadetexto6, Alignment.TRAILING))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(Alignment.TRAILING,
									groupLayout.createSequentialGroup().addGap(46).addComponent(desplegable8,
											GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
							.addGroup(Alignment.TRAILING,
									groupLayout.createSequentialGroup().addGap(46).addComponent(desplegable7,
											GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup().addGap(46).addComponent(desplegable6,
									GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup().addGap(46).addComponent(desplegable5,
									GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup().addGap(46).addComponent(desplegable4,
									GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup().addGap(46)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(desplegable2, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE,
													171, GroupLayout.PREFERRED_SIZE)
											.addComponent(desplegable3, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE,
													171, GroupLayout.PREFERRED_SIZE)
											.addComponent(desplegable1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE,
													171, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(739, Short.MAX_VALUE)));
			groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
					.createSequentialGroup().addGap(135)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(texto1)
							.addComponent(areadetexto1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE))
					.addGap(41)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(texto2)
							.addComponent(desplegable2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE)
							.addComponent(areadetexto2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(43)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(texto3)
							.addComponent(areadetexto3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE))
					.addGap(41)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(texto4)
							.addComponent(areadetexto4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(42)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(texto5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(areadetexto5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(45)
					.addGroup(
							groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
											.addComponent(texto6, GroupLayout.PREFERRED_SIZE, 20,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(areadetexto6, GroupLayout.PREFERRED_SIZE, 20,
													GroupLayout.PREFERRED_SIZE))
									.addComponent(desplegable6, GroupLayout.PREFERRED_SIZE, 20,
											GroupLayout.PREFERRED_SIZE))
					.addGap(39)
					.addGroup(
							groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
											.addComponent(texto7, GroupLayout.PREFERRED_SIZE, 20,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(areadetexto7, GroupLayout.PREFERRED_SIZE, 20,
													GroupLayout.PREFERRED_SIZE))
									.addComponent(desplegable7, GroupLayout.PREFERRED_SIZE, 20,
											GroupLayout.PREFERRED_SIZE))
					.addGap(39)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(texto8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(areadetexto8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(135, Short.MAX_VALUE)));
			groupLayout.linkSize(SwingConstants.VERTICAL,
					new Component[] { areadetexto1, areadetexto2, areadetexto3, areadetexto4, desplegable1,
							desplegable2, desplegable3, desplegable4, desplegable5, areadetexto5, areadetexto6,
							desplegable6, areadetexto7, desplegable7, areadetexto8, desplegable8 });
			groupLayout.linkSize(SwingConstants.VERTICAL,
					new Component[] { texto1, texto2, texto3, texto4, texto5, texto6, texto7, texto8 });
			groupLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] { desplegable1, desplegable2, desplegable3,
					desplegable4, desplegable5, desplegable6, desplegable7, desplegable8 });
			groupLayout.linkSize(SwingConstants.HORIZONTAL,
					new Component[] { texto1, texto2, texto3, texto4, texto5, texto6, texto7, texto8 });
			setLayout(groupLayout);
		} else if (CantidadEquipos.desplegable1.getSelectedItem() == "9") {
			imagen1.setBounds(570, 80, 55, 55);
			imagen2.setBounds(570, 145, 55, 55);
			imagen3.setBounds(570, 210, 55, 55);
			imagen4.setBounds(570, 275, 55, 55);
			imagen5.setBounds(570, 340, 55, 55);
			imagen6.setBounds(570, 405, 55, 55);
			imagen7.setBounds(570, 470, 55, 55);
			imagen8.setBounds(570, 535, 55, 55);
			imagen9.setBounds(570, 600, 55, 55);
			
			add(imagen1);
			add(imagen2);
			add(imagen3);
			add(imagen4);
			add(imagen5);
			add(imagen6);
			add(imagen7);
			add(imagen8);
			add(imagen9);

			desplegables.add(desplegable4);
			desplegables.add(desplegable5);
			desplegables.add(desplegable6);
			desplegables.add(desplegable7);
			desplegables.add(desplegable8);
			desplegables.add(desplegable9);

			imagenes.add(imagen4);
			nombres.add(areadetexto4);
			imagenes.add(imagen5);
			nombres.add(areadetexto5);
			imagenes.add(imagen6);
			nombres.add(areadetexto6);
			imagenes.add(imagen7);
			nombres.add(areadetexto7);
			imagenes.add(imagen8);
			nombres.add(areadetexto8);
			imagenes.add(imagen9);
			nombres.add(areadetexto9);
			
			GroupLayout groupLayout = new GroupLayout(this);
			groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
					.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addGroup(groupLayout.createSequentialGroup().addContainerGap()
									.addComponent(texto8, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addGap(18).addComponent(areadetexto8).addGap(46).addComponent(desplegable8,
											GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup().addGap(38).addGroup(groupLayout
									.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createSequentialGroup()
											.addComponent(texto7, GroupLayout.PREFERRED_SIZE, 48,
													GroupLayout.PREFERRED_SIZE)
											.addGap(18).addComponent(areadetexto7).addGap(46).addComponent(desplegable7,
													GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
											.addGroup(groupLayout.createSequentialGroup()
													.addComponent(texto6, GroupLayout.PREFERRED_SIZE, 48,
															GroupLayout.PREFERRED_SIZE)
													.addGap(18)
													.addComponent(areadetexto6, GroupLayout.PREFERRED_SIZE,
															GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addGap(46)
													.addComponent(desplegable6, GroupLayout.PREFERRED_SIZE, 171,
															GroupLayout.PREFERRED_SIZE))
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
													.addGroup(groupLayout.createSequentialGroup()
															.addComponent(texto9, GroupLayout.PREFERRED_SIZE, 48,
																	GroupLayout.PREFERRED_SIZE)
															.addGap(18)
															.addComponent(areadetexto9, GroupLayout.PREFERRED_SIZE, 174,
																	GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(ComponentPlacement.RELATED,
																	GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
															.addComponent(desplegable9, GroupLayout.PREFERRED_SIZE, 171,
																	GroupLayout.PREFERRED_SIZE))
													.addGroup(groupLayout.createSequentialGroup()
															.addGroup(groupLayout
																	.createParallelGroup(Alignment.TRAILING)
																	.addComponent(texto5, GroupLayout.PREFERRED_SIZE,
																			48, GroupLayout.PREFERRED_SIZE)
																	.addComponent(texto4).addComponent(texto2)
																	.addComponent(texto3).addComponent(texto1))
															.addGap(18)
															.addGroup(groupLayout
																	.createParallelGroup(Alignment.LEADING, false)
																	.addComponent(areadetexto2, Alignment.TRAILING,
																			GroupLayout.DEFAULT_SIZE, 174,
																			Short.MAX_VALUE)
																	.addComponent(areadetexto1, Alignment.TRAILING)
																	.addComponent(areadetexto5, Alignment.TRAILING)
																	.addComponent(areadetexto4, Alignment.TRAILING)
																	.addComponent(areadetexto3, Alignment.TRAILING))
															.addGap(46).addGroup(
																	groupLayout.createParallelGroup(Alignment.TRAILING)
																			.addComponent(desplegable5,
																					GroupLayout.PREFERRED_SIZE, 171,
																					GroupLayout.PREFERRED_SIZE)
																			.addComponent(desplegable4,
																					GroupLayout.PREFERRED_SIZE, 171,
																					GroupLayout.PREFERRED_SIZE)
																			.addComponent(desplegable2,
																					GroupLayout.PREFERRED_SIZE, 171,
																					GroupLayout.PREFERRED_SIZE)
																			.addComponent(desplegable3,
																					GroupLayout.PREFERRED_SIZE, 171,
																					GroupLayout.PREFERRED_SIZE)
																			.addComponent(desplegable1,
																					GroupLayout.PREFERRED_SIZE, 171,
																					GroupLayout.PREFERRED_SIZE))))))))
					.addContainerGap()));
			groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
					.createSequentialGroup().addGap(99)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(texto1)
							.addComponent(areadetexto1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE))
					.addGap(41)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(texto2)
							.addComponent(desplegable2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE)
							.addComponent(areadetexto2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(43)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(texto3)
							.addComponent(areadetexto3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE))
					.addGap(41)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(texto4)
							.addComponent(areadetexto4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(42)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(texto5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(areadetexto5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(39)
					.addGroup(
							groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
											.addComponent(texto6, GroupLayout.PREFERRED_SIZE, 20,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(areadetexto6, GroupLayout.PREFERRED_SIZE, 20,
													GroupLayout.PREFERRED_SIZE))
									.addComponent(desplegable6, GroupLayout.PREFERRED_SIZE, 20,
											GroupLayout.PREFERRED_SIZE))
					.addGap(39)
					.addGroup(
							groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
											.addComponent(texto7, GroupLayout.PREFERRED_SIZE, 20,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(areadetexto7, GroupLayout.PREFERRED_SIZE, 20,
													GroupLayout.PREFERRED_SIZE))
									.addComponent(desplegable7, GroupLayout.PREFERRED_SIZE, 20,
											GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(texto8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(areadetexto8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(41)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(texto9, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(areadetexto9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable9, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(115, Short.MAX_VALUE)));
			groupLayout.linkSize(SwingConstants.VERTICAL,
					new Component[] { desplegable5, areadetexto5, areadetexto6, areadetexto1, desplegable6,
							areadetexto7, desplegable7, areadetexto8, desplegable8, areadetexto9, desplegable9,
							areadetexto2, areadetexto3, areadetexto4, desplegable1, desplegable2, desplegable3,
							desplegable4 });
			groupLayout.linkSize(SwingConstants.VERTICAL,
					new Component[] { texto1, texto2, texto3, texto4, texto5, texto6, texto7, texto8, texto9 });
			groupLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] { desplegable5, desplegable6, desplegable7,
					desplegable8, desplegable9, desplegable1, desplegable2, desplegable3, desplegable4 });
			groupLayout.linkSize(SwingConstants.HORIZONTAL,
					new Component[] { texto1, texto2, texto3, texto4, texto5, texto6, texto7, texto8, texto9 });
			groupLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] { areadetexto5, areadetexto6, areadetexto1,
					areadetexto7, areadetexto8, areadetexto9, areadetexto2, areadetexto3, areadetexto4 });
			setLayout(groupLayout);

		} else if (CantidadEquipos.desplegable1.getSelectedItem() == "10") {
			imagen1.setBounds(570, 110, 40, 40);
			imagen2.setBounds(570, 165, 40, 40);
			imagen3.setBounds(570, 220, 40, 40);
			imagen4.setBounds(570, 270, 40, 40);
			imagen5.setBounds(570, 320, 40, 40);
			imagen6.setBounds(570, 370, 40, 40);
			imagen7.setBounds(570, 425, 40, 40);
			imagen8.setBounds(570, 475, 40, 40);
			imagen9.setBounds(570, 530, 40, 40);
			imagen10.setBounds(570, 585, 40, 40);
			
			add(imagen1);
			add(imagen2);
			add(imagen3);
			add(imagen4);
			add(imagen5);
			add(imagen6);
			add(imagen7);
			add(imagen8);
			add(imagen9);
			add(imagen10);

			desplegables.add(desplegable4);
			desplegables.add(desplegable5);
			desplegables.add(desplegable6);
			desplegables.add(desplegable7);
			desplegables.add(desplegable8);
			desplegables.add(desplegable9);
			desplegables.add(desplegable10);

			imagenes.add(imagen4);
			nombres.add(areadetexto4);
			imagenes.add(imagen5);
			nombres.add(areadetexto5);
			imagenes.add(imagen6);
			nombres.add(areadetexto6);
			imagenes.add(imagen7);
			nombres.add(areadetexto7);
			imagenes.add(imagen8);
			nombres.add(areadetexto8);
			imagenes.add(imagen9);
			nombres.add(areadetexto9);
			imagenes.add(imagen10);
			nombres.add(areadetexto10);
			
			GroupLayout groupLayout = new GroupLayout(this);
			groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
					.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup().addGap(38).addGroup(groupLayout
							.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup().addComponent(texto10)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(areadetexto10, GroupLayout.PREFERRED_SIZE, 186,
											GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 54, Short.MAX_VALUE).addComponent(
											desplegable10, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup()
									.addComponent(texto9, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(areadetexto9, GroupLayout.PREFERRED_SIZE, 174,
											GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE).addComponent(
											desplegable9, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
							.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup().addGroup(groupLayout
									.createParallelGroup(Alignment.TRAILING)
									.addComponent(texto6, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addComponent(texto1)
									.addComponent(texto5, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addComponent(texto4).addComponent(texto3).addComponent(texto2)
									.addComponent(texto7, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addComponent(texto8, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addGroup(groupLayout.createSequentialGroup().addComponent(areadetexto8)
													.addGap(46).addComponent(desplegable8, GroupLayout.PREFERRED_SIZE,
															171, GroupLayout.PREFERRED_SIZE))
											.addGroup(groupLayout.createSequentialGroup().addComponent(areadetexto7)
													.addGap(46).addComponent(desplegable7, GroupLayout.PREFERRED_SIZE,
															171, GroupLayout.PREFERRED_SIZE))
											.addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout
													.createParallelGroup(Alignment.LEADING)
													.addGroup(groupLayout.createSequentialGroup()
															.addComponent(areadetexto2, GroupLayout.PREFERRED_SIZE, 174,
																	GroupLayout.PREFERRED_SIZE)
															.addGap(46))
													.addGroup(groupLayout.createSequentialGroup()
															.addComponent(areadetexto1)
															.addPreferredGap(ComponentPlacement.RELATED))
													.addComponent(areadetexto3, GroupLayout.PREFERRED_SIZE,
															GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(areadetexto4).addComponent(areadetexto5))
													.addPreferredGap(ComponentPlacement.RELATED)
													.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
															.addComponent(desplegable2, GroupLayout.PREFERRED_SIZE, 171,
																	GroupLayout.PREFERRED_SIZE)
															.addComponent(desplegable1, GroupLayout.PREFERRED_SIZE, 171,
																	GroupLayout.PREFERRED_SIZE)
															.addComponent(desplegable3, GroupLayout.PREFERRED_SIZE, 171,
																	GroupLayout.PREFERRED_SIZE)
															.addComponent(desplegable5, GroupLayout.PREFERRED_SIZE, 171,
																	GroupLayout.PREFERRED_SIZE)
															.addComponent(desplegable4, GroupLayout.PREFERRED_SIZE, 171,
																	GroupLayout.PREFERRED_SIZE)))
											.addGroup(groupLayout.createSequentialGroup()
													.addComponent(areadetexto6, GroupLayout.PREFERRED_SIZE,
															GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
													.addComponent(desplegable6, GroupLayout.PREFERRED_SIZE, 171,
															GroupLayout.PREFERRED_SIZE)))))
							.addGap(773)));
			groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
					.createSequentialGroup().addGap(124)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(areadetexto1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE)
							.addComponent(texto1))
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(texto2)
							.addComponent(desplegable2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE)
							.addComponent(areadetexto2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(texto3)
							.addComponent(areadetexto3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(texto4)
							.addComponent(areadetexto4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(texto5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(areadetexto5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(texto6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(areadetexto6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(texto7, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(areadetexto7, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable7, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(texto8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(areadetexto8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(texto9, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(areadetexto9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable9, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(texto10, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(desplegable10, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(areadetexto10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE))
					.addContainerGap(158, Short.MAX_VALUE)));
			groupLayout.linkSize(SwingConstants.VERTICAL,
					new Component[] { texto1, texto2, texto3, texto4, texto5, texto6, texto7, texto8 });
			groupLayout.linkSize(SwingConstants.VERTICAL,
					new Component[] { areadetexto1, areadetexto2, areadetexto3, areadetexto4, areadetexto5,
							areadetexto6, areadetexto7, areadetexto8, areadetexto9, areadetexto10, desplegable1,
							desplegable2, desplegable3, desplegable4, desplegable5, desplegable6, desplegable7,
							desplegable8, desplegable9, desplegable10 });
			groupLayout.linkSize(SwingConstants.HORIZONTAL,
					new Component[] { areadetexto1, areadetexto2, areadetexto3, areadetexto4, areadetexto5,
							areadetexto6, areadetexto7, areadetexto8, areadetexto9, areadetexto10 });
			groupLayout.linkSize(SwingConstants.HORIZONTAL,
					new Component[] { texto1, texto2, texto3, texto4, texto5, texto6, texto7, texto8, texto9 });
			groupLayout.linkSize(SwingConstants.HORIZONTAL,
					new Component[] { desplegable1, desplegable2, desplegable3, desplegable4, desplegable5,
							desplegable6, desplegable7, desplegable8, desplegable9, desplegable10 });
			setLayout(groupLayout);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == volver) {
			MarcoGeneral.FondoPanel.picture = "/imagenes/equipos.png";
			JFrame pantalla = (JFrame) SwingUtilities.getWindowAncestor(this);
			pantalla.remove(this);
			pantalla.setContentPane(MarcoGeneral.fondo);
			pantalla.getContentPane().add(new CantidadEquipos());
			pantalla.setVisible(true);
		}

		else if (e.getSource() == continuar) {
			if (comprobarTodo() == true) {
				partida = new Partida();
				partida.rellenar();
				MarcoGeneral.FondoPanel.picture = Partida.fondos.get(Partida.i);
				JFrame pantalla = (JFrame) SwingUtilities.getWindowAncestor(this);
				pantalla.remove(this);
				pantalla.setContentPane(MarcoGeneral.fondo);
				pantalla.getContentPane().add(new PanelDecisionAD());
				pantalla.setVisible(true);
			}
		}

		else if (e.getSource() == info2) {
			for (Component component : this.getComponents()) {
				component.setVisible(false);
			}
			info.setVisible(true);
			volver.setVisible(false);
			continuar.setVisible(false);
			info2.setVisible(false);
			volver2.setVisible(true);
		}

		else if (e.getSource() == volver2) {
			for (Component component : this.getComponents()) {
				component.setVisible(true);
			}
			info.setVisible(false);
			volver.setVisible(true);
			continuar.setVisible(true);
			info2.setVisible(true);
			volver2.setVisible(false);
		}

		for (int j = 0; j < desplegables.size(); j++) {
			if (desplegables.get(j).getSelectedItem() == "Selecciona tu compañero") {
				imagenes.get(j).setVisible(false);
				imagenes.get(j).picture = "/imagenes/1.png";
				imagenes.get(j).setVisible(true);
			} else if (desplegables.get(j).getSelectedItem() == "Buu") {
				imagenes.get(j).setVisible(false);
				imagenes.get(j).picture = "/imagenes/bu.png";
				imagenes.get(j).setVisible(true);
			} else if (desplegables.get(j).getSelectedItem() == "Cell") {
				imagenes.get(j).setVisible(false);
				imagenes.get(j).picture = "/imagenes/cell.png";
				imagenes.get(j).setVisible(true);
			} else if (desplegables.get(j).getSelectedItem() == "Duende Tortuga") {
				imagenes.get(j).setVisible(false);
				imagenes.get(j).picture = "/imagenes/duende.png";
				imagenes.get(j).setVisible(true);
			} else if (desplegables.get(j).getSelectedItem() == "Freezer") {
				imagenes.get(j).setVisible(false);
				imagenes.get(j).picture = "/imagenes/freezer.png";
				imagenes.get(j).setVisible(true);
			} else if (desplegables.get(j).getSelectedItem() == "Gohan") {
				imagenes.get(j).setVisible(false);
				imagenes.get(j).picture = "/imagenes/gohan.png";
				imagenes.get(j).setVisible(true);
			} else if (desplegables.get(j).getSelectedItem() == "Goku") {
				imagenes.get(j).setVisible(false);
				imagenes.get(j).picture = "/imagenes/goku.png";
				imagenes.get(j).setVisible(true);
			} else if (desplegables.get(j).getSelectedItem() == "Krilin") {
				imagenes.get(j).setVisible(false);
				imagenes.get(j).picture = "/imagenes/krilin.png";
				imagenes.get(j).setVisible(true);
			} else if (desplegables.get(j).getSelectedItem() == "Piccolo") {
				imagenes.get(j).setVisible(false);
				imagenes.get(j).picture = "/imagenes/piccolo.png";
				imagenes.get(j).setVisible(true);
			} else if (desplegables.get(j).getSelectedItem() == "Trunks") {
				imagenes.get(j).setVisible(false);
				imagenes.get(j).picture = "/imagenes/trunks.png";
				imagenes.get(j).setVisible(true);
			} else if (desplegables.get(j).getSelectedItem() == "Vegeta") {
				imagenes.get(j).setVisible(false);
				imagenes.get(j).picture = "/imagenes/vegeta.png";
				imagenes.get(j).setVisible(true);
			}
		}
	}

	//************************************************************************************
	//** Nombre del método: Imagen
	//** Explicación de lo que hace el método: muestra la imagen que se quiera
	//** Parámetros de entrada: -
	//** Parámetros de salida: -
	//************************************************************************************
	public static class Imagen extends javax.swing.JPanel {

		public String picture = "/imagenes/1.png";

		// Se crea un método cuyo parámetro debe ser un objeto Graphics
		public void paint(Graphics grafico) {
			Dimension height = getSize();

			// Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
			ImageIcon Img = new ImageIcon(getClass().getResource(picture));

			// se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
			grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);

			setOpaque(false);
			super.paintComponent(grafico);
		}
	}

	//************************************************************************************
	//** Nombre del método: Imagen
	//** Explicación de lo que hace el método: comprueba que todos los campos estén llenos
	//** y que no se repita ningún nombre,
	//** Parámetros de entrada: -
	//** Parámetros de salida: -
	//************************************************************************************
	public boolean comprobarTodo() {
		int comprobar = 0;
		boolean correcto = false;
		boolean correcto2 = false;

		for (int i = 0; i < nombres.size(); i++) {
			if (nombres.get(i).getText().isEmpty() || nombres.get(i).getText().isBlank()) {
				JOptionPane.showMessageDialog(null, "El jugador " + (i + 1) + " no ha escrito su nombre.", "Alerta",
						JOptionPane.ERROR_MESSAGE);
			} else if(nombres.get(i).getText().length() <3){
				JOptionPane.showMessageDialog(null, "El jugador " + (i + 1) + " ha introducido un nombre demasiado corto (mínimo 3 char).", "Alerta",
						JOptionPane.ERROR_MESSAGE);
			} else if(nombres.get(i).getText().length() > 7) {
				JOptionPane.showMessageDialog(null, "El jugador " + (i + 1) + " ha introducido un nombre demasiado largo (máximo 7 char).", "Alerta",
						JOptionPane.ERROR_MESSAGE);
			}
				else {
				comprobar++;
			}
		}
		boolean fin = false;
		for (int i = 0; i < nombres.size() && fin == false; i++) {
			for (int j = i + 1; j < nombres.size() && fin == false; j++) {
				if ((!(nombres.get(i).getText().isEmpty()) || !(nombres.get(i).getText().isBlank()))
						&& nombres.get(i).getText().equals(nombres.get(j).getText())) {
					JOptionPane.showMessageDialog(null, "Dos o más jugadores tienen el mismo nombre.", "Alerta",
							JOptionPane.ERROR_MESSAGE);
					correcto2 = false;
					fin = true;
				} else {
					correcto2 = true;
					fin = false;
				}
			}
		}
		
		for (int i = 0; i < desplegables.size(); i++) {
			if (desplegables.get(i).getSelectedIndex() == 0) {
				JOptionPane.showMessageDialog(null, "El jugador " + (i + 1) + " no ha seleccionado su compañero",
						"Alerta", JOptionPane.ERROR_MESSAGE);
			} else {
				comprobar++;
			}
		}
		if (comprobar == 2 * nombres.size() && correcto2 == true) {
			correcto = true;
		} else {
			correcto = false;
		}
		if (correcto == true) {
			return true;
		} else {
			return false;
		}
	}
}
