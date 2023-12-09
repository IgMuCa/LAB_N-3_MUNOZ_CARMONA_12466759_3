package org.example;

import java.util.ArrayList;
import java.util.List;

public class Flow_124667593_MUNOZ_CARMONA {
    private int id;
    private String name_msg;
    private List<Option_124667593_MUNOZ_CARMONA> options;

    public Flow_124667593_MUNOZ_CARMONA(int id, String name_msg, List<Option_124667593_MUNOZ_CARMONA> options) {
        this.id = id;
        this.name_msg = name_msg;
        this.options = new ArrayList<>();
    }

    public Flow_124667593_MUNOZ_CARMONA() {
    }

    public int getId() {return id;}
    public String getName_msg() {return name_msg;}
    public List<Option_124667593_MUNOZ_CARMONA> getOptions() {return options;}
    public void setId(int id) {this.id = id;}
    public void setName_msg(String name_msg) {this.name_msg = name_msg;}
    /**
     *
     * @param options
     */
    public void setOptions(List<Option_124667593_MUNOZ_CARMONA> options) {
        this.options = options;
    }


    // AGREGAR OPCION SIN REPETIR
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


    //PARA IMPRIMIR LAS INSTANCIAS DE FLUJOS
    @Override
    public String toString() {
        return "Flow_124667593_MUNOZ_CARMONA{" +
                "id=" + id +
                ", name_msg='" + name_msg + '\'' +
                ", options=" + options +
                '}';
    }


    //-----------------------------------------------------------------------------------------------------------------
}
