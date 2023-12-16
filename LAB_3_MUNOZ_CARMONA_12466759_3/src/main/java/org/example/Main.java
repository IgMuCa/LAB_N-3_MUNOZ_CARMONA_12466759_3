package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        // Declaracion de estructuras base
        List<Usuario_124667593_MUNOZ_CARMONA> usuariosSistema = new ArrayList<>();
        List<Interaccion_124667593_MUNOZ_CARMONA> interaccionesSistema = new ArrayList<>();
        List<Chatbot_124667593_MUNOZ_CARMONA>chatbotdSistema = new ArrayList<>();

        //Se crea un Sistema
        var sistema=new System_124667593_MUNOZ_CARMONA("Sistema_Paradigma", 0, usuariosSistema, "none", interaccionesSistema, chatbotdSistema);
        Scanner scanner = new Scanner(System.in);


        int code_dialogando =1; //Se ingresa a los dialogos
        //DIALOGO (1)****************************************************************************************************************************************************************
        while (code_dialogando==1) {
            // EL DIALOGO INICIAL4
            System.out.println("SISTEMA CHATBOTS PARADIGMAS");
            System.out.println("Que deseas hacer?");
            System.out.println("a.-Ingresar al sistema - Login  (Marca 1)");
            System.out.println("b.-Salir del sistema - Logout  (Marca 2)");
            System.out.println("c.-Registar usuario  (Marca 3)");
            System.out.println("d.-Salir  (Marca 4)");
            int altEntrada = ingresarEntero(1,4);   //Se asegura el ingreso de un entrero entre 1 y 4.

            //OPCION 1
            //Ingresar al sistema
            if (altEntrada == 1) {
                System.out.println("Nombre del usuario a ingresar: ");
                String user = scanner.nextLine();
                if(sistema.getCurrentUser()!=null && sistema.getCurrentUser()!=user){
                    System.out.println("Hay un usuario operando en el sistema");
                }
                sistema.login(user);
                //Despues de aplicar LOGIN, y si el usuario está ok, entonces el curretUser será igual al user
                if (sistema.getCurrentUser()!= null && sistema.getCurrentUser().equals(user)){
                  code_dialogando=2;}
            }

            //OPCION 2
            //Logout usuario
            if (altEntrada == 2) {
                 sistema.logout();
            }

            //OPCION 3
            //Registrar usuario
            if (altEntrada == 3) {
                int var_Dummie = 1;
                //Se define ciclo para generar la posibilidad de ingresasr mas de un usuario
                while (var_Dummie == 1) {
                    if(var_Dummie==1){
                        sistema.addUsuario(make_user());
                        System.out.println("Deseas ingresar otro usuario? (Si -Marca 1) (No -Marca 2)  ");
                        int otroUsuario = ingresarEntero(1,2);
                        var_Dummie = otroUsuario;}
                }
            }

            //OPCION 4
            //Salir
            if (altEntrada == 4) {
                code_dialogando = 0;
            }
        } //Cierre del While asociado al primer dialogo.


        //Se ingresa al sistema
        //DIALOGO (2)***************************************************************************************************************************************************
        while (code_dialogando==2) {
            //DIALOGO EN SISTEMA
            System.out.println("SISTEMA CHATBOTS PARADIGMAS");
            System.out.println("a.-Ingresar un Chatbot (Marca 1)");
            System.out.println("b.-Interactuar con el sistema (Marca 2)");
            System.out.println("c.-Simular interacción con un user_bot (Marca 3)");
            System.out.println("d.-Salir (Marca 4)");
            int altEntrada1 = ingresarEntero(1,4);  //altEntrada corresponde a la alternativa elegida en este primer dialogo

            //OPCION 1
            //Ingresar un chatbot
            if (altEntrada1 == 1) {
                int var_Dummie = 1;
                //Analizar si el usuario tiene privilegios de administrador
                 if(rolAdmistrador(sistema.getUsuarios(), sistema.getCurrentUser())==0){
                     System.out.println("El usuario actual no tiene rol de Administrador");
                     var_Dummie=2;
                 }
                //Se define ciclo para generar la posibilidad de ingresar mas de un chatbot
                while (var_Dummie == 1) {
                    sistema.addChatbotToSistema(make_chatbot());
                    System.out.println("Deseas ingresar otro chatbot? (Si -Marca 1) (No -Marca 2)  ");
                    int otroChatbot = ingresarEntero(1,2);
                    var_Dummie = otroChatbot;
                }
            }

            //OPCION 2
            //Interactuar con el sistema
            if (altEntrada1 == 2) {
                int interaccion = 1;
                sistema.interaccionChatbot(0);
                sistema.sintesisUser(sistema.getCurrentUser());

                while (interaccion==1) {
                    System.out.println("Elegiras a traves de: Id (Marca 1) o Keywords (Marca 2)");
                    int eleccion = ingresarEntero(1,2);

                    if (eleccion == 1) {
                        System.out.println("Ingrese Id");
                        int opcion1 = scanner.nextInt();
                        scanner.nextLine();
                        sistema.interaccionChatbot(opcion1);
                        sistema.sintesisUser(sistema.getCurrentUser());

                        System.out.println("Continuar? (si = 1) (No = 2)");
                        int seguirInteractuando = scanner.nextInt();
                        scanner.nextLine();
                        interaccion = seguirInteractuando;
                    } else {
                        System.out.println("Ingrese Keyword");
                        String opcion2 = scanner.nextLine();
                        sistema.interaccionChatbotAux(opcion2);
                        sistema.sintesisUser(sistema.getCurrentUser());

                        System.out.println("Continuar? (si = 1) (No = 2)");
                        int seguirInteractuando = scanner.nextInt();
                        scanner.nextLine();
                        interaccion = seguirInteractuando;
                    }
                }
            }


            //OPCION 3
            if (altEntrada1==3) {
                System.out.println("Ingrese el número de iteraciones a simular");

                int numIteraciones = ingresarEntero(0,999);
                System.out.println("Ingrese el usuario simulado (formato: user_XXXXX) : " ); //*****
                String usuarioSimulado1= scanner.nextLine();
                String usuarioSimulado=usuarioSimulado1;
                sistema.simuladorChatbots(usuarioSimulado, numIteraciones);
            }

            //OPCION 4
            //Salir del dialogo
            if (altEntrada1 == 4) {
                sistema.logout();
                code_dialogando =0;
            }

        } //Cierre de While asociado al ingreso al sistema

