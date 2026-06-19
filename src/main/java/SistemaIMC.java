public class SistemaIMC {
    private Historico historico = new Historico();
    private Pessoa ultimaPessoaCadastrada = null;
    private boolean temPessoaCadastrada = false;

    public void processar(Pessoa pessoa) {
        this.ultimaPessoaCadastrada = pessoa;
        this.temPessoaCadastrada = true;

        double imc = pessoa.calcularIMC(pessoa.getPeso(), pessoa.getAltura());
        String classe = pessoa.classificarIMC(imc);

        String linha = pessoa.getNome() + " -> IMC: " +
                String.format("%.2f", imc) + " (" + classe + ")";
        historico.adicionar(linha);
        System.out.println(linha);
    }
    public boolean possuiCadastros() {
        return this.temPessoaCadastrada;
    }
    public void calcularExibirUltimoIMC() {
        if (!temPessoaCadastrada || ultimaPessoaCadastrada == null) {
            throw new EntradaInvalidaException("Não há nenhuma pessoa cadastrada para calcular o IMC!");
        }

        double alturaQuadrado = CalculadoraRecursiva.potencia(ultimaPessoaCadastrada.getAltura(), 2);
        double imcRecursivo = ultimaPessoaCadastrada.getPeso() / alturaQuadrado;
        String classe = ultimaPessoaCadastrada.classificarIMC(imcRecursivo);

        System.out.printf("\n>> Último cadastro: %s", ultimaPessoaCadastrada.getNome());
        System.out.printf("\n>> IMC calculado via Recursão: %.2f (%s)\n", imcRecursivo, classe);
    }
    public void exibirHistorico() {
        System.out.println("\n--- HISTÓRICO DE CÁLCULOS ---");
        historico.exibir();
    }
}