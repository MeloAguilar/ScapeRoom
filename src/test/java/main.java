import java.util.Scanner;

public class main extends EleccinesPlantaBaja{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean finDelJuego = false;
        String inicio;
        String inicioDelJuego;
        while(!finDelJuego){
            System.out.println("¿Deseas comenzar la historia?");
            System.out.println("[si]  [no]");
        inicioDelJuego = sc.nextLine();
        switch (inicioDelJuego) {
            case "si":
                Plantabaja.inicioSI();
                EleccinesPlantaBaja.switchInicial();
                break;
            case "no":
                Plantabaja.inicioNO();
                finDelJuego = true;
                break;
        }
        }
    }
    }



