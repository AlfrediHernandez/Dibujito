import java.awt.*;
import java.awt.event.*;
public class Dibujo extends Frame{
	public static void main(String [] ar){
		Frame f=new Dibujo();
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	});
		f.setSize(400,300);
		f.setVisible(true);
		f.setTitle("Alfredihdz 15-oct-2020");
}
public void paint(Graphics g){
		g.drawOval(130,50,50,50);  //cabeza
		g.setColor(Color.cyan);  
		g.drawOval(80,100,150,150); //cuerpo
		g.setColor(Color.blue);		
		g.drawOval(80,100,30,30);	//brazo
		g.drawOval(200,100,30,30);
		g.setColor(Color.green);
		g.drawOval(140,60,10,10);  //ojos
		g.drawOval(160,60,10,10);  //ojos
		g.setColor(Color.red);
		g.drawOval(150,75,10,5);   //boca
	}
}