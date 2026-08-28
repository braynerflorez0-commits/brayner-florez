import java.util.Scanner;

public class Cat004Ventas {

    public static void main(String[] args) {

        Scanner mango = new Scanner(System.in);

        final double PRECIO_BASICO = 30000;
        final double PRECIO_MEDIO = 60000;
        final double PRECIO_PREMIUM = 120000;
        final double PORCENTAJE_DESCUENTO = 0.10;
        final double PORCENTAJE_IVA = 0.19;

        double totalBruto = 0;
        int totalArticulos = 0;
        int cantidadPremium = 0;
        int opcion;

        do {
            System.out.println("\n===== CAJA REGISTRADORA =====");
            System.out.println("1. Producto Básico - $" + PRECIO_BASICO);
            System.out.println("2. Producto Medio  - $" + PRECIO_MEDIO);
            System.out.println("3. Producto Premium - $" + PRECIO_PREMIUM);
            System.out.println("4. Finalizar compra");
            System.out.print("Seleccione una opción: ");

            opcion = mango.nextInt();

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
                System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 4);

        double descuento = 0;

        if (totalBruto > 100000) {
            descuento = totalBruto * PORCENTAJE_DESCUENTO;
        }

        double totalConDescuento = totalBruto - descuento;
        double iva = totalConDescuento * PORCENTAJE_IVA;
        double totalFinal = totalConDescuento + iva;

        double porcentajePremium = 0;

        if (totalArticulos > 0) {
            porcentajePremium = ((double) cantidadPremium / totalArticulos) * 100;
        }

        System.out.println("\n========== FACTURA ==========");
        System.out.printf("Total bruto: $%.2f%n", totalBruto);
        System.out.printf("Descuento: $%.2f%n", descuento);
        System.out.printf("Subtotal: $%.2f%n", totalConDescuento);
        System.out.printf("IVA (19%%): $%.2f%n", iva);
        System.out.printf("TOTAL A PAGAR: $%.2f%n", totalFinal);
        System.out.println("-----------------------------");
        System.out.println("Total de artículos: " + totalArticulos);
        System.out.println("Artículos Premium: " + cantidadPremium);
        System.out.printf("Porcentaje Premium: %.2f%%%n", porcentajePremium);
        System.out.println("=============================");

        mango.close();
    }
}
git add .
git commit -m "feat: agregar variables base de productos"
git add .
git commit -m "feat: crear ciclo do-while y menu de ventas"
git add .
git commit -m "feat: agregar calculo de descuento iva y porcentaje premium"
git log --oneline


