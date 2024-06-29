import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    //ArrayList<Task> tasks = new ArrayList<>();

    //Isso é um ArrayList
    private List<Task> tasks;

    //Construtor recebendo uma lista e referenciando a variavel tasks
    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    //Metodos para adicionar a task
    public void addTask(Task task) {
        tasks.add(task);

    }

    //Metodo para listar, o getTasks pega a lista
    public List<Task> getTasks() {
        return tasks;
    }

    //Metodo para remover uma task da lista
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }


    }

    public void updateTask(int index, Task task){
        if (index >= 0 && index < tasks.size()){
            tasks.set(index, task);
        }
    }
}
