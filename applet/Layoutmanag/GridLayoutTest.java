import java.awt.*;
import java.applet.*;

public class GridLayoutTest extends Applet
{
static final int row =3;
static final int col =7;
public void init()
{
setLayout(new GridLayout(row,col));
setFont(new Font("SansSerif", Font.BOLD, 24));
for(int i = 0; i < 20; i++)
{
add(new Button("" + i));
}
}
}