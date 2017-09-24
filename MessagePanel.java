//MessagePanel.java:Display a message on a JPanel
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;

public class MessagePanel extends JPanel
{
 private String message = "Welcome to java";
 private int xCoordinate =20;
 private int yCoordinate =20;
 
 private boolean centered;
 
 public MessagePanel()
 {
 }
 
 public MessagePanel(String message)
 {
  this.message=message;
 }
 public String getMessage()
 {
  return message;
 }
 public void setMessage(String message)
 {
  this.message=message;
 }
 public int getXCoordinate()
 {
  return xCoordinate;
 }
 public void setXCoordinate(int x)
 {
  this.xCoordinate=x;
 }
 public int getYCoordinate()
 {
  return yCoordinate;
 }
 public void setYCoordinate(int y)
 {
  this.yCoordinate=y;
 }
 public boolean isCentered()
 {
  return centered;
 }
 public void setCentered(boolean centered)
  {
   this.centered=centered;
  }
 public void paintComponent(Graphics g)
 {
  super.paintComponent(g);
  if(centered)
  {
   FontMetrics fm=g.getFontMetrics();
   
   int w=fm.stringWidth(message);
   int h=fm.getAscent();
   
   xCoordinate=(getSize().width-w)/2;
   yCoordinate=(getSize().height+h)/2;
  }
  
  g.drawString(message,xCoordinate,yCoordinate);
}

public Dimension getPreferredSize()
{
 return new Dimension(200,100);
}

public Dimension getMinimumSize()
{
 return new Dimension(200,100);
}
}
 
