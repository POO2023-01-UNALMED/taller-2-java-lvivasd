package test;
public class Auto {
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos() {
		int cantidad_asientos = 0;
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] == null) {
				continue;
			}
			if (asientos[i] instanceof Asiento) {
				cantidad_asientos += 1;
			}
		}
		return cantidad_asientos;
	}
	public String verificarIntegridad() {
		boolean integridad = true;
		for (int i = 0; i < asientos.length; i++) {
			if (this.registro != asientos[i].registro) {
				integridad = false;
				return("Las piezas nos son originales");
				break;
			}
		}
		if (this.registro != motor.registro) {
			integridad = false;
			return("Las piezas no son originales");
		}
		else {
			return("Auto original");
		}
	}
}
