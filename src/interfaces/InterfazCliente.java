/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 * 
 * @author Fabrizio
 * @author Miguel
 * @author Eduardo
 */
public class InterfazCliente extends javax.swing.JFrame {

    // Socket que maneja la conexión
    private Socket socket;
    // Flujos de entrada y salida
    private DataInputStream dataInput;
    private DataOutputStream dataOutput;

    /**
     * Creates new form InterfazCliente
     */
    public InterfazCliente() {
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

        jToggleButton1 = new javax.swing.JToggleButton();
        BK = new javax.swing.JPanel();
        BtnDisconnect = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ClientTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TextIP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TextPort = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BtnSend = new javax.swing.JButton();
        BtnConnect = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextValueSend = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextMensajesRecibidos = new javax.swing.JTextArea();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnDisconnect.setText("Desconectar");
        BtnDisconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDisconnectActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Datos recibidos");

        ClientTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ClientTitle.setText("Aplicación Cliente");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("TCP/IP");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Puerto");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Datos a enviar al servidor");

        BtnSend.setText("Enviar");
        BtnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSendActionPerformed(evt);
            }
        });

        BtnConnect.setText("Conectar");
        BtnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConnectActionPerformed(evt);
            }
        });

        TextValueSend.setColumns(20);
        TextValueSend.setRows(5);
        jScrollPane1.setViewportView(TextValueSend);

        TextMensajesRecibidos.setEditable(false);
        TextMensajesRecibidos.setColumns(20);
        TextMensajesRecibidos.setRows(5);
        TextMensajesRecibidos.setFocusable(false);
        jScrollPane2.setViewportView(TextMensajesRecibidos);

        javax.swing.GroupLayout BKLayout = new javax.swing.GroupLayout(BK);
        BK.setLayout(BKLayout);
        BKLayout.setHorizontalGroup(
            BKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BKLayout.createSequentialGroup()
                .addGroup(BKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BKLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(ClientTitle))
                    .addGroup(BKLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(TextPort, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(BtnDisconnect))
                    .addGroup(BKLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4))
                    .addGroup(BKLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BKLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(BKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(BtnSend))))
                .addGap(19, 19, Short.MAX_VALUE))
            .addGroup(BKLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(TextIP, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnConnect)
                .addGap(36, 36, 36))
        );
        BKLayout.setVerticalGroup(
            BKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BKLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(ClientTitle)
                .addGap(27, 27, 27)
                .addGroup(BKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(BKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnConnect)))
                .addGap(18, 18, 18)
                .addGroup(BKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(TextPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDisconnect))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnSend)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Cerrar la ventana y volverla a abrir
    private void reiniciarVentana() {
        dispose();
        InterfazCliente nuevaVentana = new InterfazCliente();
        nuevaVentana.setVisible(true);
    }
    
    // Hilo que permite recibir los mensajes del servidor
    // La clase no tiene atributos propios porque usa las variables de la clase
    private class ConexionServidor extends Thread {
        
        public ConexionServidor () {}
        
        @Override
        public void run() {
            // Usar el flujo de datos de entrada para recibir los mensajes
            
            String mensajeRecibido = "";
            
            try {
                while (!mensajeRecibido.equals("exit")) {
                    mensajeRecibido = dataInput.readUTF();
                    // Mostrar el mensaje en la interfaz
                    TextMensajesRecibidos.setText(TextMensajesRecibidos.getText() + mensajeRecibido + "\n");
                }
                
                // Después de que se reciba "exit" para cerrar la conexión
                socket.close();
                dataInput.close();
                JOptionPane.showInternalMessageDialog(null, "Cliente desconectado", "Cliente desconectado", JOptionPane.INFORMATION_MESSAGE);
               
                reiniciarVentana();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }            
        }
    }
    
    private void BtnDisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDisconnectActionPerformed
        try {
            // Saber si el socket esta conectado para luego desconectarlo
            if (socket != null) {
                socket.close();
                dataInput.close();
                dataOutput.close();
                JOptionPane.showMessageDialog(null, "Desconexión establecida", "Desconexión exitosa", JOptionPane.INFORMATION_MESSAGE);
                reiniciarVentana();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al desconectar: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnDisconnectActionPerformed

    private void BtnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSendActionPerformed
        try {
            //saber si el socket ya se inicializo y se conecto al servidor
            if (socket != null && socket.isConnected()) {
                String mensaje = TextValueSend.getText();
                dataOutput.writeUTF(mensaje);
                
                if (mensaje.equalsIgnoreCase("exit")) {
                    reiniciarVentana();
                    return;
                }
                
                // Limpiar el text area
                TextValueSend.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "No hay una conexión establecida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al enviar mensaje: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnSendActionPerformed

    private void BtnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConnectActionPerformed
        try {
            String ip = TextIP.getText(); // Obtenemos la Ip 
            int puerto = Integer.parseInt(TextPort.getText()); // Obtenemos el puerto
            
            // Creamos un socket con la IP y el puerto
            socket = new Socket(ip, puerto);
            // Inicializar los flujos de entrada y salida de datos
            dataInput = new DataInputStream(socket.getInputStream());       
            dataOutput = new DataOutputStream(socket.getOutputStream());    

            JOptionPane.showMessageDialog(null, "Conexión establecida con el servidor", "Conexión exitosa", JOptionPane.INFORMATION_MESSAGE);
            
            // Crear y ejecutar el hilo para recibir mensajes del servidor
            ConexionServidor conexion = new ConexionServidor();
            conexion.start();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con el servidor: " + e.getMessage(), "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnConnectActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BK;
    private javax.swing.JButton BtnConnect;
    private javax.swing.JButton BtnDisconnect;
    private javax.swing.JButton BtnSend;
    private javax.swing.JLabel ClientTitle;
    private javax.swing.JTextField TextIP;
    private javax.swing.JTextArea TextMensajesRecibidos;
    private javax.swing.JTextField TextPort;
    private javax.swing.JTextArea TextValueSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
