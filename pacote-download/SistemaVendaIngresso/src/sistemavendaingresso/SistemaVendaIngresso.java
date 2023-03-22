//Nome: Bruno Tavares Brandão da Rocha;
//Matrícula: 22196193-5;
package sistemavendaingresso;
public class SistemaVendaIngresso {
      public static void main(String[] args) {
      Evento e1 = new Evento();
      e1.setNome("Rock in Rio");
      e1.setData("25/09/2022");
      e1.setCapaciMax(50000);
      e1.setValorUnico(250);
      
      e1.mostrarEvento();
      e1.venderIngresso();
      e1.quantidadeVendida();
      
      
      Ingresso i1 = new Ingresso();
      i1.setNome("Bruno Tavares");
      i1.setCpf(1234567891);
      i1.setCategoria("Pista");
      i1.setValorUnico(250f);
      i1.setEvento("Rock in Rio");
      
      i1.mostrarResumo();
      i1.imprimirValor();
      
    }
    
}
