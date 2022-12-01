/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
class customer 
{
    static ArrayList<customer> cust_list = new ArrayList<customer>();
    private String user_name ;
    private String email;
    private String pass;
    private int id ;
    private int contact_No;
    private int cardID;

public customer()
{
    
}
    public customer(String user_name, String email, String pass, int id, int contact_No, int cardID) {
        this.user_name = user_name;
        this.email = email;
        this.pass = pass;
         this.id = id;
        this.contact_No = contact_No;
        this.cardID=cardID;
    }
    
    public boolean Log_in(String user_name , String pass)
    {
        
   String str;
   String [] str_split = new String[5];
   customer C1;
   customer temp;
   boolean found = false;
        try 
        {
            FileReader fr = new FileReader("Customer.txt");
            BufferedReader br = new BufferedReader(fr);
            
            while((str=br.readLine())!=null)
            {
              
                str_split = str.split("\\*");
                C1 = new customer(str_split[0], str_split[1], str_split[2], Integer.parseInt(str_split[3]),Integer.parseInt(str_split[4]) , Integer.parseInt(str_split[5]));
                  cust_list.add(C1);
                
            }
            br.close();
        }
             catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "file not found", "error", JOptionPane.ERROR_MESSAGE);
           
        }
        
        for(int i =0;i<cust_list.size() ; i++)
        {
            temp=cust_list.get(i);
            if(temp.user_name.equalsIgnoreCase(user_name) && temp.pass.equalsIgnoreCase(pass) )
            {
                 found = true;
                 break;
            }
            else 
            {
               found = false;
            }
            
        }
        
    return found;
        
        

    }
    
    public  void register (String user_name, String email, String pass, int id, int contact_No, int card_ID)
    {
        
            
            try 
        {  
            
        FileWriter fw = new  FileWriter("Customer.txt" , true);
        PrintWriter pr = new PrintWriter(fw);
        pr.print(user_name);
        pr.print("*");
        pr.print(email);
        pr.print("*");
        pr.print(pass);
        pr.print("*");
        pr.print(id);
        pr.print("*");
        pr.print(contact_No);
        pr.print("*");
        pr.print(card_ID);
        pr.println("");
        pr.close();
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "file not found", "error", JOptionPane.ERROR_MESSAGE);
           
        }
    
               
        
        
    }
    
    public boolean payment(String name ,int card_num)
    {
        
              
   String str;
   String [] str_split = new String[5];
   customer C1;
   customer temp;
   boolean found = false;
        try 
        {
            FileReader fr = new FileReader("Customer.txt");
            BufferedReader br = new BufferedReader(fr);
            
            while((str=br.readLine())!=null)
            {
              
                str_split = str.split("\\*");
                C1 = new customer(str_split[0], str_split[1], str_split[2], Integer.parseInt(str_split[3]),Integer.parseInt(str_split[4]) , Integer.parseInt(str_split[5]));
                  cust_list.add(C1);
                
            }
            br.close();
        }
             catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "file not found", "error", JOptionPane.ERROR_MESSAGE);
           
        }
        
        for(int i =0;i<cust_list.size() ; i++)
        {
            temp=cust_list.get(i);
            if(temp.cardID == card_num && temp.user_name .equalsIgnoreCase( name) )
            {
                 found = true;
                 break;
            }
           
            
        }
        
       return found;
        
        

    }

    public static ArrayList<customer> getCust_list() {
        return cust_list;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    public int getId() {
        return id;
    }

    public int getContact_No() {
        return contact_No;
    }

    public int getCardID() {
        return cardID;
    }
      
    }
    
    
    
class city 
 {
    private theatre []  theatres;
    private String name;
    

    public city(theatre[]  theatres,  String name) 
    {
        this.theatres =theatres;
       
        this.name = name;
    }

    public theatre[] getTheatres() {
        return theatres;
    }

    public String getName() {
        return name;
    }
    
    
    
}

 
    class show
    {
       private String name;
        private int capacity;

    public show(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public show() {
    }
    
    public boolean seatsinShow(String theatreName, String showName)
    {
       boolean free= false;
        int  found;
        String strr;
         String strr1;
        String []Strr_splited = new String[3];
        try{
           FileWriter fw = new FileWriter("temp.txt");
           PrintWriter pw = new PrintWriter(fw);
            FileReader fr = new FileReader("reservation.txt");
            BufferedReader br = new BufferedReader(fr);
            while ((strr=br.readLine())!= null)
            {
                Strr_splited= strr.split("\\*");
                if(Strr_splited[0].equalsIgnoreCase(theatreName) && Strr_splited[1].equalsIgnoreCase(showName))
                {
                    found= Integer.parseInt(Strr_splited[2]);
                    if(found!=0)
                    {
                    found--;
                    pw.print(Strr_splited[0]);
                    pw.print("*");
                     pw.print(Strr_splited[1]);
                    pw.print("*");
                     pw.print(found);
                    pw.println("");
                    free=true;
                    continue;
                    
                    }
                }
                pw.println(strr);
                
            }
            pw.close();
            br.close();
            FileWriter fw1 = new FileWriter("reservation.txt");
           PrintWriter pw1 = new PrintWriter(fw1);
            FileReader fr1 = new FileReader("temp.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            
       while ((strr1=br1.readLine())!= null)
       {
           pw1.println(strr1);

       }
             pw1.close();
            br1.close();
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "file not found !");
        }
       
        if (free == true)
        return true;
        else 
            return false;
           
            
        
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
    
    
   
    }

class theatre {
    private String name ;
   private  String [] movies ;
    private show [] shows;

    public theatre(String name, String[] movies, show []shows) {
        this.name = name;
        this.shows = shows;
        this.movies = movies;
   }

    public String getName() {
        return name;
    }

    public String[] getMovies() {
        return movies;
    }

    public show[] getShows() {
        return shows;
    }
    
    
    
    
    
} 
class movie 
{
    private String name;
    private String Description;
    private String Release_date;
    
    movie(String x , String y , String z ){
        name=x ;
        Description=y;
        Release_date = z;
      
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return Description;
    }

    public String getRelease_date() {
        return Release_date;
    }
   
   
    
    
}
class category {
    
    private String name ;
    private movie [] movies ;
    public category()
    {
        
    }

    public category(String name, movie[] movies) {
        this.name = name;
        this.movies = movies;
    }

    public String getName() {
        return name;
    }

    public movie[] getMovies() {
        return movies;
    }

  
    
    
    
    
}



public class ProjectX {

    
    
    
    
    public static void main(String[] args) {
        
         Start starting = new Start();
       starting.setVisible(true);
    }
    
}
