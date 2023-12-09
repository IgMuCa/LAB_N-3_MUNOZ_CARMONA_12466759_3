package org.example;

public class Usuario_124667593_MUNOZ_CARMONA {
    private String name;
    private int estado; // 1 si es administrador y 0 en caso contrario

    public Usuario_124667593_MUNOZ_CARMONA(String name, int estado) {
        this.name = name;
        this.estado = estado;
    }

    public Usuario_124667593_MUNOZ_CARMONA() {
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getEstado() {return estado;}
    public void setEstado(int estado) {this.estado = estado;}

    @Override
    public String toString() {
        return "Usuario_124667593_MUNOZ_CARMONA{" +
                "name='" + name + '\'' +
                ", estado=" + estado +
                '}';
    }




    //----------------------------------------------------------------------------------------------------------
}