//--------------------------------------------------------------------------------------------------------------------------------------
       // Imprimir como se va llenando el sistema
       System.out.println(sistema);


    }  //FIN DEL SISTEMA STATIC VOID
    //--------------------------------------------------------------------------------------------------------------
    //SE DECLARAN METODOS A USAR EN EL MAIN----------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------
    //Metodo que crea un USUARIO
    /**
     *  Metodo que crea un usuario
     * @return
     */
    public static Usuario_124667593_MUNOZ_CARMONA make_user( ) {
        var usuario = new Usuario_124667593_MUNOZ_CARMONA();

        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese nombre de usuario");
        String userName= scanner.nextLine();
        usuario.setName(userName);
        System.out.println("Ingrese el rol definido para el usuario: ");
        System.out.println("(1) Administrador");
        System.out.println("(2) Usuario Normal");
        int userRol= ingresarEntero(1,2);  //*****
        usuario.setEstado(userRol);
        return usuario;
    }


    //-------------------------------------------------------------------------------------------------------------
    //Metodo que crea un CHATBOT

    /**
     * Metodo que crea un chatbot
     * @return
     */
    public static Chatbot_124667593_MUNOZ_CARMONA make_chatbot() {
        var chatbot = new Chatbot_124667593_MUNOZ_CARMONA();
        List<Flow_124667593_MUNOZ_CARMONA> flujos = new ArrayList<>();

        //Se ingresa por consola el chatbot:
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese ID del chatbot");
        int id_chatbot= ingresarEntero(0,999);
        //scanner.nextLine();*****
        chatbot.setChatbotID(id_chatbot);

        System.out.println("Ingrese en nombre del Chatbot");
        String name_chatbot= scanner.nextLine();
        chatbot.setName(name_chatbot);

        System.out.println("Ingrese mensaje de bienvenida del chatbot");
        String msg_chatbot= scanner.nextLine();
        chatbot.setMsgWelcome(msg_chatbot);

        System.out.println("Ingrese startFlowID");
        int startFlowIDCb= ingresarEntero(0,999);
        //scanner.nextLine();
        chatbot.setStartFlowID(startFlowIDCb);

        //Abajo: while para llenar la flujos
        System.out.println("Deseas crear un flujos?  Si (Marca 1) / No (Marca 2) ");
        int ingresarFlujo = ingresarEntero(1,2); //****
        while (ingresarFlujo == 1){
            flujos.add(make_flow());
            System.out.println("Deseas ingresar otro flujo?  Si (Marca 1) / No (Marca 2) ");
            int otroFlujo = ingresarEntero(1,2); //*****
            ingresarFlujo = otroFlujo;
        }
        chatbot.setFlows(flujos);
        return chatbot;
    }


    //------------------------------------------------------------------------------------------------------------
    //Metodo que crea un FLUJO

    /**
     * Metodo que crea un flujo
     * @return
     */
    public static Flow_124667593_MUNOZ_CARMONA make_flow() {
        var flujo= new Flow_124667593_MUNOZ_CARMONA ();
        List<Option_124667593_MUNOZ_CARMONA> opciones = new ArrayList<>();

        //Se ingresa por consola flujo:
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese Id del Flow");
        int id_flow= ingresarEntero(0,999);
        //scanner.nextLine();  //*****
        flujo.setId(id_flow);

        System.out.println("Ingrese mensaje");
        String msg_flow= scanner.nextLine();
        flujo.setName_msg(msg_flow);

        //Abajo: while para llenar la opciones:
        System.out.println("Deseas ingresar una opcion?  Si (Marca 1) / No (Marca 2) ");
        int ingresarOpcion = ingresarEntero(1,2); //****
        while (ingresarOpcion == 1){
            opciones.add(make_option());
            System.out.println("Deseas ingresar otra opcion?  Si (Marca 1) / No (Marca 2) ");
            int otraOpcion = ingresarEntero(1,2); //****
            ingresarOpcion = otraOpcion;
        }
        flujo.setOptions(opciones);
        return flujo;
    }


