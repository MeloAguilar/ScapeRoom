import java.util.Scanner;

public class EleccinesPlantaBaja extends Salon {
    public static void switchInicial() {
        Scanner sc = new Scanner(System.in);
        String entrada;
        entrada = sc.nextLine();
        if (entrada.equals("salon") || entrada.equals("garaje") || entrada.equals("escaleras")|| entrada.equals("inventario")) {
            switch (entrada) {
                case "inventario":
                    inventario();
                case "salon":
                    System.out.println(Salon.entradaSalon());
                    Salon.lugaresSalon();
                    break;
                case "garaje":

                    break;
                case "escaleras":


                    break;

            }
        } else {
            System.out.println("Elige una zona válida");
            System.out.println("[salon]  [garaje]  [escaleras]");
            EleccinesPlantaBaja.switchInicial();
        }

        return;
    }

    public static void inventario() {
        Scanner sc=new Scanner(System.in);
        int pilasLinterna = 10, cordura = 100;
        boolean pistola = false, linterna = false, llavePequeña = false, llaveFinal = false, palanca = false, fotoLavabo = false,
                llaveEscalera = false, pastillaCordura = false, llavesCoche = false, finDelJuego = false;
        System.out.println("pilas: " + pilasLinterna);
        System.out.println("cordura: " + cordura);
        if (linterna) {
            System.out.println("linterna");
        }
        if (llavesCoche) {
            System.out.println("llave coche");
        }
        if (llaveEscalera) {
            System.out.println("llave escalera");
        }
        if (llavePequeña) {
            System.out.println("llave pequeña");
        }
        if (pistola) {
            System.out.println("pistola");
        }
        if (pastillaCordura) {
            char usarAdrenalina;
            System.out.println("adrenalina");
            System.out.println("¿usar?");
            System.out.println("[si]  [no]");
            usarAdrenalina = sc.nextLine().charAt(0);
            switch (usarAdrenalina) {
                case 's':
                    if (cordura < 80) {
                        pilasLinterna--;
                        cordura = 100;
                        System.out.println("Recuperaste la cordura al máximo");
                        pastillaCordura = false;
                    } else {
                        System.out.println("En realidad no creo que lo necesite ahora");
                    }
                    break;
                case 'n':
                    System.out.println("Sí, en verdad debería dejarlo para cuando lo necesite");
                    break;
            }
        }
    }
}