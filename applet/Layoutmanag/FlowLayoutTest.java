import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class FlowLayoutTest extends Applet implements ItemListener
{
String str = "";
Checkbox Go4expert, codeitwell,mbaguys;
Label l1;
public void init()
{
setFont(new Font("timesnewroman",Font.PLAIN,22));
// set left-aligned flow layout
setLayout(new FlowLayout(FlowLayout.RIGHT));
l1=new Label("Select the Best site:");
Go4expert = new Checkbox("Go4expert.com", null, true);
codeitwell = new Checkbox("codeitwell.com ");
mbaguys = new Checkbox("mbaguys.net");
add(l1);
add(Go4expert);
add(codeitwell);
add(mbaguys);
// register to receive item events
Go4expert.addItemListener(this);
codeitwell.addItemListener(this);
mbaguys.addItemListener(this);
}
// Repaint when status of a check box changes.
public void itemStateChanged(ItemEvent ie)
{
repaint();
}
// Display current state of the check boxes.
public void paint(Graphics g)
{
str = "Go4expert.com : " + Go4expert.getState();
g.drawString(str, 6, 100);
str = "codeitwell.com: " + codeitwell.getState();
g.drawString(str, 6, 120);
str = "mbaguys.net : " + mbaguys.getState();
g.drawString(str, 6, 140);
}
}