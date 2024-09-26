import java.util.ArrayList;

public class AdicionarTarefas {
    // Lista para armazenar as tarefas
    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    // Método para adicionar uma tarefa
    public void adicionar(String titulo, String descricao) {
        Tarefa tarefa = new Tarefa(titulo, descricao);
        tarefas.add(tarefa);
        System.out.println("Pronto, tarefa adicionada");
    }

    // Método para exibir todas as tarefas
    public void exibirTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Sem Tarefas no momento");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println("Tarefa " + (i + 1) + ":");
                System.out.println(tarefas.get(i));
                System.out.println();
            }
        }
    }
}
