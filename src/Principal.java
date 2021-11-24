import java.util.Scanner;

public class Principal {
    private static int ind;
    private static Scanner in = new Scanner(System.in);
    private static Barco[] barcos;

    public static void main(String[] args) {
        int cant;
        boolean bandera = true;

        ind=0;
        cant=0;

        System.out.println('\n' + "Bienvenido" + '\n');
        while(bandera) {
            try {
                bandera=false;
                System.out.println("Cuantos barcos desea ingresar?");
                cant = in.nextInt();
                barcos = new Barco[cant];
            } catch (Exception e) {
                System.out.println("Debe ingresar un numero entero. Intente nuevamente" + '\n');
                in.nextLine();
                bandera = true;
            }
        }
        System.out.println();
        for (int n = 0; n < cant; n++) {
            System.out.println("A continuacion ingresara los datos de la embarcacion nro. " + (n + 1) + '\n');
            Agregar();
            ind++;
        }
        System.out.println('\n' + "A continuacion se listan los barcos ingresados" + '\n');
        Mostrar();
        System.out.println('\n' + "Saliendo, hasta luego!");
    }

    public static void Agregar(){
        boolean banderac;
        double cal, man, esl, pun, des, pes;
        String mat, nom, nac, tip;
        int pot, tri, pas, cam, opcion;

        banderac=true;

        while (banderac) {
            try {
                banderac = false;
                System.out.println("Ingrese 1 para Carguero o 2 para Crucero");
                opcion = in.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el calado");
                        cal = in.nextDouble();
                        System.out.println("Ingrese la manga");
                        man = in.nextDouble();
                        System.out.println("Ingrese la eslora");
                        esl = in.nextDouble();
                        System.out.println("Ingrese el puntal");
                        pun = in.nextDouble();
                        System.out.println("Ingrese el desplazamiento");
                        des = in.nextDouble();
                        System.out.println("Ingrese la matricula");
                        in.nextLine();
                        mat = in.nextLine();
                        System.out.println("Ingrese el nombre");
                        nom = in.nextLine();
                        System.out.println("Ingrese la nacionalidad");
                        nac = in.nextLine();
                        System.out.println("Ingrese la potencia");
                        pot = in.nextInt();
                        System.out.println("Ingrese el numero de tripulantes");
                        tri = in.nextInt();
                        System.out.println("Ingrese el tipo de carga");
                        in.nextLine();
                        tip = in.nextLine();
                        System.out.println("Ingrese el peso maximo");
                        pes = in.nextDouble();
                        barcos[ind] = new Carguero(cal, man, esl, pun, des, mat, nom, nac, pot, tri, tip, pes);
                        break;
                    case 2:
                        System.out.println("Ingrese el calado");
                        cal = in.nextDouble();
                        System.out.println("Ingrese la manga");
                        man = in.nextDouble();
                        System.out.println("Ingrese la eslora");
                        esl = in.nextDouble();
                        System.out.println("Ingrese el puntal");
                        pun = in.nextDouble();
                        System.out.println("Ingrese el desplazamiento");
                        des = in.nextDouble();
                        System.out.println("Ingrese la matricula");
                        in.nextLine();
                        mat = in.nextLine();
                        System.out.println("Ingrese el nombre");
                        nom = in.nextLine();
                        System.out.println("Ingrese la nacionalidad");
                        nac = in.nextLine();
                        System.out.println("Ingrese la potencia");
                        pot = in.nextInt();
                        System.out.println("Ingrese el numero de tripulantes");
                        tri = in.nextInt();
                        System.out.println("Ingrese la cantidad de pasajeros");
                        pas = in.nextInt();
                        System.out.println("Ingrese la cantidad de camarotes");
                        cam = in.nextInt();
                        barcos[ind] = new Crucero(cal, man, esl, pun, des, mat, nom, nac, pot, tri, pas, cam);
                        break;
                    default:
                        System.out.println("Opcion invalida. Intente nuevamente");
                        banderac = true;
                }
            } catch (Exception e) {
                System.out.println("Debe ingresar un valor numerico. Intente nuevamente" + '\n');
                in.nextLine();
                banderac = true;
            }
        }
    }

    public static void Mostrar(){
        for (int i = 0; i < barcos.length; i++) {
            System.out.println("Embarcacion nro. " + (i+1) + '\n');
            System.out.println("Indice: " + i);
            System.out.println("Tipo de embarcacion: " + barcos[i].getClass().getName());
            System.out.println(barcos[i].toString());
        }
    }
}