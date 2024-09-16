package agenciavehiculo;

import java.util.Scanner;

public class AgenciaVehiculo {

    public static void main(String[] args) {

        String marca = "", año = "", numserie = "", modelo = "";
        double precio = 0.0;
        int veh, vehm;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el código del tipo de vehículo:");
        System.out.println(" 0 >> Compacto \n 1 >> Lujo \n 2 >> Camioneta \n 3 >> Vagoneta");
        veh = entrada.nextInt();

        entrada.nextLine();

        switch (veh) {

            case 0:
                // compacto
                System.out.println("Ingrese marca de auto (Mazda - Renault)");
                marca = entrada.nextLine();

                if (marca.equals("Mazda") || marca.equals("mazda")) {

                    System.out.println("Ingrese el código de auto(en stock)\n 0 >> Mazda 2\n 1 >> Mazda 3");
                    vehm = entrada.nextInt();
                    if (vehm == 0) {
                        modelo = "Mazda 2";
                        precio = 82350000;
                        año = "2020";
                        numserie = "65257489";
                    } else {
                        precio = 134450000;
                        modelo = "Mazda 3";
                        año = "2023";
                        numserie = "21504869";
                    }

                } else if (marca.equals("renault") || marca.equals("Renault")) {
                    System.out.println("Ingrese el código de auto(en stock)\n 0 >> Renault KWID\n 1 >> Renault ARKANA");
                    vehm = entrada.nextInt();
                    if (vehm == 0) {
                        modelo = "Renault KWID";
                        precio = 49990000;
                        año = "2022";
                        numserie = "51423687";
                    } else {
                        precio = 124900000;
                        modelo = "Renault ARKANA";
                        año = "2019";
                        numserie = "24513685";
                    }
                }
                Compacto compacto = new Compacto(marca, modelo, año, numserie, precio);
                compacto.mostrarPrecio();
                break;

            case 1:
                // lujo
                System.out.println("Ingrese marca de auto (Porsche - Bugatti)");
                marca = entrada.nextLine();
                if (marca.equals("Porsche") || marca.equals("porsche")) {
                    System.out.println("Ingrese el código de auto(en stock)\n 0 >> Cayman GTS 4.0\n 1 >> 911 GT3 RS");
                    vehm = entrada.nextInt();
                    if (vehm == 0) {
                        modelo = "Cayman GTS 4.0";
                        precio = 638586347;
                        año = "2020";
                        numserie = "25634185";
                    } else {
                        precio = 1660914227;
                        modelo = "911 GT3 RS";
                        año = "2003";
                        numserie = "31254065";
                    }

                } else if (marca.equals("Bugatti") || marca.equals("bugatti")) {
                    System.out.println("Ingrese el código de auto(en stock)\n 0 >> Chiron\n 1 >> Divo");
                    vehm = entrada.nextInt();
                    if (vehm == 0) {
                        modelo = "Chiron";
                        precio = 1165397031;
                        año = "2016";
                        numserie = "24518692";
                    } else {
                        precio = 233414683;
                        modelo = "Divo";
                        año = "2018";
                        numserie = "30154215";
                    }
                }
                Lujo lujo = new Lujo(marca, modelo, año, numserie, precio);
                lujo.mostrarPrecio();
                break;

            case 2:
                // camionetas
                System.out.println("Ingrese marca de auto (Ford - Toyota)");
                marca = entrada.nextLine();
                if (marca.equals("Toyota") || marca.equals("toyota")) {
                    System.out.println("Ingrese el código de auto(en stock)\n 0 >> Fortuner\n 1 >> Hilux");
                    vehm = entrada.nextInt();
                    if (vehm == 0) {
                        modelo = "Fortuner";
                        precio = 207000000;
                        año = "2020";
                        numserie = "31546852";
                    } else {
                        precio = 218000000;
                        modelo = "Hilux";
                        año = "2022";
                        numserie = "45126384";
                    }

                } else if (marca.equals("Ford") || marca.equals("ford")) {
                    System.out.println("Ingrese el código de auto(en stock)\n 0 >> Escape\n 1 >> Explorer");
                    vehm = entrada.nextInt();
                    if (vehm == 0) {
                        modelo = "Escape 2.0";
                        precio = 62000000;
                        año = "2019";
                        numserie = "54213659";
                    } else {
                        precio = 98000000;
                        modelo = "Explorer";
                        año = "2015";
                        numserie = "21536594";
                    }
                }
                Camioneta camioneta = new Camioneta(marca, modelo, año, numserie, precio);
                camioneta.mostrarPrecio();
                break;

            case 3:
                // vagonetas
                System.out.println("Ingrese marca de auto (Ford - Toyota)");
                marca = entrada.nextLine();
                if (marca == "Toyota" || marca == "toyota") {
                    System.out.println("Ingrese el código de auto(en stock)\n 0 >> Fortuner\n 1 >> Hilux");
                    vehm = entrada.nextInt();
                    if (vehm == 0) {
                        modelo = "Escape 3.0";
                        precio = 169900000;
                        año = "2022";
                        numserie = "20153245";
                    } else {
                        precio = 269990000;
                        modelo = "Ranger";
                        año = "2021";
                        numserie = "34512620";
                    }

                } else if (marca == "volkswagen" || marca == "Volkswagen") {
                    System.out.println("Ingrese el código de auto(en stock)\n 0 >> Combi 1.6\n 1 >> Combi panel");
                    vehm = entrada.nextInt();
                    if (vehm == 0) {
                        modelo = "Combi 1.6";
                        precio = 65326519;
                        año = "1980";
                        numserie = "20156";
                    } else {
                        precio = 49762147;
                        modelo = "Combi panel";
                        año = "1947";
                        numserie = "35041";
                    }

                }
                Vagoneta vagoneta = new Vagoneta(marca, modelo, año, numserie, precio);
                vagoneta.mostrarPrecio();
                break;

            default:
                System.out.println("Código ingresado no válido");
        }

    }

}
