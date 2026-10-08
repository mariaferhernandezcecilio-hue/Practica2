package practica.pkg2;

import javax.swing.*;

public class Practica2 extends JFrame {

    public Practica2() {
        setTitle("Práctica 2");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel fondo = new JLabel("Fondo");
        fondo.setBounds(150, 100, 50, 20);
        add(fondo);

        JMenuBar menu = new JMenuBar();

        JMenu menuA = new JMenu("Archivo");
        JMenuItem nuevo = new JMenuItem("Nuevo");
        JMenuItem consultar = new JMenuItem("Consultar");
        JMenuItem eliminar = new JMenuItem("Eliminar");

        menuA.add(nuevo);
        menuA.add(consultar);
        menuA.add(eliminar);

        JMenu menuE = new JMenu("Editar");
        JMenu submenu = new JMenu("Modificar");
        JMenuItem opcion = new JMenuItem("Opción 1");
        submenu.add(opcion);
        menuE.add(submenu);

        JMenu menuR = new JMenu("Reporte");
        JMenu archivoPdf = new JMenu("Archivo PDF");
        JMenu archivoTxt = new JMenu("Archivo txt");

        menuR.add(archivoPdf);
        menuR.add(archivoTxt);

        JMenu menuS = new JMenu("Salir");

        menuS.addMenuListener(new javax.swing.event.MenuListener() {
            @Override
            public void menuSelected(javax.swing.event.MenuEvent e) {
                int opcion = JOptionPane.showConfirmDialog(
                    Practica2.this,
                    "¿Estás seguro de que deseas salir?",
                    "Salir",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
                );
                if (opcion == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }

            @Override
            public void menuDeselected(javax.swing.event.MenuEvent e) {}

            @Override
            public void menuCanceled(javax.swing.event.MenuEvent e) {}
        });

        menu.add(menuA);
        menu.add(menuE);
        menu.add(menuR); 
        menu.add(menuS);

        setJMenuBar(menu);
    }

    public static void main(String[] args) {
        Practica2 practica = new Practica2();
        practica.setVisible(true);
    }
}
