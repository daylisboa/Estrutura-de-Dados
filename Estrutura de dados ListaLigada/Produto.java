public class Produto {

  private int id;
  private String descricao;
  // private double valor;

  public Produto(int id, String descricao) {
    this.id = id;
    this.descricao = descricao;
    // this.valor = valor; 
  }

  public void setId(int id) {
    this.id = id;
  }
  public int getId() {
    return id;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

public String getDescricao(){
  return descricao;
}
  
  // public void setDouble(double valor) {
  //   this.valor = valor;
  // }

  // public double getValor() {
  //   return valor;
  // }












}