/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Validar {

    public Validar() {
    }
    
    
    
     public boolean validadorDeCedula(String cedula) {
       
        boolean cedulaCorrecta = false;

        try {

        if (cedula.length() == 10) // ConstantesApp.LongitudCedula
        {
        int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
        if (tercerDigito < 6) {
        // Coeficientes de validación cédula
        // El decimo digito se lo considera dígito verificador
         int[] coefValCedula = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
         int verificador = Integer.parseInt(cedula.substring(9,10));
         int suma = 0;
         int digito = 0;
        for (int i = 0; i < (cedula.length() - 1); i++) {
         digito = Integer.parseInt(cedula.substring(i, i + 1))* coefValCedula[i];
         suma += ((digito % 10) + (digito / 10));
        }

        if ((suma % 10 == 0) && (suma % 10 == verificador)) {
         cedulaCorrecta = true;
        }
        else if ((10 - (suma % 10)) == verificador) {
         cedulaCorrecta = true;
        } else {
         cedulaCorrecta = false;
        }
        } else {
        cedulaCorrecta = false;
        }
        } else {
        cedulaCorrecta = false;
        }
        } catch (NumberFormatException nfe) {
        cedulaCorrecta = false;
        } catch (Exception err) {
        System.out.println("Una excepcion ocurrio en el proceso de validadcion");

        cedulaCorrecta = false;
        }

        if (!cedulaCorrecta) {
        System.out.println("La Cédula ingresada es Incorrecta");
        JOptionPane.showMessageDialog(null, "La Cédula ingresada es Incorrecta");
        }
        return cedulaCorrecta;
    }//fin metodo validar cedula


     
     
     
    public void validarCC (String cedula)
    {
        int cantidad=cedula.length();
        if(cantidad==10)
        {
            if(this.validadorDeCedula(cedula))
            {
                JOptionPane.showMessageDialog(null,  "Cedula Correcta");  
            }
        }  else  this.validadorDeCedula(cedula);
    }//fin validarCC
     
    
    
    public  void validarTex(String caracter) {
    
        System.out.println("Por favor ingrese solo letras");
        
        if (caracter.matches("^[A-Z ]*$")) {
            System.out.println("Informacion valida");
            System.out.println(caracter);
         
        } else {
            System.out.println("Se admite solo MAYUSCULAS");
            JOptionPane.showMessageDialog(null,  "Se admite solo MAYUSCULAS");  
           
        }
    }//fin validar texto

     
    public  void validarDireccion(String caracter) {
    
        System.out.println("Por favor ingrese solo letras");
        
        if (caracter.matches("^[A-Z0-9-\\ ]*$")) {
            System.out.println("Informacion valida");
            System.out.println(caracter);
         
        } else {
            System.out.println("Se admite solo MAYUSCULAS");
            JOptionPane.showMessageDialog(null,  "Se admite solo MAYUSCULAS");  
           
        }
    }//fin validar direccion
    
    
    
    
    
    
    public void validarCorreo(String email)
    {
 
        // Patrón para validar el email
        Pattern pattern = Pattern.compile("^[_a-z0-9-\\+]+(\\.[_a-z0-9-]+)*@" + "[a-z0-9-]+(\\.[a-z0-9]+)*(\\.[a-z]{2,})$");
 
        // El email a validar
      //  String email = "info@programacionextrema.com";
 
        Matcher mather = pattern.matcher(email);
 
        if (mather.find() == true) {
            System.out.println("El email ingresado es válido.");
        } else {
            System.out.println("El email ingresado es inválido.");
            JOptionPane.showMessageDialog(null,  "Se admite solo minusculas"); 
        }
    }
    
    
    
    public void validarTelefonoC(String telefono)
    {
 
        System.out.println("El telefono ingresado?.");
        Pattern pattern = Pattern.compile("^(09)[5-9]{1}[0-9]{7}$");
        Matcher mather = pattern.matcher(telefono);
 
        if (mather.find() == true) {
            System.out.println("El telefono ingresado es válido.");
        } else {
            System.out.println("El telefono ingresado es inválido.");
            JOptionPane.showMessageDialog(null,  "Se admite solo números y un total de 10 digitos "); 
        }
    }
    
        public void validarPlaca(String placa)
        {
            System.out.println("PLACA INGRESADA?.");
            Pattern pattern = Pattern.compile("^[A-Z]{3}\\-[0-9]{4}$");
            Matcher mather = pattern.matcher(placa);

            if (mather.find() == true) {
                System.out.println("La placa es válido.");
            } else {
                System.out.println("La placa es inválido.");
                JOptionPane.showMessageDialog(null,  "Se admite del segun el formato: PPP-1111 "); 
            }
        }
    
    
    
    
    
    
    
    
}//fin toda la clase
    
    
 
    

