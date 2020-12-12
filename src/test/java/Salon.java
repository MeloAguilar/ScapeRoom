import java.util.Scanner;

public class Salon {
//Aquí tenemos la llamada a los lugares del salon
//Primero se llama a entradaSalon.
//Mediante
public static void lugaresSalon() {
    Scanner sc = new Scanner(System.in);
    String eleccionesSalon;
    System.out.println("¿Donde quieres acercarte?");
    System.out.println("[cuadros] [mesa] [dibujos]");
    eleccionesSalon = sc.nextLine();
    if (eleccionesSalon.equals("cuadros") || eleccionesSalon.equals("mesa") || eleccionesSalon.equals("dibujos")) {
//Si la eleccion es salir volverá a la entrada

        switch (eleccionesSalon) {
            case "cuadros":
                Salon.salonCuadros();
                Salon.cajaFuerte();
                break;
            case "mesa":
                Salon.salonMesa();
                lugaresSalon();
                break;
            case "dibujos":
                Salon.salonDibujos();
                Salon.lugaresSalon();
                break;
        }
    }else if(eleccionesSalon.equals("salir")){
        System.out.println("[salon]  [garaje]  [escaleras]");
            EleccinesPlantaBaja.switchInicial();

    } else {
        lugaresSalon();
    }
    return;

}

    //Aquí se llama al inicio del salon.
    public static String entradaSalon() {
        return "Abres ambas puertas y crees poder " +
                "ver el polvo revolotear por el aire,\n " +
                "además de nuevamente ese olor a humedad y a " +
                "cerrado insoportable. Intentas aclarar la vista, \n" +
                "ya que está muy oscuro. Puedes distinguir unos cuadros en la " +
                "pared del fondo, en el centro de la sala.\n " +
                "En otra pared puedes ver un corcho con distintos papeles colgados.\n " +
                "Por otro lado, Hay varios documentos esparcidos por " +
                "la mesa y el sofá, están todos arrugados.";
    }

    //Aquí se llama al metodo de la mesa
    public static void salonMesa() {
        System.out.println("Das unos pasos y te agachas junto a la mesa,\n " +
                "estirando los papeles para intentar leer algo...\n" +
                "\n" +
                "(tú)- son fotocopias de un anuncio de venta de la casa… \n" +
                "pero en todas aparecen tachones y frases como “Bienvenido al infierno”. \n" +
                "Un escalofrío te recorre mientras lo lees y te levantas con rapidez. \n" +
                "Antes de alejarte, ves un post-it pegado a la mesa, en el que pone “+17590”");
        salonElecciones();
        return;
    }

    public static void salonElecciones() {
        System.out.println("¿Donde quieres acercarte?");
        System.out.println("[cuadros] [mesa] [dibujos]");
        return;
    }

    public static void salonDibujos() {
        System.out.println("Te acercas a los dibujos que hay colgados en el corcho. \n" +
                "Puedes ver animales y arcoíris dibujados de forma infantil, \n" +
                "sin embargo, hay un dibujo que te llama la atención: \n" +
                "Uno de un niño que va de la mano de un borrón negro con ojos, \n" +
                "además se puede ver escrito J + A. En el borde del corcho \n" +
                "se encuentra algo grabado: -10000");
        salonElecciones();
        return;
    }

    public static void salonCuadros() {
        System.out.println("Al acercarte, puedes ver que son unas fotos de cinco niños. " +
                "Están llenos de polvo, tanto que casi no se pueden visualizar bien los rostros infantiles.\n " +
                "Además, el cuadro del centro parece a punto de caerse. \n" +
                "En un intento de acercar tu mano el cuadro cae al suelo sin darte tiempo para reaccionar, \n" +
                "por lo que el marco se rompe. Delante de ti se descubre una caja fuerte \n" +
                "con un código de cinco dígitos, tal vez haya algo que pueda servirte. \n" +
                "De todas formas, te agachas para recoger el cuadro.");
        System.out.println("(tú) Ahora puedo ver mejor la foto...\n" +
                "¿Por qué me suena este chico?...");
        System.out.println("¿Debería sonarme?");
        System.out.println("Detrás de la foto puedes ver una fecha escrita: 1995");
        cajaFuerte();
        salonElecciones();
        EleccinesPlantaBaja.inventario();
        return;

    }

    public static void cajaFuerte() {
        Scanner sc = new Scanner(System.in);
        String eleccionCajaFuerte;
        boolean linterna;
        int pilasLinterna = 10;
        EleccinesPlantaBaja.inventario();
        eleccionCajaFuerte = sc.nextLine();
        switch (eleccionCajaFuerte) {
            case "probar":
                pilasLinterna--;
                System.out.println("Hay una caja fuerte tras el cuadro central\n" +
                        "Parece que es un código numérico.");
                System.out.println("(tú)Probaré con...");
                int numeroSecreto = 9585, contraseña;
                contraseña = sc.nextInt();
                //Si aciertas el número secreto te darán la linterna, algo bastante preciado en este juego
                //La linterna e el método de este juego para contabilizar las acciones
                //Sin la linterna el jugador no puede sobrevivir mas de 3 acciones

                System.out.println("Pones el código en la caja fuerte y " +
                        "se escucha un chasquido que indica que está abierta, \n" +
                        "Abres despacio la puerta para asegurarte de que no " +
                        "se levante más polvo del que ya hay en la habitación\n" +
                        "Metes la mano y sacas una linterna, suspirando agradecido. Ves un bulto al fondo\n" +
                        "Intentas alcanzarlo y cuando lo sacas puedes ver que es una especie de muñeca hecha con ramas. " +
                        "...como si fuera para algún tipo de ritual...");
                System.out.println("La puerta de la caja fuerte tiene el número 7 grabado en su interior");
                System.out.println("Inexplicable... La muñeca se resbala de tus manos y cae al suelo\n" +
                        "a la vez que escuchas un estruendoso golpe que parece venir de arriba.");
                System.out.println("(Tú)Ni siquiera sé si debería subir, pero algo me llama a hacerlo");
                linterna = true;
                pilasLinterna--;

                break;
            case "pasar":
                System.out.println("Es mejor que siga buscando");
                salonElecciones();
                entradaSalon();
                break;
        }
    }
}
