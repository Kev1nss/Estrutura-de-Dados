public class Pilha {
    private ListaLigada lista;
    
    
    public Pilha(){
        this.lista = new ListaLigada();
    }
    
    
    //Adiciona no começo da Pilha
    public void adicionar(String novoValor){
        this.lista.adicionarComeco(novoValor);
    }
    
    //Removendo o final da Pilha(Remove o valor procurado)
    public void remover(){
        this.lista.remover(this.get());
    }
    
    //Método que retorna o proximo elemento da pilha
    public String get(){
        return this.lista.getPrimeiro().getValor();
    }
}
