package org.example;

public class Usuario_124667593_MUNOZ_CARMONA {
    private String name;
    private int estado; // 1 si es administrador y 0 en caso contrario

    /**
     * Constructor
     * @param name
     * @param estado
     */
    public Usuario_124667593_MUNOZ_CARMONA(String name, int estado) {
        this.name = name;
        this.estado = estado;
    }

    /**
     * Poliformoismo del constructor
     */
    public Usuario_124667593_MUNOZ_CARMONA() {
    }

    //*********************************************GETTER AND SETTER*********************************************************************************

    /**
     * Metodo que retorna el name
     * @return
     */
    public String getName() {return name;}

    /**
     * Metodo que puede modificar el name
     * @param name
     */
    public void setName(String name) {this.name = name;}

    /**
     * Metodo que retorna el estado
     * @return
     */
    public int getEstado() {return estado;}

    /**
     * Metodo que puede modificar el estado
     * @param estado
     */
    public void setEstado(int estado) {this.estado = estado;}


    //*****************************************IMPRIMIR UNA INTERACCION****************************************************************

    /**
     * Metodo para imprimir una instancia de la clase Usuario
     * @return
     */
    @Override
    public String toString() {
        return "Usuario_124667593_MUNOZ_CARMONA{" +
                "name='" + name + '\'' +
                ", estado=" + estado +
                '}';
    }




    //----------------------------------------------------------------------------------------------------------
}
