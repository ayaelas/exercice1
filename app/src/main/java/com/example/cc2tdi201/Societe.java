package com.example.cc2tdi201;

import java.io.Serializable;

public class Societe implements Serializable {
    public int id;
    public int nbemploye;
    public String nom;
    public String activite;

    public Societe(){}

    public Societe(int id, int nbemploye, String nom, String activite) {
        this.id = id;
        this.nbemploye = nbemploye;
        this.nom = nom;
        this.activite = activite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbemploye() {
        return nbemploye;
    }

    public void setNbemploye(int nbemploye) {
        this.nbemploye = nbemploye;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getActivite() {
        return activite;
    }
    public void setActivite(String activite) {
        this.activite = activite;
    }


    public void getNom(String string) {
    }

    public void getNbemploye(int anInt) {
    }

    public void getActivite(String string) {
    }
}
