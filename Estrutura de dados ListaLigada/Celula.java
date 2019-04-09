//A idéia aqui é ter uma forma de, dado um aluno, saber quem é o próximo, sem usar uma estrutura fixa.
//A classe Celula a seguir possui apenas esses dois atributos, além de getters, setters e de construtores para facilitar nosso trabalho.
//A classe AlunoLista possui uma referência para um objeto de seu próprio tipo!

public class Celula {

  private Celula proxima; //referencia o proximo da lista
  private Object elemento; //pessoa

  public Celula() {}

  public Celula(Object elemento) { 
    this.elemento = elemento;
  }
  public Celula (Celula proxima, Object elemento) {
    this.proxima = proxima;
    this.elemento = elemento;
  }
  public Celula getProxima () {
    return proxima;
  }
  public void setProxima (Celula proxima) {
    this.proxima = proxima;
  }
  public void setElemento (Object elemento){
    this.elemento = elemento;
  }
  public Object getElemento() {
    return elemento;
  }
}


 
