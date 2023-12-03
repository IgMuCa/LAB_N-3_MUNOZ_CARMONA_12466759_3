package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //METODO PARA SCANNEAR
        make_user();












    }
    //SE DECLARAN METODOS A USAR EN EL MAIN----------------------------------------------------------------------------
    public static void make_user() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese nombre de usuario");
        String userName= scanner.nextLine();
        //Scannea si es administrador o usuario normal
        System.out.println("Ingrese el rol definido para el usuario: ");
        System.out.println("(1) Administrador");
        System.out.println("(2) Usuario Normal");
        String userRol= scanner.nextLine();

    }

    public static void enter_user() {


    }

    //Crea un chatbot
    public static Chatbot_124667593_MUNOZ_CARMONA make_chatbot() {
        List<Flow_124667593_MUNOZ_CARMONA> flujos = new ArrayList<>();
        Flow_124667593_MUNOZ_CARMONA flujo;
        //Se ingresa por consola flujo
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese ID del chatbot");
        int id_chatbot= scanner.nextInt();
        System.out.println("Ingrese en nombre del Chatbot");
        String name_chatbot= scanner.nextLine();
        System.out.println("Ingrese mensaje de bienvenida del chatbot");
        String msg_chatbot= scanner.nextLine();
        System.out.println("Ingrese startFlowID");
        int startFlowID_cb= scanner.nextInt();
        //Abajo: while para llenar la flujos
        System.out.println("Deseas ingresar un flujos?  Si (Marca 1) / No (Marca 2) ");
        int var1 = scanner.nextInt();
        while (var1 == 1){
            flujo=make_flow();
            flujos.add(flujo);
            System.out.println("Deseas ingresar otro flujo?  Si (Marca 1) / No (Marca 2) ");
            int var10 = scanner.nextInt();
            if (var10==1) {
                var1=1;
            }
            else { var1=2;}
        }
        return new Chatbot_124667593_MUNOZ_CARMONA(id_chatbot, name_chatbot, msg_chatbot, startFlowID_cb, flujos);
    }


    //Crea un flujo
    public static Flow_124667593_MUNOZ_CARMONA make_flow() {
        List<Option_124667593_MUNOZ_CARMONA> opciones = new ArrayList<>();
        Option_124667593_MUNOZ_CARMONA op;
        //Se ingresa por consola flujo
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese Id del Flow");
        int id_flow= scanner.nextInt();
        System.out.println("Ingrese mensaje");
        String msg_flow= scanner.nextLine();
        //Abajo: while para llenar la opciones
        System.out.println("Deseas ingresar una opcion?  Si (Marca 1) / No (Marca 2) ");
        int var2 = scanner.nextInt();
        while (var2 == 1){
            op=make_option();
            opciones.add(op);
            System.out.println("Deseas ingresar otra opcion?  Si (Marca 1) / No (Marca 2) ");
            int var10 = scanner.nextInt();
            if (var10==1) {
                var2=1;
            }
            else { var2=2;}
        }
        return new Flow_124667593_MUNOZ_CARMONA(id_flow, msg_flow, opciones);
    }


    //Crea una opcion
    public static Option_124667593_MUNOZ_CARMONA make_option() {
        List<String> keywords = new ArrayList<>();
        //Se ingresa por consola opcion
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
            if (var10==1) {
                var3=1;
            }
            else { var3=2;}
        }
        return new Option_124667593_MUNOZ_CARMONA(code, msg_opcion, codeLinkCb, codeLinkFl, keywords );
    }



    //-----------------------------------------------------------------------------------------------------------------
}