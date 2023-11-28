package org.example;

import java.util.ArrayList;
import java.util.List;

public class Chatbot_124667593_MUNOZ_CARMONA {
    private int chatbotID;
    private String name;
    private String msgWelcome;
    private int startFlowID;
    private List<Flow_124667593_MUNOZ_CARMONA> flows;

    public Chatbot_124667593_MUNOZ_CARMONA(int chatbotID, String name, String msgWelcome, int startFlowID, List<Flow_124667593_MUNOZ_CARMONA> flows) {
        this.chatbotID = chatbotID;
        this.name = name;
        this.msgWelcome = msgWelcome;
        this.startFlowID = startFlowID;
        this.flows = new ArrayList<>();
    }
    public int getChatbotID() {
        return chatbotID;
    }
    public void setChatbotID(int chatbotID) {
        this.chatbotID = chatbotID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMsgWelcome() {
        return msgWelcome;
    }
    public void setMsgWelcome(String msgWelcome) {
        this.msgWelcome = msgWelcome;
    }
    public int getStartFlowID() {
        return startFlowID;
    }
    public List<Flow_124667593_MUNOZ_CARMONA> getFlows() {return flows;}
    public void setStartFlowID(int startFlowID) {
        this.startFlowID = startFlowID;
    }
    public void setFlows(List<Flow_124667593_MUNOZ_CARMONA> flows) {this.flows = flows;}
    public void addFlujoToflows(Flow_124667593_MUNOZ_CARMONA flujo) {
        int largo_flows = flows.size();
        int contador=0;
        for(int i=0; i< largo_flows; i++){
            if (flows.get(i).getId()==flujo.getId()){
                contador++;
            } }
        if (contador>0){
            flows.add(flujo);
        } }
}
