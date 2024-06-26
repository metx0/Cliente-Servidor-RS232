/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import java.net.*;
import java.io.*;
import javax.swing.JOptionPane;
// Para la comunicación serial
import giovynet.serial.Baud;
import giovynet.serial.Com;
import giovynet.serial.Parameters;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fabrizio
 * @author Miguel
 * @author Eduardo
 */
public class InterfazServidor extends javax.swing.JFrame {

    // El socket se inicializa cuando el cliente acepta la conexión
    private Socket socket;
    private Com puertoCom;
    private Parameters parametrosCom;

    /**
     * Creates new form InterfazServidor
     */
    public InterfazServidor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BK = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BtnEnviarACliente = new javax.swing.JButton();
        ServerTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TextPuertoRed = new javax.swing.JTextField();
        BtnActivateServer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextDatosRecibidosRS232 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextEnviarACliente = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        ComboBoxCOM = new javax.swing.JComboBox<>();
        BtnConfigurarCOM = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextDatosRecibidosCliente = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        BtnEnviarCOM = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Datos recibidos RS232");

        BtnEnviarACliente.setText("Enviar a Cliente");
        BtnEnviarACliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEnviarAClienteActionPerformed(evt);
            }
        });

        ServerTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ServerTitle.setText("Aplicación Servidor");

        jLabel1.setText("Puerto de Red");

        TextPuertoRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPuertoRedActionPerformed(evt);
            }
        });

        BtnActivateServer.setText("Activar servidor");
        BtnActivateServer.setFocusable(false);
        BtnActivateServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActivateServerActionPerformed(evt);
            }
        });

        TextDatosRecibidosRS232.setEditable(false);
        TextDatosRecibidosRS232.setColumns(20);
        TextDatosRecibidosRS232.setRows(5);
        TextDatosRecibidosRS232.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TextDatosRecibidosRS232.setFocusable(false);
        jScrollPane1.setViewportView(TextDatosRecibidosRS232);

        jLabel3.setText("Datos a enviar al cliente");

        TextEnviarACliente.setColumns(20);
        TextEnviarACliente.setRows(5);
        jScrollPane2.setViewportView(TextEnviarACliente);

        jLabel4.setText("Aplicacion RS232");

        ComboBoxCOM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COM0", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9" }));
        ComboBoxCOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxCOMActionPerformed(evt);
            }
        });

        BtnConfigurarCOM.setText("Configurar");
        BtnConfigurarCOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfigurarCOMActionPerformed(evt);
            }
        });

        TextDatosRecibidosCliente.setEditable(false);
        TextDatosRecibidosCliente.setColumns(20);
        TextDatosRecibidosCliente.setRows(5);
        TextDatosRecibidosCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TextDatosRecibidosCliente.setFocusable(false);
        jScrollPane3.setViewportView(TextDatosRecibidosCliente);

        jLabel5.setText("Datos recibidos del cliente");

        BtnEnviarCOM.setText("Enviar a COM");
        BtnEnviarCOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEnviarCOMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BKLayout = new javax.swing.GroupLayout(BK);
        BK.setLayout(BKLayout);
        BKLayout.setHorizontalGroup(
            BKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BKLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(ServerTitle))
            .addGroup(BKLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(TextPuertoRed, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(BtnActivateServer))
            .addGroup(BKLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addComponent(ComboBoxCOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(BtnConfigurarCOM))
            .addGroup(BKLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2))
            .addGroup(BKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BKLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(BKLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(BKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(BKLayout.createSequentialGroup()
                            .addComponent(BtnEnviarACliente)
                            .addGap(38, 38, 38)
                            .addComponent(BtnEnviarCOM, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel5)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        BKLayout.setVerticalGroup(
            BKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BKLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(ServerTitle)
                .addGap(30, 30, 30)
                .addGroup(BKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextPuertoRed, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnActivateServer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(BKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxCOM, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnConfigurarCOM, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEnviarACliente)
                    .addComponent(BtnEnviarCOM))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(BK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Cerrar la ventana y volverla a abrir
    private void reiniciarVentana() {
        dispose();
        InterfazServidor nuevaVentana = new InterfazServidor();
        nuevaVentana.setVisible(true);
    }

    // Clase que permite manejar la conexión en un hilo separado al principal
    private class ManejarConexion extends Thread {

        private int puertoRed;
        private ServerSocket serverSocket;
        private DataInputStream dataInput;

        public ManejarConexion(int puertoRed) {
            this.puertoRed = puertoRed;
        }

        @Override
        public void run() {
            try {
                // Iniciar el socket servidor en el puerto "puertoRed"
                serverSocket = new ServerSocket(puertoRed);
                JOptionPane.showInternalMessageDialog(null, "Servidor iniciado en el puerto " + Integer.toString(puertoRed), "Servidor iniciado", JOptionPane.INFORMATION_MESSAGE);
                String mensajeRecibido = "";

                // Aceptamos la conexión del cliente e inicializamos el socket 
                socket = serverSocket.accept();
                JOptionPane.showInternalMessageDialog(null, "Conexión iniciada con el cliente", "Conexión iniciada", JOptionPane.INFORMATION_MESSAGE);
                // Obtenemos el flujo de entrada de datos del cliente
                dataInput = new DataInputStream(socket.getInputStream());

                // TODO: mandar el mensaje por medio de RS232
                while (!mensajeRecibido.equalsIgnoreCase("exit")) {
                    mensajeRecibido = dataInput.readUTF();
                    TextDatosRecibidosCliente.setText(TextDatosRecibidosCliente.getText() + mensajeRecibido + "\n");
                    System.out.println(mensajeRecibido);
                }

                // Después de que se reciba "exit" para cerrar la conexión
                socket.close();
                dataInput.close();
                System.out.println("Servidor Desconectado");
                JOptionPane.showInternalMessageDialog(null, "Servidor desconectado", "Servidor desconectado", JOptionPane.INFORMATION_MESSAGE);

                reiniciarVentana();
            } catch (Exception e) {
                // Manejar la excepción
            }
        }
    }

    // Clase que maneja la conexión por el puerto RS232 en un hilo
    private class ConexionSerial extends Thread {

        @Override
        public void run() {
            String mensaje = "";

            // Recibir los mensajes, mostrarlos en la intefaz y mandarlos al cliente
            while (true) {
                try {
                    String cadenaRecibida = puertoCom.receiveSingleString();

                    // Si se recibe una cadena vacía, no se hace nada
                    if (!cadenaRecibida.equals("")) {
                        mensaje += cadenaRecibida;
                        TextDatosRecibidosRS232.setText(cadenaRecibida);

                        // Mandarlo al cliente
                        if (socket == null) {
                            JOptionPane.showMessageDialog(null, "No hay una conexión inciada con el cliente: ", "Error de conexión", JOptionPane.ERROR_MESSAGE);
                            JOptionPane.showMessageDialog(null, "Inicie de nuevo la configuración: ", "Error de conexión", JOptionPane.ERROR_MESSAGE);
                            break;
                        } else {
                            DataOutputStream dataOutput = new DataOutputStream(socket.getOutputStream());
                            dataOutput.writeUTF(cadenaRecibida);
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    // Recuperar el valor del puerto de red y crear un hilo que maneje la conexión
    private void BtnActivateServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActivateServerActionPerformed
        String puertoUsuario = TextPuertoRed.getText();
        int puertoRed = Integer.parseInt(puertoUsuario);

        try {
            // Crear e iniciar el hilo que maneja la conexión y recibe los datos
            ManejarConexion hiloConexion = new ManejarConexion(puertoRed);
            hiloConexion.start();
        } catch (Exception e) {
            // Manejar la excepción
        }
    }//GEN-LAST:event_BtnActivateServerActionPerformed

    private void TextPuertoRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPuertoRedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPuertoRedActionPerformed

    // Obtiene el texto, obtiene el flujo de salida del socket y manda el mensaje al cliente
    // Para eso hay que comprobar si ya existe una conexión. Si no existe, muestra un error
    private void BtnEnviarAClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEnviarAClienteActionPerformed
        // No hay una conexión actual
        if (this.socket == null) {
            JOptionPane.showMessageDialog(null, "No hay una conexión inciada con el cliente: ", "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }

        String mensajeAEnviar = TextEnviarACliente.getText();

        // Obtiene el flujo de salida
        try {
            DataOutputStream dataOutput = new DataOutputStream(socket.getOutputStream());
            dataOutput.writeUTF(mensajeAEnviar);

            if (mensajeAEnviar.equalsIgnoreCase("exit")) {
                reiniciarVentana();
                return;
            }

            // Limpiar el text area
            TextEnviarACliente.setText("");
        } catch (IOException e) {
            System.out.println("Ha ocurrido una excepción de I/O");
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_BtnEnviarAClienteActionPerformed

    private void ComboBoxCOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxCOMActionPerformed
        
    }//GEN-LAST:event_ComboBoxCOMActionPerformed

    // Toda la lógica para iniciar la comunicación por medio de RS232
    private void BtnConfigurarCOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfigurarCOMActionPerformed
        // Obtener el valor seleccionado del combo box
        String puertoSeleccionado = ComboBoxCOM.getSelectedItem().toString();

        try {
            parametrosCom = new Parameters();
            parametrosCom.setPort(puertoSeleccionado);
            parametrosCom.setBaudRate(Baud._9600);
            parametrosCom.setMinDelayWrite(10);

            // Inicializamos puertoCom con los parámetros
            puertoCom = new Com(parametrosCom);

            JOptionPane.showMessageDialog(null, "Puerto en línea", "Puerto en línea", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Puerto en línea");

            // Iniciar el hilo para escuchar los mensajes del puerto serial
            ConexionSerial rx = new ConexionSerial();
            rx.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_BtnConfigurarCOMActionPerformed

    private void BtnEnviarCOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEnviarCOMActionPerformed
        // TODO add your handling code here:
        String mensaje = TextDatosRecibidosCliente.getText();
        
        try {
            puertoCom.sendSingleData(mensaje);
        } catch (Exception ex) {
            Logger.getLogger(InterfazServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        TextDatosRecibidosCliente.setText("");
    }//GEN-LAST:event_BtnEnviarCOMActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazServidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BK;
    private javax.swing.JButton BtnActivateServer;
    private javax.swing.JButton BtnConfigurarCOM;
    private javax.swing.JButton BtnEnviarACliente;
    private javax.swing.JButton BtnEnviarCOM;
    private javax.swing.JComboBox<String> ComboBoxCOM;
    private javax.swing.JLabel ServerTitle;
    private javax.swing.JTextArea TextDatosRecibidosCliente;
    private javax.swing.JTextArea TextDatosRecibidosRS232;
    private javax.swing.JTextArea TextEnviarACliente;
    private javax.swing.JTextField TextPuertoRed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
