/* LEER ESTO: Para poder probar el método main, hay que instalar el siguiente emulador
de puertos virtuales: https://eterlogic.com/Products.VSPE.html 

Primero saldrá un aviso de la versión del producto, ahí hay que darle a "No". Después,
tenemos que picarle en el botón de arriba a la izquierda en el que hay un puerto con un
destello rojo; le dan a "siguiente", y luego habilitan el BAUD rate. */
package cliente_servidor;

import giovynet.nativelink.SerialPort;
import giovynet.serial.Baud;
import giovynet.serial.Com;
import giovynet.serial.Parameters;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Fabrizio
 * @author Miguel
 * @author Eduardo
 */
public class TestCOM {
    public static void main(String[] args) throws Exception {
        // Serial port: es un objeto del tipo de puerto que vamos a utilizar
        SerialPort serialPort = new SerialPort();
        
        // Nos permite obtener la lista de puertos disponibles
        List<String> puertosLibres = serialPort.getFreeSerialPort();
        
        // Para verificar los puertos creamos un for mediante el cual
        // obtendremos los puertos libres impresos en consola
        System.out.println("Puertos disponibles: ");
        
        for (String puertos : puertosLibres) {
            System.out.println(puertos);
        }
        
        System.out.print("Ingrese un caracter: ");
        
        char caracter;
        
        Scanner sc = new Scanner(System.in);
        
        caracter = sc.next().charAt(0);
        
        // Definición de parámetros
        Parameters param = new Parameters();
        
        // Definición del puerto 1
        param.setPort("COM2");
        
        // Definición de la velocidad de impresión. Se debe tener en cuenta
        // dicho argumento en la especificación de velocidad del dispositivo
        param.setBaudRate(Baud._9600);
        
        // Asignamos los parámetros al objeto COM1
        Com com1 = new Com(param);
        
        // Escribir COM1
        System.out.println(">> Se envió: " + caracter);
        
        // Envío de un caracter
        com1.sendSingleData(caracter);
    }
}
