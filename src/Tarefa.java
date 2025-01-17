import java.util.ArrayList;
import java.util.Scanner;

    // Classe para representar uma tarefa
    class Tarefa {
        private String titulo;
        private String descricao;

        public Tarefa(String titulo, String descricao) {
            this.titulo = titulo;
            this.descricao = descricao;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getDescricao() {
            return descricao;
        }

        @Override
        public String toString() {
            return "Título da tarefa: " + titulo + "\nDescrição da Tarefa: " + descricao;
        }
    }






