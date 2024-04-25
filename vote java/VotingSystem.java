import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VotingSystem extends JFrame implements ActionListener {
    private JLabel label1, label2, countLabel1, countLabel2;
    private JButton voteButton1, voteButton2;
    // state the count to hold the vote count
    private int count1, count2;

    public VotingSystem() {
        setTitle("Voting System");
        // choose the set up frame
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        label1 = new JLabel("Candidate 1: Yonatan");
        label2 = new JLabel("Candidate 2: Tawanda");
        // both votes start from zero
        countLabel1 = new JLabel("0");
        countLabel2 = new JLabel("0");
        voteButton1 = new JButton("Vote for Yonatan");
        voteButton2 = new JButton("Vote for Tawanda");

        // Add GUI components to the JFrame
        add(label1);
        add(countLabel1);
        add(label2);
        add(countLabel2);
        add(voteButton1);
        add(voteButton2);

        // time to add the buttons
        voteButton1.addActionListener(this);
        voteButton2.addActionListener(this);

        count1 = 0;
        count2 = 0;
    }

    public void actionPerformed(ActionEvent e) {
        // check if button is click and which one is clicked
        if (e.getSource() == voteButton1) {
            count1++;
            // Update the vote count 
            countLabel1.setText(String.valueOf(count1));
            JOptionPane.showMessageDialog(this, "You voted for Candidate 1!");
        } else if (e.getSource() == voteButton2) {
            count2++;
            // Update the vote count 
            countLabel2.setText(String.valueOf(count2));
            JOptionPane.showMessageDialog(this, "You voted for Candidate 2!");
        }
    }

    public static void main(String[] args) {
        // show the names of the candidat and the vote count to the votes
        SwingUtilities.invokeLater(() -> {
            VotingSystem votingSystem = new VotingSystem();
            votingSystem.setVisible(true);
        });
    }
}
