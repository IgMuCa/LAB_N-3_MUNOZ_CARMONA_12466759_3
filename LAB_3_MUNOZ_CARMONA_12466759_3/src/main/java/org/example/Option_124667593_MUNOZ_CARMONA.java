package org.example;

import java.util.ArrayList;
import java.util.List;

public class Option_124667593_MUNOZ_CARMONA {
    private int code;
    private String message;
    private int chatbotCodeLink;
    private int initialflowCodeLink;
    private List<String> keyword;

    public Option_124667593_MUNOZ_CARMONA(int code, String message, int chatbotCodeLink, int initialflowCodeLink, List<String> keyword) {
        this.code = code;
        this.message = message;
        this.chatbotCodeLink = chatbotCodeLink;
        this.initialflowCodeLink = initialflowCodeLink;
        this.keyword = new ArrayList<>();
    }

    public Option_124667593_MUNOZ_CARMONA() {
    }


    public int getCode() {return code;}
    public String getMessage() {return message;}
    public int getChatbotCodeLink() {return chatbotCodeLink;}
    public int getInitialflowCodeLink() {return initialflowCodeLink;}
    public List<String> getKeyword() {return keyword;}
    public void setCode(int code) {this.code = code;}
    public void setMessage(String message) {this.message = message;}
    public void setChatbotCodeLink(int chatbotCodeLink) {this.chatbotCodeLink = chatbotCodeLink;}
    public void setInitialflowCodeLink(int initialflowCodeLink) {this.initialflowCodeLink = initialflowCodeLink;}
    public void setKeyword(List<String> keyword) {this.keyword = keyword;}


    //PARA IMPRIMIR LAS INSTANCIAS DE OPCIONES
    @Override
    public String toString() {
        return "Option_124667593_MUNOZ_CARMONA{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", chatbotCodeLink=" + chatbotCodeLink +
                ", initialflowCodeLink=" + initialflowCodeLink +
                ", keyword=" + keyword +
                '}';
    }


    //--------------------------------------------------------------------------------------------------------------
}
