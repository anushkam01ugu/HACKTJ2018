import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.awt.image.*;

public class FoodPanel extends JPanel
{
   public JPanel p, mainScreen;
   CardLayout cardLayout = new CardLayout();
   public FoodPanel()
   {
      mainScreen = new JPanel();
      mainScreen.setLayout(cardLayout);
      add(mainScreen);
      
      p = new JPanel(new GridLayout(6,1));
      mainScreen.add(p);
      JLabel title = new JLabel("FoodGenie");
      title.setFont(new Font("Marvel", Font.PLAIN, 20));
      title.setForeground(new Color(250,105,89));
      
      p.add(title);
      //JTextField text = new JTextField();
      //JButton generate = new JButton("generate");
      
      
      JButton cheap = new JButton("Cheap");
      cheap.addActionListener(new Listener_ch());
      p.add(cheap);
      
      cheap.setFont(new Font("Marvel", Font.PLAIN, 20));
      
      cheap.setForeground(new Color(82, 235, 189));
      cheap.setBackground(new Color(82, 235, 189));
      cheap.setOpaque(true);

      
      JButton medium = new JButton("Normal");
      medium.addActionListener(new Listener_medium());
      p.add(medium);
      
      medium.setFont(new Font("Marvel", Font.PLAIN, 20));
      medium.setForeground(new Color(82, 235, 189));
      medium.setBackground(new Color(82, 235, 189));
      medium.setOpaque(true);
      

      
      JButton expensive = new JButton("Expensive");
      expensive.addActionListener(new Listener_expensive());
      p.add(expensive);
      
      expensive.setFont(new Font("Marvel", Font.PLAIN, 20));
      expensive.setForeground(new Color(82, 235, 189));
      expensive.setBackground(new Color(82, 235, 189));
      expensive.setOpaque(true);
      
      cardLayout.show(mainScreen, "1");
      JPanel ch = new CheapP();
      mainScreen.add(ch, "2");
      
      JPanel m = new MediumP();
      mainScreen.add(m, "3");
      
      JPanel l = new LargeP();
      mainScreen.add(l, "4");
      
   }
  
   private class Listener_ch implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
          cardLayout.show(mainScreen, "2");
      }
   }
   private class Listener_medium implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         cardLayout.show(mainScreen, "3");
      }
   }
   private class Listener_expensive implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
        cardLayout.show(mainScreen, "4"); 
      }
   }
  
}