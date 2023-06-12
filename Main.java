public class Main {
  public static void main(String[] args) {
    ListaLigada lista = new ListaLigada();
    Fila fila = new Fila();
    Pilha pilha = new Pilha();
    
    
    
  // Exemplo de adição de elementos na Lista
    lista.adicionar("Elemento 1");
    lista.adicionar("Elemento 2");
    lista.adicionar("Elemento 3");
    
     System.out.println("Primeiro elemento: "+ lista.getPrimeiro().getValor());
     System.out.println("Ultimo elemento: "+ lista.getUltimo().getValor());
     System.out.println("Tamanho da Lista: "+ lista.getTamanho());
     
     
     //Exemplo de removendo elementos da Lista
     lista.remover("Elemento 1");
     System.out.println("Tamanho da Lista: "+ lista.getTamanho());
     
     
    // Exemplo de adição de elementos na fila
    fila.adicionar("Elemento x");
    fila.adicionar("Elemento y");
    fila.adicionar("Elemento z");

    System.out.println("Primeiro elemento"+fila.get());
    
    // Exemplo de remoção de elementos da fila
    fila.remover();//removendo o primeiro
    System.out.println("Primeiro elemento"+fila.get());
    fila.remover();
    
    
    
    //Exemplo adicionando elementos na Pilha
    pilha.adicionar("a");
    pilha.adicionar("b");
    pilha.adicionar("c");
    System.out.println("Quem foi adicionado por último: " + pilha.get());

    //Removendo Pilha
    pilha.remover();
    System.out.println("Quem foi adicionado por último: " + pilha.get());


    

  }
}
