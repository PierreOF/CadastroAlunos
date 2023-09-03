import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        boolean RodarCodigo = true;
        while(RodarCodigo) {
            int entrada = input.nextInt();

            switch (entrada) {
                case 1 -> {
                    System.out.println("Digite o nome do Aluno:");
                    String nome = input.next();
                    CadastroAlunos.AdicionarAluno(nome);
                }
                case 6 -> {
                    System.out.println("ENCERRANDO...");
                    RodarCodigo = false;
                }
                default -> System.out.println("Digite um número válido");
            }
        }

    }
}