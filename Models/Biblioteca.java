import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles:");
        for (Libro libro : libros) {
            if (!libro.isPrestado()) {
                System.out.println(libro);
            }
        }
    }

    public Libro buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public void prestarLibro(Usuario usuario, String titulo) {
        Libro libro = buscarLibro(titulo);
        if (libro != null) {
            libro.prestar();
        } else {
            System.out.println("El libro no se encuentra en la biblioteca.");
        }
    }

    public void devolverLibro(Usuario usuario, String titulo) {
        Libro libro = buscarLibro(titulo);
        if (libro != null) {
            libro.devolver();
        } else {
            System.out.println("El libro no pertenece a la biblioteca.");
        }
    }
}
