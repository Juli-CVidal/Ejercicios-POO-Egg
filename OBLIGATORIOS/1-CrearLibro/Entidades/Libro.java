/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Administrador
 */
public class Libro {
    public int ISBN;
    public String titulo;
    public String autor;
    public int pags;

    public Libro(int ISBN, String titulo, String autor, int pags) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.pags = pags;
    }
    
}
