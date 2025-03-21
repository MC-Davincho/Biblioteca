/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public String mostrarLibros() {
        StringBuilder sb = new StringBuilder();
        for (Libro libro : libros) {
            sb.append("ID: ").append(libro.getId()).append(" - Título: ").append(libro.getTitulo()).append("\n");
        }
        return sb.toString();
    }

    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    public Libro buscarLibro(long id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    public boolean actualizarLibro(long id, Libro nuevoLibro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == id) {
                libros.set(i, nuevoLibro);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarLibro(long id) {
        return libros.removeIf(libro -> libro.getId() == id);
    }

    public List<Libro> obtenerLibrosAlfabeticamente() {
        List<Libro> ordenados = new ArrayList<>(libros);
        ordenados.sort(Comparator.comparing(Libro::getTitulo));
        return ordenados;
    }
}
