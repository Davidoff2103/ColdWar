//David Blanco, Sergi Pifarré y Daniel Romero
package proyecto;

import java.util.ArrayList;

import javax.swing.JFrame;

public class Partida extends JFrame {
	public static ArrayList<Planeta> equipos;
	public static int i = 0;
	public static ArrayList<String> frases;
	public static ArrayList<String> fondos;
	public static ArrayList<String> desplegables2;

	public static int ronda = 1;

	//************************************************************************************
	//** Nombre del método: rellenar
	//** Explicación de lo que hace el método: rellena todos los objetos y los arraylist
	//** con los datos de los equipos.
	//** Parámetros de entrada: ActionEvent e
	//** Parámetros de salida: -
	//************************************************************************************
	public void rellenar() {
		ronda = 1;
		String nombre = "";
		equipos = new ArrayList<>();
		fondos = new ArrayList<>();
		desplegables2 = new ArrayList<>();
		String fondo = "";
		int tipo = 0;
		for (int i = 0; i < Jugadores.nombres.size(); i++) {
			equipos.add(new Planeta());
		}
		for (int i = 0; i < equipos.size(); i++) {
			nombre = Jugadores.nombres.get(i).getText();
			equipos.get(i).setNombre_equipo(nombre);
		}

		for (int i = 0; i < equipos.size(); i++) {
			tipo = Jugadores.desplegables.get(i).getSelectedIndex();
			equipos.get(i).setTipo(tipo);
		}

		for (int i = 0; i < equipos.size(); i++) {
			tipo = equipos.get(i).getTipo();
			equipos.get(i).seleccionplaneta(tipo);
		}

		for (int i = 0; i < Jugadores.desplegables.size(); i++) {
			Partida.desplegables2.add(Jugadores.desplegables.get(i).getSelectedItem().toString());
		}

		for (int i = 0; i < equipos.size(); i++) {
			if (equipos.get(i).getTipo() == 1) {
				fondo = "/imagenes/fondo bu.jpg";
				fondos.add(fondo);
			} else if (equipos.get(i).getTipo() == 2) {
				fondo = "/imagenes/fondo cell.jpg";
				fondos.add(fondo);
			} else if (equipos.get(i).getTipo() == 3) {
				fondo = "/imagenes/fondo duende.jpg";
				fondos.add(fondo);
			} else if (equipos.get(i).getTipo() == 4) {
				fondo = "/imagenes/fondo freezer.jpg";
				fondos.add(fondo);
			} else if (equipos.get(i).getTipo() == 5) {
				fondo = "/imagenes/fondo gohan.jpg";
				fondos.add(fondo);
			} else if (equipos.get(i).getTipo() == 6) {
				fondo = "/imagenes/fondo goku.jpg";
				fondos.add(fondo);
			} else if (equipos.get(i).getTipo() == 7) {
				fondo = "/imagenes/fondo krilin.jpg";
				fondos.add(fondo);
			} else if (equipos.get(i).getTipo() == 8) {
				fondo = "/imagenes/fondo piccolo.jpg";
				fondos.add(fondo);
			} else if (equipos.get(i).getTipo() == 9) {
				fondo = "/imagenes/fondo trunks.jpg";
				fondos.add(fondo);
			} else if (equipos.get(i).getTipo() == 10) {
				fondo = "/imagenes/fondo vegeta.jpg";
				fondos.add(fondo);
			}
		}
	}

