package entidade;

public class ConversorMoeda {
	public static double IOF = 0.06;
	public static double dolarParaReal(double quantia, double precoDolar) {
	return quantia * precoDolar * (1.0 + IOF);
}
}
