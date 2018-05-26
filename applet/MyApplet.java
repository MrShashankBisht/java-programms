import java.applet.Applet;
import java.awt.*;
public class MyApplet extends Applet{
  String str;
  public void init()
   {
    str="Hello Java Applet";
    setBackground(new Color(0,255,0));
    setForeground(new Color(255,0,0));
    setFont(new Font("TimesRoman",Font.PLAIN,22));
    }
  public void paint(Graphics g)
    {
       g.drawString(str,50,50);
   }
                      }
 

