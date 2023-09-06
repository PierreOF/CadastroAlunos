import java.util.ArrayList;
import java.util.List;


public class CadastroAlunos {
    private static final List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno){
        int matricula = aluno.getMatricula() ;
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
        }else{
            System.out.println("Aluno com com a matricula " + matricula + " já cadastrado no sistema.");
        }
    }

    public void buscarAluno(int matricula){
        for(Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                System.out.println(aluno);
                return;
            }
        }System.out.println("Aluno não encontrado :/");
    }

    public void removerAluno(int matricula){
        for(Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                alunos.remove(aluno);
                System.out.println("Aluno "+aluno.getNome()+" removido com sucesso!");
                return;
            }
        }System.out.println("Aluno não encontrado :/");
    }
    public void atualizarAluno(int matricula,String nome,int idade ) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                aluno.setNome(nome);
                aluno.setIdade(idade);
                return;
        }
        }
    }
    public void listarAlunos(){
        System.out.println(alunos);
    }

    public boolean listaVazia(){
        return alunos.isEmpty();
    }


}
