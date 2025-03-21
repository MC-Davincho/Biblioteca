/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Autor extends Persona {
    private String editorial;
    private String profesion;

    public Autor(String nombre, String documentoIdentidad, String correoElectronico, String editorial, String profesion) {
        super(nombre, documentoIdentidad, correoElectronico);
        this.editorial = editorial;
        this.profesion = profesion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
}
