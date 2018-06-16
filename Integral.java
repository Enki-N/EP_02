/*******************************************************************/
/** ACH2001 - Introducao a Programacao                            **/
/** EACH-USP - Primeiro Semestre de 2015                          **/
/**                                                               **/
/** Segundo Exercicio-Programa                                    **/
/**                                                               **/
/** <Victor A. Nicacio Queiroz>  <10856737>                       **/
/**                                                               **/
/*******************************************************************/

class Integral {
	/**
		Retorna a área sob a curva definida pela função f, entre os pontos
		a e b, pela regra dos trapézios, aproximando a curva por n trapézios.

		O método retorna -1 caso n não seja maior ou igual a 1.
	*/
	static double resolve(Funcao f, double a, double b, int n) {
		//Metodo para resolver a area da função a partir da Regra dos Trapézios.
		if(n <= 0) return -1; // Condição inicial, retorna (-1) caso o valor de n seja menor ou igual a 0.

		double h = (b - a) / n; // Determina a altura dos trapézios.
		double area = 0; // Variavel para armazenar o valor aproximando da área.
		double sum = 0; // Variavel que armazena o valor do somatório.
		double x = a + h; // Inicia os pontos que irão ser contabilizados no somatório.

		for(int i = 1; i < n; i++){ // Laço para calcular o valor do somatório.
			sum += f.valor(x);
			x += h;
		}

		area = (h / 2) * (f.valor(a) + f.valor(b) + (2 * (sum))); // Aplicação da fórmula da Regra dos Trapezios.

		return (area);
	}
}
