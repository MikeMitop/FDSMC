package Biblioteca;

public class Autor {

    private String name;

    public class Pais;

    public Autor(String name, Pais pais) {
        this.name = name;
        this.pais = pais;
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

    public String toString() {
        return "Autor{" +
                "name='" + name + '\'' +
                ", pais=" + pais +
                '}';
    }
}

