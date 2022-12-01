/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectx;

import java.awt.GraphicsConfiguration;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author lenovo
 */

public class welcome extends javax.swing.JFrame {
    

    

    
   boolean theatre_isFound = false;
   
       
     
       static movie []   movies = new movie [4];//horror
       static movie []   movies1 = new movie [4];//comedy
       static movie []   movies2 = new movie [4];//romance
       static movie []   movies3 = new movie [4];//action
       static movie []   movies4 = new movie [4];//drama
       
       static String[] movies_in_theatre1 = new String[5];
       static String[] movies_in_theatre2 = new String[5];
       static String[] movies_in_theatre3 = new String[5];
       static String[] movies_in_theatre4 = new String[5];
       static String[] movies_in_theatre5 = new String[5];
       
       static theatre []last_theater=new theatre[5];
       
       static category [] cats= new category[5];
       static theatre [] theatres = new theatre [5];
       static city [] cities = new city [3];
       static String[] theatres_found = new String [5]; 
     
       static theatre []theater_inCairo=new theatre[4];
       static theatre []theatre_inAlex=new theatre[4];
       static theatre []theater_inAswan=new theatre[4];
       
       category[] return_obj (){
           theatres_found[0]="";
           theatres_found[1]="";
           theatres_found[2]="";
           theatres_found[3]="";
           theatres_found[4]="";
        movie mh1= new movie("The others","Written by :  Shaher mohamed   "
                + "Hold your chair tight ! they hear you..  "," Directed by :  Mostafa Shaifk   , 22/7/2012");
        movies[0]=mh1;       
        movies_in_theatre1[0]= mh1.getName();        //do      
        movies_in_theatre2[0]= mh1.getName();
       
        movie mh2= new movie("Saw","Written by : Leigh Whannel "
                  + " Be aware Who's behind the mask..   , ","  Directed by : James Wan    ,,  19/1/2004");
        movies[1]=mh2;
        movies_in_theatre1[1]= mh2.getName();
       
        movie mh4= new movie("Annabelle","Written by : Gary Dauberman "
                   + " Even science could'nt explain whats inside her !..  ","  Directed by : John R. Leonetti   26/9/2014");         
        movies[2]=mh4;
        movies_in_theatre3[0]=mh4.getName();
             movie mh5= new movie("Conjuring","Written by  : Chad Hayes , Just be ready for what's coming "
                      ,"  Directed by : James Wan    15/7/2013");
        movies[3]=mh5;
        movies_in_theatre4[0]=mh5.getName();
        category horror=new category("horror", movies);
        cats[0]=horror;
        
        
        movie mc2= new movie("Deadpool","Written by: Lauren Shuler , I'm not A superhero ! , get ready for Deadpool    ","  directed by :Tim miller  ,2/8/2011");
        movies1[0]=mc2;
        movies_in_theatre2[1]=mc2.getName();  //done
        movies_in_theatre3[1]=mc2.getName();
        movie mc3= new movie("نادي الرجال السري","written by : Ahmed mourad   , directed by : Khaled elhalafawy  ","1/7/2018");
        movies1[1]=mc3;
         movies_in_theatre1[2]= mc3.getName();
           movie mc4= new movie("charlie chaplin 5 ","written by : Shaher Mohamed,, You won't hold your breath ! Just laugh ..      ","  directed by : Shaher Mohamed     , 1/6/2018");
           movies1[2]=mc4;
            movies_in_theatre4[1]=mc4.getName();
             movie mc5= new movie("ghost busters  ","written by : Ivan reitman ,, Carefull, you;ll laugh out loud !  ","   directed by :  Rick moranis   2/6/2015");
             movies1[3]=mc5;
               movies_in_theatre5[0]=mc5.getName();
           category comedy =new category("comedy", movies1);
          cats[1]=comedy;
        
       
          movie mr2= new movie("the fault in our stars","written by : josh Bonne, some infinities are bigger than other infinities ! "," directed by : John green , 2/8/2011");
         movies2[0]=mr2;
          movies_in_theatre2[2]=mr2.getName();
          movies_in_theatre4[2]=mr2.getName();
          
         movie mr3= new movie("titanic","written by :James cameron , He only exists now in her memory..!"," directed by : James cameron , 1/7/2018");
         movies2[1]=mr3;
          movies_in_theatre2[3]=mr3.getName();
           movie mr4= new movie("the beauty and the beast","written by : bill conndon, Don't judge a book by its cover ! ","directed by : gabriella villanuva  , 1/6/2018");
           movies2[2]=mr4;
            movies_in_theatre3[2]=mr4.getName();
             movie mr5= new movie(" the notebook ","written by : Nicholas spark, Love wins after all "," directed by :Nick cassavetes , 2/6/2015");
             movies2[3]=mr5;
               movies_in_theatre1[3]= mr5.getName(); 
           category romance =new category("romance", movies2);
          cats[2]=romance;
                  ///////////// romance movies done /////////
          
          
          
          
        movie ma1= new movie("aquaman","written by :James wan , Water is his kingdom !! ","directed by :  will beall, 22/7/2012");
        movies3[0]=ma1;
        movies_in_theatre1[4]= ma1.getName();
          movie ma2= new movie("avengers: endgame ","written by : Jon Russo , After all , now we're in Endgame ! "," directed by :  Christopher marks, 2/8/2011");
         movies3[1]=ma2;
          movies_in_theatre2[4]=ma2.getName();           
       movies_in_theatre5[3]=ma2.getName();
           movie ma4= new movie("captain marvel","written by :  Anna boden , Now , we have a female superman !","directed by : Anna boden , 1/6/2018");
           movies3[2]=ma4;
             movies_in_theatre4[3]=ma4.getName();
             movies_in_theatre3[3]=ma4.getName();          //done
             movie ma5= new movie("iron man","written by :Jon feaveru ,A new hero Has come !!  ","directed by :Mark fergus ,2/6/2015");
             movies3[3]=ma5;
              movies_in_theatre5[1]=ma5.getName();
              
           category action =new category("action", movies3);
          cats[3]=action;
          //////////////// action movies done //////////////
          movie md1= new movie("adrift","written by : Baltasar kormakur  ,Exploring the sea in a different way !! ","directed by : david branson, 22/7/2012");
        movies4[0]=md1;
         movies_in_theatre3[4]=md1.getName();
          movie md2= new movie("YOU","written by :micheal busso, He'll stalk her ,, until death.. ","directed by : Jason statham  ,2/8/2011");
         movies4[1]=md2;
          movies_in_theatre4[4]=md2.getName();
       
           movie md4= new movie(" me before you","written by : Dwayne jonson , Love till death do them apart ! ","directed by :  Hassan shehata, 1/6/2018");
           movies4[2]=md4;
           movies_in_theatre5[2]=md4.getName();         //done
           
             movie md5= new movie("what happend to monday","written by : John travolta , Mystery can sometimes eat your mind ! ","directed by : Mick ross , 2/6/2015");
             movies4[3]=md5;
              movies_in_theatre5[4]=md5.getName();
           category drama =new category("drama", movies4);
          cats[4]=drama;
          
              show[] shows= new show[3];
    
    show show1 = new show("From 2:5 ",20);
      shows[0]=show1;
    show show2 = new show("From 5:8 ",20);
    shows[1]=show2; 
     show show3 = new show("From 8:11 ",20);
    shows[2]=show3; 
    
          
          
          
          
              theatre theatre1 = new theatre("Suncity",movies_in_theatre1,shows);
              theatres[0]= theatre1;
              theatre theatre2 = new theatre("Arabia mall",movies_in_theatre2,shows);
              theatres[1]=theatre2;
              theatre theatre3 = new theatre("city stars",movies_in_theatre3,shows);
              theatres[2]=theatre3;
              theatre theatre4 = new theatre("Cinema Hall",movies_in_theatre4,shows);
              theatres[3]=theatre4;
              theatre theatre5 = new theatre("Aswan's home",movies_in_theatre5,shows);
              theatres[4]=theatre5;
              
              theater_inCairo[0]=theatre1;
              theater_inCairo[1]=theatre2;
              theater_inCairo[2]=theatre3;
              theater_inCairo[3]=theatre4;
              theatre_inAlex[0]=theatre1;
              theatre_inAlex[1]=theatre3;
              theatre_inAlex[2]=theatre4;
              theatre_inAlex[3]=theatre2;
              theater_inAswan[0]=theatre5;
              theater_inAswan[1]=theatre4;
              theater_inAswan[2]=theatre3;
              theater_inAswan[3]=theatre2;
              city cairo = new city (theater_inCairo, "cairo");
              city alex = new city ( theatre_inAlex, "Alex");
              city aswan = new city (theater_inAswan, "Aswan");
               cities[0]=cairo ;
               cities [1]=alex;
               cities[2]=aswan;
              
              
              
           last_theater[0]=null;
              last_theater[1]=null;
               last_theater[2]=null;
              last_theater[3]=null;
               last_theater[4]=null;
              
              
              
          return cats;
       }
       
