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
public class Doble implements Habitacion{
    public boolean ocuppied;
    public int numberRoom;
    public Doble(int x, boolean y) {
        this.numberRoom = x;
        this.ocuppied = y;
}
    @Override
    public void   accept( Visitor v ) {
     v.visit( this );
    }
}
