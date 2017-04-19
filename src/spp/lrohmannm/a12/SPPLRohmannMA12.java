/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.lrohmannm.a12;
import javax.swing.JOptionPane;
/**
 *
 * @author Lisdy Nadine Rohmann Martínez
 * 513659
 * IIS
 */
public class SPPLRohmannMA12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double peso = solicitarDato("Favor de introducir su peso en kg:");
        double altura = solicitarDato("Favor de introducir su estatura en metros:");
        double imc = peso / Math.pow(altura,2);
        
        JOptionPane.showMessageDialog (null, "IMC= " + imc);
        if (imc > 25){
             JOptionPane.showMessageDialog (null,"Usted se encuentra en sobrepeso");
        }else if (imc < 18){
             JOptionPane.showMessageDialog (null,"Usted se encuentra en desnutrición");
        }else {
             JOptionPane.showMessageDialog (null,"Usted se encuentra en peso normal");
        }

    }
    public static double solicitarDato(String mensaje){
        double num = 0;
        boolean flag;
        do{
            try{
           String dato = JOptionPane.showInputDialog (null, mensaje);
            num = Double.parseDouble(dato);
            flag=false;
            }catch (Exception ex) {
                JOptionPane.showMessageDialog (null, "El dato introducido no es un número");
                flag=true;
                } 
        } while (flag); 
        return num;
    }
    
}
    
    

