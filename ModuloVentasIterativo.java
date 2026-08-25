import java.util.Scanner;

public class ModuloVentasIterativo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double DESCUENTO = 0.10;
        final double IVA = 0.19;

        final double PRECIO_BASICO = 30000;
        final double PRECIO_MEDIO = 60000;
        final double PRECIO_PREMIUM = 100000;

        double totalBruto = 0;
        int totalArticulos = 0;
        int cantidadPremium = 0;
        int opcion;

        do {
            System.out.println("\n===== CAJA REGISTRADORA =====");
            System.out.println("1. Producto Básico - $" + PRECIO_BASICO);
            System.out.println("2. Producto Medio - $" + PRECIO_MEDIO);
            System.out.println("3. Producto Premium - $" + PRECIO_PREMIUM);
            System.out.println("4. Finalizar compra");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            if (opcion == 1) {
                totalBruto += PRECIO_BASICO;
                totalArticulos++;
                System.out.println("Producto Básico agregado.");
            } else if (opcion == 2) {
                totalBruto += PRECIO_MEDIO;
                totalArticulos++;
                System.out.println("Producto Medio agregado.");
            } else if (opcion == 3) {
                totalBruto += PRECIO_PREMIUM;
                totalArticulos++;
                cantidadPremium++;
                System.out.println("Producto Premium agregado.");
            } else if (opcion == 4) {
                System.out.println("Finalizando compra...");
            } else {
                System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while (opcion != 4);

        double descuento = 0;

        if (totalBruto > 100000) {
            descuento = totalBruto * DESCUENTO;
        }

        double subtotalConDescuento = totalBruto - descuento;
        double valorIva = subtotalConDescuento * IVA;
        double totalFinal = subtotalConDescuento + valorIva;

        double porcentajePremium = 0;

        if (totalArticulos > 0) {
            porcentajePremium = ((double) cantidadPremium / totalArticulos) * 100;
        }

        System.out.println("\n========== FACTURA ==========");
        System.out.printf("Total bruto: $%,.2f%n", totalBruto);
        System.out.printf("Descuento: $%,.2f%n", descuento);
        System.out.printf("Subtotal con descuento: $%,.2f%n", subtotalConDescuento);
        System.out.printf("IVA (19%%): $%,.2f%n", valorIva);
        System.out.printf("Total final: $%,.2f%n", totalFinal);
        System.out.println("Total de artículos: " + totalArticulos);
        System.out.printf("Porcentaje de productos Premium: %.2f%%%n", porcentajePremium);
        System.out.println("==============================");

        scanner.close();
    }
}
