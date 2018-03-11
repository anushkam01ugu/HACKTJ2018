import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.awt.image.*;

public class LargeP extends JPanel
{
   public JPanel p, mainScreen;
   CardLayout cardLayout = new CardLayout();
   public LargeP()
   {
      mainScreen = new JPanel();
      mainScreen.setLayout(cardLayout);
      add(mainScreen);
      
      p = new JPanel(new GridLayout(5, 1));
      mainScreen.add(p);
      JLabel title = new JLabel("FoodGenie: Expensive");
      p.add(title);
      JLabel j1 = new JLabel("Sweetwater Tavern");
      JLabel j2 = new JLabel("Capital Grille");
      JLabel j3 = new JLabel("Morton’s Steakhouse");
      JLabel j4 = new JLabel("Bonefish Grill");
      p.add(j1);
      p.add(j2);
      p.add(j3);
      p.add(j4);
      
      JLabel yay;
      int random = (int)(Math.random()*4) + 1;
      if(random == 1)
         yay=new JLabel("You should go to Sweetwater Tavern!");
      else if(random == 2)
         yay=new JLabel("You should go to Capital Grille!");
      else if(random == 3)
         yay=new JLabel("You should go to Morton’s Steakhouse!");
      else
         yay=new JLabel("You should go to Bonefish Grill!");
   
      p.add(yay);

      
      
      
      
   }

  
}