//David Blanco, Sergi Pifarré y Daniel Romero
package proyecto;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Struct;
import java.util.ArrayList;

import proyecto.Jugadores.Imagen;

public class Main {

	// Ilerna: 192.168.3.26
	// Casa: oracle.ilerna.com
	private static final String USER = "DAW1_49536142F";
	private static final String PWD = "A49536142F";
	private static final String URL = "jdbc:oracle:thin:@oracle.ilerna.com:1521:xe";
	public static Connection con;
	
	public static Partida partida;
	private static int numPartida;
	public static boolean guardado;
	
	//************************************************************************************
	//** Nombre del método: main
	//** Explicación de lo que hace el método: método principal, que crea el marco general
	//** y establece la conexión con la base de datos.
	//** Parámetros de entrada: String[] args
	//** Parámetros de salida: -
	//************************************************************************************
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoGeneral marco1 = new MarcoGeneral();
		con = makeConnection();
	}

	//************************************************************************************
	//** Nombre del método: makeConnection
	//** Explicación de lo que hace el método: método para establecer la conexión.
	//** Parámetros de entrada: -
	//** Parámetros de salida: -
	//************************************************************************************
	public static Connection makeConnection() {

		System.out.println("Connecting database...");

		Connection con = null;
		// intentamos la conexión a la base de datos
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(URL, USER, PWD);
			System.out.println("Database connected!");
		} catch (SQLException e) {
			throw new IllegalStateException("Cannot connect the database! ", e);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// devolvemos el valor de la conexión
		return con;
	}

	//************************************************************************************
	//** Nombre del método: selectPartidas
	//** Explicación de lo que hace el método: añade en un JList todas las 
	//** partidas guardadas.
	//** Parámetros de entrada: Connection con
	//** Parámetros de salida: -
	//************************************************************************************
	public static void selectPartidas(Connection con) {
		try {
			String fecha = "";
			String sql = "SELECT d.* FROM datos_partida d ORDER BY fecha DESC";
			int num = 0;
			BigDecimal ronda = null;
			BigDecimal equipos = null;
			Statement st = null;
			st = con.createStatement();

			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				num = rs.getInt("numPartida");
				fecha = rs.getString("fecha");
				Struct datos = (Struct) rs.getObject("datos");
				ronda = (BigDecimal) datos.getAttributes()[0];
				equipos = (BigDecimal) datos.getAttributes()[1];
				PanelCargar.modelo.addElement(
						fecha + "          Partida " + num + "   Ronda " + ronda + "  //  " + equipos + " equipos restantes.");
			}
			st.close();
		} catch (SQLException e) {
			System.out.println("The SELECT had problems!!" + e);
		}
		if(PanelCargar.modelo.isEmpty() == true) {
			PanelCargar.eliminar.setEnabled(false);
			PanelCargar.borrarTodo.setEnabled(false);
		}
		else {
			PanelCargar.eliminar.setEnabled(true);
			PanelCargar.borrarTodo.setEnabled(true);	
		}
		}
	

	//************************************************************************************
	//** Nombre del método: selectWithStatement
	//** Explicación de lo que hace el método: carga los datos de la partida seleccionada
	//** y de los planetas que la componen.
	//** Parámetros de entrada: Connection con
	//** Parámetros de salida: -
	//************************************************************************************
	public static void selectWithStatement(Connection con) {

		try {
			BigDecimal ronda;
			BigDecimal equipos;
			String sql = "SELECT d.* FROM datos_partida d WHERE d.fecha='" + PanelCargar.fecha + "'";

			Statement st = null;
			st = con.createStatement();

			ResultSet rs = st.executeQuery(sql);
			partida = new Partida();

			while (rs.next()) {
				Struct datos = (Struct) rs.getObject("datos");
				ronda = (BigDecimal) datos.getAttributes()[0];
				equipos = (BigDecimal) datos.getAttributes()[1];
				partida.ronda = ronda.intValueExact();
			}
			st.close();
		} catch (SQLException e) {
			System.out.println("The SELECT had problems!!" + e);
		}

		try {
			BigDecimal tipo;
			String nombre = "";
			BigDecimal vidas;
			BigDecimal misiles;
			String desplegable = "";
			String imagen = "";
			String sql2 = "SELECT p.* FROM planetas p WHERE p.fecha='" + PanelCargar.fecha + "' ORDER BY numJ";

			Statement st2 = null;
			st2 = con.createStatement();

			ResultSet rs2 = st2.executeQuery(sql2);
			Partida.equipos = new ArrayList<>();
			Partida.desplegables2 = new ArrayList<>();
			Jugadores.imagenes = new ArrayList<>();
			Partida.fondos = new ArrayList<>();
			String fondo = "";

			while (rs2.next()) {
				Struct planeta = (Struct) rs2.getObject("planeta");
				tipo = (BigDecimal) planeta.getAttributes()[0];
				nombre = (String) planeta.getAttributes()[1];
				vidas = (BigDecimal) planeta.getAttributes()[2];
				misiles = (BigDecimal) planeta.getAttributes()[3];
				desplegable = (String) planeta.getAttributes()[4];
				imagen = (String) planeta.getAttributes()[5];
				Planeta planet = new Planeta();

				planet.setTipo(tipo.intValueExact());
				planet.setNombre_equipo(nombre);
				planet.setVidas(vidas.intValueExact());
				planet.setMisiles_x_ronda(misiles.intValueExact());

				Partida.equipos.add(planet);

				Partida.desplegables2.add(desplegable);
				Imagen image = new Imagen();

				image.picture = imagen;
				Jugadores.imagenes.add(image);
			}
			for (int i = 0; i < Partida.equipos.size(); i++) {
				if (Partida.equipos.get(i).getTipo() == 1) {
					fondo = "/imagenes/fondo bu.jpg";
					Partida.fondos.add(fondo);
				} else if (Partida.equipos.get(i).getTipo() == 2) {
					fondo = "/imagenes/fondo cell.jpg";
					Partida.fondos.add(fondo);
				} else if (Partida.equipos.get(i).getTipo() == 3) {
					fondo = "/imagenes/fondo duende.jpg";
					Partida.fondos.add(fondo);
				} else if (Partida.equipos.get(i).getTipo() == 4) {
					fondo = "/imagenes/fondo freezer.jpg";
					Partida.fondos.add(fondo);
				} else if (Partida.equipos.get(i).getTipo() == 5) {
					fondo = "/imagenes/fondo gohan.jpg";
					Partida.fondos.add(fondo);
				} else if (Partida.equipos.get(i).getTipo() == 6) {
					fondo = "/imagenes/fondo goku.jpg";
					Partida.fondos.add(fondo);
				} else if (Partida.equipos.get(i).getTipo() == 7) {
					fondo = "/imagenes/fondo krilin.jpg";
					Partida.fondos.add(fondo);
				} else if (Partida.equipos.get(i).getTipo() == 8) {
					fondo = "/imagenes/fondo piccolo.jpg";
					Partida.fondos.add(fondo);
				} else if (Partida.equipos.get(i).getTipo() == 9) {
					fondo = "/imagenes/fondo trunks.jpg";
					Partida.fondos.add(fondo);
				} else if (Partida.equipos.get(i).getTipo() == 10) {
					fondo = "/imagenes/fondo vegeta.jpg";
					Partida.fondos.add(fondo);
				}
			}
			st2.close();
		} catch (SQLException e) {
			System.out.println("The SELECT had problems!!" + e);
		}
	}

	//************************************************************************************
	//** Nombre del método: createStatement
	//** Explicación de lo que hace el método: guarda los datos de la partida y los
	//** planetas actuales en la base de datos.
	//** Parámetros de entrada: Connection con
	//** Parámetros de salida: -
	//************************************************************************************
	public static void createStatement(Connection con) {

		int tipo = 0;
		String nombre = "";
		int vidas = 0;
		int misiles = 0;
		String desplegable = "";
		String imagen = "";

		int ronda = 0;
		int equipos = 0;
		int num = 0;
		int numJ = 0;
		ronda = Partida.ronda + 1;
		equipos = Partida.equipos.size();
		String sql = "";

		if (getNumPartida(con) == false) {
			sql = "INSERT INTO DATOS_PARTIDA VALUES (numPartida.nextval, DATOS('" + ronda + "', '" + equipos
					+ "'), to_char(sysdate, 'DD/MM/YYYY HH24:MI:SS'))";
		} else {
			num = numPartida;
			sql = "INSERT INTO DATOS_PARTIDA VALUES ('" + num + "', DATOS('" + ronda + "', '" + equipos
					+ "'), to_char(sysdate, 'DD/MM/YYYY HH24:MI:SS'))";
		}

		Statement st = null;

		try {
			st = con.createStatement();
			st.execute(sql);

			st.close();
		} catch (SQLException e) {
			System.out.println("The INSERT had problems!! " + e);
		}

		String desp = "";
		for (int i = 0; i < Partida.equipos.size(); i++) {
			tipo = Partida.equipos.get(i).getTipo();
			nombre = Partida.equipos.get(i).getNombre_equipo();
			vidas = Partida.equipos.get(i).getVidas();
			misiles = Partida.equipos.get(i).getMisiles_x_ronda();

			if (Partida.equipos.get(i).getTipo() == 1) {
				desp = "Buu";
			} else if (Partida.equipos.get(i).getTipo() == 2) {
				desp = "Cell";

			} else if (Partida.equipos.get(i).getTipo() == 3) {
				desp = "Duende Tortuga";

			} else if (Partida.equipos.get(i).getTipo() == 4) {
				desp = "Freezer";

			} else if (Partida.equipos.get(i).getTipo() == 5) {
				desp = "Gohan";

			} else if (Partida.equipos.get(i).getTipo() == 6) {
				desp = "Goku";

			} else if (Partida.equipos.get(i).getTipo() == 7) {
				desp = "Krilin";

			} else if (Partida.equipos.get(i).getTipo() == 8) {
				desp = "Piccolo";

			} else if (Partida.equipos.get(i).getTipo() == 9) {
				desp = "Trunks";

			} else if (Partida.equipos.get(i).getTipo() == 10) {
				desp = "Vegeta";

			}

			desplegable = desp;
			String sql2 = "";
			imagen = Jugadores.imagenes.get(i).picture;
			numJ = i;
			
			sql2 = "INSERT INTO PLANETAS VALUES ('" + numJ + "',PLANETA('" + tipo + "', '" + nombre + "', '" + vidas
					+ "','" + misiles + "', '" + desplegable + "', '" + imagen
					+ "'), to_char(sysdate, 'DD/MM/YYYY HH24:MI:SS'))";

			Statement st2 = null;

			try {
				st2 = con.createStatement();
				st2.execute(sql2);

				st2.close();
				guardado = true;
			} catch (SQLException e) {
				deleteError(con, fechaError(con));
				guardado = false;
				return;
			}
		}

	}

	//************************************************************************************
	//** Nombre del método: fechaError
	//** Explicación de lo que hace el método: busca la última fecha guardada para borrar
	//** los datos de esa partida en caso de error al guardar.
	//** Parámetros de entrada: Connection con
	//** Parámetros de salida: String fechaError
	//************************************************************************************
	public static String fechaError(Connection con) {
		String fechaError = "";
		try {
			String sql = "SELECT MAX(fecha) FROM datos_partida";
			Statement st = null;
			st = con.createStatement();

			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				fechaError = rs.getString("MAX(fecha)");
			}
			st.close();
		} catch (SQLException e) {
			System.out.println("The SELECT had problems!!" + e);
		}
		return fechaError;
	}

	//************************************************************************************
	//** Nombre del método: deleteError
	//** Explicación de lo que hace el método: borra los datos de la partida guardada en
	//** caso de error al guardar.
	//** Parámetros de entrada: Connection con
	//** Parámetros de salida: String fechaError
	//************************************************************************************
	public static void deleteError(Connection con, String fecha) {
		String sql = "";
		String sql2 = "";
		String sql3 = "";
		String sql4 = "";
		String sql5 = "";
		
		sql = "DELETE FROM planetas WHERE fecha = '" + fecha + "'";
		sql2 = "DELETE FROM datos_partida WHERE fecha = '" + fecha + "'";
		sql3 = "ALTER SEQUENCE numPartida increment by -1";
		sql4 = "select numpartida.nextval FROM dual";
		sql5 = "ALTER SEQUENCE numPartida increment by 1";

		Statement st = null;

		try {
			st = con.createStatement();
			st.execute(sql);
			st.execute(sql2);
			st.execute(sql3);
			st.execute(sql4);
			st.execute(sql5);

			st.close();
		} catch (SQLException e) {
			System.out.println("The DELETE had problems!! " + e);
		}
	}

	//************************************************************************************
	//** Nombre del método: borrarTodo
	//** Explicación de lo que hace el método: borra todos los datos de la base de datos y
	//** reinicia la secuencia.
	//** Parámetros de entrada: Connection con
	//** Parámetros de salida: -
	//************************************************************************************
	public static void borrarTodo(Connection con) {
		String sql = "";
		String sql2 = "";
		String sql3 = "";
		String sql4 = "";
		
		sql = "DELETE FROM planetas";
		sql2 = "DELETE FROM datos_partida";
		sql3 = "DROP SEQUENCE numpartida";
		sql4 = "CREATE SEQUENCE numpartida MINVALUE 0 INCREMENT BY 1 START WITH 0";

		Statement st = null;

		try {
			st = con.createStatement();
			st.execute(sql);
			st.execute(sql2);
			st.execute(sql3);
			st.execute(sql4);
			st.close();
		} catch (SQLException e) {
			System.out.println("The DELETE had problems!! " + e);
		}
	}
	
	//************************************************************************************
	//** Nombre del método: getNumPartida
	//** Explicación de lo que hace el método: comprueba si la partida está guardada o
	//** es nueva y, en el primer caso, coge el número de partida.
	//** Parámetros de entrada: Connection con
	//** Parámetros de salida: boolean existe
	//************************************************************************************
	public static boolean getNumPartida(Connection con) {
		boolean existe = true;
		int numPartidas = 0;
		String fecha = "";
		try {
			if (PanelCargar.cargado == false && Partida.ronda == 1) {
				fecha = "";
			}
			else if(PanelCargar.cargado == false && Partida.ronda != 1) {
				fecha = fechaError(con);
			}
			else {
				fecha = PanelCargar.fecha;
			}
			String sql = "SELECT COUNT(numPartida), numPartida FROM datos_partida d WHERE d.fecha='" + fecha
					+ "' GROUP BY numPartida";
			Statement st = null;
			st = con.createStatement();

			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				numPartidas = rs.getInt("COUNT(numPartida)");
				numPartida = rs.getInt("numPartida");
			}
			st.close();
		} catch (SQLException e) {
			System.out.println("The SELECT had problems!!" + e);
		}
		if (numPartidas == 0) {
			existe = false;
		} else {
			existe = true;
		}
		return existe;
	}

	//************************************************************************************
	//** Nombre del método: deleteStatement
	//** Explicación de lo que hace el método: borra los datos de la partida seleccionada.
	//** Parámetros de entrada: Connection con
	//** Parámetros de salida: -
	//************************************************************************************
	public static void deleteStatement(Connection con) {
		String sql = "";
		String sql2 = "";

		sql = "DELETE FROM PLANETAS WHERE fecha='" + PanelCargar.fecha + "'";
		sql2 = "DELETE FROM DATOS_PARTIDA WHERE fecha='" + PanelCargar.fecha + "'";

		Statement st = null;

		try {
			st = con.createStatement();
			st.execute(sql);
			st.execute(sql2);
			st.close();
		} catch (SQLException e) {
			System.out.println("The DELETE had problems!! " + e);
		}
	}

}
