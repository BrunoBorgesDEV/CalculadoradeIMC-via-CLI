public class CalculadoraRecursiva {
    public static double potencia(double base, int expoente){
        if (expoente == 0){
            return 1;
        }
        return base * potencia (base, expoente - 1);
    }
    public static double arredondarIMC(double valor) {
        return Math.round(valor * 100.0) / 100.0;
    }
}
