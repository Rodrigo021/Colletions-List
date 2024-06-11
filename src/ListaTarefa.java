import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> removeTarefas = new ArrayList<>();
        if (!tarefaList.isEmpty()) {
            for (Tarefa t : tarefaList) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    removeTarefas.add(t);
                }
            }
            tarefaList.removeAll(removeTarefas);
        }else{
            System.out.println("A lista está vazia");
        }
    }

    public int totalTarefas(){
        return tarefaList.size();
    }

    public void listarDescricoes(){
        System.out.println(tarefaList);
    }
}
