/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorpattern;

/**
 *
 * @author jonathaneidelman
 */
public class VisitorPattern {
    public static Habitacion[] list = { new Suit(3, true), new Matrimonial(4, true), new Sencilla(5, true), new Doble (6, false) };

   // 4. Client creates "visitor" objects and passes each to accept() calls
   public static void main( String[] args ) {
      PrintVisitor    print   = new PrintVisitor();
      for (int i=0; i < list.length; i++) {
         list[i].accept(print);
      }
   }
}
