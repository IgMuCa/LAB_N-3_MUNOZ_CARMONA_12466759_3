package org.example;

import java.util.ArrayList;
import java.util.List;

public class System_124667593_MUNOZ_CARMONA {
    private String name;
    private int initialChatbotCode;
    private List<Usuario_124667593_MUNOZ_CARMONA> usuarios;
    private String currentUser;
    private List<Interaccion_124667593_MUNOZ_CARMONA> interacciones;
    private List<Chatbot_124667593_MUNOZ_CARMONA> chatbots;

    //CONSTRUCTOR
    public System_124667593_MUNOZ_CARMONA(String name, int initialChatbotCode, List<Usuario_124667593_MUNOZ_CARMONA> usuarios, String curretUser, List<Interaccion_124667593_MUNOZ_CARMONA> interacciones, List<Chatbot_124667593_MUNOZ_CARMONA> chatbots) {
        this.name = name;
        this.initialChatbotCode = initialChatbotCode;
        this.usuarios = new ArrayList<>();
        this.currentUser = currentUser;
        this.interacciones = new ArrayList<>();
        this.chatbots = new ArrayList<>();
    }

    //GETTER AND SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInitialChatbotCode() {
        return initialChatbotCode;
    }

    public void setInitialChatbotCode(int initialChatbotCode) {
        this.initialChatbotCode = initialChatbotCode;
    }

    public List<Usuario_124667593_MUNOZ_CARMONA> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario_124667593_MUNOZ_CARMONA> usuarios) {
        this.usuarios = usuarios;
    }

    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

    public List<Interaccion_124667593_MUNOZ_CARMONA> getInteracciones() {
        return interacciones;
    }

    public void setInteracciones(List<Interaccion_124667593_MUNOZ_CARMONA> interacciones) {
        this.interacciones = interacciones;}

    public List<Chatbot_124667593_MUNOZ_CARMONA> getChatbots() {
        return chatbots;
    }

    public void setChatbots(List<Chatbot_124667593_MUNOZ_CARMONA> chatbots) {
        this.chatbots = chatbots;
    }

    //----------------------------------------------------------------------------------------------------------------------------
    //METODO PARA AGREGAR UN CHATBOT SIN REPETIR
    public void addChatbotToSistema(Chatbot_124667593_MUNOZ_CARMONA chatbot) {
        int largo_chatbots = chatbots.size();
        int contador=0;
        //agregar el primer chatbot
        if (largo_chatbots==0) {chatbots.add(chatbot);
        }
        else {
        for(int i=0; i< largo_chatbots; i++){
            if (chatbots.get(i).getChatbotID()==chatbot.getChatbotID()){
                contador++;
            }
        }
        if (contador==0){chatbots.add(chatbot);}
        }
    }



    //METODO LOGIN
    public void login(String  usuario) {
        int contador =0;
        for (Usuario_124667593_MUNOZ_CARMONA user : usuarios) {
            if (user.getName().equals(usuario)) {
                contador++;
                currentUser = user.getName();
            }
        }
        if (contador==0) {
            System.out.println("Usuario no registrado");
        }
    }



    //METODO LOGOUT
    public void logout() {
        if (currentUser != "") {this.currentUser = "";}
    }



    //METODO PARA AGREGAR UN USUARIO SIN REPETIR
    public void addUsuario(Usuario_124667593_MUNOZ_CARMONA usuario) {
        int largo_usuarios = usuarios.size();
        int contador = 0;
        //agregar el primer usuario
        if (largo_usuarios==0) {usuarios.add(usuario);
        }
        else {
            //cuando ya hay usuarios en la lista
            for (int i = 0; i < largo_usuarios; i++) {
                if (usuarios.get(i).getName().equals(usuario.getName()))  {
                    contador++;
                }
            }
            //si no hay nadie con el mismo nombre, entonces lo agrega
            if (contador == 0) {usuarios.add(usuario);}
        }
    }



 //****************************************************************************************************************************************
    // METODO PARA INTERACTUAR CON UN CHATBOT
    public void interaccionChatbot(int opcionElegida) {
        int k=0;
        List<Integer>coordenadas=new ArrayList<>();

        //Ciclo for para determinar si dentro de la lista interacciones hay alguna asociada al currentUser
        for(Interaccion_124667593_MUNOZ_CARMONA i:interacciones){
            if (i.getNameUsuario().equals(currentUser)){k++;
            }
        }
        //Si K > 0 implica que el usuario ya ha interactuando con el sistema.
        if (k>0) {
            for (int i = interacciones.size() - 1; i >= 0; i--) {
                if (interacciones.get(i).getNameUsuario().equals(currentUser)) {
                    //Se asignan al arreglo coordenadas (de enteros)
                    coordenadas.add (0,interacciones.get(i).getListaHistory().get(1));
                    coordenadas.add (1,interacciones.get(i).getListaHistory().get(2));
                    coordenadas.add (2,opcionElegida);

                    for (int j1=0; j1<chatbots.size(); j1++){
                        //Encuentra el chatbot requerido
                        if (chatbots.get(j1).getChatbotID() == coordenadas.get(1)){
                            for (int j2=0; j2<chatbots.get(j1).getFlows().size();j2++){
                                //Encuentra el flow requrido
                                if(chatbots.get(j1).getFlows().get(j2).getId()==coordenadas.get(2)) {
                                    for (int j3=0; j3<chatbots.get(j1).getFlows().get(j2).getOptions().size();j3++){
                                        //Encuentra la opcion elegida
                                        if (chatbots.get(j1).getFlows().get(j2).getOptions().get(j3).getCode() == opcionElegida){
                                            coordenadas.add(3,chatbots.get(j1).getFlows().get(j2).getOptions().get(j3).getChatbotCodeLink());
                                            coordenadas.add(4,chatbots.get(j1).getFlows().get(j2).getOptions().get(j3).getInitialflowCodeLink());
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Interaccion_124667593_MUNOZ_CARMONA interaccion = new Interaccion_124667593_MUNOZ_CARMONA(currentUser,coordenadas);
                    interacciones.add(interaccion);
                    break;
                }
            }
        }
        else {
            coordenadas.add(0, 0);
            coordenadas.add(1, 1);
            coordenadas.add(2, 0);
            coordenadas.add(3, 0);
            coordenadas.add(4, 1);
            Interaccion_124667593_MUNOZ_CARMONA interaccion = new Interaccion_124667593_MUNOZ_CARMONA(currentUser,coordenadas);
            interacciones.add(interaccion);
        }
    }




    //**********************************************************************************************************************************
    // METODO PARA GENERAR UNA SINTESIS
    public void sintesisUser(String user){
         int k=0;
        //Ciclo for para determinar si dentro de la lista interacciones hay alguna asociada al User
        for(Interaccion_124667593_MUNOZ_CARMONA i:interacciones){
            if (i.getNameUsuario()==user){k++;
            }
        }
        //Si K > 0 implica que el usuario ya ha interactuando con el sistema.
        if (k>0) {
            for (int i = interacciones.size() - 1; i >= 0; i--) {
                //Se encuentra interaccion de interes
                if (interacciones.get(i).getNameUsuario().equals(user)) {
                    //Se busca el chatbot de interaccion
                     for (Chatbot_124667593_MUNOZ_CARMONA c:chatbots){
                         if (interacciones.get(i).getListaHistory().get(1)==c.getChatbotID()){
                             //Se busca el chatbot de interaccion
                             for (Flow_124667593_MUNOZ_CARMONA f:c.getFlows()) {
                                 if (interacciones.get(i).getListaHistory().get(2)==f.getId()){
                                     //Se imprimen las opciones
                                     //Se imprime la primera linea
                                     System.out.print(interacciones.get(i).getFecha());
                                     System.out.print("-" + interacciones.get(i).getNameUsuario());
                                     if (interacciones.get(i).getListaHistory().get(3)==0) {
                                         System.out.print(": Hola");
                                     }
                                     else{
                                         System.out.print(":" + interacciones.get(i).getListaHistory().get(3));
                                     }
                                     System.out.println();
                                     //se imprimen las opciones
                                     for(Option_124667593_MUNOZ_CARMONA o:f.getOptions()){
                                         System.out.println(o.getMessage());
                                     }
                                 }
                             }
                         }
                     }
                }
            }
        }
    }






    //-----------------------------------------------------------------------------------------------------------
    //PARA IMPRIMIR LAS INSTANCIAS DE SISTEMA
    @Override
    public String toString() {
        return "System_124667593_MUNOZ_CARMONA{" +
                "name='" + name + '\'' +
                ", initialChatbotCode=" + initialChatbotCode +
                ", usuarios=" + usuarios +
                ", currentUser='" + currentUser + '\'' +
                ", interacciones=" + interacciones +
                ", chatbots=" + chatbots +
                '}';
    }


    //------------------------------------------------------------------------------------------------------------------
}
