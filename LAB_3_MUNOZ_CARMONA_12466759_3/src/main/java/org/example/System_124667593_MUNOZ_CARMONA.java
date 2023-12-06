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

    //------------------------------------------------------------------------------------------------------------


    //METODO PARA AGREGAR UN CHATBOT SIN REPETIR
    public void addChatbotToSistema(Chatbot_124667593_MUNOZ_CARMONA chatbot) {
        int largo_chatbots = chatbots.size();
        int contador=0;
        for(int i=0; i< largo_chatbots; i++){
            if (chatbots.get(i).getChatbotID()==chatbot.getChatbotID()){
                contador++;
            }
        }
        if (contador>0){
            chatbots.add(chatbot);
        }
    }



    //METODO LOGIN
    public void login(Usuario_124667593_MUNOZ_CARMONA usuario) {
        if (usuarios.contains(usuario)) {
            this.currentUser = usuario.getName();
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
        for (int i = 0; i < largo_usuarios; i++) {
            if (usuarios.get(i).getName() == usuario.getName()) {
                contador++;
            }
        }
        if (contador > 0) {usuarios.add(usuario);}
    }



    // METODO PARA INTERACTUAR CON UN CHATBOT
    public void interaccionChatbot(int opcionElegida) {
        int k=0;
        List<Integer>coordenadas=new ArrayList<>();
        //Ciclo for para determinar si dentro de la lista interacciones hay alguna asociada al currentUser
        for(Interaccion_124667593_MUNOZ_CARMONA i:interacciones){
            if (i.getNameUsuario()==currentUser){k++;}}
        //Si K > 0 implica que ya el usuario esta interactuando
        if (k>0) {
            for (int i = interacciones.size() - 1; i >= 0; i--) {
                if (interacciones.get(i).getNameUsuario()==currentUser) {
                    coordenadas.set (1,interacciones.get(i).getListaHistory().get(1));
                    coordenadas.set (2,interacciones.get(i).getListaHistory().get(2));
                    coordenadas.set (3,opcionElegida);
                    for (int j1=0; j1<chatbots.size(); j1++){
                       if (chatbots.get(j1).getChatbotID() == coordenadas.get(1)){
                           for (int j2=0; j2<chatbots.get(j1).getFlows().size();j2++){
                              if(chatbots.get(j1).getFlows().get(j2).getId()==coordenadas.get(2)) {
                                  for (int j3=0; j3<chatbots.get(j1).getFlows().get(j2).getOptions().size();j3++){
                                        if (chatbots.get(j1).getFlows().get(j2).getOptions().get(j3).getCode() == opcionElegida){
                                            coordenadas.set(4,chatbots.get(j1).getFlows().get(j2).getOptions().get(j3).getChatbotCodeLink());
                                            coordenadas.set(4,chatbots.get(j1).getFlows().get(j2).getOptions().get(j3).getInitialflowCodeLink());
                                        }
                                  }
                              }
                           }
                       }
                    }
                    Interaccion_124667593_MUNOZ_CARMONA interaccion = new Interaccion_124667593_MUNOZ_CARMONA(currentUser,coordenadas);
                    break;
                }
            }
        }
         else {
            for (int i = interacciones.size() - 1; i >= 0; i--) {
                if (interacciones.get(i).getNameUsuario()==currentUser) {
                    coordenadas.set(1, interacciones.get(i).getListaHistory().get(1));
                    coordenadas.set(2, interacciones.get(i).getListaHistory().get(2));
                    coordenadas.set(3, opcionElegida);
                    coordenadas.set(4, interacciones.get(i).getListaHistory().get(1));
                    coordenadas.set(4, interacciones.get(i).getListaHistory().get(2));
                    break;
                }
            }
        }
    }


    //------------------------------------------------------------------------------------------------------------------
}
