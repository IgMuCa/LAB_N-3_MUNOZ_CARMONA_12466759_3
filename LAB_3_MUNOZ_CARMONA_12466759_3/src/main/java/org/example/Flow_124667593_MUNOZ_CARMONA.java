package org.example;

import java.util.ArrayList;
import java.util.List;

public class Flow_124667593_MUNOZ_CARMONA {
    private int id;
    private String name_msg;
    private List<Option_124667593_MUNOZ_CARMONA> options;

    /**
     * Constructor
     * @param id
     * @param name_msg
     * @param options
     */
    public Flow_124667593_MUNOZ_CARMONA(int id, String name_msg, List<Option_124667593_MUNOZ_CARMONA> options) {
        this.id = id;
        this.name_msg = name_msg;
        this.options = new ArrayList<>();
    }

    /**
     * Polimosfismo de constructor
     */
    public Flow_124667593_MUNOZ_CARMONA() {
    }


    //****************************************************GETTER AND SETTER**********************************************************************************************


    /**
     * Metodo que retorna el Id
     * @return
     */
    public int getId() {return id;}

    /**
     * Metodo que retorna el name_msg
     * @return
     */
    public String getName_msg() {return name_msg;}

    /**
     * Metodo que retorna la lista de opciones
     * @return
     */
    public List<Option_124667593_MUNOZ_CARMONA> getOptions() {return options;}

    /**
     * Metodo que puede modificar el Id
     * @param id
     */
    public void setId(int id) {this.id = id;}

    /**
     * Metodo que puede modificar el name_msg
     * @param name_msg
     */
    public void setName_msg(String name_msg) {this.name_msg = name_msg;}

    /**
     * Metodo que puede modificar la lista de opciones
     * @param options
     */
    public void setOptions(List<Option_124667593_MUNOZ_CARMONA> options) {
        this.options = options;
    }

    /**
     * Metodo que agrega una opcion al flujo
     * @param opcion
     */
    public void addOpcionToOptions(Option_124667593_MUNOZ_CARMONA opcion) {
        int largo_options = options.size();
        int contador=0;

        //agregar la primera opcion
        if (largo_options==0) {options.add(opcion);}
        else {
            for (int i = 0; i < largo_options; i++) {
                if (options.get(i).getCode() == opcion.getCode()) {
                    contador++;
                }
            }
            if (contador == 0) {
                options.add(opcion);
            }
        }
    }


    //******************************************IMPRIMIR LAS INSTANCIAS DE FLUJOS*********************************************************

    /**
     * Imprimir una instancia de la clase flujo
     * @return
     */
    @Override
    public String toString() {
        return "Flow_124667593_MUNOZ_CARMONA{" +
                "id=" + id +
                ", name_msg='" + name_msg + '\'' +
                ", options=" + options +
                '}';
    }


    //----------------------------------------------------------------------------------------------------------------------------------------------
}
