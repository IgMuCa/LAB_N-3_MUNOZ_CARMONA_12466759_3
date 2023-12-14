package org.example;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.List;

public class Interaccion_124667593_MUNOZ_CARMONA {
    private String nameUsuario;
    private String siString;
    private List<Integer> listaHistory;
    private LocalDate fecha;


    public Interaccion_124667593_MUNOZ_CARMONA(String nameUsuario, String siString, List<Integer> listaHistory) {
        this.nameUsuario = nameUsuario;
        this.siString = siString;
        this.listaHistory = listaHistory;
        this.fecha = LocalDate.now();
    }

    public String getSiString() {
        return siString;}
    public String getNameUsuario() {return nameUsuario;}
    public List<Integer> getListaHistory() {return listaHistory;}
    public LocalDate getFecha() {return fecha;}
    public void setNameUsuario(String nameUsuario) {this.nameUsuario = nameUsuario;}
    public void setListaHistory(List<Integer> listaHistory) {this.listaHistory = listaHistory;}
    public void setSiString(String siString) {
        this.siString = siString;}


  //METODO PARA IMPRIMIR UNA INTERACCION
    @Override
    public String toString() {
        return "Interaccion_124667593_MUNOZ_CARMONA{" +
                "nameUsuario='" + nameUsuario + '\'' +
                ", listaHistory=" + listaHistory +
                ", fecha=" + fecha +
                '}';
    }



}
