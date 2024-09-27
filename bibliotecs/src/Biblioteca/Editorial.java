package Biblioteca;

public class Editorial {

    private String name;
    private Pais pais;
    private int codigo;

    public Editorial(String name, Pais pais, int codigo) {
        this.name = name;
        this.pais = pais;
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String toString() {
        return "Editorial{" +
                "name='" + name + '\'' +
                ", pais=" + pais +
                ", codigo=" + codigo +
                '}';
    }
}


//Para que sirve el tostring:

// El método toString() se utiliza para devolver una representación de cadena de cualquier objeto.
// Si desea representar cualquier objeto como cadena, toString() viene a la imagen.
// El método toString() devuelve la cadena de texto en la que se representa el objeto.
// Si desea obtener una representación de cadena de cualquier objeto, toString() viene a la imagen.
// El método toString() se define en la clase Object. La clase Object es la clase base para todas las clases en Java.
// Por lo tanto, el método toString() está disponible en todas las clases. La firma del método toString() es dada por:
