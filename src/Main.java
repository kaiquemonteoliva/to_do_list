import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {


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


        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();


        int opcao;

        do {

            System.out.println("\nEscolha a opção: 1 para adicionar, 2 listar task's, 3 para remover, 4 para editar, 0 Para sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    Task novaTask = new Task();
                    System.out.print("Título: ");
                    novaTask.setTitle(scanner.nextLine());
                    System.out.print("Descrição: ");
                    novaTask.setDescripition(scanner.nextLine());
//                    System.out.println("Digite a data de validade DD/MM/YYYY:");
//                    novaTask.setDueDate(LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                    System.out.println("Digite a data de validade DD/MM/YYYY:");
                    String dataInput = scanner.nextLine();
                    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    try {
                        LocalDate date = LocalDate.parse(dataInput, dateFormatter);
                        date.format(dateFormatter);
                        novaTask.setDueDate(date);
                    } catch (Exception e) {
//                        Codigo
                    }
                    taskManager.addTask(novaTask);
                    System.out.println("Task criada com sucesso!!!");
                    break;

                case 2:
                    if (!taskManager.getTasks().isEmpty()) {
                        for (Task cadaTask : taskManager.getTasks()) {
                            System.out.println();
                            System.out.println("Titulo: " + cadaTask.getTitle());
                            System.out.println("Descrição: " + cadaTask.getDescripition());
                            System.out.println("Data de vencimento: " + cadaTask.getDueDate());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Digite o numero da task que deseja remover: ");
                    int removertask = scanner.nextInt();
                    if (!taskManager.getTasks().isEmpty()) taskManager.removeTask(removertask - 1);
                    System.out.println("Task removida!!!");
                    break;

                case 4:
                    novaTask = new Task();
                    System.out.println("Digite o numero da task que você quer editar: ");
                    int index = Integer.parseInt(scanner.nextLine()) - 1;
                    System.out.print("Título: ");
                    novaTask.setTitle(scanner.nextLine());
                    System.out.println("Descrição: ");
                    novaTask.setDescripition(scanner.nextLine());
                    System.out.println("Digite a data devalidade DD/MM/YYYY");
                    dataInput = scanner.nextLine();
                    dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    try {
                        LocalDate date = LocalDate.parse(dataInput, dateFormatter);
                        date.format(dateFormatter);
                        novaTask.setDueDate(date);
                    } catch (Exception e) {
//                        Codigo
                    }
                    taskManager.updateTask(index, novaTask);
                    System.out.println("Task atualizada com sucesso!!!");
                    break;
            }

        } while (opcao != 0);
        System.out.println("Você saiu do programa!!!");
    }
}