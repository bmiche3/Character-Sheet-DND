package classCollection;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import dndProject.Character.Proficiencies;
import dndProject.Character.Attributes;
import net.miginfocom.swing.MigLayout;

public class Sorcerer {

	private JPanel jp;
	private JButton acceptClass;

	//Strings unique to Sorcerer
	String hitPoints = "1d6 + your Constitution modifier per Sorcerer level";
	String armor = "Proficient in no armors.";
	String weapons = "Proficient in daggers, darts, slings, quarterstaffs, and light crossbows.";
	String savingThrows = "Constitution and Charisma are the Sorcerer's saving throws.";
	String skills = "Choose two from Arcana, Deception, Insight, Intimidation, Persuasion, and Religion.";
			
	ArrayList<Proficiencies> skillList = new ArrayList<Proficiencies>();
	ArrayList<Attributes> sThrows = new ArrayList<Attributes>(); 
	
	public Sorcerer() {

		skillList.add(Proficiencies.ARCANA);
		skillList.add(Proficiencies.DECEPTION);
		skillList.add(Proficiencies.INSIGHT);
		skillList.add(Proficiencies.INTIMIDATION);
		skillList.add(Proficiencies.PERSUASION);
		skillList.add(Proficiencies.REGLIGION);
		
		sThrows.add(Attributes.CHA);
		sThrows.add(Attributes.CON);
		
		createJPanel();
		
	}
		public void createJPanel(){
		jp = new JPanel();
		jp.setSize(640, 480);
		jp.setLayout(new MigLayout("", "[25%][75%]", "[10%][10%][10%][10%][10%][10%][10%][10%][10%][10%][10%]"));
		jp.add(new JLabel("<html><font size=\"6\">Sorcerer</font></html>"), "cell 0 0 2 1,alignx center,aligny center");
		
		
		// Hitpoints
		jp.add(new JLabel("<html><b>Hit Points:</b></html>"), "cell 0 1,alignx right,aligny bottom");
		jp.add(new JLabel(hitPoints), "cell 1 1,alignx left,aligny bottom");
				
		// Armor
		jp.add(new JLabel("<html><b>Armor:</b></html>"), "cell 0 2,alignx right,aligny bottom");
		jp.add(new JLabel(armor), "cell 1 2,alignx left,aligny bottom");
				
		// Weapons
		jp.add(new JLabel("<html><b>Weapons:</b></html>"), "cell 0 3,alignx right,aligny bottom");
		jp.add(new JLabel(weapons), "cell 1 3,alignx left,aligny bottom");
				
		// Saving Throws
		jp.add(new JLabel("<html><b>Saving Throws:</b></html>"), "cell 0 4,alignx right,aligny bottom");
		jp.add(new JLabel(savingThrows), "cell 1 4,alignx left,aligny bottom");
				
		// Skills
		jp.add(new JLabel("<html><b>Skills:</b></html>"), "cell 0 5,alignx right,aligny bottom");
		jp.add(new JLabel(skills), "cell 1 5,alignx left,aligny bottom");
		
		acceptClass = new JButton("Accept Sorcerer as Your Class");
		jp.add(acceptClass, "cell 0 9 2 1,alignx center,aligny center");
		
	}

	public JPanel getJPanel(){return jp;}
	public JButton getAcceptedClass(){return acceptClass;}
	public ArrayList<Attributes> getSavingThrows(){return sThrows;}
	public String getSkillString() {
		// TODO Auto-generated method stub
		return skills;
	}
	public ArrayList<Proficiencies> getProficiencies() {
		// TODO Auto-generated method stub
		return skillList;
	}
}
