import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Usuario usuario = new Usuario("Juan");

        // Agregar algunos libros a la biblioteca
        biblioteca.agregarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez"));
        biblioteca.agregarLibro(new Libro("El señor de los anillos", "J.R.R. Tolkien"));
        biblioteca.agregarLibro(new Libro("1984", "George Orwell"));

        Scanner scanner = new Scanner(System.in);
        String opcion = "";

        while (!opcion.equalsIgnoreCase("salir")) {
            System.out.println("\nOpciones:");
            System.out.println("1. Mostrar libros disponibles");
            System.out.println("2. Prestar un libro");
            System.out.println("3. Devolver un libro");
            System.out.println("Escribe 'salir' para terminar.");

            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    biblioteca.mostrarLibrosDisponibles();
                    break;
                case "2":
                    System.out.print("Introduce el título del libro a prestar: ");
                    String tituloPrestar = scanner.nextLine();
                    biblioteca.prestarLibro(usuario, tituloPrestar);
                    break;
                case "3":
                    System.out.print("Introduce el título del libro a devolver: ");
                    String tituloDevolver = scanner.nextLine();
                    biblioteca.devolverLibro(usuario, tituloDevolver);
                    break;
                case "salir":
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
