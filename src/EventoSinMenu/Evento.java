package EventoSinMenu;


import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pipeg
 */
public class Evento {
    
    private int codigo,precio,cantidadPersonas;
    private Date fechaIni, fechaTer;
    private String ubicacion,tipoevent;
  
    private char entretencion; //S.- si N.- no

    public Evento() {
    }

    public Evento(int codigo, int precio, int cantidadPersonas, Date fechaIni, Date fechaTer, String ubicacion, String tipoevent, char entretencion) {
        this.codigo = codigo;
        this.precio = precio;
        this.cantidadPersonas = cantidadPersonas;
        this.fechaIni = fechaIni;
        this.fechaTer = fechaTer;
        this.ubicacion = ubicacion;
        this.tipoevent = tipoevent;
        this.entretencion = entretencion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public Date getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Date getFechaTer() {
        return fechaTer;
    }

    public void setFechaTer(Date fechaTer) {
        this.fechaTer = fechaTer;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipoevent() {
        return tipoevent;
    }

    public void setTipoevent(String tipoevent) {
        this.tipoevent = tipoevent;
    }

    public char getEntretencion() {
        return entretencion;
    }

    public void setEntretencion(char entretencion) {
        this.entretencion = entretencion;
    }

    @Override
    public String toString() {
        return "Evento{" + "codigo=" + codigo + ", precio=" + precio + ", cantidadPersonas=" + cantidadPersonas + ", fechaIni=" + fechaIni + ", fechaTer=" + fechaTer + ", ubicacion=" + ubicacion + ", tipoevent=" + tipoevent + ", entretencion=" + entretencion + '}';
    }

  
     
      //codigo evento
    
    public int CodigoEvento(){
        this.codigo=this.codigo+1;
        return this.codigo;
    }
    
    
}
