import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String salasPlantaBaja;
        Plantabaja.plantaBaja();
        salasPlantaBaja = sc.nextLine();
        while (salasPlantaBaja != "salir") {
            switch (salasPlantaBaja) {
                case "salon":
                    Salon.lugaresSalon();
                    break;
                case "garaje":
                    break;
                case "escaleras":
                    break;
            }
        }
    }
}


