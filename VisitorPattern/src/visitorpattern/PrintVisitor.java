package visitorpattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author santicarmo31
 */
public class PrintVisitor implements Visitor{
    @Override
    public void visit(Matrimonial matri) {
     String a = "Desocupada"; 
     if(matri.ocuppied){
          a = "Ocupada"; 
          
      }
      System.out.println( "Se visito la habitacion matrimonial de numero " + matri.numberRoom + " que esta " + a );
   }
    @Override
   public void visit(Suit suit) {
      String a = "Desocupada"; 
     if(suit.ocuppied){
          a = "Ocupada"; 
          
      }
      System.out.println( "Se visito la habitacion suite de numero " + suit.numberRoom + " que esta " + a );
   }
    @Override
   public void visit(Sencilla sencilla) {
      String a = "Desocupada"; 
     if(sencilla.ocuppied){
          a = "Ocupada"; 
          
      }
      System.out.println( "Se visito la habitacion sencilla de numero " + sencilla.numberRoom + " que esta " + a );
   }

    @Override
    public void visit(Doble doble) {
        String a = "Desocupada"; 
        if(doble.ocuppied){
          a = "Ocupada"; 
          
         }
         System.out.println( "Se visito la habitacion doble de numero " + doble.numberRoom + " que esta " + a );
    }
}
