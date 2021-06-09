package com.quiz;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Questions {
	
	private int indexPos;
	
	private String pays;
	private String capitale;
	private String userAnswer;
	
	private String expressions;
	private String solution;
	private String userAnswerMath;
	
	
	ArrayList<Integer> ListPos = new ArrayList<Integer>();
	
	CategoriesOfquestion categories = new CategoriesOfquestion();
	private String[][] dataCatConnaiceGenerale = categories.getConnaissanceGenerale();
	private String[][] dataCatMathematique= categories.getCatMath();
	
	
	{
		
	       JOptionPane Personne1= new JOptionPane();
           JOptionPane Personne2 = new JOptionPane();
           JOptionPane Personne3 = new JOptionPane();
           JOptionPane round = new JOptionPane();
		   String nomParticipant1 = Personne1.showInputDialog(null,"Veuillez entrer votre nom postulant #1 ?","Information du premier postulant",JOptionPane.QUESTION_MESSAGE);
		   String prenomParticipant1 = Personne1.showInputDialog(null,"Veuillez entrer votre prenom postulant #1?","Information du premier postulant",JOptionPane.QUESTION_MESSAGE);
		   Personne1.showMessageDialog(null, "Merci pour vos informations \n" + nomParticipant1+" "+prenomParticipant1, "Information Premier inscrit",
				   JOptionPane.INFORMATION_MESSAGE);

		   
		   String nomParticipant2 = Personne1.showInputDialog(null,"Veuillez entrer votre nom postulant #2 ?","Information du Segond postulant",JOptionPane.QUESTION_MESSAGE);
		   String prenomParticipant2 = Personne1.showInputDialog(null,"Veuillez entrer votre prenom postulant #2 ?","Information du segond postulant",JOptionPane.QUESTION_MESSAGE);
		   Personne2.showMessageDialog(null, "Merci pour vos informations \n" + nomParticipant2+" "+prenomParticipant2, "Information Segond inscrit",
				   JOptionPane.INFORMATION_MESSAGE);
		   
		   String nomParticipant3 = Personne1.showInputDialog(null,"Veuillez entrer votre nom postulant #3?","Information du Dernier postulant",JOptionPane.QUESTION_MESSAGE);
		   String prenomParticipant3 = Personne1.showInputDialog(null,"Veuillez entrer votre prenom postulant #3 ?","Information du Dernier postulant",JOptionPane.QUESTION_MESSAGE);
		   Personne3.showMessageDialog(null, "Merci pour vos informations \n" + nomParticipant3+" "+prenomParticipant3, "Information Dernier inscrit",
				   JOptionPane.INFORMATION_MESSAGE);
		   
			Participants participant1 = new Participants(nomParticipant1,prenomParticipant1);
		    Participants participant2 = new Participants(nomParticipant2,prenomParticipant2);
		    Participants participant3 = new Participants(nomParticipant3,prenomParticipant3);
			
			Participants participant = new Participants();
			participant.getListeOfparticipant().add(participant1);
			participant.getListeOfparticipant().add(participant2);
			participant.getListeOfparticipant().add(participant3);
			
			round.showMessageDialog(null, "Les Trois inscrits de la compétition sont: \n"+participant1.getNom()+" "+participant1.getPrenom()+"\n"+participant2.getNom()+" "+participant2.getPrenom()+"\n"+participant3.getNom()+" "+participant3.getPrenom()+"\n", "Liste des inscrits",
					   JOptionPane.INFORMATION_MESSAGE);
			
			 Personne3.showMessageDialog(null,"Information sur la compétition\n \t 1)le nombre de questions sont 2 pour chaque personne.\n 2)Le nombre de match est 2\n \t\tsi la premiere personne gagne il sera qualifié pour le deuxieme match \n \t\t si cette personne gagne encore le Segond match elle sera qualifié pour la grande final.\n Et que les deux autre personne doivent jouer un dernier match pour les departager.\n  3) le premier match sera "+" "+"< "+participant1.getNom()+" "+participant1.getPrenom()+" >"+" VS "+"< "+participant2.getNom()+" "+participant2.getPrenom()+" >"+"\n"
					 +"4) Si "+" "+"<<"+participant1.getNom()+" "+participant1.getPrenom()+">>"+" "+"gane il va jouer avec son deuxieme match avec"+" "+"<< "+participant3.getNom()+" "+participant3.getPrenom()+">>"+"\n Et que le match Suivant sera"+" \n"+"<< "+participant2.getNom()+" "+participant2.getPrenom()+" >>"+" Vs "+"<<"+participant3.getNom()+" "+participant3.getPrenom()+" >>"
					   ,"NB info",JOptionPane.WARNING_MESSAGE);
			
			round.showMessageDialog(null, "Bienvenue dans le premier macth du competition \n" +" << "+participant1.getNom()+" "+participant1.getPrenom()+"> "+" VS "+" <<"+participant2.getNom()+" "+participant2.getPrenom()+">>", "Premier Match",
					   JOptionPane.INFORMATION_MESSAGE);
			
			Scanner clavier = new Scanner(System.in);
			ListPos.clear();
			
			for(int i=0; i<dataCatConnaiceGenerale.length; i++) {
				do {
					Random random = new Random();
					indexPos = random.nextInt(dataCatConnaiceGenerale.length);
					
				}while(ListPos.contains(indexPos));
				
				ListPos.add(indexPos);
				pays = dataCatConnaiceGenerale[indexPos][0];
				capitale = dataCatConnaiceGenerale[indexPos][1];
				 
			    
				switch(i) {
				 case 0:
					 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant1.getNom()+" "+participant1.getPrenom(),JOptionPane.QUESTION_MESSAGE);
					
					{
						if(userAnswer.equalsIgnoreCase(capitale)) {
							participant1.setScore(i+1);
							round.showMessageDialog(null, "Bonne reponse :) Socre"+participant1.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
							
					      }else {
					    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
					    	
					    	  }
						
					}
				 	break;
				 case 1:
					 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant2.getNom()+" "+participant2.getPrenom(),JOptionPane.QUESTION_MESSAGE);
						{
							if(userAnswer.equalsIgnoreCase(capitale)) {
								participant2.setScore(i);
								round.showMessageDialog(null, "Bonne reponse :) Score"+participant2.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
								
						      }else {
						    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
						    	
						    	  }
						}
					break;
				 case 2:
					 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant1.getNom()+" "+participant1.getPrenom(),JOptionPane.QUESTION_MESSAGE);
						{
							if(userAnswer.equalsIgnoreCase(capitale)) {
								participant1.setScore(i);
								round.showMessageDialog(null, "Bonne reponse :) Score "+participant1.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
								
						      }else {
						    	
						    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
						    	
						    	  }
							
						}
					break;
				 case 3:
					 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant2.getNom()+" "+participant2.getPrenom(),JOptionPane.QUESTION_MESSAGE);
						{
							if(userAnswer.equalsIgnoreCase(capitale)) {
								participant2.setScore(i-1);
								round.showMessageDialog(null, "Bonne reponse :) Socre "+participant2.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
								
						      }else {
						    	
						    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
						    	 
						    	  }
						}
					break;
				 case 4:
					 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant1.getNom()+" "+participant1.getPrenom(),JOptionPane.QUESTION_MESSAGE);
						{
							if(userAnswer.equalsIgnoreCase(capitale)) {
								participant1.setScore(i-1);
								round.showMessageDialog(null, "Bonne reponse :) Score "+participant1.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
								
						      }else {
						    
						    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
						    	 
						    	  }
						}
					break;
				 case 5:
					 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant2.getNom()+" "+participant2.getPrenom(),JOptionPane.QUESTION_MESSAGE);
						{
							if(userAnswer.equalsIgnoreCase(capitale)) {
								participant2.setScore(i-2);
								round.showMessageDialog(null, "Bonne reponse :) Score"+participant2.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
								
						      }else {
						    	 
						    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
						    	  
						    	  }
						}
					break;
				 case 6:
					 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant1.getNom()+" "+participant1.getPrenom(),JOptionPane.QUESTION_MESSAGE);
						{
							if(userAnswer.equalsIgnoreCase(capitale)) {
								participant1.setScore(i-2);
								round.showMessageDialog(null, "Bonne reponse :) Score "+participant1.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
						
						      }else {
						    	  
						    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
						    	  }
						}
				 	break;
				 case 7:
					 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant2.getNom()+" "+participant2.getPrenom(),JOptionPane.QUESTION_MESSAGE);
						{
							if(userAnswer.equalsIgnoreCase(capitale)) {
								participant2.setScore(i-3);
								round.showMessageDialog(null, "Bonne reponse :) Score "+participant1.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
								
						      }else {
						    	 
						    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
						    	  
						    	  }
						}
					break;
				 case 8:
					 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant1.getNom()+" "+participant1.getPrenom(),JOptionPane.QUESTION_MESSAGE);
						{
							if(userAnswer.equalsIgnoreCase(capitale)) {
								participant1.setScore(i-3);
								round.showMessageDialog(null, "Bonne reponse :) Score "+participant1.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
								
						      }else {
						    	
						    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
						    	 
						    	  }
						}
					break;
				 case 9:
					 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant2.getNom()+" "+participant2.getPrenom(),JOptionPane.QUESTION_MESSAGE);
						{
							if(userAnswer.equalsIgnoreCase(capitale)) {
						
								participant2.setScore(i-4);
								round.showMessageDialog(null, "Bonne reponse :) Score "+participant2.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
								
						      }else {
						    	  
						    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
						    	 
						    	  }
						}
					break;
			
				 }
				
					
			}
			
			int part2 = participant1.getScore();
		
			// test pour passer le premier tour//
			if(participant1.getScore() > participant2.getScore()) {
				round.showMessageDialog(null, "Félicitation  \n" +" < "+participant1.getNom()+" "+participant1.getPrenom()+">"+" tu vas en demi-finale", "Qualification pour la Demi-final",
						   JOptionPane.INFORMATION_MESSAGE);
					
				round.showMessageDialog(null, "Bienvenue au Demi-fimal de la competition entre \n" +" << "+participant1.getNom()+" "+participant1.getPrenom()+"> "+" VS "+" <<"+participant3.getNom()+" "+participant3.getPrenom()+">>", "Demi - final",
						   JOptionPane.INFORMATION_MESSAGE);
				
					ListPos.clear();
					for(int i=0; i<dataCatMathematique.length; i++) {
						do {
							Random random = new Random();
							indexPos = random.nextInt(dataCatMathematique.length);
							
						}while(ListPos.contains(indexPos));
						
						ListPos.add(indexPos);
						expressions = dataCatMathematique[indexPos][0];
						solution = dataCatMathematique[indexPos][1];
						 
					    
						switch(i) {
						 case 0:
							 userAnswer = round.showInputDialog(null,"Quelle est le resultat de:"+" "+expressions+"?",participant1.getNom()+" "+participant1.getPrenom(),JOptionPane.QUESTION_MESSAGE);
							{
								if(userAnswer.equalsIgnoreCase(solution)) {
									participant1.setScore(i+1);
									round.showMessageDialog(null, "Bonne reponse :) Score"+participant1.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
									
							      }else {
							    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+solution,null, JOptionPane.INFORMATION_MESSAGE);
							    	
							    	  }
							}
						 	break;
						 case 1:
							 userAnswer = round.showInputDialog(null,"Quelle est le resultat de:"+" "+expressions+"?",participant3.getNom()+" "+participant3.getPrenom(),JOptionPane.QUESTION_MESSAGE);
								{
									if(userAnswer.equalsIgnoreCase(solution)) {
										participant3.setScore(i);
										round.showMessageDialog(null, "Bonne reponse :) Score"+participant3.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
									
								      }else {
								    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+solution,null, JOptionPane.INFORMATION_MESSAGE);
								    	 
								    	  }
								}
							break;
						 case 2:
							 userAnswer = round.showInputDialog(null,"Quelle est le resultat de:"+" "+expressions+"?",participant1.getNom()+" "+participant1.getPrenom(),JOptionPane.QUESTION_MESSAGE);
								{
									if(userAnswer.equalsIgnoreCase(solution)) {
										participant1.setScore(i);
										round.showMessageDialog(null, "Bonne reponse :) Score"+participant1.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
										
								      }else {
								    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+solution,null, JOptionPane.INFORMATION_MESSAGE);
								    	 
								    	  }
								}
							break;
						 case 3:
							 userAnswer = round.showInputDialog(null,"Quelle est le resultat de:"+" "+expressions+"?",participant3.getNom()+" "+participant3.getPrenom(),JOptionPane.QUESTION_MESSAGE);
								{
									if(userAnswer.equalsIgnoreCase(solution)) {
										participant3.setScore(i-1);
										round.showMessageDialog(null, "Bonne reponse :) Socre"+participant3.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
										
								      }else {
								    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+solution,null, JOptionPane.INFORMATION_MESSAGE);
								    	 
								    	  }
								}
							break;
						 case 4:
							 userAnswer = round.showInputDialog(null,"Quelle est le resultat de:"+" "+expressions+"?",participant1.getNom()+" "+participant1.getPrenom(),JOptionPane.QUESTION_MESSAGE);
								{
									if(userAnswer.equalsIgnoreCase(solution)) {
										participant1.setScore(i-2);
										round.showMessageDialog(null, "Bonne reponse :) Score "+participant1.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
										
								      }else {
								    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+solution,null, JOptionPane.INFORMATION_MESSAGE);
								    	
								    	  }
								}
							break;
						 case 5:
							 userAnswer = round.showInputDialog(null,"Quelle est le resultat de:"+" "+expressions+"?",participant3.getNom()+" "+participant3.getPrenom(),JOptionPane.QUESTION_MESSAGE);
								{
									if(userAnswer.equalsIgnoreCase(solution)) {
										round.showMessageDialog(null, "Bonne reponse :) Score"+participant3.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
										
								      }else {
								    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+solution,null, JOptionPane.INFORMATION_MESSAGE);
								    	 
								    	  }
								}
							break;
						 case 6:
							 userAnswer = round.showInputDialog(null,"Quelle est le resultat de:"+" "+expressions+"?",participant1.getNom()+" "+participant1.getPrenom(),JOptionPane.QUESTION_MESSAGE);
								{
									if(userAnswer.equalsIgnoreCase(solution)) {
										round.showMessageDialog(null, "Bonne reponse :) Score"+participant1.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
										
								      }else {
								    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+solution,null, JOptionPane.INFORMATION_MESSAGE);
								    	  System.out.println("Mauvais reponse  :( ");
								    	  }
								}
						 	break;
						 case 7:
							 userAnswer = round.showInputDialog(null,"Quelle est le resultat de:"+" "+expressions+"?",participant3.getNom()+" "+participant3.getPrenom(),JOptionPane.QUESTION_MESSAGE);
								{
									if(userAnswer.equalsIgnoreCase(solution)) {
										round.showMessageDialog(null, "Bonne reponse :) Score"+participant3.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
									
								      }else {
								    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+solution,null, JOptionPane.INFORMATION_MESSAGE);
								    
								    	  }
								}
							break;
						 case 8:
							 userAnswer = round.showInputDialog(null,"Quelle est le resultat de:"+" "+expressions+"?",participant1.getNom()+""+participant1.getPrenom(),JOptionPane.QUESTION_MESSAGE);
								{
									if(userAnswer.equalsIgnoreCase(solution)) {
										round.showMessageDialog(null, "Bonne reponse :) Score"+participant1.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
										
								      }else {
								    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+solution,null, JOptionPane.INFORMATION_MESSAGE);
								    	  System.out.println("Mauvais reponse  :( ");
								    	  }
								}
							break;
						 case 9:
							 userAnswer = round.showInputDialog(null,"Quelle est le resultat de:"+" "+expressions+"?",participant3.getNom()+" "+participant3.getPrenom(),JOptionPane.QUESTION_MESSAGE);
								{
									if(userAnswer.equalsIgnoreCase(solution)) {
										round.showMessageDialog(null, "Bonne reponse :)",null, JOptionPane.INFORMATION_MESSAGE);

								      }else {
								    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+solution,null, JOptionPane.INFORMATION_MESSAGE);
								    	
								    	  }
								}
							break;
					
						 }
							
					}
					
					
					//verification for  final//
					if(participant1.getScore() > participant3.getScore()) {
						int part1 = participant1.getScore();
						int part1t = part1+part2;
						round.showMessageDialog(null, "Félicitation \n" +" << "+participant1.getNom()+participant1.getPrenom()+" Tu es qualifier pour la grande final avec un score "+part1t+"/4", "Qualification pour la final",JOptionPane.INFORMATION_MESSAGE);
						participant.getlistefinalistes().add(participant1);
						
						//deuxiemme round  2 avec 3 participant//
				         round.showMessageDialog(null, "Bienvenue dans le Demi-finale de la competition \n" +" << "+participant2.getNom()+participant2.getPrenom()+"> "+" VS "+" <<"+participant3.getNom()+participant3.getPrenom()+">>", "Demi-final",
								   JOptionPane.INFORMATION_MESSAGE);
				         
						ListPos.clear();
						for(int i=0; i<dataCatMathematique.length; i++) {
							do {
								Random random = new Random();
								indexPos = random.nextInt(dataCatMathematique.length);
								
							}while(ListPos.contains(indexPos));
							
							ListPos.add(indexPos);
							pays = dataCatConnaiceGenerale[indexPos][0];
							capitale = dataCatConnaiceGenerale[indexPos][1];
							 
						    
							switch(i) {
							 case 0:
								 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant2.getNom()+" "+participant2.getPrenom(),JOptionPane.QUESTION_MESSAGE);
								{
									if(userAnswer.equalsIgnoreCase(capitale)) {
										participant2.setScore(i+1);
										round.showMessageDialog(null, "Bonne reponse :) Score "+participant2.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
									
								      }else {
								    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
								    	 
								    	  }
								}
							 	break;
							 case 1:
								 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant3.getNom()+" "+participant3.getPrenom(),JOptionPane.QUESTION_MESSAGE);
									{
										if(userAnswer.equalsIgnoreCase(capitale)) {
											participant3.setScore(i);
											round.showMessageDialog(null, "Bonne reponse :) Score "+participant3.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
										
									      }else {
									    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
									    	
									    	  }
									}
								break;
							 case 2:
								 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant2.getNom()+" "+participant2.getPrenom(),JOptionPane.QUESTION_MESSAGE);
									{
										if(userAnswer.equalsIgnoreCase(capitale)) {
											participant2.setScore(i);
											round.showMessageDialog(null, "Bonne reponse :) Score "+participant2.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
											
									      }else {
									    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
									    	 
									    	  }
									}
								break;
							 case 3:
								 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant3.getNom()+" "+participant3.getPrenom(),JOptionPane.QUESTION_MESSAGE);
									{
										if(userAnswer.equalsIgnoreCase(capitale)) {
											participant3.setScore(i-1);
											round.showMessageDialog(null, "Bonne reponse :) Score "+participant3.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
											
									      }else {
									    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
									    	  
									    	  }
									}
								break;
							 case 4:
								 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant2.getNom()+" "+participant2.getPrenom(),JOptionPane.QUESTION_MESSAGE);
									{
										if(userAnswer.equalsIgnoreCase(capitale)) {
											round.showMessageDialog(null, "Bonne reponse :)",null, JOptionPane.INFORMATION_MESSAGE);
											
									      }else {
									    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
									    	 
									    	  }
									}
								break;
							 case 5:
								 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant3.getNom()+" "+participant3.getPrenom(),JOptionPane.QUESTION_MESSAGE);
									{
										if(userAnswer.equalsIgnoreCase(capitale)) {
											round.showMessageDialog(null, "Bonne reponse :)",null, JOptionPane.INFORMATION_MESSAGE);
											
									      }else {
									    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
									    	  
									    	  }
									}
								break;
							 case 6:
								 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant2.getNom()+" "+participant2.getPrenom(),JOptionPane.QUESTION_MESSAGE);
									{
										if(userAnswer.equalsIgnoreCase(capitale)) {
											round.showMessageDialog(null, "Bonne reponse :)",null, JOptionPane.INFORMATION_MESSAGE);
											
									      }else {
									    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
									    	  
									    	  }
									}
							 	break;
							 case 7:
								 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant3.getNom()+" "+participant3.getPrenom(),JOptionPane.QUESTION_MESSAGE);
									{
										if(userAnswer.equalsIgnoreCase(capitale)) {
											round.showMessageDialog(null, "Bonne reponse :)",null, JOptionPane.INFORMATION_MESSAGE);
											
									      }else {
									    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
									    	 
									    	  }
									}
								break;
							 case 8:
								 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant2.getNom()+" "+participant2.getPrenom(),JOptionPane.QUESTION_MESSAGE);
									{
										if(userAnswer.equalsIgnoreCase(capitale)) {
											round.showMessageDialog(null, "Bonne reponse :)",null, JOptionPane.INFORMATION_MESSAGE);
											
									      }else {
									    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
									    	 
									    	  }
									}
								break;
							 case 9:
								 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant3.getNom()+" "+participant3.getPrenom(),JOptionPane.QUESTION_MESSAGE);
									{
										if(userAnswer.equalsIgnoreCase(capitale)) {
											round.showMessageDialog(null, "Bonne reponse :)",null, JOptionPane.INFORMATION_MESSAGE);
										
									      }else {
									    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
									    	
									    	  }
									}
								break;
						
							 }
								
						}	
						
						
						//verification for  final//
						if(participant2.getScore() > participant3.getScore()) {
	
							round.showMessageDialog(null, "Félicitation \n" +" << "+" "+participant1.getNom()+"  "+" "+participant1.getPrenom()+" "+" et "+" "+participant2.getNom()+" "+participant2.getPrenom()+" "+"Vous êtres qualifier pour la grande finale", "Finale",JOptionPane.INFORMATION_MESSAGE);
							participant.getlistefinalistes().add(participant2);
						}else {
							round.showMessageDialog(null, "Félicitation \n" +" << "+" "+participant1.getNom()+" "+participant1.getPrenom()+" "+"et"+" "+participant3.getNom()+" "+participant3.getPrenom()+" "+"Vous êtres qualifier pour la grande finale", "Finale",JOptionPane.INFORMATION_MESSAGE);
							participant.getlistefinalistes().add(participant3);
						}
						
					}
					
					
					
			}else {
				
	
		         round.showMessageDialog(null, "Félicitation  \n" +" < "+participant2.getNom()+" "+participant2.getPrenom()+">"+" tu vas en demi-final", "Qualification pour la Demi-final",
						   JOptionPane.INFORMATION_MESSAGE);
		         int scoreparticip2 = participant2.getScore();
					
				round.showMessageDialog(null, "Bienvenue au Demi-fimal de la competition entre \n" +" << "+participant2.getNom()+" "+participant2.getPrenom()+"> "+" VS "+" <<"+participant3.getNom()+" "+participant3.getPrenom()+">>", "Demi - final",
						   JOptionPane.INFORMATION_MESSAGE);
				
				ListPos.clear();
				for(int i=0; i<dataCatConnaiceGenerale.length; i++) {
					do {
						Random random = new Random();
						indexPos = random.nextInt(dataCatConnaiceGenerale.length);
						
					}while(ListPos.contains(indexPos));
					
					ListPos.add(indexPos);
					pays = dataCatConnaiceGenerale[indexPos][0];
					capitale = dataCatConnaiceGenerale[indexPos][1];
					 
				    
					switch(i) {
					 case 0:
						 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant2.getNom()+""+participant2.getPrenom(),JOptionPane.QUESTION_MESSAGE);
						{
							if(userAnswer.equalsIgnoreCase(capitale)) {
								participant2.setScore(i+1);
								round.showMessageDialog(null, "Bonne reponse :) Score "+participant2.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
								
						      }else {
						    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
						    	
						    	  }
						}
					 	break;
					 case 1:
						 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant3.getNom()+""+participant3.getPrenom(),JOptionPane.QUESTION_MESSAGE);
							{
								if(userAnswer.equalsIgnoreCase(capitale)) {
									participant3.setScore(i);
									round.showMessageDialog(null, "Bonne reponse :) Score"+participant3.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
									
							      }else {
							    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
							    	  System.out.println("Mauvais reponse  :( ");
							    	  }
							}
						break;
					 case 2:
						 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant2.getNom()+""+participant2.getPrenom(),JOptionPane.QUESTION_MESSAGE);
							{
								if(userAnswer.equalsIgnoreCase(capitale)) {
									participant2.setScore(i);
									round.showMessageDialog(null, "Bonne reponse :) Score "+participant2.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
									System.out.println("Bonne reponse :) ");
							      }else {
							    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
							    	
							    	  }
							}
						break;
					 case 3:
						 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant3.getNom()+""+participant3.getPrenom(),JOptionPane.QUESTION_MESSAGE);
							{
								if(userAnswer.equalsIgnoreCase(capitale)) {
									participant3.setScore(i-1);
									round.showMessageDialog(null, "Bonne reponse :) Socre"+participant3.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
									
							      }else {
							    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
							    	 
							    	  }
							}
						break;
					 case 4:
						 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant2.getNom()+""+participant2.getPrenom(),JOptionPane.QUESTION_MESSAGE);
							{
								if(userAnswer.equalsIgnoreCase(capitale)) {
									round.showMessageDialog(null, "Bonne reponse :)",null, JOptionPane.INFORMATION_MESSAGE);
									
							      }else {
							    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
							    	
							    	  }
							}
						break;
					 case 5:
						 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant3.getNom()+""+participant3.getPrenom(),JOptionPane.QUESTION_MESSAGE);
							{
								if(userAnswer.equalsIgnoreCase(capitale)) {
									round.showMessageDialog(null, "Bonne reponse :)",null, JOptionPane.INFORMATION_MESSAGE);
									
							      }else {
							    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
							    	 
							    	  }
							}
						break;
					 case 6:
						 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant2.getNom()+""+participant2.getPrenom(),JOptionPane.QUESTION_MESSAGE);
							{
								if(userAnswer.equalsIgnoreCase(capitale)) {
									round.showMessageDialog(null, "Bonne reponse :)",null, JOptionPane.INFORMATION_MESSAGE);
									System.out.println("Bonne reponse :) ");
							      }else {
							    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
							    	
							    	  }
							}
					 	break;
					 case 7:
						 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant3.getNom()+""+participant3.getPrenom(),JOptionPane.QUESTION_MESSAGE);
							{
								if(userAnswer.equalsIgnoreCase(capitale)) {
									round.showMessageDialog(null, "Bonne reponse :)",null, JOptionPane.INFORMATION_MESSAGE);
									
							      }else {
							    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
							    	 
							    	  }
							}
						break;
					 case 8:
						 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant2.getNom()+""+participant2.getPrenom(),JOptionPane.QUESTION_MESSAGE);
							{
								if(userAnswer.equalsIgnoreCase(capitale)) {
									round.showMessageDialog(null, "Bonne reponse :)",null, JOptionPane.INFORMATION_MESSAGE);
									
							      }else {
							    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
							    	
							    	  }
							}
						break;
					 case 9:
						 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant3.getNom()+""+participant3.getPrenom(),JOptionPane.QUESTION_MESSAGE);
							{
								if(userAnswer.equalsIgnoreCase(capitale)) {
									round.showMessageDialog(null, "Bonne reponse :)",null, JOptionPane.INFORMATION_MESSAGE);
									
							      }else {
							    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
							    	 
							    	  }
							}
						break;
				
					 }
						
				}	
				
				
				//verification for  final//
				if(participant2.getScore() > participant3.getScore()) {
					int scores = participant2.getScore();
					int scorept = scoreparticip2 + scores;
					
					round.showMessageDialog(null, "Félicitation  \n" +" < "+participant2.getNom()+participant2.getPrenom()+">"+"tu vas en Final avec un score de "+scorept+"/4"+"pour les deux match", "Qualification pour la final",
							   JOptionPane.INFORMATION_MESSAGE);
						
					participant.getlistefinalistes().add(participant2);
				}
				
				
				 //participant 1 avec 3 participant round//
		         round.showMessageDialog(null, "Bienvenue au Demi-fimal de la competition entre \n" +" << "+participant1.getNom()+participant1.getPrenom()+"> "+" VS "+" <<"+participant3.getNom()+participant3.getPrenom()+">>", "Demi - final",
						   JOptionPane.INFORMATION_MESSAGE);
		         
				ListPos.clear();
				for(int i=0; i<dataCatMathematique.length; i++) {
					do {
						Random random = new Random();
						indexPos = random.nextInt(dataCatMathematique.length);
						
					}while(ListPos.contains(indexPos));
					
					ListPos.add(indexPos);
					expressions = dataCatMathematique[indexPos][0];
					solution = dataCatMathematique[indexPos][1];
					 
				    
					switch(i) {
					 case 0:
						 userAnswer = round.showInputDialog(null,"Quelle est le resultat de: %s?"+" "+expressions+"?",participant1.getNom()+""+participant1.getPrenom(),JOptionPane.QUESTION_MESSAGE);
						{
							if(userAnswer.equalsIgnoreCase(solution)) {
								participant1.setScore(i+1);
								round.showMessageDialog(null, "Bonne reponse :) Score "+participant1.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
								
						      }else {
						    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+solution,null, JOptionPane.INFORMATION_MESSAGE);
						    	 
						    	  }
						}
					 	break;
					 case 1:
						 userAnswer = round.showInputDialog(null,"Quelle est le resultat de: %s?"+" "+expressions+"?",participant3.getNom()+" "+participant3.getPrenom(),JOptionPane.QUESTION_MESSAGE);
							{
								if(userAnswer.equalsIgnoreCase(solution)) {
									participant3.setScore(i);
									round.showMessageDialog(null, "Bonne reponse :) Score"+participant3.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
									
							      }else {
							    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+solution,null, JOptionPane.INFORMATION_MESSAGE);
							    	 
							    	  }
							}
						break;
					 case 2:
						 userAnswer = round.showInputDialog(null,"Quelle est le resultat de: %s?"+" "+expressions+"?",participant1.getNom()+" "+participant1.getPrenom(),JOptionPane.QUESTION_MESSAGE);
							{
								if(userAnswer.equalsIgnoreCase(solution)) {
									participant1.setScore(i);
									round.showMessageDialog(null, "Bonne reponse :) Score"+participant1.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
									
							      }else {
							    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+solution,null, JOptionPane.INFORMATION_MESSAGE);
							    	  
							    	  }
							}
						break;
					 case 3:
						 userAnswer = round.showInputDialog(null,"Quelle est le resultat de: %s?"+" "+expressions+"?",participant3.getNom()+" "+participant3.getPrenom(),JOptionPane.QUESTION_MESSAGE);
							{
								if(userAnswer.equalsIgnoreCase(solution)) {
									participant2.setScore(i-1);
									round.showMessageDialog(null, "Bonne reponse :) Score "+participant3.getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
									
							      }else {
							    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+solution,null, JOptionPane.INFORMATION_MESSAGE);
							    	 
							    	  }
							}
						break;
					 case 4:
						 userAnswer = round.showInputDialog(null,"Quelle est le resultat de: %s?"+" "+expressions+"?",participant1.getNom()+" "+participant1.getPrenom(),JOptionPane.QUESTION_MESSAGE);
							{
								if(userAnswer.equalsIgnoreCase(solution)) {
									round.showMessageDialog(null, "Bonne reponse :)",null, JOptionPane.INFORMATION_MESSAGE);
									
							      }else {
							    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+solution,null, JOptionPane.INFORMATION_MESSAGE);
							    	 
							    	  }
							}
						break;
					 case 5:
						 userAnswer = round.showInputDialog(null,"Quelle est le resultat de: %s?"+" "+expressions+"?",participant3.getNom()+" "+participant3.getPrenom(),JOptionPane.QUESTION_MESSAGE);
							{
								if(userAnswer.equalsIgnoreCase(solution)) {
									round.showMessageDialog(null, "Bonne reponse :)",null, JOptionPane.INFORMATION_MESSAGE);
									
							      }else {
							    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+solution,null, JOptionPane.INFORMATION_MESSAGE);
							    	  
							    	  }
							}
						break;
					 case 6:
						 userAnswer = round.showInputDialog(null,"Quelle est le resultat de: %s?"+" "+expressions+"?",participant1.getNom()+" "+participant1.getPrenom(),JOptionPane.QUESTION_MESSAGE);
							{
								if(userAnswer.equalsIgnoreCase(solution)) {
									round.showMessageDialog(null, "Bonne reponse :)",null, JOptionPane.INFORMATION_MESSAGE);
									
							      }else {
							    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+solution,null, JOptionPane.INFORMATION_MESSAGE);
							    	 
							    	  }
							}
					 	break;
					 case 7:
						 userAnswer = round.showInputDialog(null,"Quelle est le resultat de: %s?"+" "+expressions+"?",participant3.getNom()+" "+participant3.getPrenom(),JOptionPane.QUESTION_MESSAGE);
							{
								if(userAnswer.equalsIgnoreCase(solution)) {
									round.showMessageDialog(null, "Bonne reponse :)",null, JOptionPane.INFORMATION_MESSAGE);
									
							      }else {
							    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+solution,null, JOptionPane.INFORMATION_MESSAGE);
							    	 
							    	  }
							}
						break;
					 case 8:
						 userAnswer = round.showInputDialog(null,"Quelle est le resultat de: %s?"+" "+expressions+"?",participant1.getNom()+" "+participant1.getPrenom(),JOptionPane.QUESTION_MESSAGE);
							{
								if(userAnswer.equalsIgnoreCase(solution)) {
									round.showMessageDialog(null, "Bonne reponse :)",null, JOptionPane.INFORMATION_MESSAGE);
									
							      }else {
							    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+solution,null, JOptionPane.INFORMATION_MESSAGE);
							    	  
							    	  }
							}
						break;
					 case 9:
						 userAnswer = round.showInputDialog(null,"Quelle est le resultat de: %s?"+" "+expressions+"?",participant3.getNom()+" "+participant3.getPrenom(),JOptionPane.QUESTION_MESSAGE);
							{
								if(userAnswer.equalsIgnoreCase(solution)) {
									round.showMessageDialog(null, "Bonne reponse :)",null, JOptionPane.INFORMATION_MESSAGE);
									 
							      }else {
							    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+solution,null, JOptionPane.INFORMATION_MESSAGE);
							    	 
							    	  }
							}
						break;
				
					 }
						
				}	
				
				//verification for  final//
				if(participant1.getScore() > participant3.getScore()) {
					
					round.showMessageDialog(null, "Félicitation \n" +" << "+" "+participant1.getNom()+" "+participant1.getPrenom()+" et "+" "+participant2.getNom()+""+participant2.getPrenom()+" "+"Vous êtres qualifier pour la grande finale", "Qualification pour la final",JOptionPane.INFORMATION_MESSAGE);
					participant.getlistefinalistes().add(participant1);
				}else {
					round.showMessageDialog(null, "Félicitation \n" +" << "+participant2.getNom()+" "+participant2.getPrenom()+" et "+participant3.getNom()+participant3.getPrenom()+" "+"Vous êtres qualifier pour la grande finale", "Qualification pour la final",JOptionPane.INFORMATION_MESSAGE);
					participant.getlistefinalistes().add(participant3);
				}
				
				
				
				
			}
			
			
			int g;
			
			for(g=0; g<participant.getlistefinalistes().size();g++) {
				System.out.println(participant.getlistefinalistes().get(g).getNom());
			}
			
			///Final pour les participants///
			
			round.showMessageDialog(null, "Bienvenue dans la grande finale de la compétition entre \n" +" << "+participant.getlistefinalistes().get(0).getNom()+participant.getlistefinalistes().get(0).getPrenom()+"> "+" VS "+" <<"+participant.getlistefinalistes().get(1).getNom()+participant.getlistefinalistes().get(1).getPrenom()+">>", "Finale",
					   JOptionPane.INFORMATION_MESSAGE);
		
			ListPos.clear();

			for(int j=0; j<dataCatConnaiceGenerale.length; j++) {
				do {
					Random random = new Random();
					indexPos = random.nextInt(dataCatConnaiceGenerale.length);
					
				}while(ListPos.contains(indexPos));
				
				ListPos.add(indexPos);
				pays = dataCatConnaiceGenerale[indexPos][0];
				capitale = dataCatConnaiceGenerale[indexPos][1];
				 
			    
				switch(j) {
				 case 0:
					 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant.getListeOfparticipant().get(0).getNom()+" "+participant.getListeOfparticipant().get(0).getPrenom(),JOptionPane.QUESTION_MESSAGE);
					{
						if(userAnswer.equalsIgnoreCase(capitale)) {
							participant.getListeOfparticipant().get(0).setScore(j+1);
							round.showMessageDialog(null, "Bonne reponse :) Score "+participant.getListeOfparticipant().get(0).getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
							
					      }else {
					    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
					    	  
					    	  }
					}
				 	break;
				 case 1:
					 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant.getListeOfparticipant().get(1).getNom()+" "+participant.getListeOfparticipant().get(1).getPrenom(),JOptionPane.QUESTION_MESSAGE);
						{
							if(userAnswer.equalsIgnoreCase(capitale)) {
								participant.getListeOfparticipant().get(1).setScore(j);
								round.showMessageDialog(null, "Bonne reponse :) Score"+participant.getListeOfparticipant().get(1).getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
								
						      }else {
						    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
						    	  
						    	  }
						}
					break;
				 case 2:
					 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant.getListeOfparticipant().get(0).getNom()+" "+participant.getListeOfparticipant().get(0).getPrenom(),JOptionPane.QUESTION_MESSAGE);
						{
							if(userAnswer.equalsIgnoreCase(capitale)) {
								participant.getListeOfparticipant().get(0).setScore(j);
								round.showMessageDialog(null, "Bonne reponse :) Score "+participant.getListeOfparticipant().get(0).getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
								
						      }else {
						    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
						    	  
						    	  }
						}
					break;
				 case 3:
					 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant.getListeOfparticipant().get(1).getNom()+" "+participant.getListeOfparticipant().get(1).getPrenom(),JOptionPane.QUESTION_MESSAGE);
						{
							if(userAnswer.equalsIgnoreCase(capitale)) {
								participant.getListeOfparticipant().get(1).setScore(j-1);
								round.showMessageDialog(null, "Bonne reponse :) Score"+participant.getListeOfparticipant().get(1).getScore()+"/2",null, JOptionPane.INFORMATION_MESSAGE);
								
						      }else {
						    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
						    	  
						    	  }
						}
					break;
				 case 4:
					 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant.getListeOfparticipant().get(0).getNom()+" "+participant.getListeOfparticipant().get(0).getPrenom(),JOptionPane.QUESTION_MESSAGE);
						{
							if(userAnswer.equalsIgnoreCase(capitale)) {
								round.showMessageDialog(null, "Bonne reponse :)",null, JOptionPane.INFORMATION_MESSAGE);
								
						      }else {
						    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
						    	
						    	  }
						}
					break;
				 case 5:
					 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant.getListeOfparticipant().get(1).getNom()+""+participant.getListeOfparticipant().get(1).getPrenom(),JOptionPane.QUESTION_MESSAGE);
						{
							if(userAnswer.equalsIgnoreCase(capitale)) {
								round.showMessageDialog(null, "Bonne reponse :)",null, JOptionPane.INFORMATION_MESSAGE);
							
						      }else {
						    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
						    	 
						    	  }
						}
					break;
				 case 6:
					 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant.getListeOfparticipant().get(0).getNom()+" "+participant.getListeOfparticipant().get(0).getPrenom(),JOptionPane.QUESTION_MESSAGE);
						{
							if(userAnswer.equalsIgnoreCase(capitale)) {
								round.showMessageDialog(null, "Bonne reponse :)",null, JOptionPane.INFORMATION_MESSAGE);
								
						      }else {
						    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
						    	 
						    	  }
						}
				 	break;
				 case 7:
					 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant.getListeOfparticipant().get(1).getNom()+" "+participant.getListeOfparticipant().get(1).getPrenom(),JOptionPane.QUESTION_MESSAGE);
						{
							if(userAnswer.equalsIgnoreCase(capitale)) {
								round.showMessageDialog(null, "Bonne reponse :)",null, JOptionPane.INFORMATION_MESSAGE);
								
						      }else {
						    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
						    	 
						    	  }
						}
					break;
				 case 8:
					 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant.getListeOfparticipant().get(0).getNom()+" "+participant.getListeOfparticipant().get(0).getPrenom(),JOptionPane.QUESTION_MESSAGE);
						{
							if(userAnswer.equalsIgnoreCase(capitale)) {
								round.showMessageDialog(null, "Bonne reponse :)",null, JOptionPane.INFORMATION_MESSAGE);
								
						      }else {
						    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
						    	 
						    	  }
						}
					break;
				 case 9:
					 userAnswer = round.showInputDialog(null,"Quelle est la capitale de"+" "+pays+"?",participant.getListeOfparticipant().get(0).getNom()+" "+participant.getListeOfparticipant().get(0).getPrenom(),JOptionPane.QUESTION_MESSAGE);
						{
							if(userAnswer.equalsIgnoreCase(capitale)) {
								round.showMessageDialog(null, "Bonne reponse :)",null, JOptionPane.INFORMATION_MESSAGE);
								
						      }else {
						    	  round.showMessageDialog(null, "Mauvais reponse --> tu devrais repondre"+" "+capitale,null, JOptionPane.INFORMATION_MESSAGE);
						    	
						    	  }
						}
					break;
			
				 }
					
			}	
		
			if(participant.getListeOfparticipant().get(0).getScore() > participant.getListeOfparticipant().get(1).getScore()) {
				 round.showMessageDialog(null, "Félicitation "+participant.getListeOfparticipant().get(0).getNom()+" "+participant.getListeOfparticipant().get(0).getPrenom()+" "+"Vous avez remporté la grande finale :) ",null, JOptionPane.INFORMATION_MESSAGE);
			}else {
				 round.showMessageDialog(null, "Félicitation "+participant.getListeOfparticipant().get(1).getNom()+" "+participant.getListeOfparticipant().get(1).getPrenom()+" "+"Vous avez remporté la grande finale :)",null, JOptionPane.INFORMATION_MESSAGE);
			}
			
	}	

}

