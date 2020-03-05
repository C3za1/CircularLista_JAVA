/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularlista;

/**
 *
 * @author Admin
 */
public class CircularLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circular cir= new Circular();
        cir.agregarAlInicio(1);
        cir.agregarAlInicio(2);
        cir.agregarAlFinal(3);
        cir.agregarAlFinal(4);
        cir.agregarAlInicio(5);
        cir.agregarAlFinal(6);
        cir.getTamanio();
        cir.listar();
    }
    
    
}
