public class Elemento {
    //Elemento(Nó) só sabe seu valor e seu próximo
    public String valor;
    public Elemento proximo;
    
    public Elemento(String novoValor){
        this.valor=novoValor;
        
    }
    
    
     //Métodos Acessores
    public void setValor(String valor){
        this.valor=valor;
    }
    public String getValor(){
        return valor;
    }
     public void setProximo(Elemento proximo){
        this.proximo=proximo;
    }
    public Elemento getProximo(){
        return proximo;
    }
    
}
