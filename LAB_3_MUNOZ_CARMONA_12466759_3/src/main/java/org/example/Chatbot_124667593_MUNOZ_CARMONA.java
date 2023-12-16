package org.example;

import java.util.ArrayList;
import java.util.List;

public class Chatbot_124667593_MUNOZ_CARMONA {
    private int chatbotID;
    private String name;
    private String msgWelcome;
    private int startFlowID;
    private List<Flow_124667593_MUNOZ_CARMONA> flows;

    /**
     * Constructor
     * @param chatbotID
     * @param name
     * @param msgWelcome
     * @param startFlowID
     * @param flows
     */
    public Chatbot_124667593_MUNOZ_CARMONA(int chatbotID, String name, String msgWelcome, int startFlowID, List<Flow_124667593_MUNOZ_CARMONA> flows) {
        this.chatbotID = chatbotID;
        this.name = name;
        this.msgWelcome = msgWelcome;
        this.startFlowID = startFlowID;
        this.flows = new ArrayList<>();
    }

    /**
     * Polimorfismo del metodo constructor
     */
    public Chatbot_124667593_MUNOZ_CARMONA() {
    }


    //*************************************************GETTER AND SETTER***************************************************************************************************************

    /**
     * Metodo que retorna el chatbotID
     * @return
     */
    public int getChatbotID() {return chatbotID;}

    /**
     * Metodo que puede modificar el chatbotID
     * @param chatbotID
     */
    public void setChatbotID(int chatbotID) {
        this.chatbotID = chatbotID;}

    /**
     * Metodo que retorna el name
     * @return
     */
    public String getName() {
        return name;}

    /**
     * Metodo que puede modificar el name
     * @param name
     */
    public void setName(String name) {
        this.name = name;}

    /**
     * Metodo que retorna el msgWelcome
     * @return
     */
    public String getMsgWelcome() {
        return msgWelcome;}

    /**
     * Metodo que puede modificar el msgWelcome
     * @param msgWelcome
     */
    public void setMsgWelcome(String msgWelcome) {
        this.msgWelcome = msgWelcome;}

    /**
     * Metodo que retorna el starFlowID
     * @return
     */
    public int getStartFlowID() {
        return startFlowID;}

    /**
     * Metodo que retorna los flujos del chatbot
     * @return
     */
    public List<Flow_124667593_MUNOZ_CARMONA> getFlows() {return flows;}

    /**
     *  Metodo que puede modificar el starFlowID
     * @param startFlowID
     */
    public void setStartFlowID(int startFlowID) {
        this.startFlowID = startFlowID;}

    /**
     * Metodo peuede modificar la lista de Flujos
     * @param flows
     */
    public void setFlows(List<Flow_124667593_MUNOZ_CARMONA> flows) {this.flows = flows;}


    /**
     * Metodo que puede agregar un flujo al chatbot, sin repetir
     * @param flujo
     */
    public void addFlujoToflows(Flow_124667593_MUNOZ_CARMONA flujo) {
        int largo_flows = flows.size();
        int contador=0;

        //agregar el primer flujo
        if (largo_flows==0){flows.add(flujo);}
        else {
            for (int i = 0; i < largo_flows; i++) {
                if (flows.get(i).getId() == flujo.getId()) {
                    contador++;
                }
            }
            if (contador == 0) {
                flows.add(flujo);
            }
        }
    }




    //*******************************************IMPRIMIR LAS INSTANCIAS DE CHATBOTS********************************************************************************************

    /**
     * Metodo que imprime una instancia de la clase chatbot
     * @return
     */
    @Override
    public String toString() {
        return "Chatbot_124667593_MUNOZ_CARMONA{" +
                "chatbotID=" + chatbotID +
                ", name='" + name + '\'' +
                ", msgWelcome='" + msgWelcome + '\'' +
                ", startFlowID=" + startFlowID +
                ", flows=" + flows +
                '}';
    }


    //----------------------------------------------------------------------------------------------------------------------------------------
}
