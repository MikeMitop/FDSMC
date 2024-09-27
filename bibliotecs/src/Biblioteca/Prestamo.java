package Biblioteca;

import java.time.LocalDate;

public class Prestamo {
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    public Libro libro;
    public Estudiante estudiante;
private int DiasPrestamo;
        private int DiasMora;
        private int Multa;

public Prestamo(LocalDate fechaPrestamo, LocalDate fechaDevolucion, Libro libro, Estudiante estudiante, int DiasPrestamo, int DiasMora, int Multa) {

    this.libro = libro;
    this.estudiante = estudiante;
    this.DiasPrestamo = DiasPrestamo;

}

public String toString() {
    return "Prestamo{" +
            "fechaPrestamo=" + fechaPrestamo +
            ", fechaDevolucion=" + fechaDevolucion +
            ", libro=" + libro +
            ", estudiante=" + estudiante +
            ", DiasPrestamo=" + DiasPrestamo +
            ", DiasMora=" + DiasMora +
            ", Multa=" + Multa +
            '}';
}
}
