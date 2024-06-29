import java.time.LocalDate;

public class Task {

//
//    Sistema de Gerenciamento de Tarefas (To-Do List)
//
//    Descrição: Crie um aplicativo de console que permite aos usuários adicionar,
//    visualizar, editar e excluir tarefas. Cada tarefa pode ter um título,
//    uma descrição e uma data de vencimento.
//
//    Funcionalidades:
//    Adicionar nova tarefa;
//    Listar todas as tarefas;
//    Editar uma tarefa existente;
//    Marcar uma tarefa como concluída;
//    Excluir uma tarefa;

//    Desafios adicionais:
//    Persistência de dados usando arquivos ou banco de dados.
//    Interface gráfica usando JavaFX ou Swing.


    private String title;
    private String descripition;
    private LocalDate dueDate;


    public Task(String title, String descripition ){
        this.title = title;
        this.descripition = descripition;
//        this.dueDate = dueDate;
    }

    public Task() {

    }


    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getDescripition() {

        return descripition;
    }

    public void setDescripition(String descripition) {

        this.descripition = descripition;
    }

    public LocalDate getDueDate() {


        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {

        this.dueDate = dueDate;



    }
}
