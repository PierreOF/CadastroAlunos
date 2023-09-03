public class Aluno {

    private String nome;
    private int idade;
    private static int matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        Aluno.matricula = matricula;
    }
}
