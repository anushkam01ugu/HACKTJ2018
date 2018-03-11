import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.awt.image.*;

public class MediumP extends JPanel
{
   public JPanel p, mainScreen;
   CardLayout cardLayout = new CardLayout();
   public MediumP()
   {
      mainScreen = new JPanel();
      mainScreen.setLayout(cardLayout);
      add(mainScreen);
      
      p = new JPanel(new GridLayout(5, 1));
      mainScreen.add(p);
      JLabel title = new JLabel("FoodGenie: Medium");
      p.add(title);
      JLabel j1 = new JLabel("PF Changs");
      JLabel j2 = new JLabel("Pei Wei");
      JLabel j3 = new JLabel("Uncle Julio’s");
      JLabel j4 = new JLabel("Olive Garden");
      JLabel j5 = new JLabel("Coastal Flats");
      p.add(j1);
      p.add(j2);
      p.add(j3);
      p.add(j4);
      p.add(j5);
      JLabel yay;
      int random = (int)(Math.random()*5) + 1;
      if(random == 1)
         yay=new JLabel("You should go to PF Changs!");
      else if(random == 2)
         yay=new JLabel("You should go to Pei Wei!");
      else if(random == 3)
         yay=new JLabel("You should go to Uncle Julio’s!");
      else if(random == 4)
         yay=new JLabel("You should go to Olive Garden!");
      else
         yay=new JLabel("You should go to Coastal Flats!");
   
      p.add(yay);
      
      
      
   }

  
}