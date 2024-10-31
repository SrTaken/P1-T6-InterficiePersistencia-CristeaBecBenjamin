/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.milaifontanals.club;

/**
 *
 * @author beni
 */
public interface IClubOracleBD {
    
    
    /**
     * Metode per tancar la conexio a la BD 
     * agafe les dades de un fitxer properties
     * 
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void tancarCapa() throws GestorBDClub;
    
    /**
     * Metode per afegir un nou Jugador a la BD
     * 
     * @param j Jugador a afegir
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void afegirJugador(Jugador j) throws GestorBDClub;
    
     /**
     * Metode per esborrar un Jugador de la BD
     * 
     * @param j Jugador a esborrar
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void esborrarJugador(Jugador j) throws GestorBDClub;
    
    /**
     * Metode per modificar les dades d'un Jugador de la BD
     * 
     * @param j Jugador a modificar
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void modificarJugador(Jugador j) throws GestorBDClub;
    
    /**
     * Metode per afegir una nova Temporada a la BD
     * 
     * @param t Temporada a afegir
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void afegirTemporada(Temporada t) throws GestorBDClub;
    
     /**
     * Metode per esborrar una Temporada de la BD
     * 
     * @param t Temporada a esborrar
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void esborrarTemporada(Temporada t) throws GestorBDClub;
    
    /**
     * Metode per afegir una nova Categoria a la BD
     * 
     * @param c Categoria a afegir
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void afegirCategoria(Categoria c) throws GestorBDClub;
    
     /**
     * Metode per esborrar una Categoria de la BD
     * 
     * @param c Categoria a esborrar
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void esborrarCategoria(Categoria c) throws GestorBDClub;
    
    /**
     * Metode per afegir un nou Equip a la BD
     * 
     * @param e Equip a afegir
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void afegirEquip(Equip e) throws GestorBDClub;
    
     /**
     * Metode per esborrar un Equip de la BD
     * 
     * @param e Equip a esborrar
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void esborrarEquip(Equip e) throws GestorBDClub;
    
    /**
     * Metode per modificar les dades d'un Equip de la BD
     * 
     * @param e Equip a modificar
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void modificarEquip(Equip e) throws GestorBDClub;    
    
    
    
}
