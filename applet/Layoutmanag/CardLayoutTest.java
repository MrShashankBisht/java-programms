// Demonstrate CardLayout.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class CardLayoutTest extends Applet implements ActionListener,
MouseListener
{
Checkbox Java, C, VB ;
Panel langCards;
CardLayout cardLO;
Button OO, Other;
public void init()
{
OO = new Button("ObjectOriented Languages");
Other = new Button("Procedural Languages");
add(OO);
add(Other);
cardLO = new CardLayout();
langCards = new Panel();
langCards.setLayout(cardLO); // set panel layout to card layout
Java = new Checkbox("Java", null, true);
C = new Checkbox("C");
VB = new Checkbox("VB");
// add OO languages check boxes to a panel
Panel OOPan = new Panel();
OOPan.add(Java);
OOPan.add(VB);
// Add other languages check boxes to a panel
Panel otherPan = new Panel();
otherPan.add(C);
// add panels to card deck panel
langCards.add(OOPan, "Object Oriented Languages");
langCards.add(otherPan, "Procedural Languages");
// add cards to main applet panel
add(langCards);
// register to receive action events
OO.addActionListener(this);
Other.addActionListener(this);
// register mouse events
addMouseListener(this);
}
// Cycle through panels.
public void mousePressed(MouseEvent me)
{
cardLO.next(langCards);
}
// Provide empty implementations for the other MouseListener methods.
public void mouseClicked(MouseEvent me)
{
}
public void mouseEntered(MouseEvent me)
{
}
public void mouseExited(MouseEvent me)
{
}
public void mouseReleased(MouseEvent me)
{
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource() == OO)
{
cardLO.show(langCards, "Object Oriented Languages");
}
else
{
cardLO.show(langCards, "Procedural Languages");
}
}
}