import java.util.Scanner;
public class CafeMain {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("   BIENVENIDO A LA TIENDA DE CAFE ONLINE");
                Cafe pedido = elegirCafeBase(sc);
                pedido = agregarExtras(sc, pedido);

                generarRecibo(pedido);
                sc.close();
            }

            private static Cafe elegirCafeBase(Scanner sc) {
                System.out.println("\nElige tu café base:");
                System.out.println("1. Espresso        ($5.00)");
                System.out.println("2. Capuccino        ($6.00)");
                System.out.println("3. Cafe Americano   ($4.00)");
                System.out.print("Opcion: ");

                int opcion = leerOpcion(sc, 1, 3);

                switch (opcion) {
                    case 1:
                        return new Capuccino();
                    case 2:
                        return new CafeAmericano();
                    default:
                        return new Expreso();
                }
            }

            private static Cafe agregarExtras(Scanner sc, Cafe pedido) {
                boolean seguir = true;

                while (seguir) {
                    System.out.println("\n¿Deseas agregar un extra a tu pedido actual?");
                    System.out.println("Pedido actual: " + pedido.getDescrpcion()
                            + " -> $" + String.format("%.2f", pedido.getCosto()));
                    System.out.println("1. Chocolate     (+$1.50)");
                    System.out.println("2. Caramelo      (+$1.20)");
                    System.out.println("3. Finalizar pedido");
                    System.out.print("Opción: ");

                    int opcion = leerOpcion(sc, 0, 5);

                    switch (opcion) {
                        case 1:
                            pedido = new Chocolate(pedido);
                            break;

                        case 2:
                            pedido = new Caramelo(pedido);
                            break;
                        case 0:
                        default:
                            seguir = false;
                            break;
                    }
                }

                return pedido;
            }

            private static int leerOpcion(Scanner sc, int min, int max) {
                int opcion;
                while (true) {
                    try {
                        opcion = Integer.parseInt(sc.nextLine().trim());
                        if (opcion >= min && opcion <= max) {
                            return opcion;
                        }
                    } catch (NumberFormatException ignored) {
                        // Se vuelve a pedir el dato
                    }
                    System.out.print("Opción inválida, intenta de nuevo: ");
                }
            }

            private static void generarRecibo(Cafe pedido) {
                System.out.println("            RECIBO DE VENTA");
                System.out.println("Pedido: " + pedido.getDescrpcion());
                System.out.printf("Total a pagar: $%.2f%n", pedido.getCosto());
                System.out.println("¡Gracias por tu compra!");
            }
        }
