import javax.xml.namespace.QName;

public class Aluno {

    private String nome;
    private int idade;
    private int matricula;

    public Aluno (String nome , int idade , int matricula ){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

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

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;

    }

    @Override
    public String toString() {
        return "Aluno:" +
                "Nome:" + nome +
                ", Idade:" + idade +
                ", Matricula:" + matricula
                ;
    }
}
