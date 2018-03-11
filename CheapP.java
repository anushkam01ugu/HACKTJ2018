import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.awt.image.*;

public class CheapP extends JPanel
{
   public JPanel p, mainScreen;
   CardLayout cardLayout = new CardLayout();
   public CheapP()
   {
      mainScreen = new JPanel();
      mainScreen.setLayout(cardLayout);
      add(mainScreen);
      
      p = new JPanel(new GridLayout(7, 1));
      mainScreen.add(p);
      JLabel title = new JLabel("FoodGenie: Cheap");
      p.add(title);
      JLabel j1 = new JLabel("chick-fil-a");
      JLabel j2 = new JLabel("subway");
      JLabel j3 = new JLabel("popeyes");
      JLabel j4 = new JLabel("mcdonalds");
      JLabel j5 = new JLabel("KFC");
      JLabel j6 = new JLabel("Five Guys");
      JLabel j7 = new JLabel("Taco Bell");
      p.add(j1);
      p.add(j2);
      p.add(j3);
      p.add(j4);
      p.add(j5);
      p.add(j6);
      p.add(j7);
      
      JLabel yay;
      int random = (int)(Math.random()*7) + 1;
      if(random == 1)
         yay=new JLabel("You should go to chick-fil-a!");
      else if(random == 2)
         yay=new JLabel("You should go to subway!");
      else if(random == 3)
         yay=new JLabel("You should go to popeyes!");
      else if(random == 4)
         yay=new JLabel("You should go to mcdonalds!");
      else if(random == 5)
         yay=new JLabel("You should go to KFC!");
      else if(random == 6)
         yay=new JLabel("You should go to Five Guys!");
      else
         yay=new JLabel("You should go to Taco Bell");
   
      p.add(yay);
      
      
      
      
   }

  
}