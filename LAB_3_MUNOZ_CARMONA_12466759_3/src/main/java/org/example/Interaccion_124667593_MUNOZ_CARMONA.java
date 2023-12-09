package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Interaccion_124667593_MUNOZ_CARMONA {
    private String nameUsuario;
    private List<Integer> listaHistory;
    private LocalDateTime fecha;

    public Interaccion_124667593_MUNOZ_CARMONA(String nameUsuario, List<Integer> listaHistory) {
        this.nameUsuario = nameUsuario;
        this.listaHistory = new ArrayList<>();
        this.fecha= LocalDateTime.now();
    }

    public String getNameUsuario() {return nameUsuario;}
    public List<Integer> getListaHistory() {return listaHistory;}
    public LocalDateTime getFecha() {return fecha;}
    public void setNameUsuario(String nameUsuario) {this.nameUsuario = nameUsuario;}
    public void setListaHistory(List<Integer> listaHistory) {this.listaHistory = listaHistory;}
}
