import java.awt.*;        
import java.awt.event.*;  
import javax.swing.*; 

public class Leetcode extends Frame implements WindowListener
{

   private Label Easy_Count_label;   
   private TextField Easy_Text; 
   private Button Easy_inc;  
   private Button Easy_dec;
   private int Easy_c = 0; 

   private Label Medium_Count_label;   
   private TextField Medium_Text; 
   private Button Medium_inc;
   private Button Medium_dec;  
   private int Medium_c = 0;  

   private Label Hard_Count_label;   
   private TextField Hard_Text; 
   private Button Hard_inc; 
   private Button Hard_dec;   
   private int Hard_c = 0;     

   private Button reset; 
               public Leetcode () {
                  setLayout(new FlowLayout());

                  Easy_Count_label = new Label("Easy Leetcode"); 
                  add(Easy_Count_label);                   

                  Easy_Text = new TextField(Easy_c + "", 10);
                  Easy_Text.setEditable(true);      
                  add(Easy_Text);                 

                  Easy_inc = new Button("Easy +1");   
                  add(Easy_inc);                 

                  BtnCountListener listener = new BtnCountListener();
                  Easy_inc.addActionListener(listener);
                  Easy_dec = new Button("Easy -1");   
                  add(Easy_dec);                 
                  Easy_dec.addActionListener(listener);



                  Medium_Count_label = new Label("Medium Leetcode"); 
                  add(Medium_Count_label);                   
                  Medium_Text = new TextField(Medium_c + "", 10);
                  Medium_Text.setEditable(true);      
                  add(Medium_Text);                 

                  Medium_inc = new Button("Medium +1");   
                  add(Medium_inc);                 
                  Medium_inc.addActionListener(listener);
                  Medium_dec = new Button("Medium -1");   
                  add(Medium_dec);                 
                  Medium_dec.addActionListener(listener);



                  Hard_Count_label = new Label("Hard Leetcode"); 
                  add(Hard_Count_label);                   
                  Hard_Text = new TextField(Hard_c + "", 10);
                  Hard_Text.setEditable(true);      
                  add(Hard_Text);                 

                  Hard_inc = new Button("Hard +1");   
                  add(Hard_inc);                 
                  Hard_inc.addActionListener(listener);
                  Hard_dec = new Button("Hard -1");   
                  add(Hard_dec);                 
                  Hard_dec.addActionListener(listener);


                  reset = new Button("Reset");   
                  add(reset);                 

                  reset.addActionListener(listener);

                  setTitle("Leetcode Counter"); 
                  setSize(460, 130);       
                  setVisible(true);
                  setResizable(false);
                  addWindowListener(this);
         
}
   public static void main(String[] args) 

      {
                  Leetcode app = new Leetcode();
      }

   public void windowActivated(WindowEvent e) {}    
   public void windowClosed(WindowEvent e) {}    
   public void windowClosing(WindowEvent e) {    
       dispose();    
   }    
   public void windowDeactivated(WindowEvent e) {}    
   public void windowDeiconified(WindowEvent e) {}    
   public void windowIconified(WindowEvent e) {}    
   public void windowOpened(WindowEvent arg0) {} 
   
   private class BtnCountListener implements ActionListener {
         public void actionPerformed(ActionEvent evt) 
               {
                        if( evt.getSource()== Easy_inc){
                              int temp=Integer.parseInt(Easy_Text.getText());
                              temp+=1;
                              Easy_Text.setText(temp + ""); 
                              Easy_c=temp;
                        }
                        else if( evt.getSource()== Medium_inc){
                              int temp=Integer.parseInt(Medium_Text.getText());
                              temp+=1;
                              Medium_Text.setText(temp + ""); 
                              Medium_c=temp;
                        }
                        else if( evt.getSource()== Hard_inc){
                              int temp=Integer.parseInt(Hard_Text.getText());
                              temp+=1;
                              Hard_Text.setText(temp + ""); 
                              Hard_c=temp;
                        }

                        else if( evt.getSource()== Easy_dec){
                              int temp=Integer.parseInt(Easy_Text.getText());
                              temp-=1;
                              Easy_Text.setText(temp + ""); 
                              Easy_c=temp;
                        }
                        else if( evt.getSource()== Medium_dec){
                              int temp=Integer.parseInt(Medium_Text.getText());
                              temp-=1;
                              Medium_Text.setText(temp + ""); 
                              Medium_c=temp;
                        }
                        else if( evt.getSource()== Hard_dec){
                              int temp=Integer.parseInt(Hard_Text.getText());
                              temp-=1;
                              Hard_Text.setText(temp + ""); 
                              Hard_c=temp;
                        }

                        else if( evt.getSource()== reset){
                                                   
                                    Easy_c=0;
                                    Medium_c=0;
                                    Hard_c=0;
                                    int temp=0;
                                    Easy_Text.setText(temp + ""); 
                                    Medium_Text.setText(temp + ""); 
                                    Hard_Text.setText(temp + ""); 

                        }

               }  


         }

}


