package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Declaracion de estructuras base
        List<Usuario_124667593_MUNOZ_CARMONA> usuariosSistema = new ArrayList<>();
        List<Interaccion_124667593_MUNOZ_CARMONA> interaccionesSistema = new ArrayList<>();
        List<Chatbot_124667593_MUNOZ_CARMONA>chatbotdSistema = new ArrayList<>();

        //Se crea un sistema de referencia
        var sistema=new System_124667593_MUNOZ_CARMONA("", 0, usuariosSistema, "", interaccionesSistema, chatbotdSistema);

        // EL DIALOGO COMIENZA POR ELEGIR QUE HACER
        // a.-Ingresar un usuario
        // b.-Ingresar un Chatbot
        // c.-Interactuar con el sistema
        // d.-Salir
        Scanner scanner = new Scanner (System.in);
        System.out.println("Que deseas hacer?");
        System.out.println("a.-Crear un sistema (Marca 1)");
        System.out.println("b.-Ingresar un usuario (Marca 2)");
        System.out.println("c.-Ingresar un Chatbot (Marca 3)");
        System.out.println("d.-Interactuar con el sistema (Marca 4)");
        System.out.println("e.-Salir (Marca 5)");
        int altEntrada= scanner.nextInt();  //altEntrada corresponde a la alternativa elegida en este primer dialogo


        //Crear usuario
        if (altEntrada==1) {
            //Se infresa el nombre del sistema
            Scanner scanner1 = new Scanner (System.in);
            System.out.println("Ingrese nombre del sistema");
            String nombreSistema = scanner1.nextLine();
            sistema.setName(nombreSistema);

            //Se ingresa el Id del chatbot incial en el sistema
            System.out.println("Ingrese Id chatbot inicial");
            int initialCbId = scanner1.nextInt();
            sistema.setInitialChatbotCode(initialCbId);
        }


        //Ingresar usuario
        if(altEntrada==2){
            int var_Dummie=1;

            //Se define ciclo para generar la posibilidad de infresasr mas de un usuario
            while (var_Dummie==1) {
                sistema.addUsuario(make_user());
                Scanner scanner2 = new Scanner (System.in);
                System.out.println("Deseas ingresar otro usuario? (Si -Marca 1) (No -Marca 2)  ");
                int otroUsuario= scanner2.nextInt();
                var_Dummie=otroUsuario;
            }
        }


        //Ingresar un chatbot
        if(altEntrada==3){
            make_chatbot();

        }











    }
    //SE DECLARAN METODOS A USAR EN EL MAIN----------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------
    //Metodo que crea un usuario
    public static Usuario_124667593_MUNOZ_CARMONA make_user( ) {
        var usuario = new Usuario_124667593_MUNOZ_CARMONA();

        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese nombre de usuario");
        String userName= scanner.nextLine();
        usuario.setName(userName);
        System.out.println("Ingrese el rol definido para el usuario: ");
        System.out.println("(1) Administrador");
        System.out.println("(2) Usuario Normal");
        int userRol= scanner.nextInt();
        usuario.setEstado(userRol);
        return usuario;
    }


    //-------------------------------------------------------------------------------------------------------------
    //Metodo que crea un chatbot
    public static Chatbot_124667593_MUNOZ_CARMONA make_chatbot() {
        var chatbot = new Chatbot_124667593_MUNOZ_CARMONA();
        List<Flow_124667593_MUNOZ_CARMONA> flujos = new ArrayList<>();
        //Flow_124667593_MUNOZ_CARMONA flujo;

        //Se ingresa por consola el chatbot:
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese ID del chatbot");
        int id_chatbot= scanner.nextInt();
        chatbot.setChatbotID(id_chatbot);

        System.out.println("Ingrese en nombre del Chatbot");
        String name_chatbot= scanner.nextLine();
        chatbot.setName(name_chatbot);

        System.out.println("Ingrese mensaje de bienvenida del chatbot");
        String msg_chatbot= scanner.nextLine();
        chatbot.setMsgWelcome(msg_chatbot);

        System.out.println("Ingrese startFlowID");
        int startFlowIDCb= scanner.nextInt();
        chatbot.setStartFlowID(startFlowIDCb);
        chatbot.setFlows(flujos);

        //Abajo: while para llenar la flujos
        System.out.println("Deseas crear un flujos?  Si (Marca 1) / No (Marca 2) ");
        int ingresarFlujo = scanner.nextInt();
        while (ingresarFlujo == 1){
            flujos.add(make_flow());
            System.out.println("Deseas ingresar otro flujo?  Si (Marca 1) / No (Marca 2) ");
            int otroFlujo = scanner.nextInt();
            ingresarFlujo = otroFlujo;
        }
        return chatbot;
    }


    //------------------------------------------------------------------------------------------------------------
    //Crea un flujo
    public static Flow_124667593_MUNOZ_CARMONA make_flow() {
        List<Option_124667593_MUNOZ_CARMONA> opciones = new ArrayList<>();
        Option_124667593_MUNOZ_CARMONA opcionNueva;

        //Se ingresa por consola flujo:
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese Id del Flow");
        int id_flow= scanner.nextInt();
        System.out.println("Ingrese mensaje");
        String msg_flow= scanner.nextLine();

        //Se crea el flujo nuevo al que se le agregaran las opciones:
        Flow_124667593_MUNOZ_CARMONA nuevoFlujo = new Flow_124667593_MUNOZ_CARMONA(id_flow, msg_flow, opciones);

        //Abajo: while para llenar la opciones:
        System.out.println("Deseas ingresar una opcion?  Si (Marca 1) / No (Marca 2) ");
        int var2 = scanner.nextInt();
        while (var2 == 1){
            opcionNueva = make_option();
            nuevoFlujo.addOpcionToOptions(opcionNueva);
            System.out.println("Deseas ingresar otra opcion?  Si (Marca 1) / No (Marca 2) ");
            int var10 = scanner.nextInt();
            var2 = var10;
        }
        return nuevoFlujo;
    }



    //Crea una opcion
    public static Option_124667593_MUNOZ_CARMONA make_option() {
        List<String> keywords = new ArrayList<>();

        //Se ingresa por consola la opcion:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Code de la opcion");
        int code = scanner.nextInt();
        System.out.println("Ingrese mensaje");
        String msg_opcion = scanner.nextLine();
        System.out.println("Ingrese el CodeLink del Chatbot asociado");
        int codeLinkCb = scanner.nextInt();
        System.out.println("Ingrese el CodeLink del Flow asociado");
        int codeLinkFl = scanner.nextInt();

        //Abajo: while para llenar la keywords
        System.out.println("Deseas ingresar una keywords?  Si (Marca 1) / No (Marca 2) ");
        int var3 = scanner.nextInt();
        while (var3 == 1){
            System.out.println("Ingrese keyword");
            String kw = scanner.nextLine();
            keywords.add(kw);
            System.out.println("Deseas ingresar otra keywords?  Si (Marca 1) / No (Marca 2) ");
            int var10 = scanner.nextInt();
             var3=var10;
        }
        return new Option_124667593_MUNOZ_CARMONA(code, msg_opcion, codeLinkCb, codeLinkFl, keywords );
    }



    //-----------------------------------------------------------------------------------------------------------------
}