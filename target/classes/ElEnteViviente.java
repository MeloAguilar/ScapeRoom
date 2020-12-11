

import java.util.Scanner;

public class ElEnteViviente {
    public static void main(String[] args) {
        //En este juego responderas por teclado con las opciones expuestas en los corchetes.
        //Hay varios requisitos. Para poder llegar a la planta de arriba tendrás que encontrar 3 objetos.
        //La linterna, las llaves del coche y la llave de la segunda planta.
        //Para terminar el juego deberás encontrar como abrir la puertade la izquierda.
        //La llave pequeña y la palanca.
        //No hay un único final. Cuando abras la puerta final existen 6 finales malos y uno no tan malo.
        System.out.println("Estás en clase y te llega un Whatsapp de tu mejor amigo: es un audio donde \n" +
                " se escuchan gritos. Segundos después, te envía su ubicación en tiempo real. En el mapa \n" +
                " consigues ver que se encuentra en una casa a las afueras del pueblo, que parece abandonada. \n" +
                "Preocupado, llamas a la policía sin suerte pues, al no haber pasado 72 horas desde su desaparición, \n" +
                "te dicen que intentes ponerte en contacto con él o vayas a verle a casa antes de lanzar la alarma. \n" +
                "Llamas a sus padres pero no contestan al teléfono así que decides ir a aquella casa que aparecía \n" +
                "en su ubicación. Puede que esté en problemas \n" +
                "\n" +
                "Abres la puerta y entras. Esta se cierra tras de ti con un portazo\n" +
                "......\n" +
                "...");
        System.out.println("-¿Qué haría Josh aquí?");
        String eleccionEntrada;
        boolean pistola = false, linterna = false, llavePequeña = false, llaveFinal = false, palanca = false, fotoLavabo = false,
                llaveEscalera = false, pastillaCordura = false, llavesCoche = false, finDelJuego = false;
        int habitacion = 0;
        Scanner sc = new Scanner(System.in);
        int pilasLinterna = 10, cordura = 100;
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        //Comenzaremos el juego con una pequeña introduccion
        System.out.println("INICIO DEL JUEGO\n" +
                "*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        System.out.println("Instrucciones");
        System.out.println("-Tu vitalidad va guiada por la cordura.");
        System.out.println("-Comienzas con 100 puntos de cordura.");
        System.out.println("-Para decidir el camino escribe en pantalla cualquiera de las opciones entre corchetes.");
        System.out.println("-La linterna es un item MUY importante.");
        System.out.println("-La linterna funciona a pilas, comenzarás con 10 que se irán gastando mediante avances por la casa.");
        System.out.println("-Podrás encontrar pilas para la linterna por la casa.");
        System.out.println("-Hay al menos 10 finales diferentes.");
        System.out.println("-Elige con lógica tus opciones si no quieres morir antes de tiempo.");
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        String inicio;

        inicio = sc.nextLine();
        while (!finDelJuego) {

                    while (pilasLinterna > 0 && cordura > 0) {
                        if (pilasLinterna <= 0 || cordura <= 0) {
                            finDelJuego = true;
                        } else {

                            eleccionEntrada = sc.nextLine();
                            //Aquí encontraremos el inventario
                            if (eleccionEntrada.equals("cosas")) {
                                System.out.println("pilas: " + pilasLinterna);
                                System.out.println("cordura: " + cordura);
                                if (linterna == true) {
                                    System.out.println("linterna");
                                }
                                if (llavesCoche == true) {
                                    System.out.println("llave coche");
                                }
                                if (llaveEscalera == true) {
                                    System.out.println("llave escalera");
                                }
                                if (llavePequeña == true) {
                                    System.out.println("llave pequeña");
                                }
                                if (pistola == true) {
                                    System.out.println("pistola");
                                }
                                if (pastillaCordura == true) {
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
                                    }//Fin_ifLlavesCoche
                                }//Fin_ifLinterna
                            }//Fin_Inventario
                            else {
                                //Las escaleras estarán cerradas hasta que encontremos la llave Escaleras(coche)
                                switch (eleccionEntrada) {
                                    case "escaleras":
                                        while (!finDelJuego) {
                                            if (!llaveEscalera) {
                                                pilasLinterna--;
                                                //Cuando consigamos la llave Escalera podremos subir a la segunda planta
                                            } else if (llaveEscalera) {

                                                //Elegiremos entre las cuatro habitaciones y volveremos atrás cuando terminemos los acertijos de cada una
                                                //Cuando sepamos donde está Josh podremos decidir como salir de la casa
                                                System.out.println("Comienzas a subir las escaleras a la segunda planta y siente como prácticamente\n" +
                                                        "toda la casa cruje bajo tus pies. Abres despacio la puerta y te encuentras\n" +
                                                        "con una especie de descansillo que continúa con un pasillo.\n" +
                                                        "El olor a humedad de la planta baja ha sido sustituido por un fuerte olor a azufre\n" +
                                                        "que te hace sentir más mareado a cada instante...");
                                                System.out.println("Hay cuatro habitaciones, dos a la derecha, una al final del pasillo y una a la izquierda. \n" +
                                                        "Todas las puertas están cerradas, aunque la que llama la atención es la de la izquierda, \n" +
                                                        "que está sellada con unos tablones de madera. \n" +
                                                        "Aún no has encontrado a Josh y empiezas a dudar que tal vez ni siquiera esté ya en la casa. \n" +
                                                        "No obstante, hace un rato que sientes que no estás solo...");
                                                System.out.println("(tú)¿Dónde debería ir?");
                                                System.out.println("[der1]  [der2]  [delante]  [izq] \n" +
                                                        "Inventario [cosas]");
                                                while (finDelJuego == false) {
                                                    String descansillo;

                                                    descansillo = sc.nextLine();
                                                    if (descansillo.equals("cosas")) {
                                                        System.out.println("pilas: " + pilasLinterna);
                                                        System.out.println("cordura: " + cordura);
                                                        if (linterna == true) {
                                                            System.out.println("linterna");
                                                        }
                                                        if (llavesCoche == true) {
                                                            System.out.println("llave coche");
                                                        }
                                                        if (llaveEscalera == true) {
                                                            System.out.println("llave escalera");
                                                        }
                                                        if (llavePequeña == true) {
                                                            System.out.println("llave pequeña");
                                                        }
                                                        if (pistola == true) {
                                                            System.out.println("pistola");
                                                        }
                                                        if (palanca == true) {
                                                            System.out.println("palanca");
                                                        }
                                                        if (fotoLavabo == true) {
                                                            char leerCarta;
                                                            System.out.println("¿Quieres leer el reverso de la carta?");
                                                            System.out.println("SI[s]    NO[n]");
                                                            leerCarta = sc.nextLine().charAt(0);
                                                            switch (leerCarta) {
                                                                case 's':
                                                                    System.out.println("Joshua Howarthson\n" +
                                                                            "16 de Diciembre de 2002");
                                                                    System.out.println(".............");
                                                                    System.out.println("No puede ser...\n" +
                                                                            ".....\n" +
                                                                            "Estos son los...¿abuelos de Josh?");
                                                                    break;
                                                                case 'n':
                                                                    System.out.println("Mejor la guardo");
                                                                    break;
                                                            }
                                                        }
                                                        if (pastillaCordura == true) {
                                                            char usarPastillaCordura;
                                                            System.out.println("Pastillas de Cordura");
                                                            System.out.println("¿usar?");
                                                            System.out.println("[si]  [no]");
                                                            usarPastillaCordura = sc.nextLine().charAt(0);
                                                            switch (usarPastillaCordura) {
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
                                                            }//Fin_Switch_ChutarseAdrenalina
                                                        }//Fin_ifChutarseAdrenalina
                                                        System.out.println("[der1]  [der2]  [delante]  [izq] \n" +
                                                                "Inventario [cosas]");
                                                    }//SEGUNDA PLANTA
                                                    if (cordura <= 0 || pilasLinterna <= 0) {
                                                        finDelJuego = true;
                                                    } else {

                                                        switch (descansillo) {

                                                            case "der1":
                                                                if (pastillaCordura) {
                                                                    System.out.println("No creo que haya nada más aquí...");
                                                                } else {
                                                                    char hab1;
                                                                    System.out.println("Abres la puerta de la habitación y te encuentras con el dormitorio principal de la casa. \n" +
                                                                            "Te acercas al tocador que preside la habitación y ves varias fotos encima del mismo. \n" +
                                                                            "Las observas con detenimiento las diversas imágenes. Son fotos familiares y, \n" +
                                                                            "en su mayoría, aparecen una pareja de ancianos. \n" +
                                                                            "Apartas varias fotos que tapan otras de abajo y encuentras lo que parecía que estabas buscando \n" +
                                                                            "sin ni siquiera saberlo.");
                                                                    System.out.println("(tú) ¡Es Josh! Aunque parece bastante más joven de lo que es ahora.\n " +
                                                                            "Aparece en la foto acompañado de la pareja de ancianos… \n" +
                                                                            "¿Podrían ser sus abuelos?");
                                                                    System.out.println("(tú)¿Es esta la casa de los abuelos de Josh? \n" +
                                                                            "¿Por eso ha venido aquí?");
                                                                    System.out.println("En el cajón del tocador encuentras un bote de pastillas con el número 7 escrito con un rotulador, \n" +
                                                                            "por lo que no puedes ver de que medicamento se trata. \n" +
                                                                            "Parecen calmantes y eso te podría venir bien. \n" +
                                                                            "Aún así, no estás seguro de qué hacer.");
                                                                    System.out.println("¿Quieres llevarte el bote?");
                                                                    System.out.println("[si]  [no]");
                                                                    hab1 = sc.next().charAt(0);
                                                                    switch (hab1) {
                                                                        case 's':
                                                                            pilasLinterna--;
                                                                            pastillaCordura = true;
                                                                            if (linterna) {
                                                                                System.out.println("Conseguiste un bote de pildoras bastante extraño");
                                                                                System.out.println("Vuelves al descansillo");
                                                                                System.out.println("[der1] [der2] [delante] [izq] [cosas]");
                                                                            } else {
                                                                                cordura -= 50;
                                                                                System.out.println("El Ente te atraviesa y caes de espaldas al suelo \n" +
                                                                                        "Pierdes 50 de cordura \n" +
                                                                                        "Recuerda, los entes temen la luz.");
                                                                                System.out.println("Vuelves al descansillo");
                                                                                System.out.println("[der1] [der2] [delante] [izq] [cosas]");
                                                                            }
                                                                            break;
                                                                        case 'n':
                                                                            pilasLinterna--;
                                                                            System.out.println("Es verdad... mejor no jugarsela...");
                                                                            System.out.println("Vuelves al descansillo");
                                                                            System.out.println("[der1] [der2] [delante] [izq] [cosas]");
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            //Te echa si no aciertas en la habitacion 2. Arreglar
                                                            case "der2":
                                                                if (llavePequeña) {
                                                                    System.out.println("No parece que haya nada más aquí...");
                                                                } else {
                                                                    String camas;
                                                                    System.out.println("Abres la puerta y entras a una habitación con dos literas, es bastante grande y parece ser de niños...\n" +
                                                                            "Hay bastantes juguetes viejos tirados por el suelo. \n" +
                                                                            "¿Quieres acercarte y buscar en las camas?");
                                                                    System.out.println("[si]  [no]");
                                                                    camas = sc.nextLine();
                                                                    while (!llavePequeña) {
                                                                        switch (camas) {
                                                                            case "si":
                                                                                String literas;
                                                                                System.out.println("¿quieres acercarte a la litera de la derecha o de la izquierda?");
                                                                                System.out.println("[izq]  [der]");
                                                                                literas = sc.nextLine();
                                                                                switch (literas) {
                                                                                    case "der":
                                                                                        System.out.println("te acercas a las camas y notas incluso más frío que antes, cuando buscas bajo la cama derecha encuentras un pequeño libro que pesa bastante");
                                                                                        System.out.println("(tú)Parece que tiene un pequeño candado bastante fuerte....\n" +
                                                                                                "Tiene tres ruedas numeradas del 1 al 9...");
                                                                                        int numeroLibro = 793, intentoLibro;
                                                                                        System.out.println("Comienzas a girar las ruedas de el candado: ");
                                                                                        intentoLibro = sc.nextInt();
                                                                                        if (intentoLibro == numeroLibro) {
                                                                                            System.out.println("Abres el libro y dentro encuentras una llave pequeña \n" +
                                                                                                    "con una cadena\n" +
                                                                                                    "....¿Para qué servirá la llave?... \n" +
                                                                                                    "Coges la llave y vuelves al descansillo");
                                                                                            pilasLinterna--;
                                                                                            llavePequeña = true;
                                                                                            System.out.println("Vuelves al descansillo");
                                                                                            System.out.println("[der1] [der2] [delante] [izq] [cosas]");
                                                                                        } else {
                                                                                            System.out.println("El libro no se abre... Probaré con otro código");
                                                                                            pilasLinterna--;
                                                                                        }
                                                                                        break;
                                                                                    case "izq":
                                                                                        System.out.println("Notas algo entre las sábanas...\n" +
                                                                                                "(tú)Parece... ¿Una pistola?\n" +
                                                                                                "¿Qué hará una pistola aquí?");
                                                                                        System.out.println("Recoges la pistola que había entre las mantas");
                                                                                        pistola = true;
                                                                                        break;
                                                                                }
                                                                                break;
                                                                            case "no":
                                                                                System.out.println("(tú)No creo que pueda pasar nada bueno si me acerco más");
                                                                                System.out.println("[der1]  [der2]  [delante]  [izq]" +
                                                                                        "\n INVENTARIO[cosas]");
                                                                                break;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                            case "delante":
                                                                System.out.println("Caminas hasta el fondo del pasillo y, al pasar por la puerta cerrada con las tablas de madera, un mal presentimiento recorre tu cuerpo.\n " +
                                                                        "Abres la puerta del fondo y descubres un baño prácticamente destrozado y con un fuerte olor a pútrido, que se mezcla con el ambiente y olores que hay por el pasillo.\n " +
                                                                        "Intentas taparte la nariz con tu camiseta y entras para ver mejor que hay. El lavabo tiene un papel atrancado en el desagüe y justo arriba del mismo tienes un espejo-botiquín.\n " +
                                                                        "El olor insoportable parece venir de la bañera, pero no puedes ver que hay porque la cortina de la misma tapa toda tu visión.");
                                                                System.out.println("¿Dónde prefieres mirar?");
                                                                while (!palanca && cordura > 0 && pilasLinterna > 0) {
                                                                    finDelJuego = false;
                                                                    String baño;
                                                                    if (llaveFinal) {
                                                                        System.out.println("No creo que quede nada más que ver aquí.");
                                                                    } else {
                                                                        String acertijoFinal;

                                                                        System.out.println("[bañera]  [lavabo]  [espejo]");
                                                                        acertijoFinal = sc.nextLine();
                                                                        if (pilasLinterna > 0 && cordura > 0) {
                                                                            switch (acertijoFinal) {
                                                                                case "bañera":
                                                                                    String inspeccionBañera;
                                                                                    System.out.println("¿Prefieres correr la cortina rápidamente o inspeccionar al rededor de la bañera?");
                                                                                    System.out.println("[rapido]   [inspeccion]");
                                                                                    inspeccionBañera = sc.nextLine();
                                                                                    if (inspeccionBañera.equals("rapido")) {
                                                                                        System.out.println("Escuchas un grito estremecedor y la linterna se te cae al suelo\n" +
                                                                                                "Sientes como tu cuerpo se entumece y te mareas mucho...");
                                                                                        pilasLinterna--;
                                                                                        cordura -= 70;
                                                                                        if (cordura <= 0 || pilasLinterna <= 0) {
                                                                                            finDelJuego = true;
                                                                                        }
                                                                                    } else if (inspeccionBañera.equals("inspeccion")) {
                                                                                        System.out.println("Mirando junto a la bañera encuentras una palanca oxidada");
                                                                                        System.out.println("[der1]  [der2] [delante]  [izq]  [cosas]");
                                                                                        palanca = true;

                                                                                    }

                                                                                    break;
                                                                                case "lavabo":
                                                                                    String inspeccionLavabo;
                                                                                    System.out.println("Te acercas al lavabo y analizas si puedes recuperar el papel. " +
                                                                                            "Parece que sí, pero vas a tener que tirar para sacarlo.");
                                                                                    System.out.println("[tirar]  [pasar]");
                                                                                    inspeccionLavabo = sc.nextLine();
                                                                                    if (inspeccionLavabo.equals("tirar")) {
                                                                                        System.out.println("Tiras del papel con firmeza, procurando no romperlo. \n" +
                                                                                                "Al sacarlo del hueco, empieza a borbotear agua negra y sucia que te hace sentir arcadas.\n " +
                                                                                                "Te separas del lavabo para ver qué contenía el papel que has cogido.\n" +
                                                                                                "\n" +
                                                                                                "(tú)Parece una carta… esto sí es algo que no se encuentra normalmente.\n" +
                                                                                                "\n" +
                                                                                                "“Papá, lo siento, me duele decirte esto pero no vamos a ir allí nunca más. \n" +
                                                                                                "Tenéis que marcharos de esa casa si queréis seguir viendo a vuestros nietos. \n" +
                                                                                                "Aunque Josh no tenga la misma reacción que los míos mi hermana, Leah, está de acuerdo conmigo. \n" +
                                                                                                "Tenéis que salir de allí, pero mientras que mamá siga negándose a mudarse, \n" +
                                                                                                "tendremos que buscar otra forma de que veáis a los niños.\n" +
                                                                                                "Lo siento, papá.\n" +
                                                                                                "Vivian.”\n" +
                                                                                                "\n" +
                                                                                                "(tú)Josh, otra vez… Y Leah es su madre, así que seguro que se refiere al Josh que yo conozco. \n" +
                                                                                                "¿Por qué la abuela de Josh no quería irse de la casa para poder ver a sus nietos? \n" +
                                                                                                "¿Qué la apegaba tanto a esta casa? \n" +
                                                                                                "¿Qué había en esta casa para que los niños se asustaran tanto? \n" +
                                                                                                "Y… la peor pregunta: ¿Por qué Josh no le tenía miedo a lo que fuese que pasaba aquí, como al resto de niños?\n");
                                                                                        pilasLinterna--;
                                                                                    } else if (inspeccionLavabo.equals("pasar")) {
                                                                                        System.out.println("(tú) Paso… prefiero ahorrarme el disgusto de lo que puede salir de ahí. " +
                                                                                                "Tampoco me hace falta saber todo lo que está pasando.");
                                                                                        pilasLinterna--;
                                                                                    }
                                                                                    break;
                                                                                case "espejo":
                                                                                    String sobreHospital;
                                                                                    String inspeccionEspejo;
                                                                                    System.out.println("Te pones frente al espejo y te observas durante un par de segundos.\n" +
                                                                                            " Tal vez lleves una media hora dentro de esa puta casa, pero tienes la sensación de que han pasado varios días.\n " +
                                                                                            "Tus ojos se ven cansados y parece que tienes la cara consumida y deshidratada. \n" +
                                                                                            "Puedes ver el pasillo detrás de ti y, por un momento, parece que los tablones de madera han desaparecido…\n" +
                                                                                            "\n" +
                                                                                            "Te giras con rapidez, pero sigue todo exactamente igual a como estaba. Los tablones aún están ahí.\n" +
                                                                                            "\n" +
                                                                                            "Vuelves a centrarte en el espejo y lo abres para ver si encuentras algo en el botiquín. \n" +
                                                                                            "Al fondo del mismo, puedes ver que está escrito con arañazos la frase: \n" +
                                                                                            "“Josh, te echo de menos” de forma bastante tétrica y, justo abajo de esto, un sobre del hospital.\n");
                                                                                    System.out.println("¿Quieres abrir el sobre del hospital?");
                                                                                    System.out.println("[si]  [no]");
                                                                                    sobreHospital = sc.nextLine();
                                                                                    switch (sobreHospital) {
                                                                                        case "si":
                                                                                            System.out.println("(tú)- Es un acta de defunción…: “Linda Howarthson 13/6/19. Paro cardíaco”. \n" +
                                                                                                    "La abuela de Josh murió hace algo más de un año. Según el informe, pasó su último día agonizando y tosiendo sangre, \n" +
                                                                                                    "además de aparecerle diversos sarpullidos en la piel pero que, aún así, “se reía de vez en cuando, exclamando: ¡Por fin seré tuya, por fin estaremos juntos! \n" +
                                                                                                    "Solo nos falta él.” Según lo que pone aquí, se supuso que estaba delirando por los medicamentos y el dolor aunque, finalmente, a las 3:00 am, murió con un gesto de locura y éxtasis.\n" +
                                                                                                    "\n" +
                                                                                                    "(tú)Josh nunca me contó nada de esto, aunque recuerdo que por aquellas fechas dijo estar malo y no apareció por clase en más de una semana. \n" +
                                                                                                    "¿Qué le haría no contarlo?\n");
                                                                                            break;
                                                                                        case "no":
                                                                                            System.out.println("En realidad no necesito saber más...");
                                                                                            break;
                                                                                    }
                                                                                    System.out.println("Dentro hay 3 pilas");
                                                                                    pilasLinterna += 3;
                                                                                    fotoLavabo = true;
                                                                                    break;
                                                                            }
                                                                            continue;

                                                                        } else {
                                                                            finDelJuego = true;
                                                                        }
                                                                    }
                                                                    break;
                                                                }
                                                                break;
                                                            case "izq":
                                                                System.out.println("Desde fuera escuchas voces... No parece que sean gritos, sino más bien");
                                                                System.out.println("...¿risas?...");
                                                                if (!llavePequeña) {
                                                                    System.out.println("Podría quitar los tablones pero la puerta también está cerrada con llave");
                                                                    System.out.println("¿Dónde quieres ir?");
                                                                    System.out.println("[der1]  [der2]  [izq]  [delante]\n" +
                                                                            "INVENTARIO[cosas]");
                                                                } else if (palanca && llavePequeña) {
                                                                    String abrirPuertaFinal;
                                                                    System.out.println("Creo que la palanca me servirá... menos mal que me la llevé");
                                                                    System.out.println("¿Forzar la puerta con la palanca?");
                                                                    System.out.println("SI[s]   NO[n]");
                                                                    abrirPuertaFinal = sc.nextLine();
                                                                    switch (abrirPuertaFinal) {
                                                                        case "s":
                                                                            String josh;
                                                                            System.out.println("Abres la puerta lentamente gracias a la palanca");
                                                                            System.out.println("-Estoy cansadísimo joder");
                                                                            System.out.println("La puerta está cerrada con llave...");
                                                                            System.out.println("Parece que hay alguien tras la puerta");
                                                                            System.out.println("JOSH!!!! ¿ESTÁS AHÍ?");
                                                                            System.out.println("(Josh)-¿Qué coño haces aquí tío?\n" +
                                                                                    "No te dije que no me siguieses?\n" +
                                                                                    "Siempre has sido tan gilipollas...");
                                                                            System.out.println("(Protagonista)-¿Pero de qué coño hablas " +
                                                                                    "si fuiste tu quien me mandaste esta ubicación\n" +
                                                                                    "Joder, Josh, he venido aquí a por tí");
                                                                            pilasLinterna--;
                                                                            System.out.println("......¿Qué debería hacer?");
                                                                            System.out.println("[apuntar]  [irse] ");
                                                                            josh = sc.nextLine();
                                                                            switch (josh) {
                                                                                case "apuntar":
                                                                                    if (pistola) {
                                                                                        String disparoFinal;
                                                                                        System.out.println("¿Apuntar a Josh, al techo para asustarlo o al ente?");
                                                                                        System.out.println("[josh]  [techo]  [ente]");
                                                                                        disparoFinal = sc.nextLine();
                                                                                        switch (disparoFinal) {
                                                                                            case "josh":
                                                                                                String desorientadoDescansillo;
                                                                                                System.out.println("Apuntas al pecho de Josh para intentar intimidarlo" +
                                                                                                        "y que te haga caso... \n" +
                                                                                                        "Pero en lugar de eso se avalanza encima de tí....\n" +
                                                                                                        "........\n" +
                                                                                                        "B\n" +
                                                                                                        "O\n" +
                                                                                                        "O\n" +
                                                                                                        "M\n");
                                                                                                System.out.println("Te levantas, te pitan los oidos pero corres lo más rápido que puedes\n" +
                                                                                                        "No ves nada y te encuentras desorientado.\n" +
                                                                                                        "¿Dónde crees que deberías ir, delante, derecha o izquierda?");
                                                                                                System.out.println("[delante]  [der]  [izq]");
                                                                                                desorientadoDescansillo = sc.nextLine();
                                                                                                switch (desorientadoDescansillo) {
                                                                                                    case "delante":
                                                                                                        System.out.println("Corriendo en linea recta te chocas contra una pared\n" +
                                                                                                                "Todo se vuelve negro....");
                                                                                                        System.out.println("FIN");
                                                                                                        finDelJuego = true;
                                                                                                        break;
                                                                                                    case "izq":
                                                                                                        System.out.println("A ciegas, entras sin querer en el cuarto de baño mugriento...\n" +
                                                                                                                "Pero esta vez no tienes escapatoria...");
                                                                                                        System.out.println("FIN");
                                                                                                        finDelJuego = true;
                                                                                                        break;
                                                                                                    case "der":
                                                                                                        String eleccionFinal1;
                                                                                                        System.out.println("Sales corriendo hacia la derecha y tropiezas al no notar la falta de suelo...\n" +
                                                                                                                "Ahora solo tienes dos opciones... Intentar saltar los (más o menos) 15 escalones...\n" +
                                                                                                                "O intentar rodar escaleras abajo....");
                                                                                                        System.out.println("[rodar]   [saltar]");
                                                                                                        eleccionFinal1 = sc.nextLine();
                                                                                                        switch (eleccionFinal1) {
                                                                                                            case "rodar":
                                                                                                                System.out.println("Tratas de rodar pero quedas inconsciente en el intento...\n" +
                                                                                                                        "Cuando despiertas estás maniatado...\n" +
                                                                                                                        "Lo último que ves es la cara ensangrentada de tu amigo...\n" +
                                                                                                                        "Con una sontrisa de oreja a oreja.");
                                                                                                                System.out.println("FIN");
                                                                                                                finDelJuego = true;
                                                                                                                break;
                                                                                                            case "saltar":
                                                                                                                String muerteTablones;
                                                                                                                System.out.println("Consigues saltar los escalones y te chocas con la pared,\n" +
                                                                                                                        "Que está bastante cerca de la escalera");
                                                                                                                System.out.println("Consigues llegar a la puerta, pero te giras un segundo....");
                                                                                                                System.out.println("¿Correr sin mirar atrás.... o cerrar la puerta?");
                                                                                                                System.out.println("[correr]  [cerrar]");
                                                                                                                muerteTablones = sc.nextLine();
                                                                                                                switch (muerteTablones) {
                                                                                                                    case "correr":
                                                                                                                        System.out.println("Consigues salir de ahí casi ileso pero notas que algo falla...");
                                                                                                                        System.out.println("FIN");
                                                                                                                        finDelJuego = true;
                                                                                                                        break;
                                                                                                                    case "cerrar":
                                                                                                                        System.out.println("Toda la casa tiembla y una viga cae sobre tí...");
                                                                                                                        System.out.println("FIN");
                                                                                                                        finDelJuego = true;
                                                                                                                        break;
                                                                                                                }
                                                                                                                break;
                                                                                                        }//Fin_EleccionFinal1
                                                                                                }
                                                                                                break;
                                                                                            case "techo":

                                                                                                String disparoTecho;
                                                                                                System.out.println("Disparas al techo y Josh se asusta...\n" +
                                                                                                        "Tiras de su brazo, sales corriendo de allí con él.\n" +
                                                                                                        "Se resiste y notas una respiración de angustia frente a tí.\n" +
                                                                                                        "Cuando llegáis a la escalera ves una sombra frente a tí");
                                                                                                System.out.println("¿Qué deberías hacer?");
                                                                                                System.out.println("¿Seguir huyendo y atravesar al fantasmao esconderte en un armario?");
                                                                                                System.out.println("[correr]  [esconderse]");
                                                                                                disparoTecho = sc.nextLine();
                                                                                                switch (disparoTecho) {
                                                                                                    case "correr":
                                                                                                        System.out.println("Conseguís salir de allí los dos vivos...\n" +
                                                                                                                "Aunque Josh no parece él mismo...");
                                                                                                        System.out.println("THE END");
                                                                                                        finDelJuego = true;
                                                                                                        break;
                                                                                                    case "esconderse":
                                                                                                        System.out.println("Encuentras un armario " +
                                                                                                                "y te metes dentro, no sabes donde está Josh\n" +
                                                                                                                "y tu linterna no deja de parpadear...\n" +
                                                                                                                "Josh abre la puerta con una sonrisa de oreja a oreja....");
                                                                                                        System.out.println("FIN");
                                                                                                        finDelJuego = true;
                                                                                                        break;
                                                                                                }//Fin_DisparoTecho
                                                                                                break;
                                                                                            case "ente":
                                                                                                String disparoEnte;
                                                                                                System.out.println("Disparas al ente, la bala lo " +
                                                                                                        "traspasa y mientras este desaparece " +
                                                                                                        "la ventana explota con el balazo y ahora " +
                                                                                                        "ves una opción en saltar por la ventana");
                                                                                                System.out.println("[saltar]  [correr]");
                                                                                                disparoEnte = sc.nextLine();
                                                                                                while (!finDelJuego) {
                                                                                                    switch (disparoEnte) {
                                                                                                        case "saltar":
                                                                                                            System.out.println("Coges de la mano a tu " +
                                                                                                                    "amigo y saltáis por la ventana..");
                                                                                                            System.out.println("FIN");
                                                                                                            finDelJuego = true;
                                                                                                            break;
                                                                                                        case "correr":
                                                                                                            String eleccionCorrerDisparoEnte;
                                                                                                            System.out.println("Salís corriendo por la " +
                                                                                                                    "puerta hacia las escaleras pero, de cara,\n" +
                                                                                                                    "te encuentras con el ente y este " +
                                                                                                                    "se avalanza sobre tí.");
                                                                                                            System.out.println("¿Quieres enfrentarlo o " +
                                                                                                                    "prefieres esquivar?");
                                                                                                            System.out.println("[esquivar]  [enfrentar]");
                                                                                                            eleccionCorrerDisparoEnte = sc.nextLine();
                                                                                                            switch (eleccionCorrerDisparoEnte) {
                                                                                                                case "esquivar":
                                                                                                                    String esquivarEnteDisparoEnte;
                                                                                                                    System.out.println("El fantasma queda atrás " +
                                                                                                                            "y llegais a la puerta principal");
                                                                                                                    System.out.println("¿Cerrar la puerta o " +
                                                                                                                            "correr sin mirar atrás?");
                                                                                                                    System.out.println("[correr]  [cerrar]");
                                                                                                                    esquivarEnteDisparoEnte = sc.nextLine();
                                                                                                                    switch (esquivarEnteDisparoEnte) {
                                                                                                                        case "correr":
                                                                                                                            System.out.println("Salís corriendo de esa maldita casa...\n" +
                                                                                                                                    "Días después Josh desaparece de nuevo...\n" +
                                                                                                                                    "No se le volvió a ver jamás...");
                                                                                                                            finDelJuego = true;
                                                                                                                            break;
                                                                                                                        case "cerrar":
                                                                                                                            System.out.println("Toda " +
                                                                                                                                    "la casa tiembla mientras " +
                                                                                                                                    "cierras la puerta...\n" +
                                                                                                                                    "La fachada se cae sobre ambos...");
                                                                                                                            System.out.println("FIN");
                                                                                                                            finDelJuego = true;
                                                                                                                            break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case "enfrentar":
                                                                                                                    System.out.println("Porque enfrentas a un ente?\n" +
                                                                                                                            "Que creias que iba a pasar?");
                                                                                                                    break;
                                                                                                            }//Fin_SwitchCorrer_DisparoEnte
                                                                                                    }
                                                                                                }//Fin_DisparoFinal
                                                                                                break;
                                                                                        }
                                                                                    }//Fin_IfCogerPistola
                                                                                    else if (!pistola) {
                                                                                        System.out.println("(No tengo una pistola...)");
                                                                                        System.out.println("Josh saca una pistola y te dispara justo en el pecho\n" +
                                                                                                "Lo último que ves es al ente fundiéndose con Josh....");
                                                                                        finDelJuego = true;
                                                                                    }
                                                                                    break;
                                                                                case "irse":
                                                                                    System.out.println("Intentas escapar y te caes de boca al suelo");
                                                                                    System.out.println("FIN");
                                                                                    finDelJuego = true;
                                                                                    break;
                                                                            }//Fin_SwitchJosh
                                                                            if (llavePequeña) {
                                                                            } else {
                                                                                System.out.println("Joder me falta esta llave");
                                                                            }
                                                                            break;
                                                                        case "n":
                                                                            System.out.println("En realidad debería  seguir buscando, seguro que me he dejado algo");

                                                                    }//Fin_SwitchPuertaFinal
                                                                } else if (!palanca) {
                                                                    System.out.println("La puerta está sellada con tablones de madera..\n" +
                                                                            "Seguro que por aquí hay algo con lo que quitar este tapón...");
                                                                    System.out.println("[der1]  [der2]  [delante]  [izq] \n" +
                                                                            "Inventario [cosas]");
                                                                }
                                                                break;
                                                        }//Fin_SwitchDescansillo
                                                    }
                                                }//Fin_Escapar
                                            }//Fin_EscaleraAbierta
                                            break;
                                        }
                                        break;
                                    //GARAJE
                        /*Tendremos que entrar al garaje para encontrar las llaves del coche en la taquilla y la llave de la
                        segunda planta, cuando lo consigamos volveremos a la entrada
                        */
                                    case "garaje":
                                        if (llavesCoche && llaveEscalera) {
                                            System.out.println("Hace demasiado frío aquí... mejor será seguir buscando.");
                                        } else {
                                            String eleccionGaraje1, eleccionGaraje2;
                                            System.out.println("Entras y ves el coche y unas taquillas que están bastante alejadas \n" +
                                                    "de la puerta, totalmente sumidas en la oscuridad \n" +
                                                    ",¿Quieres acercarte a las taquillas o prefieres investigar el coche?");
                                            while (!llaveEscalera && pilasLinterna > 0 && cordura > 0) {
                                                System.out.println("[coche] [taquillas]");
                                                eleccionGaraje1 = sc.nextLine();
                                                switch (eleccionGaraje1) {
                                                    case "coche":
                                                        if (!llavesCoche) {
                                                            System.out.println("Te asomas a la ventanilla del coche e intentas ver el interior. \n" +
                                                                    "Los asientos están destrozados y parece que una colonia de bichos han conquistado el coche como nuevo hábitat.");
                                                        } else if (llavesCoche) {
                                                            String libreta;
                                                            System.out.println("Pruebas a introducirla en la cerradura y, aunque el coche no reacciona de ninguna forma, la puerta se abre.\n " +
                                                                    "Al tirar de ella para asomarte en su interior, escuchas como algunos bichos se esconden entre los recovecos del coche. \n" +
                                                                    "Te armas de valor y coges la libreta del asiento del copiloto, esperando que no haya nada raro dentro. \n" +
                                                                    "Justo antes de incorporarte, ves unas llaves en el suelo del coche, las cuales coges con velocidad.");
                                                            System.out.println("¿Quieres abrir la libreta?");
                                                            System.out.println("[si]  [no]");
                                                            libreta = sc.nextLine();
                                                            switch (libreta) {
                                                                case "si":
                                                                    System.out.println("Abres la libreta con cuidado, pues parece que se va a deshacer en cualquier momento. \n " +
                                                                            "En la portada se puede leer “J. Howarthson”. Al pasar lentamente las páginas, ves que en todas aparece una fecha diferente,\n " +
                                                                            "lo que te hace entender que puede ser una especie de diario. Te diriges a la última página \n" +
                                                                            "y ves que la fecha corresponde a hace poco más de un año. En ella puedes leer:\n" +
                                                                            "\n" +
                                                                            "“Otra noche más en la que no me siento seguro en esta casa. \n" +
                                                                            "Mis hijos han dejado de venir a verme porque temen que a sus hijos les pase algo.\n" +
                                                                            "¿Qué va a pasarles si están con sus abuelos? No permitiría que nada les hiciera daño.\n " +
                                                                            "Sin embargo… Linda cada vez está más perdida… ha perdido aquella sonrisa de la que me enamoré\n " +
                                                                            "y también parece que está perdiendo las ganas de vivir. \n" +
                                                                            "El pequeño Josh es el único que no sale llorando cada vez que viene.\n " +
                                                                            "Más bien, parece que disfruta mucho de estar aquí, pero no entiendo por qué.\n" +
                                                                            "Estoy perdiendo a toda mi familia por culpa de esta casa, debo venderla como sea”.");
                                                                    break;
                                                                case "no":
                                                                    System.out.println("(tú)No tengo tiempo para leer esto...");
                                                                    break;

                                                            }
                                                            llaveEscalera = true;
                                                            System.out.println("Vuelves a la entrada\n" +
                                                                    "[salon]  [garaje]  [escaleras]  INVENTARIO[cosas]");
                                                        }
                                                        break;
                                                    //Si no llevas la linterna lo tendrás jodido, pues hasta cogiendo la derecha te pegará
                                                    case "taquillas":
                                                        System.out.println("Te acercas a las taquillas con cuidado de no resbalar con el aceite\n" +
                                                                "ha derramado el coche por todo el suelo. \n" +
                                                                "Cuando estás lo suficientemente cerca como para poder para poder leer,\n" +
                                                                "descubres que está escrito en la taquilla izquierda LUCIFER y en la derecha LUCIEL.\n" +
                                                                "\n" +
                                                                "¿Cuál prefieres abrir?\n" +
                                                                "[izq]  [der]");
                                                        eleccionGaraje2 = sc.nextLine();
                                                        //Para las decisiones según si el usuario lleva la linterna o no al garaje
                                                        switch (eleccionGaraje2) {
                                                            case "izq":
                                                                if (!linterna) {
                                                                    System.out.println("Al tocar la taquilla sientes como el frío recorre tu cuerpo,\n " +
                                                                            "y un olor a azufre sale del interior. Respirar hondo y coges con \n" +
                                                                            "firmeza la puerta para abrirla pero una fuerza desconocida comienza a \n" +
                                                                            "tirar de tu mano hacia adentro de la misma y tú, \n" +
                                                                            "desesperado, intentas alejarte cuanto antes de la taquilla. \n" +
                                                                            "Te acabas cayendo al suelo cuando la puerta se abre de par en par.\n " +
                                                                            "Jurarías haber visto un rostro en la oscuridad de la taquilla, \n" +
                                                                            "pero intentas pensar que tu imaginación te está jugando una mala pasada");
                                                                    cordura -= 100;
                                                                    pilasLinterna--;
                                                                } else if (linterna) {
                                                                    System.out.println("Sintiéndote seguro de tu elección abres la " +
                                                                            "taquilla y el fuerte olor que desprende te hace toser. \n" +
                                                                            "No te apetece demasiado meter la mano ahí dentro, \n" +
                                                                            "pero puedes divisar algo en el interior de la misma. \n" +
                                                                            "Al meter la mano, sacas las llaves de un coche algo \n" +
                                                                            "oxidadas que llevan un llavero colgado con distintos nombres:\n " +
                                                                            "Molly, Robbie, Anna, Lilly y… ¿Josh?");
                                                                    System.out.println("Hay muchos Josh en este mundo pero, con todo lo que está pasando,\n" +
                                                                            "seguro que se refiere al Josh que yo conozco.\n" +
                                                                            "Sin embargo...¿Quiénes son el resto de personas?\n" +
                                                                            "Josh no tiene hermanos... Esto es muy extraño...");
                                                                    cordura -= 25;
                                                                    pilasLinterna--;
                                                                    System.out.println(cordura);
                                                                }
                                                                break;
                                                            case "der":
                                                                if (!linterna) {
                                                                    System.out.println("Sintiéndote seguro de tu elección abres la taquilla \n" +
                                                                            "y el fuerte olor que desprende te hace toser. \n" +
                                                                            "No te apetece demasiado meter la mano ahí dentro, \n" +
                                                                            "pero puedes divisar algo en el interior de la misma. \n" +
                                                                            "Al meter la mano, sacas las llaves de un coche algo oxidadas \n" +
                                                                            "que llevan un llavero colgado con distintos nombres: \n" +
                                                                            "Molly, Robbie, Anna, Lilly y… ¿Josh? ");
                                                                    cordura -= 90;
                                                                    llavesCoche = true;
                                                                    System.out.println(cordura);
                                                                    pilasLinterna--;
                                                                } else if (linterna) {
                                                                    System.out.println("Has encontrado las llaves del coche dentro de la taquilla \n" +
                                                                            "mmmm... Parece que hay un numero escrito en la puerta [9]");
                                                                    llavesCoche = true;
                                                                    pilasLinterna--;
                                                                }
                                                                break;

                                                        }
                                                        break;
                                                }
                                            }
                                        }
                                        break;
                                    //La primera sala que se debe visitar si se quiere tener oportunidad ante el ente
                                    //Un pequeño acertijo mediante numeros escritos en los cuadros
                                    //Si se acierta el acertijo se abre una caja fuerte
                                    case "salon":
                                        String eleccionesSalon;
                                        System.out.println("Abres ambas puertas y crees poder " +
                                                "ver el polvo revolotear por el aire,\n " +
                                                "además de nuevamente ese olor a humedad y a " +
                                                "cerrado insoportable. Intentas aclarar la vista, \n" +
                                                "ya que está muy oscuro. Puedes distinguir unos cuadros en la " +
                                                "pared del fondo, en el centro de la sala.\n " +
                                                "En otra pared puedes ver un corcho con distintos papeles colgados.\n " +
                                                "Por otro lado, Hay varios documentos esparcidos por " +
                                                "la mesa y el sofá, están todos arrugados.");
                                        while (!linterna) {
                                            System.out.println("¿A qué quieres acercarte?");
                                            System.out.println("[cuadros]  [mesa]  [dibujos]");

                                            eleccionesSalon = sc.nextLine();

                                            if (linterna) {
                                                System.out.println("Me parece que no queda nada más que ver aquí");
                                                break;
                                            } else {

                                                switch (eleccionesSalon) {
                                                    case "cuadros":
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
                                                        System.out.println("¿Quieres probar o prefieres segui buscando?");
                                                        System.out.println("[probar]  [pasar]");
                                                        String cajaFuerte;
                                                        cajaFuerte = sc.nextLine();
                                                        switch (cajaFuerte) {
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
                                                                if (contraseña != numeroSecreto) {
                                                                    System.out.println("Intentalo de nuevo");
                                                                }else {
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
                                                                    System.out.println("Vuelves a la entrada\n" +
                                                                            "[salon]  [garaje]  [escaleras]  INVENTARIO[cosas]");
                                                                }

                                                                break;
                                                            case "pasar":
                                                                System.out.println("Es mejor que siga buscando");
                                                                break;
                                                        }
                                                        break;
                                                    case "mesa":
                                                        System.out.println("Das unos pasos y te agachas junto a la mesa, " +
                                                                "estirando los papeles para intentar leer algo");
                                                        System.out.println("(tú)- son fotocopias de un anuncio de venta de la casa… \n" +
                                                                "pero en todas aparecen tachones y frases como “Bienvenido al infierno”. \n" +
                                                                "Un escalofrío te recorre mientras lo lees y te levantas con rapidez. \n" +
                                                                "Antes de alejarte, ves un post-it pegado a la mesa, en el que pone “+17590”");
                                                        break;
                                                    case "dibujos":
                                                        System.out.println("Te acercas a los dibujos que hay colgados en el corcho. \n" +
                                                                "Puedes ver animales y arcoíris dibujados de forma infantil, \n" +
                                                                "sin embargo, hay un dibujo que te llama la atención: \n" +
                                                                "Uno de un niño que va de la mano de un borrón negro con ojos, \n" +
                                                                "además se puede ver escrito J + A. En el borde del corcho \n" +
                                                                "se encuentra algo grabado: -10000");
                                                        break;
                                                }
                                            }
                                        }
                                }//Fin_Juego
                            }//fin_While de inicio
                        }//Fin_Main
                    }//Fin_PublicClass
            }
        }
    }
}



