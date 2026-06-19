public class Atleta extends Pessoa {

    private String modalidade;

    public Atleta (String nome, int idade, double peso, double altura, String modalidade){
        super (nome, idade, peso, altura);
        this.modalidade = modalidade;
    }

    @Override
    public String classificarIMC(double imc) {
        if (imc < 20.0) return "Abaixo do peso ideal para um atleta";
        else if (imc < 27.0) return "Ideal para um atelta";
        else return "Acima do ideal para um atleta";
        }

        @Override
    public String exibirPerfil() {
        return super.exibirPerfil() + "modalidade" + modalidade;
        }
}
