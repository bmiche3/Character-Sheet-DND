package backgroundCollection;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import dndProject.Character.Proficiencies;
import net.miginfocom.swing.MigLayout;

public class Charlatan {
	private JPanel jp;
	private JButton acceptBackground;

		ArrayList<Proficiencies> skillProf = new ArrayList<Proficiencies>();
		//String[] skillProf = {"Deception", "Slight of Hand"};
		ArrayList<String> toolProf = new ArrayList<String>();
		//String[] toolProf = {"Disguise kit", "Forgery kit"};
		String equipment = "A set of fine clothes, a disguise kit, tools of the con of your choice, and a belt pouch containing 15 GP.";
		
	public Charlatan() {

		skillProf.add(Proficiencies.DECEPTION);
		skillProf.add(Proficiencies.SLEIGHT_OF_HAND);
		toolProf.add("Disguise kit");
		toolProf.add("Forgery kit");
		
		createJPanel();
	}
		
		public void createJPanel(){
		jp = new JPanel();
		jp.setSize(640, 480);
		jp.setLayout(new MigLayout("", "[25%][75%]", "[10%][10%][10%][10%][10%][10%][10%][10%][10%][10%][10%]"));
		jp.add(new JLabel("<html><font size=\"6\">Carlatan</font></html>"), "cell 0 0 2 1,alignx center,aligny center");
		
		//Proficiencies
		jp.add(new JLabel("<html><b>Proficiencies:</b></html>"), "cell 0 1,alignx right,aligny bottom");
		jp.add(new JLabel("Insight, Religion"), "cell 1 1,alignx left,aligny bottom");
		
		//tools
		jp.add(new JLabel("<html><b>Tool Proficiencies:</b></html>"), "cell 0 2,alignx right,aligny bottom");
		jp.add(new JLabel("Disguise kit, Forgery kit"), "cell 1 2,alignx left,aligny bottom");		
		
		//equipment
		jp.add(new JLabel("<html><b>Equipment:</b></html>"), "cell 0 3,alignx right,aligny bottom");
		jp.add(new JLabel(equipment), "cell 1 3,alignx left,aligny bottom");
		
		acceptBackground = new JButton("Accept Carlatan as Your Background");
		jp.add(acceptBackground, "cell 0 9 2 1,alignx center,aligny center");
		
	}

	public JPanel getJPanel(){return jp;}
	public JButton getAcceptedBackground(){return acceptBackground;}
	public ArrayList<Proficiencies> getProficiencies(){return skillProf;}
	public ArrayList<String> getTools(){return toolProf;}
}

