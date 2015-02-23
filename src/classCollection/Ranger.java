package classCollection;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import dndProject.Character.Proficiencies;
import dndProject.Character.Attributes;
import net.miginfocom.swing.MigLayout;

public class Ranger {

	private JPanel jp;
	private JButton acceptClass;

	//String unique to Ranger
	String hitPoints = "1d10 + your Constitution modifier per Ranger level";
	String armor = "Proficient in Light armor, Medium armor, and shields";
	String weapons = "Proficient in simple and martial weapons.";
	String savingThrows = "Strength and Dexterity are the Ranger's saving throws.";
	String skills = "Choose three from Animal Handling, Athletics, Insight, Investigation, Nature, Perception, Stealth, and Survial.";
	
	ArrayList<Proficiencies> skillList = new ArrayList<Proficiencies>();
	ArrayList<Attributes> sThrows = new ArrayList<Attributes>(); 
	
	public Ranger() {

		skillList.add(Proficiencies.ANIMAL_HANDELING);
		skillList.add(Proficiencies.ATHETICS);
		skillList.add(Proficiencies.INSIGHT);
		skillList.add(Proficiencies.INVESTIGATION);
		skillList.add(Proficiencies.NATURE);
		skillList.add(Proficiencies.PERCEPTION);
		skillList.add(Proficiencies.STEALTH);
		skillList.add(Proficiencies.SURVIVAL);
		
		sThrows.add(Attributes.DEX);
		sThrows.add(Attributes.STR);
		
		createJPanel();
		
	}
		
		public void createJPanel(){
		jp = new JPanel();
		jp.setSize(640, 480);
		jp.setLayout(new MigLayout("", "[25%][75%]", "[10%][10%][10%][10%][10%][10%][10%][10%][10%][10%][10%]"));
		jp.add(new JLabel("<html><font size=\"6\">Ranger</font></html>"), "cell 0 0 2 1,alignx center,aligny center");
		
		
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
		
		acceptClass = new JButton("Accept Ranger as Your Class");
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

