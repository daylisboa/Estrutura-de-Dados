public class Main {
// TesteAdicionaNoFim
  public static void main(String[] args) {
    
    ListaLigada lista = new ListaLigada();
      lista.adiciona("Preparador");
      lista.adiciona("DataPreparo");

      System.out.println(lista);
    }
}




// public class Celula {
//       private Celula proximo; 
//       private Object elemento; 

//     public Celula() {}

//     public Celula(Object elemento) {
//         this.elemento = elemento;
//     }
//     public Celula(Celula proximo, Object elemento) {
//         this.proximo = proximo;
//         this.elemento = elemento;
//     }
//     public Celula getProximo() {
//         return proximo;
//     }
//     public Object getElemento() {
//         return elemento;
//     }
//     public void setProximo(Celula proximo) {
//         this.proximo = proximo;
//     }
//     public void setElemento(Object elemento) {
//         this.elemento = elemento;
//     }  
// }

// ///////////////////////////////////////////////////////////////////
// // package usalista3;

// public class ListaLigada {
//     private Celula primeira;
//     private Celula ultima;
//     private int totalDeElementos; 
  
//     public void listar() {
//       Celula cel = primeira;  
//       for (int i=1; i<=totalDeElementos;i++) {   
//           Produto prod = (Produto) cel.getElemento(); 
//           System.out.println("Id = "+prod.getId());
//           System.out.println("Descricao = "+prod.getDescricao());
//           System.out.println("Valor = "+prod.getValor());
//           cel = cel.getProximo(); 
//       }
//     }

//     public boolean alterar(Produto elemento) {
//         boolean ret = true; 
//         Celula cel = primeira;  
//         for (int i=1; i<=totalDeElementos;i++) {   
//           Produto prod = (Produto) cel.getElemento(); 
//           if (elemento.getId() == prod.getId()) {
//             cel.setElemento(elemento);
//             ret = false; 
//             break; 
//           }
//           cel = cel.getProximo(); 
//         }
//         return ret; 
//     }

//     public boolean excluir(int id) {
//         boolean ret = true; 
//         Celula cel = primeira;  
//         Celula ant = primeira;  
//         for (int i=1; i<=totalDeElementos;i++) {   
//           Produto prod = (Produto) cel.getElemento(); 
//           if (id == prod.getId())
//           { ant.setProximo(cel.getProximo());
//             ret = false; 
//             totalDeElementos--; 
//             break; 
//           }
//           ant = cel; 
//           cel = cel.getProximo(); 
//         }
//         return ret; 
//     }
//     public void incluir(Object elemento) {
//         Celula c1 = new Celula(elemento);
//         if (totalDeElementos==0) { 
//            primeira = c1; 
//         }
//         else if (totalDeElementos==1) {  
//           ultima = c1;     
//            primeira.setProximo(ultima);
//         }
//         else {
//             ultima.setProximo(c1);
//             ultima = c1; 
//         }
//         totalDeElementos++; 
//     }

//     public void incluirComeco(Object elemento) {
//         Celula c1 = new Celula(elemento);
//         c1.setProximo(primeira);
//         primeira = c1; 
//         totalDeElementos++; 
//     }
//   /*  public void incluirFim(Object elemento) {
//         Celula c1 = new Celula(elemento);
//         ultima.setProximo(c1);
//         ultima = c1; 
//     }
// */
//     public Celula getPrimeira() {
//         return primeira;
//     }
//     public void setPrimeira(Celula primeira) {
//         this.primeira = primeira;
//     }
//     public Celula getUltima() {
//         return ultima;
//     }
//     public void setUltima(Celula ultima) {
//         this.ultima = ultima;
//     }
//     public int getTotalDeElementos() {
//         return totalDeElementos;
//     }
//     public void setTotalDeElementos(int totalDeElementos) {
//         this.totalDeElementos = totalDeElementos;
//     }
      
      
// }
// ///////////////////////////////////////////////////////////////////
// public class Produto {
//     private int id;
//     private String descricao; 
//     private double valor; 

//     public Produto(int id, String descricao, double valor) {
//         this.id = id;
//         this.descricao = descricao;
//         this.valor = valor;
//     }

//     public int getId() {
//         return id;
//     }
//     public void setId(int id) {
//         this.id = id;
//     }
//     public String getDescricao() {
//         return descricao;
//     }
//     public void setDescricao(String descricao) {
//         this.descricao = descricao;
//     }
//     public double getValor() {
//         return valor;
//     }
//     public void setValor(double valor) {
//         this.valor = valor;
//     }
// } 

// ///////////////////////////////////////////////////////////////////
// // package usalista3;

// public class Usalista3 {

//     public static void main(String[] args) {
//        ListaLigada lista = new ListaLigada(); 
       
//        Produto p1 = new Produto(1,"TV",4000);
//        Produto p2 = new Produto(2,"CELULAR",2000);
//        Produto p3 = new Produto(3,"Computador",12000);
       
//        lista.incluir(p1);
//        lista.incluir(p2);
//        lista.incluir(p3);
       
//        lista.listar(); 

//        Produto pa = new Produto(2,"CELULAR A",2000);
//        lista.alterar(pa);
//        lista.excluir(3);
//        lista.listar();   
//     }
// }

