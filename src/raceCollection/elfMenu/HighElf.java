package raceCollection.elfMenu;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;
import raceCollection.Elf;

public class HighElf extends Elf {

	private JPanel jp;
	private JButton acceptRace;

	// Strings unique to High elf
	String ASI = abilityScoreIncrease;
	String highElf_ASI = "Your Intelligence score increases by 1.";
	String elfWeaponTraining = "You have proficiency with the longsword, shortsword, shortbow, and longbow.";
	String cantrips = "You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.";
	String extraLanguage = "You can speak, read, and write one extra language of your choice.";
	
	ArrayList<String> atri = new ArrayList<String>();
	
	// Info  {Strength,Dexterity,Constitution,Intelligence,Wisdom,Charisma }
	//String[] atri = {"0","2","0","1","0","0"};
	
	public HighElf() {

		
		atri.add("0"); //Strength
		atri.add("2"); //Dexterity
		atri.add("0"); //Constitution
		atri.add("1"); //Intelligence
		atri.add("0"); //Wisdom
		atri.add("0"); //Charisma
		createJPanel();
		
	}
		public void createJPanel(){
		jp = new JPanel();
		jp.setSize(640, 480);
		jp.setLayout(new MigLayout("", "[25%][75%]", "[10%][10%][10%][10%][10%][10%][10%][10%][10%][10%][10%]"));
		jp.add(new JLabel("<html><font size=\"6\">High Elf</font></html>"), "cell 0 0 2 1,alignx center,aligny center");
		
		// Ability Score Increase
		jp.add(new JLabel("<html><b>Ability Score</b><br><div align=\"right\"><b>Increase:</b></html>"), "cell 0 1,alignx right,aligny bottom");
		jp.add(new JLabel("<html>"+ASI+"<br><div align=\"left\">"+highElf_ASI+"</html>"), "cell 1 1,alignx left,aligny bottom");
						
		// alignment
		jp.add(new JLabel("<html><b>Alignment:</b></html>"), "cell 0 2,alignx right,aligny bottom");
		jp.add(new JLabel(alignment), "cell 1 2,alignx left,aligny bottom");
						
		//Size
		jp.add(new JLabel("<html><b>Size:</b></html>"), "cell 0 3,alignx right, aligny top");
		jp.add(new JLabel(size), "cell 1 3,alignx left, aligny top");
								
		//Speed
		jp.add(new JLabel("<html><b>Speed:</b></html>"), "cell 0 4,alignx right, aligny top");
		jp.add(new JLabel(speed), "cell 1 4,alignx left, aligny top");

		//languages
		jp.add(new JLabel("<html><b>Languages:</b></html>"), "cell 0 5,alignx right, aligny top");
		jp.add(new JLabel(languages), "cell 1 5,alignx left, aligny top");
		
		//elf weapon training
		jp.add(new JLabel("<html><b>Elf Weapon Training:</b></html>"), "cell 0 6,alignx right, aligny top");
		jp.add(new JLabel(elfWeaponTraining), "cell 1 6,alignx left, aligny top");
		
		//cantrips
		jp.add(new JLabel("<html><b>Cantrips:</b></html>"), "cell 0 7,alignx right, aligny top");
		jp.add(new JLabel(cantrips), "cell 1 7,alignx left, aligny top");
		
		//extra languages
		jp.add(new JLabel("<html><b>Extra Language:</b></html>"), "cell 0 8,alignx right, aligny top");
		jp.add(new JLabel(extraLanguage), "cell 1 8,alignx left, aligny top");
		
		
		acceptRace = new JButton("Accept High Elf as Your Race");
		jp.add(acceptRace, "cell 0 9 2 1,alignx center,aligny center");
		
	}

	public JPanel getJPanel(){return jp;}
	public JButton getAcceptedRace(){return acceptRace;}
	public ArrayList<String> getAttributes(){return atri;}
}