	//************************************************************************************
	//** Nombre del método: finRonda
	//** Explicación de lo que hace el método: se comprueba lo que pasa al finalizar cada
	//** ronda y se actualizan las vidas de cada equipo. Se añaden las frases al arraylist
	//** frases.
	//** Parámetros de entrada: -
	//** Parámetros de salida: -
	//************************************************************************************
	public void finRonda() {
		frases = new ArrayList<>();
		int total = 0;
		int resta = 0;
		for (int i = 0; i < equipos.size(); i++) {
			if (equipos.get(i).getAtacar().equals("Seleccionar")) {
				frases.add("El equipo " + equipos.get(i).getNombre_equipo() + " no ha atacado.");
			}
			if (equipos.get(i).getTipo() == 3) {
				equipos.get(i).setMisiles_x_ronda(equipos.get(i).getMisiles_x_ronda() + 2);
			}
			for (int j = 0; j < equipos.size(); j++) {
				if (equipos.get(i).getAtacar().equals(equipos.get(j).getNombre_equipo())) {
					total = equipos.get(i).getMisiles_a();
					equipos.get(i).setMisiles_a(equipos.get(i).comprobarTipo(equipos.get(i).getMisiles_a(),
							equipos.get(i).getTipo(), equipos.get(j).getTipo()));
					resta = equipos.get(i).getMisiles_a() - equipos.get(j).getMisiles_d();
					if (resta < 0) {
						resta = 0;
					}
					if (equipos.get(j).getMisiles_d() > 0) {
						if (equipos.get(i).getMisiles_a() > equipos.get(j).getMisiles_d()) {
							if (equipos.get(j).getVidas() - equipos.get(i).getMisiles_a()
									+ equipos.get(j).getMisiles_d() > 0) {
								equipos.get(j).setVidas(equipos.get(j).getVidas() - equipos.get(i).getMisiles_a()
										+ equipos.get(j).getMisiles_d());
							} else {
								equipos.get(j).setVidas(0);
							}
						}
						if (equipos.get(j).getTipo() == 5) {
							frases.add("El equipo " + equipos.get(i).getNombre_equipo() + " ha atacado a "
									+ equipos.get(j).getNombre_equipo() + ". Como " + equipos.get(j).getNombre_equipo()
									+ " ha recibido " + total
									+ " misiles pero tiene a Gohan de compañero, ha esquivado "
									+ (total - equipos.get(i).getMisiles_a()) + ", y finalmente ha recibido "
									+ equipos.get(i).getMisiles_a() + " misiles de ataque. Como ha utilizado "
									+ equipos.get(j).getMisiles_d() + " misiles de defensa, pierde " + resta
									+ " de vida y se queda con " + equipos.get(j).getVidas() + ".");
						}

						else if (equipos.get(i).getTipo() == 1 && equipos.get(j).getTipo() == 10
								|| equipos.get(i).getTipo() == 2 && equipos.get(j).getTipo() == 9
								|| equipos.get(i).getTipo() == 4 && equipos.get(j).getTipo() == 8
								|| equipos.get(i).getTipo() == 6 && equipos.get(j).getTipo() == 1
								|| equipos.get(i).getTipo() == 8 && equipos.get(j).getTipo() == 2
								|| equipos.get(i).getTipo() == 9 && equipos.get(j).getTipo() == 4
								|| equipos.get(i).getTipo() == 10 && equipos.get(j).getTipo() == 6) {
							frases.add("El equipo " + equipos.get(i).getNombre_equipo() + " ha atacado a "
									+ equipos.get(j).getNombre_equipo() + ". Como " + equipos.get(j).getNombre_equipo()
									+ " ha recibido " + total + " misiles, y debido a que el atacante tiene a "
									+ desplegables2.get(i) + " de compañero y el defensor a " + desplegables2.get(j)
									+ ", le hace el doble de daño. Por lo que, finalmente, ha recibido "
									+ equipos.get(i).getMisiles_a() + " misiles de ataque. Como ha utilizado "
									+ equipos.get(j).getMisiles_d() + " misiles de defensa, pierde " + resta
									+ " de vida y se queda con " + equipos.get(j).getVidas() + ".");
						}

						else if (equipos.get(i).getTipo() == 1 && equipos.get(j).getTipo() == 6
								|| equipos.get(i).getTipo() == 2 && equipos.get(j).getTipo() == 8
								|| equipos.get(i).getTipo() == 4 && equipos.get(j).getTipo() == 9
								|| equipos.get(i).getTipo() == 6 && equipos.get(j).getTipo() == 10
								|| equipos.get(i).getTipo() == 8 && equipos.get(j).getTipo() == 4
								|| equipos.get(i).getTipo() == 9 && equipos.get(j).getTipo() == 2
								|| equipos.get(i).getTipo() == 10 && equipos.get(j).getTipo() == 1) {
							frases.add("El equipo " + equipos.get(i).getNombre_equipo() + " ha atacado a "
									+ equipos.get(j).getNombre_equipo() + ". Como " + equipos.get(j).getNombre_equipo()
									+ " ha recibido " + total + " misiles, y debido a que el atacante tiene a "
									+ desplegables2.get(i) + " de compañero y el defensor a " + desplegables2.get(j)
									+ ", le hace la mitad de daño. Por lo que, finalmente, ha recibido "
									+ equipos.get(i).getMisiles_a() + " misiles de ataque. Como ha utilizado "
									+ equipos.get(j).getMisiles_d() + " misiles de defensa, pierde " + resta
									+ " de vida y se queda con " + equipos.get(j).getVidas() + ".");
						}

						else {
							frases.add("El equipo " + equipos.get(i).getNombre_equipo() + " ha atacado a "
									+ equipos.get(j).getNombre_equipo() + ". Como " + equipos.get(j).getNombre_equipo()
									+ " ha utilizado " + equipos.get(j).getMisiles_d()
									+ " misiles de defensa y ha recibido " + equipos.get(i).getMisiles_a()
									+ " misiles de ataque, pierde " + resta + " de vida y se queda con "
									+ equipos.get(j).getVidas() + ".");
						}

						if (equipos.get(j).getMisiles_d() - equipos.get(i).getMisiles_a() <= 0) {
							equipos.get(j).setMisiles_d(0);
						} else {
							equipos.get(j).setMisiles_d(equipos.get(j).getMisiles_d() - equipos.get(i).getMisiles_a());
						}
						if (equipos.get(j).getVidas() <= 0) {
							frases.add(equipos.get(j).getNombre_equipo() + " ha sido eliminado por "
									+ equipos.get(i).getNombre_equipo() + ".");
						}
					} else if (equipos.get(j).getMisiles_d() == 0) {
						if (equipos.get(i).getMisiles_a() > equipos.get(j).getMisiles_d()) {
							if (equipos.get(j).getVidas() - equipos.get(i).getMisiles_a() > 0) {
								equipos.get(j).setVidas(equipos.get(j).getVidas() - equipos.get(i).getMisiles_a());
							} else {
								equipos.get(j).setVidas(0);
							}

						}
						if (equipos.get(j).getTipo() == 5) {
							frases.add("El equipo " + equipos.get(i).getNombre_equipo() + " ha atacado a "
									+ equipos.get(j).getNombre_equipo() + ". Como " + equipos.get(j).getNombre_equipo()
									+ " ha recibido " + total
									+ " misiles de ataque pero tiene a Gohan de compañero, ha esquivado "
									+ (total - equipos.get(i).getMisiles_a()) + ", por lo que finalmente ha recibido "
									+ equipos.get(i).getMisiles_a()
									+ " misiles de ataque. Como no ha utilizado misiles de defensa, pierde "
									+ (equipos.get(i).getMisiles_a()) + " de vida y se queda con "
									+ equipos.get(j).getVidas() + ".");
						} else if (equipos.get(i).getTipo() == 1 && equipos.get(j).getTipo() == 10
								|| equipos.get(i).getTipo() == 2 && equipos.get(j).getTipo() == 9
								|| equipos.get(i).getTipo() == 4 && equipos.get(j).getTipo() == 8
								|| equipos.get(i).getTipo() == 6 && equipos.get(j).getTipo() == 1
								|| equipos.get(i).getTipo() == 8 && equipos.get(j).getTipo() == 2
								|| equipos.get(i).getTipo() == 9 && equipos.get(j).getTipo() == 4
								|| equipos.get(i).getTipo() == 10 && equipos.get(j).getTipo() == 6) {
							frases.add("El equipo " + equipos.get(i).getNombre_equipo() + " ha atacado a "
									+ equipos.get(j).getNombre_equipo() + ". Como " + equipos.get(j).getNombre_equipo()
									+ " ha recibido " + total + " misiles, y debido a que el atacante tiene a "
									+ desplegables2.get(i) + " de compañero y el defensor a " + desplegables2.get(j)
									+ ", le hace el doble de daño. Por lo que, finalmente, ha recibido "
									+ equipos.get(i).getMisiles_a()
									+ " misiles de ataque. Como no ha utilizado misiles de defensa, pierde "
									+ (equipos.get(i).getMisiles_a()) + " de vida y se queda con "
									+ equipos.get(j).getVidas() + ".");
						}

						else if (equipos.get(i).getTipo() == 1 && equipos.get(j).getTipo() == 6
								|| equipos.get(i).getTipo() == 2 && equipos.get(j).getTipo() == 8
								|| equipos.get(i).getTipo() == 4 && equipos.get(j).getTipo() == 9
								|| equipos.get(i).getTipo() == 6 && equipos.get(j).getTipo() == 10
								|| equipos.get(i).getTipo() == 8 && equipos.get(j).getTipo() == 4
								|| equipos.get(i).getTipo() == 9 && equipos.get(j).getTipo() == 2
								|| equipos.get(i).getTipo() == 10 && equipos.get(j).getTipo() == 1) {
							frases.add("El equipo " + equipos.get(i).getNombre_equipo() + " ha atacado a "
									+ equipos.get(j).getNombre_equipo() + ". Como " + equipos.get(j).getNombre_equipo()
									+ " ha recibido " + total + " misiles, y debido a que el atacante tiene a "
									+ desplegables2.get(i) + " de compañero y el defensor a " + desplegables2.get(j)
									+ ", le hace la mitad de daño. Por lo que, finalmente, ha recibido "
									+ equipos.get(i).getMisiles_a()
									+ " misiles de ataque. Como no ha utilizado misiles de defensa, pierde "
									+ (equipos.get(i).getMisiles_a()) + " de vida y se queda con "
									+ equipos.get(j).getVidas() + ".");
						}

						else {
							frases.add("El equipo " + equipos.get(i).getNombre_equipo() + " ha atacado a "
									+ equipos.get(j).getNombre_equipo() + ". Como " + equipos.get(j).getNombre_equipo()
									+ " no ha utilizado misiles de defensa y ha recibido "
									+ equipos.get(i).getMisiles_a() + " misiles de ataque, pierde "
									+ (equipos.get(i).getMisiles_a()) + " de vida y se queda con "
									+ equipos.get(j).getVidas() + ".");
						}
						if (equipos.get(j).getVidas() <= 0) {
							frases.add(equipos.get(j).getNombre_equipo() + " ha sido eliminado por "
									+ equipos.get(i).getNombre_equipo() + ".");
						}
					}
				}
			}
		}
		for (int i = equipos.size() - 1; i >= 0; i--) {
			if (equipos.get(i).getVidas() == 0) {
				equipos.remove(i);
				fondos.remove(i);
				Jugadores.imagenes.remove(i);
			}
		}
		frases.add("Quedan " + equipos.size() + " jugadores con vida.");
	}
}
