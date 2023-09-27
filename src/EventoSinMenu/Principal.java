package EventoSinMenu;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pipeg
 */
public class Principal {
    public static void main(String[] args) {
        
        Lista lista1= new Lista();
        Lista lista2 = new Lista();
        Lista lista3 = new Lista();
        Lista lista4 = new Lista();
        Date fecha1 = new Date(123,5,3,10,5);
        Date fecha2 =new Date(123,5,3,20,10);
        Date fecha3 =new Date(123,6,5,20,10);
        Date fecha4 =new Date(123,6,6,00,10);
        Date fecha5 =new Date(123,1,25,11,15);
        Date fecha6 =new Date(123,1,25,16,00);
        Date fecha7 =new Date(123,7,30,10,01);
        Date fecha8 =new Date(123,7,30,15,10);
        Date fecha9 =new Date(123,8,23,12,10);
        Date fecha10 =new Date(123,8,23,14,10);
        Date fecha11 =new Date(123,3,13,10,10);
        Date fecha12 =new Date(123,3,13,20,10);
        Date fecha13 =new Date(123,4,4,9,10);
        Date fecha14 =new Date(123,4,4,12,10);
        Date fecha15 =new Date(123,10,20,7,10);
        Date fecha16 =new Date(123,10,20,22,10);
        Date fecha17 =new Date(123,11,6,20,10);
        Date fecha18 =new Date(123,11,6,23,10);
        Date fecha19 =new Date(123,2,15,9,10);
        Date fecha20 =new Date(123,2,15,20,10);
        Date fecha21 =new Date(123,6,18,18,10);
        Date fecha22 =new Date(123,6,18,22,10);
        Date fecha23 =new Date(123,9,1,11,10);
        Date fecha24 =new Date(123,9,1,16,10);
      
        
        
        Evento eve1= new Evento(1, 1000, 500,fecha1, fecha2, "valpo", "cumpleaños", 'S');
        Evento eve2= new Evento(2, 4000, 1500,fecha3, fecha4, "algarrobo", "cumpleaños", 'N');
        Evento eve3= new Evento(3, 5000, 5000,fecha5, fecha6, "papud", "cumpleaños", 'S');
        Evento eve4= new Evento(4, 8000, 600,fecha7, fecha8, "conchali", "matrimonio", 'S');
        Evento eve5= new Evento(5, 100, 700,fecha9, fecha10, "vinna", "matrimonio", 'N');
        Evento eve6= new Evento(6, 10000, 300,fecha11, fecha12, "putaendo", "matrimonio", 'N');
        Evento eve7= new Evento(7, 1100, 1000,fecha13, fecha14, "los angeles", "cena", 'N');
        Evento eve8= new Evento(8, 100, 50000,fecha15, fecha16, "machali", "cena", 'S');
        Evento eve9= new Evento(9, 5000, 900,fecha17, fecha18, "rengo", "cena", 'S');
        Evento eve10= new Evento(10, 21000, 100,fecha19, fecha20, "lo barnechea", "fiesta", 'S');
        Evento eve11= new Evento(11, 16000, 1800,fecha21, fecha22, "contulmo", "fiesta", 'N');
        Evento eve12= new Evento(12, 1050, 55000,fecha23, fecha24, "hualpen", "fiesta", 'S');
        lista1.agregarLista(eve1);
        lista1.agregarLista(eve2);
        lista1.agregarLista(eve3);
        lista2.agregarLista(eve4);
        lista2.agregarLista(eve5);
        lista2.agregarLista(eve6);
        lista3.agregarLista(eve7);
        lista3.agregarLista(eve8);
        lista3.agregarLista(eve9);
        lista4.agregarLista(eve10);
        lista4.agregarLista(eve11);
        lista4.agregarLista(eve12);
        
        
        //Numero de eventos realizados.
        
        System.out.println("*************\n");
        System.out.println("Cumpleaños: "+lista1.tamañoLista());
        System.out.println("Matrimonios: "+lista2.tamañoLista());
        System.out.println("Cenas: "+lista3.tamañoLista());
        System.out.println("Fietas: "+lista4.tamañoLista());

//        System.out.println("Total de Eventos realizados por tipo:\n");
//        System.out.println("Cumpleaños: "+cumpl;
//        System.out.println("Matrimonios: "+matrimonios.size());
//        System.out.println("Cenas: "+cenas.size());
//        System.out.println("Fietas: "+fiestas.size());
        System.out.println("\n*****************");
        
        //orden de listas por fecha de realizacion
//        lista1.sort((evento1, evento2) -> evento1.getFechaIni().compareTo(evento2.getFechaIni()));//en esta parte lo que hago es definir que de eventos consecutivos comparare la fecha de inicio
        System.out.println("\nCumpleaños");
        lista1.ordenar();
        System.out.println(lista1);
//        System.out.println(cumpleaños);
//        matrimonios.sort((evento1, evento2) -> evento1.getFechaIni().compareTo(evento2.getFechaIni()));
        System.out.println("\nMatrimonios");
        lista2.ordenar();
        System.out.println(lista2);
//        System.out.println(matrimonios);
//        cenas.sort((evento1, evento2) -> evento1.getFechaIni().compareTo(evento2.getFechaIni()));
        System.out.println("\nCenas");
        lista3.ordenar();
        System.out.println(lista3);
//        System.out.println(cenas);
//        fiestas.sort((evento1, evento2) -> evento1.getFechaIni().compareTo(evento2.getFechaIni()));
       System.out.println("\nFiestas");
       lista4.ordenar();
        System.out.println(lista4);
//        System.out.println(fiestas);

        
    }
    
}
