public class Lista {

  public static void main(String[] args) {

    ListaLigada lista = new ListaLigada();

    Produto p1 = new Produto(1, "Caneta");
    Produto p2 = new Produto(2, "Lápis");

    Celula c1 = new Celula(p1);
    Celula c2 = new Celula(p2);

    lista.adiciona(c1);
    lista.adiciona(c2);
    
    System.out.println(lista);
  }
}