package es.studium.Refactorizacion;

public class Refactorizacion {
	
	private static final double IVA = 1.21;

	public static double calcularPrecio(int unidades, double precioUnitario) {
		return ((unidades*precioUnitario)*IVA);
	}
}
