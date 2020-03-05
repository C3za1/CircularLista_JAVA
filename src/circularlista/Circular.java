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
public class Circular {
    private Nodo inicio;
    private Nodo ultimo;
    private int tam;
    
    public Circular(){
        inicio=null;
        ultimo=null;
        tam=0;
    }
    public boolean esVacia(){
        return inicio == null;
    }
     public int getTamanio(){
        return tam;
    }
     public void agregarAlFinal(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            inicio = nuevo;
            ultimo = nuevo;
            ultimo.setSiguiente(inicio);
        } else{
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
            ultimo = nuevo;
        }
        tam++;
    }
     public void agregarAlInicio(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            inicio = nuevo;
            ultimo = nuevo;  
            ultimo.setSiguiente(inicio);
        } else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            ultimo.setSiguiente(inicio);
        }
        tam++;
    }
      public void eliminar(){
        inicio = null;
        ultimo = null;
        tam = 0;
    }
      public void listar(){
        if (!esVacia()) {
            Nodo aux = inicio;
            int i = 0;
            do{
                System.out.println(i + ".[ " + aux.getValor() + " ]");
                aux = aux.getSiguiente();
                i++;
            }while(aux != inicio);
        }
    }
}
