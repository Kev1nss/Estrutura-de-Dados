public class ListaLigada {
    //Lista Ligada só sabe seu primeiro, último e o tamanho da lista.
    
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;
    
    //Método Construtor
    public ListaLigada(){
        this.primeiro=null;
        this.ultimo=null;
        this.tamanho=0;
        
    }
    
    //Método Adicionar (Lista e Fila)
    public void adicionar(String novoValor){
        Elemento novoElemento = new Elemento(novoValor);
        
        if(primeiro==null && ultimo==null){
            this.primeiro= novoElemento;
            this.ultimo = novoElemento;
        }else{
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
        tamanho ++;
    }
    
    //Método Adicionar no começo (Pilha)
    public void adicionarComeco(String novoValor){
        Elemento novoElemento = new Elemento(novoValor);
        if(this.primeiro==null && this.ultimo==null){
            this.primeiro=novoElemento;
            this.ultimo=novoElemento;
        }else{
            novoElemento.setProximo(this.primeiro);
            this.primeiro = novoElemento;
        }
        tamanho ++;
    }
    
    
    
    //Método Remover
   public void remover(String valorProcurado) {
    Elemento anterior = null;
    Elemento atual = this.primeiro;

  for (int i=0; i<this.getTamanho();i++){
      if(atual.getValor().equalsIgnoreCase(valorProcurado)){
          if(tamanho==1){
              this.primeiro=null;
              this.ultimo=null;
          }else if(atual==primeiro){
              //removendo o primeiro
              this.primeiro=atual.getProximo();
              atual.setProximo(null);
          } else if(atual ==ultimo){
              //removendo o ultimo
              this.ultimo=anterior;
              anterior.setProximo(null);
              
          }else {
              //removendo no meio
              anterior.setProximo(atual.getProximo());
              atual=null;
          }
          this.tamanho --;
          break;
      }
      anterior=atual;
      atual=atual.getProximo();
  }
  }
      
      
    // Método para retornar Posição
      public Elemento get(int posicao){
          Elemento atual = this.primeiro;
          
          for(int i=0; i<posicao;i++){
              if(atual.getProximo() !=null){
                  atual=atual.getProximo();
              }
             
          }
          return atual; 
          
      }
    
    //Métodos Acessores
    public void setPrimeiro(Elemento primeiro){
        this.primeiro=primeiro;
    }
    public Elemento getPrimeiro(){
        return primeiro;
    }
     public void setUltimo(Elemento ultimo){
        this.ultimo=ultimo;
    }
    public Elemento getUltimo(){
        return ultimo;
    }
    public void setTamanho(int tamanho){
        this.tamanho=tamanho;
  }
    public int getTamanho(){
        return tamanho;
}
}

    

