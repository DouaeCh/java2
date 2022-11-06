import java.awt.*
public class Main
  public static void main (string [] args){
  Frame fenetre = new frame("My first GU");
  Button b1 = new Button ("Valider");
  Button b2 = new Button ("Supprimer");
  TextField tf = new TextField("email@gmail.com");
  TextField tf2 = new TextField ("XXXX XXXX YYYY YYYY");
  fenetre.add(b1);
  fenetre.add(tf);
  fenetre.add(b2);
 

  fenetre.add(tf2);
  fenetre.setVisible(true);
  fenetre.setBounds(300 , 300 , 450 , 600);
 

