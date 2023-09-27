package EventoSinMenu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;



/**
 *
 * @author Felipe Gaete, Julio Cifuentes, Ariel Olivares
 * @version 20-09-23
 */
public class Lista {
    
    private ArrayList <Evento> listaEvento;

    public Lista() {
        listaEvento = new ArrayList<>();
        
    }
    
    //agregar a la lista
    
    public boolean agregarLista(Evento event){
        return listaEvento.add(event);
    }
    
    //total vendido evento
    
    public void ventaEvento(){
        int venta=0, tot=0;
        for (Evento evento : listaEvento) {
            venta= evento.getCantidadPersonas()*evento.getPrecio();
            tot=tot+venta;
        System.out.println("El total vendido en este  tipo de evento es de: $"+tot);
            
        }
    }
    
    //Tamaño de la lista
    
    public int tamañoLista(){
       return listaEvento.size();
    }
    
    //ordenar
    
    public void ordenar(){
        listaEvento.sort((evento1, evento2) -> evento1.getFechaIni().compareTo(evento2.getFechaIni()));
    }

    @Override
    public String toString() {
        return "ListaEvento{" + listaEvento + '}';
    }
            

    
}