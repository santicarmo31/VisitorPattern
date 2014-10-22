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
public interface Habitacion {
    public void accept( Visitor v );
}
