package org.example;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class System_124667593_MUNOZ_CARMONA {
    private String name;
    private int initialChatbotCode;
    private List<Usuario_124667593_MUNOZ_CARMONA> usuarios;
    private String currentUser;
    private List<Interaccion_124667593_MUNOZ_CARMONA> interacciones;
    private List<Chatbot_124667593_MUNOZ_CARMONA> chatbots;

    /**
     * Constructor
     * @param name
     * @param initialChatbotCode
     * @param usuarios
     * @param curretUser
     * @param interacciones
     * @param chatbots
     */
    public System_124667593_MUNOZ_CARMONA(String name, int initialChatbotCode, List<Usuario_124667593_MUNOZ_CARMONA> usuarios, String curretUser, List<Interaccion_124667593_MUNOZ_CARMONA> interacciones, List<Chatbot_124667593_MUNOZ_CARMONA> chatbots) {
        this.name = name;
        this.initialChatbotCode = initialChatbotCode;
        this.usuarios = new ArrayList<>();
        this.currentUser = currentUser;
        this.interacciones = new ArrayList<>();
        this.chatbots = new ArrayList<>();
    }

    //******************************************GETTER AND SETTER**************************************************************************************************

    /**
     * Metodo que retorna el name
     * @return
     */
     String getName() {
        return name;
    }

    /**
     * Metodo que puede modificar el name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo que retorna el InictialChatbotCode
     * @return
     */
    public int getInitialChatbotCode() {
        return initialChatbotCode;
    }

    /**
     * Metodo que puede modificar el initialChatbotCode
     * @param initialChatbotCode
     */
    public void setInitialChatbotCode(int initialChatbotCode) {
        this.initialChatbotCode = initialChatbotCode;
    }

    /**
     * Metodo que retorna lista de usuarios
     * @return
     */
    public List<Usuario_124667593_MUNOZ_CARMONA> getUsuarios() {
        return usuarios;
    }

    /**
     * Metodo que puede modificar la lista de usuarios
     * @param usuarios
     */
    public void setUsuarios(List<Usuario_124667593_MUNOZ_CARMONA> usuarios) {
        this.usuarios = usuarios;
    }

    /**
     * Metodo que retorna el current user
     * @return
     */
    public String getCurrentUser() {
        return currentUser;
    }

    /**
     * Metodo que puede modificar el currenr User
     * @param currentUser
     */
    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

    /**
     * Metodo que retorna la lista de interacciones
     * @return
     */
    public List<Interaccion_124667593_MUNOZ_CARMONA> getInteracciones() {
        return interacciones;
    }

    /**
     * Metodo que puede modificar la lista de interacciones
     * @param interacciones
     */
    public void setInteracciones(List<Interaccion_124667593_MUNOZ_CARMONA> interacciones) {
        this.interacciones = interacciones;}

    /**
     * Metodo que retorna la lista de Chatbots
     * @return
     */
    public List<Chatbot_124667593_MUNOZ_CARMONA> getChatbots() {
        return chatbots;
    }

    /**
     * Metodo que puede modificar la lista de chatbots
     * @param chatbots
     */
    public void setChatbots(List<Chatbot_124667593_MUNOZ_CARMONA> chatbots) {
        this.chatbots = chatbots;
    }

    //----------------------------------------------------------------------------------------------------------------------------
    /**
     * Metodo para agregar un Chatbot, sin repetirlo (ADD SIN REPETIR)
     * @param chatbot
     */
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



    /**
     * Metodo que permite a un usuario ingresar a un sistema (METODO LOGIN)
     * @param usuario
     */
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



    /**
     * Metodo que permite a un usuario salir  de un sistema (METODO LOGOUT)
     */
    public void logout() {
        if (currentUser != "") {this.currentUser = "";}
    }



    //METODO PARA AGREGAR UN USUARIO SIN REPETIR
    /**
     * Metodo para agregar un usuario sin repetir (AGREGAR UN USUARIO SIN REPETIR)
     * @param usuario
     */
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
    // METODO PARA INTERACTUAR EN UN SISTEMA
    /**
     * Metodo para interactuar en un sistema
     * @param opcionElegida
     */
    public void interaccionChatbot(int opcionElegida) {
     int k = 0;
     String siOpcionEsString = "";

     List<Integer> coordenadas = new ArrayList<>();
     //Ciclo for para determinar si dentro de la lista interacciones hay alguna asociada al currentUser
     for (Interaccion_124667593_MUNOZ_CARMONA i : interacciones) {
         if (i.getNameUsuario().equals(currentUser)) {
             k++;
         }
     }
     //Si K > 0 implica que el usuario ya ha interactuando con el sistema.
     if (k > 0) {
         for (int i = interacciones.size() - 1; i >= 0; i--) {
             if (interacciones.get(i).getNameUsuario().equals(currentUser)) {
                 coordenadas.add(0, interacciones.get(i).getListaHistory().get(3));
                 coordenadas.add(1, interacciones.get(i).getListaHistory().get(4));
                 coordenadas.add(2, opcionElegida);

                 for (int j1 = 0; j1 < chatbots.size(); j1++) {
                     //Encuentra el chatbot requerido
                     if (chatbots.get(j1).getChatbotID() == interacciones.get(i).getListaHistory().get(3)) {
                         for (int j2 = 0; j2 < chatbots.get(j1).getFlows().size(); j2++) {
                             //Encuentra el flow requrido
                             if (chatbots.get(j1).getFlows().get(j2).getId() == interacciones.get(i).getListaHistory().get(4)) {
                                 for (int j3 = 0; j3 < chatbots.get(j1).getFlows().get(j2).getOptions().size(); j3++) {
                                     //Encuentra la opcion elegida, en este caso, de opcionElegida String, se debe revisar si pertenece a las keywords de las opsciones
                                     if (chatbots.get(j1).getFlows().get(j2).getOptions().get(j3).getCode() == opcionElegida) {
                                         coordenadas.add(3, chatbots.get(j1).getFlows().get(j2).getOptions().get(j3).getChatbotCodeLink());
                                         coordenadas.add(4, chatbots.get(j1).getFlows().get(j2).getOptions().get(j3).getInitialflowCodeLink());
                                     }
                                 }
                             }
                         }
                     }
                 }
                 Interaccion_124667593_MUNOZ_CARMONA interaccion = new Interaccion_124667593_MUNOZ_CARMONA(currentUser, siOpcionEsString, coordenadas);
                 interacciones.add(interaccion);
                 break;
             }
         }
     } else {
         coordenadas.add(0, 0);
         coordenadas.add(1, 1);
         coordenadas.add(2, 0);
         coordenadas.add(3, 0);
         coordenadas.add(4, 1);
         Interaccion_124667593_MUNOZ_CARMONA interaccion = new Interaccion_124667593_MUNOZ_CARMONA(currentUser, siOpcionEsString, coordenadas);
         interacciones.add(interaccion);
     }
 }

 //----------------------------------------------------------------------------------------------------------------------------------
    // METODO PARA INTERACTUAR EN UN SISTEMA (Pero usando como opciones los keywords)
    /**
     * Metodo para interactuar en un sistema
     * @param opcionElegida
     */
    public void interaccionChatbotAux(String opcionElegida) {

        int k=0;
        String siOpcionEsString=opcionElegida;

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
                    coordenadas.add (0,interacciones.get(i).getListaHistory().get(3));
                    coordenadas.add (1,interacciones.get(i).getListaHistory().get(4));
                    for (int j1=0; j1<chatbots.size(); j1++){
                        //Encuentra el chatbot requerido
                        if (chatbots.get(j1).getChatbotID() == interacciones.get(i).getListaHistory().get(3)){
                            for (int j2=0; j2<chatbots.get(j1).getFlows().size();j2++){
                                //Encuentra el flow requrido
                                if(chatbots.get(j1).getFlows().get(j2).getId()==interacciones.get(i).getListaHistory().get(4)) {
                                    for (int j3=0; j3<chatbots.get(j1).getFlows().get(j2).getOptions().size();j3++){
                                        //Encuentra la opcion elegida
                                        if (chatbots.get(j1).getFlows().get(j2).getOptions().get(j3).getKeyword().contains(opcionElegida)) {
                                            coordenadas.add(2,chatbots.get(j1).getFlows().get(j2).getOptions().get(j3).getCode());
                                            coordenadas.add(3,chatbots.get(j1).getFlows().get(j2).getOptions().get(j3).getChatbotCodeLink());
                                            coordenadas.add(4,chatbots.get(j1).getFlows().get(j2).getOptions().get(j3).getInitialflowCodeLink());
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Interaccion_124667593_MUNOZ_CARMONA interaccion = new Interaccion_124667593_MUNOZ_CARMONA(currentUser,siOpcionEsString, coordenadas);
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
            Interaccion_124667593_MUNOZ_CARMONA interaccion = new Interaccion_124667593_MUNOZ_CARMONA(currentUser,siOpcionEsString, coordenadas);
            interacciones.add(interaccion);
        }
    }




    //**********************************************************************************************************************************
    // METODO PARA GENERAR UNA SINTESIS
    /**
     * Metodo para generar una sistesis de interacciones
     * @param user
     */
    public void sintesisUser(String user){

            for (int i =0; i<interacciones.size(); i++) {
                //Se encuentra interaccion de interes
                if (interacciones.get(i).getNameUsuario().equals(user)) {

                    //Se busca el chatbot de interaccion
                     for (int j1=chatbots.size()-1; j1>=0; j1--){
                         if (chatbots.get(j1).getChatbotID() == interacciones.get(i).getListaHistory().get(3)){

                             //Se busca el flujo de interaccion
                             for (int j2=chatbots.get(j1).getFlows().size()-1; j2>=0;j2--) {
                                 if (chatbots.get(j1).getFlows().get(j2).getId()==interacciones.get(i).getListaHistory().get(4)){

                                     //Se imprime la primera linea; fecha y usuario
                                     System.out.print(interacciones.get(i).getFecha());
                                     System.out.print("-" + interacciones.get(i).getNameUsuario());

                                     if (interacciones.get(i).getListaHistory().get(3)==0) {
                                         System.out.print(": Hola");
                                     }
                                     else{
                                         if (interacciones.get(i).getSiString().equals("")){
                                             System.out.print(":" + interacciones.get(i).getListaHistory().get(3));}
                                         else{
                                             System.out.print(":" + interacciones.get(i).getSiString());}
                                     }
                                     //se imprimen las opciones
                                     System.out.println();
                                     for(int j3=0; j3<chatbots.get(j1).getFlows().get(j2).getOptions().size(); j3++){
                                         System.out.println(chatbots.get(j1).getFlows().get(j2).getOptions().get(j3).getMessage());
                                     }
                                 }
                             }
                         }
                     }
                }
            }
        }


//*******************************************************************************************************************************************
// SIMULADOR
    /**
     * Metodo que genera una interacion simulada con los chatbots
     * @param user
     */
    public void SimulacionChatbot(String user) {
        int k=0; //Iniciador para contar si el user ya ha interactuado con el sistemas (Sea este user un automata o no)
        String siOpcionEsString="";

        List<Integer>coordenadas=new ArrayList<>();
        //Ciclo for para determinar si dentro de la lista interacciones hay alguna asociada al currentUser
        for(Interaccion_124667593_MUNOZ_CARMONA i:interacciones){
            if (i.getNameUsuario().equals(user)){k++;
            }
        }
        //Si K > 0 implica que el usuario ya ha interactuando con el sistema.
        if (k>0) {
            for (int i = interacciones.size() - 1; i >= 0; i--) {
                if (interacciones.get(i).getNameUsuario().equals(user)) {
                    coordenadas.add (0,interacciones.get(i).getListaHistory().get(3));
                    coordenadas.add (1,interacciones.get(i).getListaHistory().get(4));

                    for (int j1=0; j1<chatbots.size(); j1++){
                        //Encuentra el chatbot requerido
                        if (chatbots.get(j1).getChatbotID() == interacciones.get(i).getListaHistory().get(3)){
                            for (int j2=0; j2<chatbots.get(j1).getFlows().size();j2++){
                                //Encuentra el flow requrido
                                if(chatbots.get(j1).getFlows().get(j2).getId()==interacciones.get(i).getListaHistory().get(4)) {
                                    int min = 1;
                                    int max = chatbots.get(j1).getFlows().get(j2).getOptions().size();
                                    Random random = new Random();
                                    int opcionElegida = random.nextInt(max - min + 1) + min;
                                    for (int j3=0; j3<chatbots.get(j1).getFlows().get(j2).getOptions().size();j3++){
                                        if (chatbots.get(j1).getFlows().get(j2).getOptions().get(j3).getCode() == opcionElegida){
                                            coordenadas.add (2,opcionElegida);
                                            coordenadas.add(3,chatbots.get(j1).getFlows().get(j2).getOptions().get(j3).getChatbotCodeLink());
                                            coordenadas.add(4,chatbots.get(j1).getFlows().get(j2).getOptions().get(j3).getInitialflowCodeLink());
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Interaccion_124667593_MUNOZ_CARMONA interaccion = new Interaccion_124667593_MUNOZ_CARMONA(user,siOpcionEsString, coordenadas);
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
            Interaccion_124667593_MUNOZ_CARMONA interaccion = new Interaccion_124667593_MUNOZ_CARMONA(user,siOpcionEsString, coordenadas);
            interacciones.add(interaccion);
        }
    }



    /**
     * Simula y reporta un chatbot simulado
     * @param user
     * @param numIteraciones
     */
    public void simuladorChatbots (String user, int numIteraciones) {
        //Ciclo for para replicar la simulacion de acuerdo al numero de iteraciones
        for (int i=0; i<numIteraciones; i++) {
            SimulacionChatbot(user);
        }
        //Mostrar sintesis.
        sintesisUser(user);
    }



    //********************************IMPRIMIR LAS INSTANCIAS DE SISTEMA***************************************************************
    /**
     * Metodo para imprimir una instancia de sistema
     * @return
     */
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
