public class Fila {
    private ListaLigada lista;
    
    public Fila(){
        this.lista = new ListaLigada();
    }
    
    //Adicionando no final da lista
    public void adicionar(String novoValor){
        this.lista.adicionar(novoValor);
    }
    
    //Removendo do começo da lista
    public void remover(){
        this.lista.remover(this.get());
    }
    
    
    //Retornando proximo elemento da fila
    public String get(){
        return this.lista.getPrimeiro().getValor();
    }
    
}
