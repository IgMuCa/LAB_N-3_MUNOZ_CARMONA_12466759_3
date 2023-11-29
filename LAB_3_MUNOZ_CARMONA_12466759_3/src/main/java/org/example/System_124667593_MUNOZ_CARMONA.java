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

    public System_124667593_MUNOZ_CARMONA(String name, int initialChatbotCode, List<Usuario_124667593_MUNOZ_CARMONA> usuarios, Usuario_124667593_MUNOZ_CARMONA curretUser, List<Interaccion_124667593_MUNOZ_CARMONA> interacciones, List<Chatbot_124667593_MUNOZ_CARMONA> chatbots) {
        this.name = name;
        this.initialChatbotCode = initialChatbotCode;
        this.usuarios = new ArrayList<>();
        this.currentUser = currentUser;
        this.interacciones = new ArrayList<>();
        this.chatbots = new ArrayList<>();
    }

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

    public void login(Usuario_124667593_MUNOZ_CARMONA usuario) {
        if (usuarios.contains(usuario)) {
            this.currentUser = usuario.getName();
        }
    }

    public void logout() {
        if (currentUser != "") {
            this.currentUser = "";
        }
    }

    public List<Interaccion_124667593_MUNOZ_CARMONA> getInteracciones() {
        return interacciones;
    }

    public void setInteracciones(List<Interaccion_124667593_MUNOZ_CARMONA> interacciones) {
        this.interacciones = interacciones;
    }

    public List<Chatbot_124667593_MUNOZ_CARMONA> getChatbots() {
        return chatbots;
    }

    public void setChatbots(List<Chatbot_124667593_MUNOZ_CARMONA> chatbots) {
        this.chatbots = chatbots;
    }

    public void addUsuario(Usuario_124667593_MUNOZ_CARMONA usuario) {
        int largo_usuarios = usuarios.size();
        int contador = 0;
        for (int i = 0; i < largo_usuarios; i++) {
            if (usuarios.get(i).getName() == usuario.getName()) {
                contador++;
            }
        }
        if (contador > 0) {usuarios.add(usuario);} }

    // Metodo para interactuar con un chatbot
    public void interaccionChatbot(int opcionElegida) {
        int k=0;
        List<Integer>coordenadas=new ArrayList<>();
        //Ciclo for para determinar si dentro de la lista interacciones hay alguna asociada al currentUser
        for(Interaccion_124667593_MUNOZ_CARMONA i:interacciones){
            if (i.getNameUsuario()==currentUser){k++;}}
        //
        if (k>0) {
            for (int i = interacciones.size() - 1; i >= 0; i--) {
                if (interacciones.get(i).getNameUsuario()==currentUser) {
                    coordenadas.add(0,3);

                    Interaccion_124667593_MUNOZ_CARMONA interaccion = new Interaccion_124667593_MUNOZ_CARMONA(currentUser,coordenadas);
                }}}
        else {

        }
    }


}