    /**
     * Creates new form welcome
     */
    public welcome() {
        // this.reshape(400, 200,  700, 800);
        
        initComponents();
        this.reshape(400, 200, 730, 469);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        combo2 = new javax.swing.JComboBox();
        buttonn = new javax.swing.JButton();
        buttonn1 = new javax.swing.JButton();
        buttonn2 = new javax.swing.JButton();
        buttonn3 = new javax.swing.JButton();
        info1 = new javax.swing.JButton();
        info3 = new javax.swing.JButton();
        info4 = new javax.swing.JButton();
        info2 = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(20, 20, 200, 200));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("Choose your city");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 30, 210, 29);

        combo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cairo", "Alex", "Aswan" }));
        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });
        getContentPane().add(combo1);
        combo1.setBounds(230, 30, 90, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Choose category");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 70, 200, 29);

        combo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Horror", "Comedy", "Romance", "Action", "Drama" }));
        combo2.setToolTipText("");
        combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo2ActionPerformed(evt);
            }
        });
        getContentPane().add(combo2);
        combo2.setBounds(230, 70, 90, 30);

        buttonn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonnActionPerformed(evt);
            }
        });
        getContentPane().add(buttonn);
        buttonn.setBounds(10, 145, 200, 20);

        buttonn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonn1ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonn1);
        buttonn1.setBounds(10, 183, 200, 23);

        buttonn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonn2ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonn2);
        buttonn2.setBounds(10, 230, 200, 20);

        buttonn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonn3ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonn3);
        buttonn3.setBounds(10, 276, 200, 20);

        info1.setText("info");
        info1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info1ActionPerformed(evt);
            }
        });
        getContentPane().add(info1);
        info1.setBounds(230, 140, 70, 30);

        info3.setText("info");
        info3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info3ActionPerformed(evt);
            }
        });
        getContentPane().add(info3);
        info3.setBounds(230, 220, 70, 30);

        info4.setText("info");
        info4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info4ActionPerformed(evt);
            }
        });
        getContentPane().add(info4);
        info4.setBounds(230, 260, 70, 30);

        info2.setText("info");
        info2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info2ActionPerformed(evt);
            }
        });
        getContentPane().add(info2);
        info2.setBounds(230, 180, 70, 30);

        lbl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl1.setForeground(new java.awt.Color(51, 0, 51));
        getContentPane().add(lbl1);
        lbl1.setBounds(300, 250, 430, 50);

        lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl.setForeground(new java.awt.Color(51, 0, 51));
        getContentPane().add(lbl);
        lbl.setBounds(160, 320, 570, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo2ActionPerformed
        // TODO add your handling code here:
        
      welcome cat=  new welcome();
      cat.return_obj();
                
      
           
             buttonn.setText( cats[combo2.getSelectedIndex()].getMovies()[0].getName());
             buttonn1.setText(cats[combo2.getSelectedIndex()].getMovies()[1].getName());
             buttonn2.setText(cats[combo2.getSelectedIndex()].getMovies()[2].getName());
             buttonn3.setText(cats[combo2.getSelectedIndex()].getMovies()[3].getName());
         // buttonn4.setText(cats[combo2.getSelectedIndex()].movies[4].name);
             
     
    }//GEN-LAST:event_combo2ActionPerformed

    private void info2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info2ActionPerformed
        // TODO add your handling code here:
      welcome cat=  new welcome();
      cat.return_obj();
      lbl.setText( cats[combo2.getSelectedIndex()].getMovies()[1].getDescription());       
      lbl1.setText( cats[combo2.getSelectedIndex()].getMovies()[1].getRelease_date()); 

    }//GEN-LAST:event_info2ActionPerformed

    private void info1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info1ActionPerformed
       
        welcome cat=  new welcome();
      cat.return_obj();
      lbl.setText( cats[combo2.getSelectedIndex()].getMovies()[0].getDescription());
      lbl1.setText( cats[combo2.getSelectedIndex()].getMovies()[0].getRelease_date()); 
    }//GEN-LAST:event_info1ActionPerformed

    private void info3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info3ActionPerformed
        // TODO add your handling code here:
         
        welcome cat=  new welcome();
      cat.return_obj();
      lbl.setText( cats[combo2.getSelectedIndex()].getMovies()[2].getDescription());
      lbl1.setText( cats[combo2.getSelectedIndex()].getMovies()[2].getRelease_date()); 
    }//GEN-LAST:event_info3ActionPerformed

    private void info4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info4ActionPerformed
        // TODO add your handling code here:
         
        welcome cat=  new welcome();
      cat.return_obj();
      lbl.setText( cats[combo2.getSelectedIndex()].getMovies()[3].getDescription());
      lbl1.setText( cats[combo2.getSelectedIndex()].getMovies()[3].getRelease_date()); 
    }//GEN-LAST:event_info4ActionPerformed

    private void buttonnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonnActionPerformed
    welcome cat=  new welcome();
      cat.return_obj();
         for(int i = 0 ; i< theatres.length ; i++)
        {
            for(int k =0 ; k < movies.length+1 ; k++)
            {
              if(theatres[i].getMovies()[k] .equals( buttonn.getText()))
            
                theatres_found[i]= theatres[i].getName();
           
            }
            
        }
        
         for (int i = 0 ; i<cities.length ; i++)
         {
             if(cities[i].getName() .equalsIgnoreCase(combo1.getSelectedItem().toString()))
             {
                 for(int k =0 ; k<theatres_found.length ; k++)
                 {
                     for (int j = 0 ; j <cities[i].getTheatres().length ;j++)
                     {
                     if(theatres_found[k].equalsIgnoreCase(cities[i].getTheatres()[j].getName()))
                     {
                         theatres_found[k]=cities[i].getTheatres()[j].getName();
                         theatre_isFound= true;
                         
                     }
                     
                 
                 }
                     if(theatre_isFound == false)
                    theatres_found[k] = "";
                 
             }
             
             
         }
         }
       for (int i=0;i<theatres.length;i++)
       {
           for (int j=0;j<theatres_found.length;j++)
           {
             if (theatres[i].getName().equalsIgnoreCase(theatres_found[j]))
             
                 last_theater[i]=theatres[i];
          
       }
       }
        
        reservation r = new reservation(buttonn.getText(), last_theater);
        r.setVisible(true);

            
    }//GEN-LAST:event_buttonnActionPerformed

    private void buttonn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonn1ActionPerformed
        // TODO add your handling code here:
   welcome cat=  new welcome();
      cat.return_obj();
         for(int i = 0 ; i< theatres.length ; i++)
        {
            for(int k =0 ; k < movies.length+1 ; k++)
            {
              if(theatres[i].getMovies()[k] .equals( buttonn1.getText()))
            
                theatres_found[i]= theatres[i].getName();
           
            }
            
        }
        
         for (int i = 0 ; i<cities.length ; i++)
         {
             if(cities[i].getName() .equalsIgnoreCase(combo1.getSelectedItem().toString()))
             {
                 for(int k =0 ; k<theatres_found.length ; k++)
                 {
                     for (int j = 0 ; j <cities[i].getTheatres().length ;j++)
                     {
                     if(theatres_found[k].equalsIgnoreCase(cities[i].getTheatres()[j].getName()))
                     {
                         theatres_found[k]=cities[i].getTheatres()[j].getName();
                         theatre_isFound= true;
                     }
                     
                 
                 }
                     if(theatre_isFound == false)
                    theatres_found[k] = "";
                 
             }
             
             
         }
         }
       for (int i=0;i<theatres.length;i++)
       {
           for (int j=0;j<theatres_found.length;j++)
           {
             if (theatres[i].getName().equalsIgnoreCase(theatres_found[j]))
             
                 last_theater[i]=theatres[i];
          
       }
       }
        
        reservation r = new reservation(buttonn1.getText(), last_theater);
        r.setVisible(true);

            
    }//GEN-LAST:event_buttonn1ActionPerformed

    private void buttonn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonn2ActionPerformed
      welcome cat=  new welcome();
      cat.return_obj();
         for(int i = 0 ; i< theatres.length ; i++)
        {
            for(int k =0 ; k < movies.length+1 ; k++)
            {
              if(theatres[i].getMovies()[k] .equals( buttonn2.getText()))
            
                theatres_found[i]= theatres[i].getName();
           
            }
            
        }
        
        for (int i = 0 ; i<cities.length ; i++)
         {
             if(cities[i].getName() .equalsIgnoreCase(combo1.getSelectedItem().toString()))
             {
                 for(int k =0 ; k<theatres_found.length ; k++)
                 {
                     for (int j = 0 ; j <cities[i].getTheatres().length ;j++)
                     {
                     if(theatres_found[k].equalsIgnoreCase(cities[i].getTheatres()[j].getName()))
                     {
                         theatres_found[k]=cities[i].getTheatres()[j].getName();
                         theatre_isFound= true;
                     }
                     
                 
                 }
                     if(theatre_isFound == false)
                    theatres_found[k] = "";
                 
             }
             
             
         }
         }
       for (int i=0;i<theatres.length;i++)
       {
           for (int j=0;j<theatres_found.length;j++)
           {
             if (theatres[i].getName().equalsIgnoreCase(theatres_found[j]))
             
                 last_theater[i]=theatres[i];
          
       }
       }
        
        reservation r = new reservation(buttonn2.getText(), last_theater);
        r.setVisible(true);

            

    }//GEN-LAST:event_buttonn2ActionPerformed

    private void buttonn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonn3ActionPerformed
        // TODO add your handling code here:
     welcome cat=  new welcome();
      cat.return_obj();
         for(int i = 0 ; i< theatres.length ; i++)
        {
            for(int k =0 ; k < movies.length+1 ; k++)
            {
              if(theatres[i].getMovies()[k] .equals( buttonn3.getText()))
            
                theatres_found[i]= theatres[i].getName();
           
            }
            
        }
        for (int i = 0 ; i<cities.length ; i++)
         {
             if(cities[i].getName() .equalsIgnoreCase(combo1.getSelectedItem().toString()))
             {
                 for(int k =0 ; k<theatres_found.length ; k++)
                 {
                     for (int j = 0 ; j <cities[i].getTheatres().length ;j++)
                     {
                     if(theatres_found[k].equalsIgnoreCase(cities[i].getTheatres()[j].getName()))
                     {
                         theatres_found[k]=cities[i].getTheatres()[j].getName();
                         theatre_isFound= true;
                     }
                     
                 
                 }
                     if(theatre_isFound == false)
                    theatres_found[k] = "";
                 
             }
             
             
         }
         }
         
   
       for (int i=0;i<theatres.length;i++)
       {
           for (int j=0;j<theatres_found.length;j++)
           {
             if (theatres[i].getName().equalsIgnoreCase(theatres_found[j]))
             
                 last_theater[i]=theatres[i];
          
       }
       }
        
        reservation r = new reservation(buttonn3.getText(), last_theater);
        r.setVisible(true);

            

    }//GEN-LAST:event_buttonn3ActionPerformed

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
      
        
        
        // TODO code application logic here
       
       
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonn;
    private javax.swing.JButton buttonn1;
    private javax.swing.JButton buttonn2;
    private javax.swing.JButton buttonn3;
    private javax.swing.JComboBox combo1;
    public javax.swing.JComboBox combo2;
    private javax.swing.JButton info1;
    private javax.swing.JButton info2;
    private javax.swing.JButton info3;
    private javax.swing.JButton info4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lbl1;
    // End of variables declaration//GEN-END:variables
}
