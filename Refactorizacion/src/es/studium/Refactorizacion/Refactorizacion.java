package es.studium.Refactorizacion;

public class Refactorizacion {
	
	public static double calcularPrecio(int unidades, double precioUnitario) {
		return ((((unidades*precioUnitario)*21)/100)+(unidades*precioUnitario));
	}
}
