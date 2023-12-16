package org.example;

import java.util.ArrayList;
import java.util.List;

public class Option_124667593_MUNOZ_CARMONA implements IOption {
    private int code;
    private String message;
    private int chatbotCodeLink;
    private int initialflowCodeLink;
    private List<String> keyword;


    /**
     * Constructor
     * @param code
     * @param message
     * @param chatbotCodeLink
     * @param initialflowCodeLink
     * @param keyword
     */
    public Option_124667593_MUNOZ_CARMONA(int code, String message, int chatbotCodeLink, int initialflowCodeLink, List<String> keyword) {
        this.code = code;
        this.message = message;
        this.chatbotCodeLink = chatbotCodeLink;
        this.initialflowCodeLink = initialflowCodeLink;
        this.keyword = new ArrayList<>();
    }


    /**
     * Polimosfismo de metodos del constructor
     */
    public Option_124667593_MUNOZ_CARMONA() {
    }


    //************************************************GETTER AND SETTER*****************************************************************************************

    /**
     * Metodo que retorna en code
     * @return
     */
    public int getCode() {return code;}

    /**
     * Metodo que retorna el message
     * @return
     */
    public String getMessage() {return message;}

    /**
     * Metodo que retorna el chatbotCodeLink
     * @return
     */
    public int getChatbotCodeLink() {return chatbotCodeLink;}

    /**
     * Metodo que retorna el initialflowCodeLink
     * @return
     */
    public int getInitialflowCodeLink() {return initialflowCodeLink;}

    /**
     * Metodo que retorna la lista keyword
     * @return
     */
    public List<String> getKeyword() {return keyword;}

    /**
     * Metodo que puede modificar el code
     * @param code
     */
    public void setCode(int code) {this.code = code;}

    /**
     * Metodo que puede modificar el message
     * @param message
     */
    public void setMessage(String message) {this.message = message;}

    /**
     * Metodo que puede modificar el chatbotCodeLink
     * @param chatbotCodeLink
     */
    public void setChatbotCodeLink(int chatbotCodeLink) {this.chatbotCodeLink = chatbotCodeLink;}

    /**
     * Metodo que puede modificar el initialflowCodeLink
     * @param initialflowCodeLink
     */
    public void setInitialflowCodeLink(int initialflowCodeLink) {this.initialflowCodeLink = initialflowCodeLink;}

    /**
     * Metodo que puede modificar la lista de keyword
     * @param keyword
     */
    public void setKeyword(List<String> keyword) {this.keyword = keyword;}


    //***************************************IMPRIMIR LAS INSTANCIAS DE OPCIONES****************************************************************

    /**
     * Metodo que puede imprimir isntancias de la clase opction
     * @return
     */
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

    //Impelentación interfaz
    @Override
    public int getCodigo() {
        return 0;
    }


    //--------------------------------------------------------------------------------------------------------------
}
