package org.example;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.List;

public class Interaccion_124667593_MUNOZ_CARMONA {
    private String nameUsuario;
    private String siString;
    private List<Integer> listaHistory;
    private LocalDate fecha;


    /**
     * Constructor
     * @param nameUsuario
     * @param siString
     * @param listaHistory
     */
    public Interaccion_124667593_MUNOZ_CARMONA(String nameUsuario, String siString, List<Integer> listaHistory) {
        this.nameUsuario = nameUsuario;
        this.siString = siString;
        this.listaHistory = listaHistory;
        this.fecha = LocalDate.now();
    }


    //************************************************GETTER AND SETTER*********************************************************************************

    /**
     * Metodo que retorna siString (una variable que guarda el valor de la opcion ssi esta es string)
     * @return
     */
    public String getSiString() {return siString;}

    /**
     * Metodo que retorna nameUsuario
     * @return
     */
    public String getNameUsuario() {return nameUsuario;}

    /**
     * Metodo que retorna la listaHistory (Se trata de una lista de enteros que guarda los id de charbot, flows y opciones que recorre una usuario)
     * @return
     */
    public List<Integer> getListaHistory() {return listaHistory;}

    /**
     * Metodo que retorna fecha de la transacción
     * @return
     */
    public LocalDate getFecha() {return fecha;}

    /**
     * Metodo que puede modificar el nameUsuario
     * @param nameUsuario
     */
    public void setNameUsuario(String nameUsuario) {this.nameUsuario = nameUsuario;}

    /**
     * Metodo que puede modificar la listaHistory
     * @param listaHistory
     */
    public void setListaHistory(List<Integer> listaHistory) {this.listaHistory = listaHistory;}

    /**
     * Metodo que puede modificar la variable siString
     * @param siString
     */
    public void setSiString(String siString) {this.siString = siString;}


  ///****************************************IMPRIMIR UNA INTERACCION*********************************************************************************

    /**
     * Metodo que imprime una instancia de la clase interacción
     * @return
     */
    @Override
    public String toString() {
        return "Interaccion_124667593_MUNOZ_CARMONA{" +
                "nameUsuario='" + nameUsuario + '\'' +
                ", siString='" + siString + '\'' +
                ", listaHistory=" + listaHistory +
                ", fecha=" + fecha +
                '}';
    }
}
