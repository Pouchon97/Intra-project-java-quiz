package com.quiz;

import java.util.ArrayList;
import java.util.HashMap;

public class Participants {
	private String nom;
	private String prenom;
	private int score;
	private HashMap<String,Integer> historyOfscoreAll = new HashMap<>();
	private int historyOfscore = 0;

	private ArrayList<Participants> allParticipant = new ArrayList<>();
	
	private ArrayList<Participants> listefinalistes = new ArrayList<>();

	public Participants(String nom, String prenom) {this.nom = nom;this.prenom = prenom;}
	
	public Participants() {}
	
	public String getNom() {return nom;}
	
	public void setNom(String nom) {this.nom = nom;}
	
	public String getPrenom() {return prenom;}
	
	public void setPrenom(String prenom) {this.prenom = prenom;}
	
    public int getScore() {return score;}
	
	public void setScore(int score) {this.score = score;}
	
    public int gethistoryOfscore() {return historyOfscore;}
	
	public void sethistoryOfscore(int score) {this.historyOfscore = historyOfscore;}
	
	public ArrayList<Participants> getListeOfparticipant(){return allParticipant;}
	
	public ArrayList<Participants> getlistefinalistes(){return listefinalistes;}
	
	public HashMap<String,Integer> gethistoryOfscoreAll(){return historyOfscoreAll;}

	
	
}
