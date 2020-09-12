package Clases;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GUI extends javax.swing.JFrame{

    ImagenNumero[] numeros = new ImagenNumero[18];
    ImagenNumero[] paraOrdenar;
    //ImagenNumero[] ordenado;
    HiloBubble hiloBubble;
    HiloShell hiloShell;

    public GUI() {
        initComponents();
        llenarArreglo();
        Revolver();

        bubbleSort.setEnabled(true);
        shellSort.setEnabled(true);
        quickSort.setEnabled(true);
        unSort.setEnabled(true);


        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setSize(790, 550);
        this.setLocationRelativeTo(null);
        this.setTitle("Algoritmos de ordenamiento");
        this.setLayout(null);
    }

    public void llenarArreglo() {

        numeros[0] = new ImagenNumero(new ImageIcon(getClass().getResource("/Numeros/1.jpg")), 1);
        numeros[1] = new ImagenNumero(new ImageIcon(getClass().getResource("/Numeros/2.jpg")), 2);
        numeros[2] = new ImagenNumero(new ImageIcon(getClass().getResource("/Numeros/3.jpg")), 3);
        numeros[3] = new ImagenNumero(new ImageIcon(getClass().getResource("/Numeros/4.jpg")), 4);
        numeros[4] = new ImagenNumero(new ImageIcon(getClass().getResource("/Numeros/5.jpg")), 5);
        numeros[5] = new ImagenNumero(new ImageIcon(getClass().getResource("/Numeros/6.jpg")), 6);
        numeros[6] = new ImagenNumero(new ImageIcon(getClass().getResource("/Numeros/7.jpg")), 7);
        numeros[7] = new ImagenNumero(new ImageIcon(getClass().getResource("/Numeros/8.jpg")), 8);
        numeros[8] = new ImagenNumero(new ImageIcon(getClass().getResource("/Numeros/9.jpg")), 9);
        numeros[9] = new ImagenNumero(new ImageIcon(getClass().getResource("/Numeros/10.jpg")), 10);
        numeros[10] = new ImagenNumero(new ImageIcon(getClass().getResource("/Numeros/11.jpg")), 11);
        numeros[11] = new ImagenNumero(new ImageIcon(getClass().getResource("/Numeros/12.jpg")), 12);
        numeros[12] = new ImagenNumero(new ImageIcon(getClass().getResource("/Numeros/13.jpg")), 13);
        numeros[13] = new ImagenNumero(new ImageIcon(getClass().getResource("/Numeros/14.jpg")), 14);
        numeros[14] = new ImagenNumero(new ImageIcon(getClass().getResource("/Numeros/15.jpg")), 15);
        numeros[15] = new ImagenNumero(new ImageIcon(getClass().getResource("/Numeros/16.jpg")), 16);
        numeros[16] = new ImagenNumero(new ImageIcon(getClass().getResource("/Numeros/17.jpg")), 17);
        numeros[17] = new ImagenNumero(new ImageIcon(getClass().getResource("/Numeros/18.jpg")), 18);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        e3 = new javax.swing.JLabel();
        e1 = new javax.swing.JLabel();
        e5 = new javax.swing.JLabel();
        e6 = new javax.swing.JLabel();
        e7 = new javax.swing.JLabel();
        e8 = new javax.swing.JLabel();
        e9 = new javax.swing.JLabel();
        e10 = new javax.swing.JLabel();
        e2 = new javax.swing.JLabel();
        e4 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        bubbleSort = new javax.swing.JButton();
        quickSort = new javax.swing.JButton();
        shellSort = new javax.swing.JButton();
        unSort = new javax.swing.JButton();
        botonMillon = new javax.swing.JButton();

        e1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        e1.setBounds(60,90,70,70);

        e2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        e2.setBounds(130,90,70,70);

        e3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        e3.setBounds(200,90,70,70);

        e4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        e4.setBounds(270,90,70,70);

        e5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        e5.setBounds(340,90,70,70);

        e6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        e6.setBounds(410,90,70,70);

        e7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        e7.setBounds(480,90,70,70);

        e8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        e8.setBounds(550,90,70,70);

        e9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        e9.setBounds(620,90,70,70);

        e10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        e10.setBounds(690,90,70,70);

        add(e1);
        add(e2);
        add(e3);
        add(e4);
        add(e5);
        add(e6);
        add(e7);
        add(e8);
        add(e9);
        add(e10);


        titulo.setFont(new java.awt.Font("Calibri", 0, 40)); // NOI18N
        titulo.setText("Algoritmos de ordenamiento");
        titulo.setBounds(180,10,500,60);
        add(titulo);

        bubbleSort.setText("Bubble sort");
        bubbleSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubbleSortActionPerformed(evt);
            }
        });
        bubbleSort.setBounds(60,220,200,60);
        add(bubbleSort);

        quickSort.setText("Quick Sort");
        quickSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quickSortActionPerformed(evt);
            }
        });
        quickSort.setBounds(60,320,200,60);
        add(quickSort);

        shellSort.setText("Shell Sort");
        shellSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shellSortActionPerformed(evt);
            }
        });
        shellSort.setBounds(60,420,200,60);
        add(shellSort);

        unSort.setText("UnSort");
        unSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unSortActionPerformed(evt);
            }
        });
        unSort.setBounds(400,220,200,60);
        add(unSort);

        botonMillon.setText("Bubble Millón");
        botonMillon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMillonActionPerformed(evt);
            }
        });
        botonMillon.setBounds(400,320,200,60);
        add(botonMillon);
    }// </editor-fold>

    private void quickSortActionPerformed(java.awt.event.ActionEvent evt) {


    }

    private void shellSortActionPerformed(java.awt.event.ActionEvent evt) {

        //Shell(paraOrdenar);
        hiloShell = new HiloShell(paraOrdenar);
        hiloShell.start();

        bubbleSort.setEnabled(false);
        shellSort.setEnabled(false);
        quickSort.setEnabled(false);
        unSort.setEnabled(false);
        botonMillon.setEnabled(false);

    }

    private void bubbleSortActionPerformed(java.awt.event.ActionEvent evt) {

        hiloBubble = new HiloBubble();
        hiloBubble.start();

        bubbleSort.setEnabled(false);
        shellSort.setEnabled(false);
        quickSort.setEnabled(false);
        unSort.setEnabled(false);
        botonMillon.setEnabled(false);

    }

    private void unSortActionPerformed(java.awt.event.ActionEvent evt) {
        Revolver();
        bubbleSort.setEnabled(true);
        shellSort.setEnabled(true);
        quickSort.setEnabled(true);
        unSort.setEnabled(true);
        botonMillon.setEnabled(true);
    }

    private void botonMillonActionPerformed(java.awt.event.ActionEvent evt) {

        bubbleMillon();
    }

    public class HiloBubble extends Thread {

        int x = 0;

        public void run() {
            do {
                while (x < paraOrdenar.length - 1) {
                    try {
                        BubbleSort(paraOrdenar, x);
                        Mostrar();
                        x++;
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                bubbleSort.setEnabled(true);
                shellSort.setEnabled(true);
                quickSort.setEnabled(true);
                unSort.setEnabled(true);
                botonMillon.setEnabled(true);
                this.stop();
                x = 0;

            } while (x == 0);
        }
    }

    public void BubbleSort(ImagenNumero A[], int vuelta) {
        ImagenNumero aux;
        int j = 0;

        while (j < A.length -1 - vuelta ) {

            if (A[j + 1].getValor() < A[j].getValor()) {
                aux = A[j + 1];
                A[j + 1] = A[j];
                A[j] = aux;

            }
            j++;
        }

    }

    class HiloShell extends Thread{
        int salto, i;
        boolean cambios;
        ImagenNumero aux;
        ImagenNumero [] A;

        public HiloShell(ImagenNumero[] nums){
            A = nums;
        }

        //try{
        public void run(){
            try{
                for (salto = A.length / 2; salto != 0; salto /= 2) {
                    cambios = true;
                    while (cambios) {
                        cambios = false;
                        for (i = salto; i < A.length; i++)
                        {
                            if (A[i - salto].getValor() > A[i].getValor()) {
                                aux = A[i];
                                A[i] = A[i - salto];
                                A[i - salto] = aux;
                                Thread.sleep(700);
                                cambios = true;
                                Mostrar(A);
                            }
                        }
                    }
                }
                bubbleSort.setEnabled(true);
                shellSort.setEnabled(true);
                quickSort.setEnabled(true);
                unSort.setEnabled(true);
                botonMillon.setEnabled(true);
                this.stop();
            }catch (Exception e){}
        }
    }

    public class HiloQuick extends Thread{

    }

    public void Mostrar() {
        e1.setIcon(paraOrdenar[0].getImagen());
        e2.setIcon(paraOrdenar[1].getImagen());
        e3.setIcon(paraOrdenar[2].getImagen());
        e4.setIcon(paraOrdenar[3].getImagen());
        e5.setIcon(paraOrdenar[4].getImagen());
        e6.setIcon(paraOrdenar[5].getImagen());
        e7.setIcon(paraOrdenar[6].getImagen());
        e8.setIcon(paraOrdenar[7].getImagen());
        e9.setIcon(paraOrdenar[8].getImagen());
        e10.setIcon(paraOrdenar[9].getImagen());
    }

    public void Mostrar(ImagenNumero [] nums) {
        e1.setIcon(nums[0].getImagen());
        e2.setIcon(nums[1].getImagen());
        e3.setIcon(nums[2].getImagen());
        e4.setIcon(nums[3].getImagen());
        e5.setIcon(nums[4].getImagen());
        e6.setIcon(nums[5].getImagen());
        e7.setIcon(nums[6].getImagen());
        e8.setIcon(nums[7].getImagen());
        e9.setIcon(nums[8].getImagen());
        e10.setIcon(nums[9].getImagen());
    }


    public void Revolver () {
        Random generador = new Random();
        paraOrdenar = new ImagenNumero[10];

        for (int i = 0; i < 10; i++) {
            int aleatorio = generador.nextInt(18);
            paraOrdenar[i] = numeros[aleatorio];
        }

        Mostrar();
    }

    public void bubbleMillon() {

        int A [] = new int[1000];
        int aux;
        Random generador = new Random();

        for (int i = 0; i < A.length-1; i++) {
            A[i] = generador.nextInt(1000);
        }

        int x = 0, j = 0;
        bubbleSort.setEnabled(false);
        shellSort.setEnabled(false);
        quickSort.setEnabled(false);
        unSort.setEnabled(false);
        botonMillon.setEnabled(false);

        do {

            while (j < A.length -1) {

                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;

                }
                j++;
            }

            x++;
        }
        while (x<A.length-1);

        for (int i = 0; i < 200; i++) {
            System.out.print(A[i] + ", ");
        }

        bubbleSort.setEnabled(true);
        shellSort.setEnabled(true);
        quickSort.setEnabled(true);
        unSort.setEnabled(true);
        botonMillon.setEnabled(true);

    }


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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton bubbleSort;
    private javax.swing.JLabel e1;
    private javax.swing.JLabel e10;
    private javax.swing.JLabel e2;
    private javax.swing.JLabel e3;
    private javax.swing.JLabel e4;
    private javax.swing.JLabel e5;
    private javax.swing.JLabel e6;
    private javax.swing.JLabel e7;
    private javax.swing.JLabel e8;
    private javax.swing.JLabel e9;
    private javax.swing.JButton botonMillon;
    private javax.swing.JButton quickSort;
    private javax.swing.JButton shellSort;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton unSort;
    // End of variables declaration
}
