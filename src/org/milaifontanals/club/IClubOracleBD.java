/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.milaifontanals.club;

import java.util.List;
import java.io.File;

/**
 *
 * @author beni
 */
public interface IClubOracleBD {
    
    
    /**
     * Mètode per tancar la conexió a la BD 
     * agafa les dades d'un fitxer properties
     * 
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void tancarCapa() throws GestorBDClub;
    
    /**
     * Mètode per afegir un nou Jugador a la BD
     * 
     * @param j Jugador a afegir
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void afegirJugador(Jugador j) throws GestorBDClub;
    
    
    /**
     * Metode per iniciar sesio
     * @param login
     * @param password
     * @return boolean true si es correcte, false si no
     * @throws GestorBDClub 
     */
    boolean validarLogin(String login, String password) throws GestorBDClub;
    
     /**
     * Mètode per esborrar un Jugador de la BD
     * 
     * @param id del Jugador a esborrar
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void esborrarJugador(int id) throws GestorBDClub;
    
    /**
     * Mètode per modificar les dades d'un Jugador de la BD
     * 
     * @param j Jugador a modificar
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void modificarJugador(Jugador j) throws GestorBDClub;
    
    /**
     * Mètode per afegir una nova Temporada a la BD
     * 
     * @param t Temporada a afegir
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void afegirTemporada(Temporada t) throws GestorBDClub;
    
     /**
     * Mètode per esborrar una Temporada de la BD
     * 
     * @param year de la Temporada a esborrar
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void esborrarTemporada(int year) throws GestorBDClub;
    
    /**
     * Mètode per afegir una nova Categoria a la BD
     * 
     * @param c Categoria a afegir
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void afegirCategoria(Categoria c) throws GestorBDClub;
    
     /**
     * Mètode per esborrar una Categoria de la BD
     * 
     * @param c Categoria a esborrar
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void esborrarCategoria(Categoria c) throws GestorBDClub;
    
    /**
     * Mètode per afegir un nou Equip a la BD
     * 
     * @param e Equip a afegir
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void afegirEquip(Equip e) throws GestorBDClub;
    
     /**
     * Mètode per esborrar un Equip de la BD
     * 
     * @param e Equip a esborrar
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void esborrarEquip(Equip e) throws GestorBDClub;
    
    /** 
     * Mètode per modificar les dades d'un Equip de la BD
     * 
     * @param e Equip a modificar
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void modificarEquip(Equip e) throws GestorBDClub;    
    
    /**
     * Mètode per afegir un Jugador a un Equip com a Membre a la BD
     * 
     * @param m Membre a afegir a la BD
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void afegirMembre(Membre m) throws GestorBDClub;
    
     /**
     * Mètode per esborrar un Jugador d'un Equip de la BD
     * 
     * @param id_j del Jugador a esborrar del equip
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void esborrarMembre(int idJugador, int idEquip) throws GestorBDClub;
    
    /**
     * Mètode per afegir un Usuari a la BD
     * 
     * @param u Usuari a afegir a la BD
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void afegirUsuari(Usuari u) throws GestorBDClub;
    
     /**
     * Mètode per esborrar un Usuari de la BD
     * 
     * @param login del Usuari a esborrar de la BD
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void esborrarUsuari(String login) throws GestorBDClub;
    
    /** 
     * Mètode per modificar les dades d'un Usuari de la BD
     * 
     * @param u Usuari a modificar
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void modificarUsuari(Usuari u) throws GestorBDClub;
    
     /**
     * Obtenir tots els jugadors de la BD
     *
     * @return Llista de jugadors recuperats
     * @throws org.milaifontanals.club.GestorBDClub
     */
    List<Jugador> obtenirLlistaJugador() throws GestorBDClub;
    
    /**
     * Obtenir totes les Temporades de la BD
     *
     * @return Llista de Temporades recuperats
     * @throws org.milaifontanals.club.GestorBDClub
     */
    List<Temporada> obtenirLlistaTemporada() throws GestorBDClub;
    
    /**
     * Obtenir totes les Categories de la BD
     *
     * @return Llista de Categoria recuperats
     * @throws org.milaifontanals.club.GestorBDClub
     */
    List<Categoria> obtenirLlistaCategoria() throws GestorBDClub;
    
    /**
     * Obtenir totes els Equip de la BD
     *
     * @return Llista de Equip recuperats
     * @throws org.milaifontanals.club.GestorBDClub
     */
    List<Equip> obtenirLlistaEquip() throws GestorBDClub;
    
    /**
     * Obtenir tots els Membres d'un equip de la BD
     *
     * 
     * @param e Equip per recuperar els membres
     * @return Llista de Membres recuperats
     * @throws org.milaifontanals.club.GestorBDClub
     */
    List<Membre> obtenirLlistaMembre(int e) throws GestorBDClub;
    
    /**
     * Mètode per confirmar els canvis (fa commit)
     * 
     * @throws GestorBDClub 
     */
    
    void confirmarCanvis() throws GestorBDClub;
    
    /**
     * Mètode per fer Rollback
     * @throws GestorBDClub 
     */
    void desferCanvis() throws GestorBDClub;
    
    
    /**
     * Metode per obtenir el usuari que estem buscant
     * @param login del usuari que volem obtenir
     * @return
     * @throws GestorBDClub 
     */
    Usuari getUsuari(String login) throws GestorBDClub;
    
    /**
     * Metode per obtenir la Categoria que estem buscant
     * @param Categoria que volem obtenir
     * @return
     * @throws GestorBDClub 
     */
    Categoria getCategoria(int id) throws GestorBDClub;
    
    /**
     * Metode per obtenir la Temporada que estem buscant
     * @param Temporada que volem obtenir
     * @return
     * @throws GestorBDClub 
     */
    Temporada getTemporada(int id) throws GestorBDClub;
    
    /**
     * Modifica los datos de un Membre en la BD
     * 
     * @param m Membre a modificar
     * @throws org.milaifontanals.club.GestorBDClub
     */
    void modificarMembre(Membre m) throws GestorBDClub;
    
    /**
     * Obtiene un Membre específico de la BD
     * 
     * @param idJugador ID del jugador
     * @param idEquip ID del equipo
     * @return Membre encontrado o null si no existe
     * @throws org.milaifontanals.club.GestorBDClub
     */
    Membre obtenirMembre(int idJugador, int idEquip) throws GestorBDClub;
    
    /**
     * Obtiene un Jugador específico de la BD
     * 
     * @param id ID del jugador a obtener
     * @return Jugador encontrado
     * @throws org.milaifontanals.club.GestorBDClub
     */
    Jugador obtenirJugador(int id) throws GestorBDClub;
    
    void exportJugadorsToCSV(File file) throws GestorBDClub;
    void exportEquipsToCSV(File file) throws GestorBDClub;
    void exportMembresToCSV(File file) throws GestorBDClub;
    void exportJugadorsToXML(File file) throws GestorBDClub;
    void exportEquipsToXML(File file) throws GestorBDClub;
    void exportMembresToXML(File file) throws GestorBDClub;
 
}
