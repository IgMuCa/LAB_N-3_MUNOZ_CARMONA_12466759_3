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
        // EL DIALOGO INICIAL
        // a.-Crear usuario usuario
        // b.-Ingresar ingresar al sistema


        int code_dialogando =1;
        // permite iniciar dialogo

        while (code_dialogando==1) {
        //DIALOGO
            // a.-Ingresar un usuario
            // b.-Ingresar un Chatbot
            // c.-Interactuar con el sistema
            // d.-Salir
            Scanner scanner = new Scanner(System.in);
            System.out.println("Que deseas hacer?");
            System.out.println("a.-Crear un sistema (Marca 1)");
            System.out.println("b.-Ingresar un usuario (Marca 2)");
            System.out.println("c.-Ingresar un Chatbot (Marca 3)");
            System.out.println("d.-Interactuar con el sistema (Marca 4)");
            System.out.println("e.-Salir (Marca 5)");
            int altEntrada = scanner.nextInt();  //altEntrada corresponde a la alternativa elegida en este primer dialogo

            //OPCION 1
            //Crear sistema
            if (altEntrada == 1) {
                //Se infresa el nombre del sistema
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Ingrese nombre del sistema");
                String nombreSistema = scanner1.nextLine();
                sistema.setName(nombreSistema);
                //Se ingresa el Id del chatbot incial en el sistema
                System.out.println("Ingrese Id chatbot inicial");
                int initialCbId = scanner1.nextInt();
                sistema.setInitialChatbotCode(initialCbId);
            }

            //OPCION 2
            //Ingresar usuario
            if (altEntrada == 2) {
                int var_Dummie = 1;
                //Se define ciclo para generar la posibilidad de ingresasr mas de un usuario
                while (var_Dummie == 1) {
                    sistema.addUsuario(make_user());
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Deseas ingresar otro usuario? (Si -Marca 1) (No -Marca 2)  ");
                    int otroUsuario = scanner2.nextInt();
                    var_Dummie = otroUsuario;
                }
            }

             //OPCION 3
            //Ingresar un chatbot
            if (altEntrada == 3) {
                int var_Dummie = 1;
                //Se define ciclo para generar la posibilidad de ingresasr mas de un chatbot
                while (var_Dummie == 1) {
                    sistema.addChatbotToSistema(make_chatbot());
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Deseas ingresar otro chatbot? (Si -Marca 1) (No -Marca 2)  ");
                    int otroChatbot = scanner2.nextInt();
                    var_Dummie = otroChatbot;
                }
            }

            //OPCION 4
            //Salir del dialogo
            if (altEntrada == 4) {
              //Sub dialogo asociado interactuar






            }




            //OPCION 5
            //Salir del dialogo
            if (altEntrada == 5) {code_dialogando =0;
            }


        }



//--------------------------------------------------------------------------------------------------------------------------------------

       // Imprimir como se va llenando el sistema
       System.out.println(sistema);



    } //fin del static void main

    //--------------------------------------------------------------------------------------------------------------
    //SE DECLARAN METODOS A USAR EN EL MAIN----------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------
    //Metodo que crea un USUARIO
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
    //Metodo que crea un CHATBOT
    public static Chatbot_124667593_MUNOZ_CARMONA make_chatbot() {
        var chatbot = new Chatbot_124667593_MUNOZ_CARMONA();
        List<Flow_124667593_MUNOZ_CARMONA> flujos = new ArrayList<>();

        //Se ingresa por consola el chatbot:
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese ID del chatbot");
        int id_chatbot= scanner.nextInt();
        scanner.nextLine();
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

        //Abajo: while para llenar la flujos
        System.out.println("Deseas crear un flujos?  Si (Marca 1) / No (Marca 2) ");
        int ingresarFlujo = scanner.nextInt();
        while (ingresarFlujo == 1){
            flujos.add(make_flow());
            System.out.println("Deseas ingresar otro flujo?  Si (Marca 1) / No (Marca 2) ");
            int otroFlujo = scanner.nextInt();
            ingresarFlujo = otroFlujo;
        }
        chatbot.setFlows(flujos);
        return chatbot;
    }


    //------------------------------------------------------------------------------------------------------------
    //Metodo que crea un FLUJO
    public static Flow_124667593_MUNOZ_CARMONA make_flow() {
        var flujo= new Flow_124667593_MUNOZ_CARMONA ();
        List<Option_124667593_MUNOZ_CARMONA> opciones = new ArrayList<>();

        //Se ingresa por consola flujo:
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese Id del Flow");
        int id_flow= scanner.nextInt();
        flujo.setId(id_flow);

        scanner.nextLine();
        System.out.println("Ingrese mensaje");
        String msg_flow= scanner.nextLine();
        flujo.setName_msg(msg_flow);

        //Abajo: while para llenar la opciones:
        System.out.println("Deseas ingresar una opcion?  Si (Marca 1) / No (Marca 2) ");
        int ingresarOpcion = scanner.nextInt();
        while (ingresarOpcion == 1){
            opciones.add(make_option());
            System.out.println("Deseas ingresar otra opcion?  Si (Marca 1) / No (Marca 2) ");
            int otraOpcion = scanner.nextInt();
            ingresarOpcion = otraOpcion;
        }
        flujo.setOptions(opciones);
        return flujo;
    }


//----------------------------------------------------------------------------------------------------------------
    //Metodo que crea una OPCION
    public static Option_124667593_MUNOZ_CARMONA make_option() {
        var opcion =new Option_124667593_MUNOZ_CARMONA();
        List<String> keywords = new ArrayList<>();

        //Se ingresa por consola la opcion:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Code de la opcion");
        int code = scanner.nextInt();
        scanner.nextLine();
        opcion.setCode(code);

        System.out.println("Ingrese mensaje");
        String msg_opcion = scanner.nextLine();
        opcion.setMessage(msg_opcion);

        System.out.println("Ingrese el CodeLink del Chatbot asociado");
        int codeLinkCb = scanner.nextInt();
        scanner.nextLine();
        opcion.setChatbotCodeLink(codeLinkCb);

        System.out.println("Ingrese el CodeLink del Flow asociado");
        int codeLinkFl = scanner.nextInt();
        scanner.nextLine();
        opcion.setInitialflowCodeLink(codeLinkFl);

        //Abajo: while para llenar la keywords
        System.out.println("Deseas ingresar una keywords?  Si (Marca 1) / No (Marca 2) ");
        int ingresarKW = scanner.nextInt();
        scanner.nextLine();
        while (ingresarKW == 1){
            System.out.println("Ingrese keyword");
            String kw = scanner.nextLine();
            keywords.add(kw);
            System.out.println("Deseas ingresar otra keywords?  Si (Marca 1) / No (Marca 2) ");
            int otraKW = scanner.nextInt();
            scanner.nextLine();
            ingresarKW=otraKW;
        }
        opcion.setKeyword(keywords);
        return opcion;
    }



    //Cierre
    //-----------------------------------------------------------------------------------------------------------------
} //fin del mail