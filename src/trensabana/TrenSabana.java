/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trensabana;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



/**
 *
 * @author Estudiante
 */
public class TrenSabana {
    static TrenSabana tren = new TrenSabana();
    
    public static void main(String[] args) throws IOException {
        
        
        tren.read();
        
    }
    
    
    public void read() throws IOException{
        String date;
        PrintWriter wr = new PrintWriter("output.txt");
        wr.write("Ride Status \n");
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
        String line;
    while ((line = br.readLine()) != null) {
        wr.println(line);
       
    }
        wr.close();
    }
        catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        }
    }
    
    public void writer() throws IOException{
        try (FileWriter fw = new FileWriter("output.txt",true)){
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println();
    } 
    
    
}
}
