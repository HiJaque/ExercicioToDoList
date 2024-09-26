import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        AdicionarTarefas gerenciador = new AdicionarTarefas();
        Scanner ler = new Scanner(System.in);

        while (true) {

            System.out.println(String.format("\nMenu:" +
                    "\n 1. Criar uma tarefa nova" +
                    "\n 2. Mostrar todas as tarefas " +
                    "\n 3. Sair" +
                    "\n Escolha uma opção:"));

            int opcao = ler.nextInt();
            ler.nextLine();  // Consumir a nova linha

            if (opcao == 1) {
                System.out.print("Digite o título: ");
                String titulo = ler.nextLine();
                System.out.print("Digite a tarefa: ");
                String descricao = ler.nextLine();
                gerenciador.adicionar(titulo, descricao);
            } else if (opcao == 2) {
                gerenciador.exibirTarefas();
            } else if (opcao == 3) {
                System.out.println("Até Logo...");
                break;
            } else {
                System.out.println("Opção inválida");
            }
        }

        ler.close();
    }
}