//----------------------------------------------------------------------------------------------------------------
    //Metodo que crea una OPCION

    /**
     * Metodo que crea una opcion
     * @return
     */
    public static Option_124667593_MUNOZ_CARMONA make_option() {
        var opcion =new Option_124667593_MUNOZ_CARMONA();
        List<String> keywords = new ArrayList<>();

        //Se ingresa por consola la opcion:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Code de la opcion");
        int code = ingresarEntero(0,999); //******
        //scanner.nextLine(); ****
        opcion.setCode(code);

        System.out.println("Ingrese mensaje");
        String msg_opcion = scanner.nextLine();
        opcion.setMessage(msg_opcion);

        System.out.println("Ingrese el CodeLink del Chatbot asociado");
        int codeLinkCb = ingresarEntero(0,999); //****
        //scanner.nextLine(); ******
        opcion.setChatbotCodeLink(codeLinkCb);

        System.out.println("Ingrese el CodeLink del Flow asociado");
        int codeLinkFl = ingresarEntero(0,999);
        //scanner.nextLine(); ***
        opcion.setInitialflowCodeLink(codeLinkFl);

        //Abajo: while para llenar la keywords
        System.out.println("Deseas ingresar una keywords?  Si (Marca 1) / No (Marca 2) ");
        int ingresarKW = ingresarEntero(1,2);  //******
        //scanner.nextLine(); ****
        while (ingresarKW == 1){
            System.out.println("Ingrese keyword");
            String kw = scanner.nextLine();
            keywords.add(kw);
            System.out.println("Deseas ingresar otra keywords?  Si (Marca 1) / No (Marca 2) ");
            int otraKW = ingresarEntero(1,2); //****
            //scanner.nextLine();  ***
            ingresarKW=otraKW;
        }
        opcion.setKeyword(keywords);
        return opcion;
    }

    //-------------------------------------------------------------------------------------------------------------------
    //Metodo para determinar si una tupla pertenece a lista de usuarios

    /**
     * Metodo para determinar si una tupla pertenece a lista de usuarios
     * @param usuarios
     * @param usuario
     * @return
     */
    public static int rolAdmistrador (List<Usuario_124667593_MUNOZ_CARMONA>usuarios, String usuario){
        int esAdministrador=0;
        for (Usuario_124667593_MUNOZ_CARMONA user:usuarios) {
            if (user.getName().equals(usuario)){
                if (user.getEstado()==1){
                    esAdministrador=1;
                }
            }
        }
        return esAdministrador;
    }



    /**
     * Metodo para ingresar un entero protegiendo el tipo de dato
     * @param min
     * @param max
     * @return
     */
    public static int ingresarEntero(int min, int max){
        Scanner scanner = new Scanner(System.in);
        int entrada=0;
        boolean entradaValida = false;
        do {
            //System.out.print("Ingrese un número entero entre " + min + " y " + max + ": ");
            if (scanner.hasNextInt()) {
                entrada = scanner.nextInt();
                entradaValida = (entrada >= min && entrada <= max);
                if (!entradaValida) {
                    System.out.println("Número fuera de rango. Inténtelo nuevamente.");
                }
            }
            else {
                System.out.println("Entrada no válida. Inténtelo nuevamente.");
                scanner.next(); // Limpiar el buffer de entrada
                entradaValida = false;
            }
        } while (!entradaValida);
            return entrada;
    }






//******************************************************************************************************************************************************************
// Cierre
} //fin del mail