public abstract class PessoaBase {

    protected String nome;
    protected int idade;

    public PessoaBase(String nome, int idade) {
        this.nome = nome ;
        this.idade = idade;
    }
public abstract String exibirPerfil();

    public String getNome(){
        return nome;
    }
    public int getidade(){
        return idade;
    }
}