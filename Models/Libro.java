public class Libro {
    private String titulo;
    private String autor;
    private boolean prestado;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;  // Por defecto, el libro está disponible
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("Has prestado el libro: " + titulo);
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("Has devuelto el libro: " + titulo);
        } else {
            System.out.println("Este libro no está prestado.");
        }
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Estado: " + (prestado ? "Prestado" : "Disponible");
    }
}