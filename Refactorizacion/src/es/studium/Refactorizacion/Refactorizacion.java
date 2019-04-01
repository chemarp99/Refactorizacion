package es.studium.Refactorizacion;

public class Refactorizacion {
	
	public static double calcularPrecio(int unidades, double precioUnitario) {
		final Double IVA = 1.21;
		return ((unidades*precioUnitario)*IVA);
	}
}
