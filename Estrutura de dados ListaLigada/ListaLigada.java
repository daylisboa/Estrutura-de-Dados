public class ListaLigada {

private Celula primeira;
private Celula ultima;
private int totalDeElementos;

//Definindo a interface
public void adiciona(Object elemento) {} 
public void adiciona(int posicao, Object elemento) {} 

public void listar() {
    Celula cel = primeira;
    for(int i = 1; i <= totalDeElementos; i++) {

    Produto prod = (Produto) cel.getElemento();
    System.out.println("Id: " +  prod.getId());
    System.out.println("Descricao: " + prod.getDescricao());
    // System.out.println("Valor: " + prod.getValor());

    cel = cel.getProxima();
  }
}
public boolean alterar(Produto elemento) {
    boolean ret = true; 
    Celula cel = primeira;  
    for (int i=1; i<=totalDeElementos;i++) { 
        Produto prod = (Produto) cel.getElemento(); 
        if (elemento.getId() == prod.getId()) {
          cel.setElemento(elemento);
          ret = false; 
          break; 
        }
        cel = cel.getProxima(); 
    }
    return ret; 
}
public boolean excluir (int id) {
  boolean ret = true; 
  Celula cel = primeira;  
  Celula ant = primeira;  
  for (int i=1; i<=totalDeElementos;i++) {
      Produto prod = (Produto) cel.getElemento(); 
      if (id == prod.getId()) {
        ant.setProxima(cel.getProxima());
        ret = false; 
        totalDeElementos--; 
        break; 
      }
      ant = cel; 
      cel = cel.getProxima(); 
  }
  return ret; 
}
public void incluir(Object elemento) {
    Celula c1 = new Celula(elemento);
    if (totalDeElementos==0) { 
       primeira = c1; 
    } else if (totalDeElementos == 1){
        ultima = c1;     
        primeira.setProxima(ultima);
    }  else { 
        ultima.setProxima(c1);
        ultima = c1; 
    }
    totalDeElementos++; 
}
public void incluirComeco(Object elemento) {
    Celula c1 = new Celula(elemento);
    c1.setProxima(primeira);
    primeira = c1; 
    totalDeElementos++; 
}
public void incluirFim(Object elemento) {
    Celula c1 = new Celula(elemento);
    ultima.setProxima(c1);
    ultima = c1; 
}

}