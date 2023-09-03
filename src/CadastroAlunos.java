import java.util.ArrayList;
import java.util.List;


public class CadastroAlunos {
    private static List<String> alunos = new ArrayList<>();

    public static void AdicionarAluno(String aluno){
        int matricula = Aluno.getMatricula() ;
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
            System.out.println(alunos);
        }else{
            System.out.println("Aluno com com a matricula " + matricula + " já cadastrado no sistema.");

        }
    }






}
