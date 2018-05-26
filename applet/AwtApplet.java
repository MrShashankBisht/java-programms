import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class AwtApplet extends Applet implements ActionListener{
  TextField t1;
  Button b1,b2;
  public void init()
   {
    setBackground(new Color(0,255,0));
    setForeground(new Color(255,0,0));
    setFont(new Font("TimesRoman",Font.PLAIN,22));
   
     t1=new TextField("0");
     add(t1);    
   
    b1=new Button("  Square ");
    add(b1);
    b1.addActionListener(this);

   b2=new Button("  Double ");
    add(b2);
    b2.addActionListener(this);
   



     }

  public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
         {
        int res=Integer.parseInt(t1.getText());
         res=res*res;
        t1.setText(String.valueOf(res));
        }
      else if(ae.getSource()==b2)
         {
        int res=Integer.parseInt(t1.getText());
         res=res*2;
        t1.setText(String.valueOf(res));
        }
    }

  
                    }
 

