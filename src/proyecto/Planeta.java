//David Blanco, Sergi Pifarré y Daniel Romero
package proyecto;

import java.util.Random;

public class Planeta {
	private int tipo;
	private String nombre_equipo;
	private int vidas;
	private int misiles_x_ronda;
	private int misiles_a;
	private int misiles_d;
	private String atacar;

	// ************************************************************************************
	// ** Nombre del método: Planeta
	// ** Explicación de lo que hace el método: constructor vacío del objeto planeta.
	// ** Parámetros de entrada: -
	// ** Parámetros de salida: -
	// ************************************************************************************
	public Planeta() {
		this.nombre_equipo = "";
		this.vidas = 0;
		this.misiles_x_ronda = 0;
		this.misiles_a = 0;
		this.misiles_d = 0;
		this.tipo = 0;
		this.atacar = "";
	}

	// ************************************************************************************
	// ** Nombre del método: Planeta
	// ** Explicación de lo que hace el método: constructor con parámetros del
	// ** objeto planeta.
	// ** Parámetros de entrada: String nombre, int vidas, int misiles, int misiles_a,
	// ** int misiles_d, int tipo, String atacar.
	// ** Parámetros de salida: -
	// ************************************************************************************
	public Planeta(String nombre, int vidas, int misiles, int misiles_a, int misiles_d, int tipo, String atacar) {
		this.nombre_equipo = nombre;
		this.vidas = vidas;
		this.misiles_x_ronda = misiles;
		this.misiles_a = misiles_a;
		this.misiles_d = misiles_d;
		this.tipo = tipo;
		this.atacar = atacar;
	}

	// getters
	public String getNombre_equipo() {
		return this.nombre_equipo;
	}

	public int getVidas() {
		return this.vidas;
	}

	public int getMisiles_x_ronda() {
		return this.misiles_x_ronda;
	}

	public int getMisiles_a() {
		return this.misiles_a;
	}

	public int getMisiles_d() {
		return this.misiles_d;
	}

	public int getTipo() {
		return tipo;
	}

	public String getAtacar() {
		return this.atacar;
	}

	// setters
	public void setNombre_equipo(String nombre_equipo) {
		this.nombre_equipo = nombre_equipo;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	public void setMisiles_x_ronda(int misiles_x_ronda) {
		this.misiles_x_ronda = misiles_x_ronda;
	}

	public void setMisiles_a(int misiles_a) {
		this.misiles_a = misiles_a;
	}

	public void setMisiles_d(int misiles_d) {
		this.misiles_d = misiles_d;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public void setAtacar(String atacar) {
		this.atacar = atacar;
	}

	// ************************************************************************************
	// ** Nombre del método: seleccionPlaneta
	// ** Explicación de lo que hace el método: se dan unas características a cada
	// ** equipo según el compañero elegido.
	// ** Parámetros de entrada: int tipo_planeta.
	// ** Parámetros de salida: -
	// ************************************************************************************
	public void seleccionplaneta(int tipo_planeta) {
		if (tipo_planeta == 1) {
			this.vidas = 200;
			this.misiles_x_ronda = 50;
		} else if (tipo_planeta == 2) {
			this.vidas = 200;
			this.misiles_x_ronda = 50;
		} else if (tipo_planeta == 3) {
			this.vidas = 400;
			this.misiles_x_ronda = 10;
		} else if (tipo_planeta == 4) {
			this.vidas = 200;
			this.misiles_x_ronda = 50;
		} else if (tipo_planeta == 5) {
			this.vidas = 100;
			this.misiles_x_ronda = 50;
		} else if (tipo_planeta == 6) {
			this.vidas = 200;
			this.misiles_x_ronda = 50;
		} else if (tipo_planeta == 7) {
			this.vidas = 200;
			this.misiles_x_ronda = 50;
		} else if (tipo_planeta == 8) {
			this.vidas = 200;
			this.misiles_x_ronda = 50;
		} else if (tipo_planeta == 9) {
			this.vidas = 200;
			this.misiles_x_ronda = 50;
		} else if (tipo_planeta == 10) {
			this.vidas = 200;
			this.misiles_x_ronda = 50;
		}
	}

	// ************************************************************************************
	// ** Nombre del método: atacar
	// ** Explicación de lo que hace el método: se ponen los misiles de ataque.
	// ** Parámetros de entrada: -
	// ** Parámetros de salida: -
	// ************************************************************************************
	public void atacar() {
		this.setMisiles_a((int) (PanelDecisionAD.cantidadA.getValue()));
	}

	// ************************************************************************************
	// ** Nombre del método: defender
	// ** Explicación de lo que hace el método: se ponen los misiles de defensa.
	// ** Parámetros de entrada: -
	// ** Parámetros de salida: -
	// ************************************************************************************
	public void defender() {
		this.setMisiles_d((int) (PanelDecisionAD.cantidadD.getValue()));
	}

	// ************************************************************************************
	// ** Nombre del método: comprobarTipo
	// ** Explicación de lo que hace el método: se comprueba si hay algun extra en
	// ** el ataque.
	// ** Parámetros de entrada: int misiles, int tipo, int tipo_contr
	// ** Parámetros de salida: int misiles.
	// ************************************************************************************
	public int comprobarTipo(int misiles, int tipo, int tipo_contr) {
		if (tipo == 1 && tipo_contr == 6) {
			misiles = misiles / 2;
		} else if (tipo == 1 && tipo_contr == 10) {
			misiles = misiles * 2;
		} else if (tipo == 2 && tipo_contr == 9) {
			misiles = misiles * 2;
		} else if (tipo == 2 && tipo_contr == 8) {
			misiles = misiles / 2;
		} else if (tipo == 4 && tipo_contr == 8) {
			misiles = misiles * 2;
		} else if (tipo == 4 && tipo_contr == 9) {
			misiles = misiles / 2;
		} else if (tipo_contr == 5) {
			Random aleatorio = new Random();

			int percent = 0;
			int impactos = 0;

			for (int i = 0; i < misiles; i++) {
				percent = aleatorio.nextInt(2);
				if (percent == 0) {
					impactos++;
				}
			}
			misiles = impactos;

		} else if (tipo == 6 && tipo_contr == 1) {
			misiles = misiles * 2;
		} else if (tipo == 6 && tipo_contr == 10) {
			misiles = misiles / 2;
		} else if (tipo == 8 && tipo_contr == 2) {
			misiles = misiles * 2;
		} else if (tipo == 8 && tipo_contr == 4) {
			misiles = misiles / 2;
		} else if (tipo == 9 && tipo_contr == 4) {
			misiles = misiles * 2;
		} else if (tipo == 9 && tipo_contr == 2) {
			misiles = misiles / 2;
		} else if (tipo == 10 && tipo_contr == 6) {
			misiles = misiles * 2;
		} else if (tipo == 10 && tipo_contr == 1) {
			misiles = misiles / 2;
		}

		return (misiles);

	}

}
