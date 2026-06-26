public class Atleta extends Pessoa {
    private String modalidade;

    public Atleta(String nome, int idade, double peso, double altura, String modalidade) {
        super(nome, idade, peso, altura);
        this.modalidade = modalidade;
    }

    public String getModalidade() {
        return modalidade;
    }

    @Override
    public String classificarIMC(double imc) {
        // Atletas têm faixas de classificação diferenciadas
        if (imc < 20) {
            return "Abaixo do peso (Atleta)";
        } else if (imc < 25) {
            return "Peso normal (Atleta) - Excelente!";
        } else if (imc < 30) {
            return "Sobrepeso moderado (Atleta)";
        } else {
            return "Peso elevado para a modalidade";
        }
    }

    @Override
    public String exibirPerfil() {
        return super.exibirPerfil() + " | Modalidade: " + modalidade;
    }
}