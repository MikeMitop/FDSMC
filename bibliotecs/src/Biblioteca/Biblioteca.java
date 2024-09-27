package Biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;

public class Biblioteca {
    public static void main(String[] args) {

        ArrayList<Libro> listaLibros = new ArrayList<>();
        ArrayList<Prestamo> listaPrestamos = new ArrayList<>();

        Pais pais = new Pais(1, "Colombia");

        Autor autor1 = new Autor("Gabriel Garcia Marquez", pais);

        Editorial editorial = new Editorial ("SCD92", "Norma", pais);

        Libro libro1 = new Libro(300, "123456", "JavaTutorial", autor1, editorial, 100, true);

        system.out.println(libro1);
        listaLibros.add(libro1);

        Estudiante estudiante1 = new Estudiante("Juan", "Perez", "123456", "Ingenieria de Sistemas");

        Prestamo prestamo1 = new Prestamo(LocalDate.now(), LocalDate.now().plusDays(7), libro1, estudiante1, 7, 0, 0);

        listaPrestamos.add(prestamo1);

        System.out.println(prestamo1);
    }

}
