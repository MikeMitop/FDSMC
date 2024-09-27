package Biblioteca;

public class Libro {

    private int NumPaginas;
    private String ISBN;
    private String Titulo;
    private Autor autor;
    private Editorial editorial;
    private String Edicion;
    private boolean Estado;

    public Libro(int NumPaginas, String ISBN, String Titulo, Autor autor, Editorial editorial, String Edicion, boolean Estado) {
        this.NumPaginas = NumPaginas;
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.Edicion = Edicion;
        this.Estado = Estado;
    }

    public int getNumPaginas() {
        return NumPaginas;
    }

    public void setNumPaginas(int NumPaginas) {
        this.NumPaginas = NumPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getEdicion() {
        return Edicion;
    }

    public void setEdicion(String Edicion) {
        this.Edicion = Edicion;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    public String toString() {
        return "Libro{" +
                "NumPaginas=" + NumPaginas +
                ", ISBN='" + ISBN + '\'' +
                ", Titulo='" + Titulo + '\'' +
                ", autor=" + autor +
                ", editorial=" + editorial +
                ", Edicion='" + Edicion + '\'' +
                ", Estado=" + Estado +
                '}';
    }
}
