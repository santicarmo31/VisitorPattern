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
public class Matrimonial implements Habitacion{
    public boolean ocuppied;
    public int numberRoom;
    
     public Matrimonial(int x, boolean y) {
        this.numberRoom = x;
        this.ocuppied = y;
}
    public void   accept( Visitor v ) {
     v.visit( this );
    }
}