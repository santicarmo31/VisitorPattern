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
public interface Visitor {
   public void visit(Matrimonial matri ); // second dispatch
   public void visit(Sencilla sencilla );
   public void visit(Doble doble);
   public void visit(Suit suit);
}
