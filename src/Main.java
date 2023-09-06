import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        boolean RodarCodigo = true;
        while(RodarCodigo) {

            System.out.println("---------------------------------");
            System.out.println("SISTEMA DE CADASTRO DE ALUNOS  :)");
            System.out.println("1) Adicionar Aluno");
            System.out.println("2) Remover Aluno");
            System.out.println("3) Buscar Aluno");
            System.out.println("4) Atualizar Aluno");
            System.out.println("5) Listar Todos");
            System.out.println("6) Sair");
            System.out.println("---------------------------------");


            CadastroAlunos cadastroAlunos = new CadastroAlunos();
            int entrada = input.nextInt();


            switch (entrada) {
                case 1 -> {
                    System.out.println("Digite o nome do Aluno:");
                    String nome = input.next();
                    System.out.println("Digite a idade do Aluno");
                    int idade = input.nextInt();
                    System.out.println("Digite a matrícula do Aluno");
                    int matricula = input.nextInt();
                    Aluno aluno = new Aluno(nome,idade,matricula);
                    cadastroAlunos.adicionarAluno(aluno);
                }
                case 2 -> {
                    if(cadastroAlunos.listaVazia()){
                        System.out.println("Cadastre algum aluno antes de remover!");
                    }else{
                        System.out.println("Digite a matricula do aluno");
                        int matricula = input.nextInt();
                        cadastroAlunos.removerAluno(matricula);
                    }

                }
                case 3 -> {
                    if(cadastroAlunos.listaVazia()){
                        System.out.println("Nenhum aluno foi cadastrado!");
                    }else{
                        System.out.println("Digite a matricula do aluno");
                        int matricula = input.nextInt();
                        cadastroAlunos.buscarAluno(matricula);
                    }
                }
                case 4 -> {
                    if(cadastroAlunos.listaVazia()){
                        System.out.println("Nenhum aluno foi encontrado!");
                    }else{
                        System.out.println("Digite a matricula do aluno");
                        int matricula = input.nextInt();
                        System.out.println("Digite o novo nome");
                        String nome = input.next();
                        System.out.println("Digite a nova idade");
                        int idade = input.nextInt();
                        cadastroAlunos.atualizarAluno(matricula,nome,idade);
                    }
                }
                case 5 -> {
                    if(cadastroAlunos.listaVazia()){
                        System.out.println("Nenhum aluno foi cadastrado");
                    }else{
                        cadastroAlunos.listarAlunos();
                    }

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