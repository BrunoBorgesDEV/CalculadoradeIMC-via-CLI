public class Pessoa extends PessoaBase implements CalculadoraIMC {
    private double peso;
    private double altura;
    private boolean active;

    public Pessoa(String nome, int idade, double peso, double altura) {
        super(nome, idade);
        this.peso = peso;
        this.altura = altura;
        this.active = true;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public boolean isActive() {
        return active;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("O peso deve ser maior que zero.");
        }
        this.peso = peso;
    }

    @Override
    public double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    @Override
    public String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "abaixo do peso";
        } else if (imc < 25) {
            return "peso normal  :)";
        } else if (imc < 30) {
            return "sobrepeso";
        } else if (imc < 35) {
            return "obesidade grau 1";
        } else if (imc < 40) {
            return "obesidade grau 2";
        } else {
            return "obesidade grau 3";
        }
    }
    @Override
    public String exibirPerfil() {
        double imcCalculado = calcularIMC(this.peso, this.altura);
        String classificacao = classificarIMC(imcCalculado);

        return String.format("Nome: %s, Idade: %d, Peso: %.2f kg, Altura: %.2f m | IMC: %.2f (%s)",
                getNome(), getidade(), this.peso, this.altura, imcCalculado, classificacao);
    }
}