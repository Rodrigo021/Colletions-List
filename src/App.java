public class App {
    public static void main(String[] args) throws Exception {
        ListaTarefa lista = new ListaTarefa();
        System.out.println(lista.totalTarefas());
        
        lista.adicionarTarefa("tarea 1");
        lista.adicionarTarefa("tarea 2");
        lista.adicionarTarefa("tarea 3");
        
        //lista.removerTarefa("tarea 2");
        System.out.println(lista.totalTarefas());
        lista.listarDescricoes();
    }
}