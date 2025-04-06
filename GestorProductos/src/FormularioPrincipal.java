/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FormularioPrincipal extends javax.swing.JFrame {

    public FormularioPrincipal() {
        initComponents(); // Inicializa los componentes del formulario principal
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); // Cerrar la ventana al salir
        setTitle("Formulario Principal"); // Título de la ventana
        setSize(400, 300); // Tamaño del formulario
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setLayout(new java.awt.GridLayout(2, 1)); // Organizar en dos filas

        // Mensaje de bienvenida
        JLabel lblTitulo = new JLabel("Bienvenido al Formulario Principal", JLabel.CENTER);
        add(lblTitulo); // Agregar la etiqueta

        // Botón para ir al formulario secundario
        JButton btnIrSecundario = new JButton("Ir al Formulario Secundario");
        btnIrSecundario.addActionListener(evt -> abrirFormularioSecundario());
        add(btnIrSecundario); // Agregar el botón
    }

    private void abrirFormularioSecundario() {
    FormularioSecundario formularioSecundario = new FormularioSecundario();
    formularioSecundario.setVisible(true); // Mostrar el secundario

    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new
              FormularioPrincipal().setVisible(true);
        });
    }
}