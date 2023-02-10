/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author jimmycc
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
                
            String contenido, cone;
            String cont[],conte[];
            int puntosycoma=0, ints=0;
            String anterior="";
            boolean flag=false,bflag=false,bandera=false;
            ArrayList arreglo=new ArrayList();
        
            FileReader lector=new FileReader("p2.txt");
            BufferedReader lectura=new BufferedReader(lector);
            PrintWriter out=null;
            out=new PrintWriter(new FileWriter("t2.txt"));
            FileReader lec=new FileReader("Tab.txt");
            BufferedReader leer=new BufferedReader(lec);
            PrintWriter outa=null;
            outa=new PrintWriter(new FileWriter("vari.txt"));
            
            try{
                while((cone=leer.readLine())!=null){
                    arreglo.add(cone);
                }
            }catch(Exception e){
            }
            
            
            try{
            while((contenido=lectura.readLine())!=null){
                flag=false;
                cont=contenido.split("");
                conte=contenido.split(" ");
                
                
                
                
                if("/".equals(cont[0])&&"*".equals(cont[1])){
                   bflag=true;
                   
                }
                
                for (int j = 0; j < conte.length; j++) {
                    String cos[] =conte[j].split("");
                    for (int k = 0; k < arreglo.size(); k++) {
                        bandera=false;
                        String ar[]=arreglo.get(k).toString().split("");
                        
                        if(conte[j].contains(arreglo.get(k).toString())){
                            outa.println(arreglo.get(k));
                        }
                        
                        /*
                        int s1=conte[j].length(),s2=arreglo.get(k).toString().length();
                        
                            try{
                            for (int i = 0; i < s1; i++) {
                                if(!ar[i].equals(cos[i])){
                                    bandera=true;
                                }
                            }
                            if(bandera==false){
                                outa.println(conte[j]);
                            }
                            }catch(Exception e){
                            }
                        */
                        
                        /*
                        if(arreglo.get(k).equals(conte[j])){
                        outa.println(conte[j]);
                            System.out.println(conte[j]);
                         }
                        */
                    }
                    
                }
                int i=0;
                
                    for ( i = i; i < cont.length; i++) {
                        try{
                        if("/".equals(cont[i]) && "/".equals(cont[i+1])){
                            flag=true;
                        }
                        
                        
                        
                        }catch(Exception e){
                            
                        }
                        if(bflag==false){
                            if(flag==false){
                            if (" ".equals(cont[i])){
                                cont[i]="";
                            }
                            try{
                            if(";".equals(cont[i])){
                                out.println();
                                puntosycoma=puntosycoma+1;
                            }
                            }catch(Exception e){
                                
                            }
                            
                            
                            /*
                            if("i".equals(cont[i])&&"f".equals(cont[i+1])){
                                
                            }
                            */
                            
                            out.print(cont[i]);
                            }
                        }
                        
                        
                    }
                    if(bflag==false){
                    out.println();
                    }
                    
                    if("*".equals(cont[0])&&"/".equals(cont[1])){
                    bflag=false;
                }
                
                

            }
            
            out.println(puntosycoma);
            }finally{
                if(out!=null){
                    out.close();
                    outa.close();
                }
            }
        
       
    }
    
}
