
package com.mycompany.tpeluqueria;

import javax.swing.JOptionPane;

/**
 *
 * @author Atati 
 * @author mh684
 */
public class Peluqueria extends javax.swing.JFrame {
    
    Peluqueros jose = new Peluqueros();
    Peluqueros ana = new Peluqueros();
    Peluqueros roberto =new Peluqueros();
    Peluqueros lucrecia=new Peluqueros();
    
    public Peluqueria() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.setTitle("Aplicación la peluquería");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        tituloPeluqueria = new javax.swing.JLabel();
        tituloAna = new javax.swing.JLabel();
        tituloRoberto = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        jPanelAna = new javax.swing.JPanel();
        textCcAna = new javax.swing.JLabel();
        valorCcAna = new javax.swing.JLabel();
        cantCcAna = new javax.swing.JLabel();
        textCdAna = new javax.swing.JLabel();
        textTinAna = new javax.swing.JLabel();
        textPeinAna = new javax.swing.JLabel();
        textTotalSAna = new javax.swing.JLabel();
        textTotalRAna = new javax.swing.JLabel();
        cantTotalRAna = new javax.swing.JLabel();
        cantTotalSAna = new javax.swing.JLabel();
        cantPeinAna = new javax.swing.JLabel();
        cantTintAna = new javax.swing.JLabel();
        cantCdAna = new javax.swing.JLabel();
        valorCdAna = new javax.swing.JLabel();
        valorTinAna = new javax.swing.JLabel();
        valorPeinAna = new javax.swing.JLabel();
        jPanelRoberto = new javax.swing.JPanel();
        textCcRob = new javax.swing.JLabel();
        textCdRob = new javax.swing.JLabel();
        textTinRob = new javax.swing.JLabel();
        textPeinRob = new javax.swing.JLabel();
        textTotalSRob = new javax.swing.JLabel();
        textTotalRRob = new javax.swing.JLabel();
        cantCcRob = new javax.swing.JLabel();
        cantCdRob = new javax.swing.JLabel();
        cantTinRob = new javax.swing.JLabel();
        cantPeinRob = new javax.swing.JLabel();
        cantTotalSRob = new javax.swing.JLabel();
        cantTotalRRob = new javax.swing.JLabel();
        valorCcRob = new javax.swing.JLabel();
        valorCdRob = new javax.swing.JLabel();
        valorTinRob = new javax.swing.JLabel();
        valorPeinRob = new javax.swing.JLabel();
        tituloLucrecia = new javax.swing.JLabel();
        jPanelLucrecia = new javax.swing.JPanel();
        textCcLu = new javax.swing.JLabel();
        textCdLu = new javax.swing.JLabel();
        textTinLu = new javax.swing.JLabel();
        textTotalRLu = new javax.swing.JLabel();
        textTotalSLu = new javax.swing.JLabel();
        textPeinLu = new javax.swing.JLabel();
        cantCcLu = new javax.swing.JLabel();
        cantCdLu = new javax.swing.JLabel();
        cantTinLu = new javax.swing.JLabel();
        cantPeinLu = new javax.swing.JLabel();
        cantTotalSLu = new javax.swing.JLabel();
        cantTotalRLu = new javax.swing.JLabel();
        valorCcLu = new javax.swing.JLabel();
        valorCdLu = new javax.swing.JLabel();
        valorTinLu = new javax.swing.JLabel();
        valorPeinLu = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        img4 = new javax.swing.JLabel();
        jPanelJose = new javax.swing.JPanel();
        textCcJo = new javax.swing.JLabel();
        textCdJo = new javax.swing.JLabel();
        textTinJo = new javax.swing.JLabel();
        textPeinJo = new javax.swing.JLabel();
        textTotalSJo = new javax.swing.JLabel();
        textTotalRJo = new javax.swing.JLabel();
        cantCcJo = new javax.swing.JLabel();
        cantCdJo = new javax.swing.JLabel();
        cantTinJo = new javax.swing.JLabel();
        cantPeinJo = new javax.swing.JLabel();
        cantTotalSJo = new javax.swing.JLabel();
        cantTotalRJo = new javax.swing.JLabel();
        valorCcJo = new javax.swing.JLabel();
        valorCdJo = new javax.swing.JLabel();
        valorTinJo = new javax.swing.JLabel();
        valorPeinJo = new javax.swing.JLabel();
        tituloJose = new javax.swing.JLabel();
        iniciarDia = new javax.swing.JButton();
        registrarAnita = new javax.swing.JButton();
        registrarRoberto = new javax.swing.JButton();
        registrarLucrecia = new javax.swing.JButton();
        registrarJose = new javax.swing.JButton();
        verTotales = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        fondo.setBackground(new java.awt.Color(255, 255, 255));

        tituloPeluqueria.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        tituloPeluqueria.setForeground(new java.awt.Color(204, 153, 255));
        tituloPeluqueria.setText("PELUQUERIA UDEC");

        tituloAna.setBackground(new java.awt.Color(255, 204, 204));
        tituloAna.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        tituloAna.setText("ANA");

        tituloRoberto.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        tituloRoberto.setText("ROBERTO");

        img1.setIcon(new javax.swing.ImageIcon("C:\\Users\\mh684\\OneDrive\\Documentos\\Materias 3er Semestre\\Programacion II\\java proyectos\\tPeluqueria\\src\\main\\java\\com\\mycompany\\tpeluqueria\\PELUQUERA1 (1).jpg")); // NOI18N
        img1.setText("jLabel1");

        img2.setIcon(new javax.swing.ImageIcon("C:\\Users\\mh684\\OneDrive\\Documentos\\Materias 3er Semestre\\Programacion II\\java proyectos\\tPeluqueria\\src\\main\\java\\com\\mycompany\\tpeluqueria\\PELUQUERO1 (1).jpg")); // NOI18N
        img2.setText("jLabel1");

        jPanelAna.setBackground(new java.awt.Color(204, 255, 204));
        jPanelAna.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        textCcAna.setText("Corte Caballero");

        valorCcAna.setText("0.0");

        cantCcAna.setText("0");

        textCdAna.setText("Corte Dama");

        textTinAna.setText("Tintura Cabello");

        textPeinAna.setText("Peinado");

        textTotalSAna.setText("Total Servicios");

        textTotalRAna.setText("Total Recaudo");

        cantTotalRAna.setText("0.0");

        cantTotalSAna.setText("0");

        cantPeinAna.setText("0");

        cantTintAna.setText("0");

        cantCdAna.setText("0");

        valorCdAna.setText("0.0");

        valorTinAna.setText("0.0");

        valorPeinAna.setText("0.0");

        javax.swing.GroupLayout jPanelAnaLayout = new javax.swing.GroupLayout(jPanelAna);
        jPanelAna.setLayout(jPanelAnaLayout);
        jPanelAnaLayout.setHorizontalGroup(
            jPanelAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAnaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textTotalSAna, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelAnaLayout.createSequentialGroup()
                        .addGroup(jPanelAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelAnaLayout.createSequentialGroup()
                                .addComponent(textCcAna)
                                .addGap(32, 32, 32))
                            .addGroup(jPanelAnaLayout.createSequentialGroup()
                                .addComponent(textCdAna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(34, 34, 34)))
                        .addGroup(jPanelAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelAnaLayout.createSequentialGroup()
                                .addComponent(cantCdAna, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(valorCdAna, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelAnaLayout.createSequentialGroup()
                                .addComponent(cantCcAna, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorCcAna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanelAnaLayout.createSequentialGroup()
                        .addGroup(jPanelAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textTinAna, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPeinAna, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textTotalRAna))
                        .addGap(34, 34, 34)
                        .addGroup(jPanelAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelAnaLayout.createSequentialGroup()
                                .addComponent(cantPeinAna, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(valorPeinAna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cantTotalSAna, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantTotalRAna, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelAnaLayout.createSequentialGroup()
                                .addComponent(cantTintAna, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(valorTinAna, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(92, 92, 92))
        );
        jPanelAnaLayout.setVerticalGroup(
            jPanelAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAnaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCcAna)
                    .addComponent(cantCcAna)
                    .addComponent(valorCcAna))
                .addGap(18, 18, 18)
                .addGroup(jPanelAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCdAna)
                    .addComponent(cantCdAna)
                    .addComponent(valorCdAna))
                .addGap(18, 18, 18)
                .addGroup(jPanelAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTinAna)
                    .addComponent(cantTintAna)
                    .addComponent(valorTinAna))
                .addGap(18, 18, 18)
                .addGroup(jPanelAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPeinAna)
                    .addComponent(valorPeinAna)
                    .addComponent(cantPeinAna, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTotalSAna)
                    .addComponent(cantTotalSAna))
                .addGap(18, 18, 18)
                .addGroup(jPanelAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTotalRAna)
                    .addComponent(cantTotalRAna))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanelRoberto.setBackground(new java.awt.Color(204, 255, 204));
        jPanelRoberto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        textCcRob.setText("Corte Caballero");

        textCdRob.setText("Corte Dama");

        textTinRob.setText("Tintura Cabello");

        textPeinRob.setText("Peinado");

        textTotalSRob.setText("Total Servicios");

        textTotalRRob.setText("Total Recaudo");

        cantCcRob.setText("0");

        cantCdRob.setText("0");

        cantTinRob.setText("0");

        cantPeinRob.setText("0");

        cantTotalSRob.setText("0");

        cantTotalRRob.setText("0.0");

        valorCcRob.setText("0.0");

        valorCdRob.setText("0.0");

        valorTinRob.setText("0.0");

        valorPeinRob.setText("0.0");

        javax.swing.GroupLayout jPanelRobertoLayout = new javax.swing.GroupLayout(jPanelRoberto);
        jPanelRoberto.setLayout(jPanelRobertoLayout);
        jPanelRobertoLayout.setHorizontalGroup(
            jPanelRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRobertoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textCcRob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textTinRob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textPeinRob, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTotalRRob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textTotalSRob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textCdRob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanelRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRobertoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanelRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantCcRob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantCdRob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantTinRob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantPeinRob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantTotalSRob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valorCcRob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorTinRob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorCdRob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorPeinRob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(jPanelRobertoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cantTotalRRob, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelRobertoLayout.setVerticalGroup(
            jPanelRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRobertoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCcRob)
                    .addComponent(cantCcRob)
                    .addComponent(valorCcRob))
                .addGap(18, 18, 18)
                .addGroup(jPanelRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCdRob)
                    .addGroup(jPanelRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cantCdRob, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(valorCdRob)))
                .addGap(18, 18, 18)
                .addGroup(jPanelRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTinRob)
                    .addComponent(cantTinRob)
                    .addComponent(valorTinRob))
                .addGap(18, 18, 18)
                .addGroup(jPanelRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPeinRob)
                    .addComponent(cantPeinRob)
                    .addComponent(valorPeinRob))
                .addGap(18, 18, 18)
                .addGroup(jPanelRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTotalSRob)
                    .addComponent(cantTotalSRob))
                .addGap(18, 18, 18)
                .addGroup(jPanelRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTotalRRob)
                    .addComponent(cantTotalRRob))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tituloLucrecia.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        tituloLucrecia.setText("LUCRECIA");

        jPanelLucrecia.setBackground(new java.awt.Color(204, 255, 204));
        jPanelLucrecia.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        textCcLu.setText("Corte Caballero");

        textCdLu.setText("Corte Dama");

        textTinLu.setText("Tintura Cabello");

        textTotalRLu.setText("Total Recaudo");

        textTotalSLu.setText("Total Servicios");

        textPeinLu.setText("Peinado");

        cantCcLu.setText("0");

        cantCdLu.setText("0");

        cantTinLu.setText("0");

        cantPeinLu.setText("0");

        cantTotalSLu.setText("0");

        cantTotalRLu.setText("0.0");

        valorCcLu.setText("0.0");

        valorCdLu.setText("0.0");

        valorTinLu.setText("0.0");

        valorPeinLu.setText("0.0");

        javax.swing.GroupLayout jPanelLucreciaLayout = new javax.swing.GroupLayout(jPanelLucrecia);
        jPanelLucrecia.setLayout(jPanelLucreciaLayout);
        jPanelLucreciaLayout.setHorizontalGroup(
            jPanelLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLucreciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(textTotalRLu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textTotalSLu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textCcLu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textCdLu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textTinLu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textPeinLu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanelLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLucreciaLayout.createSequentialGroup()
                        .addGroup(jPanelLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cantTotalSLu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(cantPeinLu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cantCcLu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cantCdLu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cantTinLu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valorCcLu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valorCdLu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valorTinLu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valorPeinLu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelLucreciaLayout.createSequentialGroup()
                        .addComponent(cantTotalRLu, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 43, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelLucreciaLayout.setVerticalGroup(
            jPanelLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLucreciaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCcLu)
                    .addComponent(cantCcLu)
                    .addComponent(valorCcLu))
                .addGap(18, 18, 18)
                .addGroup(jPanelLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCdLu)
                    .addComponent(cantCdLu)
                    .addComponent(valorCdLu))
                .addGap(18, 18, 18)
                .addGroup(jPanelLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTinLu)
                    .addComponent(cantTinLu)
                    .addComponent(valorTinLu))
                .addGap(18, 18, 18)
                .addGroup(jPanelLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPeinLu)
                    .addComponent(cantPeinLu)
                    .addComponent(valorPeinLu))
                .addGap(18, 18, 18)
                .addGroup(jPanelLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTotalSLu)
                    .addComponent(cantTotalSLu))
                .addGap(18, 18, 18)
                .addGroup(jPanelLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTotalRLu)
                    .addComponent(cantTotalRLu))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        img3.setIcon(new javax.swing.ImageIcon("C:\\Users\\mh684\\OneDrive\\Documentos\\Materias 3er Semestre\\Programacion II\\java proyectos\\tPeluqueria\\src\\main\\java\\com\\mycompany\\tpeluqueria\\PELUQUERA2 (1).jpg")); // NOI18N
        img3.setText("jLabel1");

        img4.setIcon(new javax.swing.ImageIcon("C:\\Users\\mh684\\OneDrive\\Documentos\\Materias 3er Semestre\\Programacion II\\java proyectos\\tPeluqueria\\src\\main\\java\\com\\mycompany\\tpeluqueria\\PELUQUERO2 (1).jpg")); // NOI18N
        img4.setText("jLabel1");

        jPanelJose.setBackground(new java.awt.Color(204, 255, 204));
        jPanelJose.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        textCcJo.setText("Corte Caballero");

        textCdJo.setText("Corte Dama");

        textTinJo.setText("Tintura Cabello");

        textPeinJo.setText("Peinado");

        textTotalSJo.setText("Total Servicios");

        textTotalRJo.setText("Total Recaudo");

        cantCcJo.setText("0");

        cantCdJo.setText("0");

        cantTinJo.setText("0");

        cantPeinJo.setText("0");

        cantTotalSJo.setText("0");

        cantTotalRJo.setText("0.0");

        valorCcJo.setText("0.0");

        valorCdJo.setText("0.0");

        valorTinJo.setText("0.0");

        valorPeinJo.setText("0.0");

        javax.swing.GroupLayout jPanelJoseLayout = new javax.swing.GroupLayout(jPanelJose);
        jPanelJose.setLayout(jPanelJoseLayout);
        jPanelJoseLayout.setHorizontalGroup(
            jPanelJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJoseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textCcJo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textCdJo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textTinJo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textPeinJo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textTotalSJo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textTotalRJo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanelJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelJoseLayout.createSequentialGroup()
                        .addGroup(jPanelJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cantTotalSJo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(cantCcJo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cantCdJo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cantTinJo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cantPeinJo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valorCcJo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valorCdJo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valorTinJo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valorPeinJo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelJoseLayout.createSequentialGroup()
                        .addComponent(cantTotalRJo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 47, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelJoseLayout.setVerticalGroup(
            jPanelJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJoseLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCcJo)
                    .addComponent(cantCcJo)
                    .addComponent(valorCcJo))
                .addGap(18, 18, 18)
                .addGroup(jPanelJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCdJo)
                    .addComponent(cantCdJo)
                    .addComponent(valorCdJo))
                .addGap(18, 18, 18)
                .addGroup(jPanelJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTinJo)
                    .addComponent(cantTinJo)
                    .addComponent(valorTinJo))
                .addGap(18, 18, 18)
                .addGroup(jPanelJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPeinJo)
                    .addComponent(cantPeinJo)
                    .addComponent(valorPeinJo))
                .addGap(18, 18, 18)
                .addGroup(jPanelJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTotalSJo)
                    .addComponent(cantTotalSJo))
                .addGap(18, 18, 18)
                .addGroup(jPanelJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTotalRJo)
                    .addComponent(cantTotalRJo))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tituloJose.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        tituloJose.setText("JOSÉ");

        iniciarDia.setText("Iniciar día");
        iniciarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarDiaActionPerformed(evt);
            }
        });

        registrarAnita.setText("Registrar Anita");
        registrarAnita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarAnitaActionPerformed(evt);
            }
        });

        registrarRoberto.setText("Registrar Roberto");
        registrarRoberto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarRobertoActionPerformed(evt);
            }
        });

        registrarLucrecia.setText("Registrar Lucrecia");
        registrarLucrecia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarLucreciaActionPerformed(evt);
            }
        });

        registrarJose.setText("Registrar José");
        registrarJose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarJoseActionPerformed(evt);
            }
        });

        verTotales.setText("Ver Totales");
        verTotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verTotalesActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(255, 153, 153));
        salir.setText("Salir");
        salir.setMaximumSize(new java.awt.Dimension(72, 25));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(25, 36, Short.MAX_VALUE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanelAna, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tituloAna, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addComponent(jPanelRoberto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tituloRoberto, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(verTotales)
                                .addGap(46, 46, 46)
                                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(fondoLayout.createSequentialGroup()
                                        .addComponent(jPanelLucrecia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(img3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(img4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tituloLucrecia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fondoLayout.createSequentialGroup()
                                        .addComponent(iniciarDia)
                                        .addGap(38, 38, 38)
                                        .addComponent(registrarAnita)
                                        .addGap(40, 40, 40)
                                        .addComponent(registrarRoberto)
                                        .addGap(42, 42, 42)
                                        .addComponent(registrarLucrecia)
                                        .addGap(47, 47, 47)
                                        .addComponent(registrarJose)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanelJose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tituloJose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(31, 31, 31))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloPeluqueria, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(tituloPeluqueria)
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(tituloAna)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanelAna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(tituloRoberto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelRoberto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                                .addComponent(img2)
                                .addGap(12, 12, 12)))))
                .addGap(26, 26, 26)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                        .addComponent(tituloLucrecia)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelLucrecia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(img3))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                        .addComponent(tituloJose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelJose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(img4))))
                .addGap(57, 57, 57)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iniciarDia)
                    .addComponent(registrarAnita)
                    .addComponent(registrarRoberto)
                    .addComponent(registrarLucrecia)
                    .addComponent(verTotales)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrarJose))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarDiaActionPerformed
    cantCcAna.setText("0");
    valorCcAna.setText("0.0");
    cantCdAna.setText("0");
    valorCdAna.setText("0.0"); 
    cantPeinAna.setText("0");        
    valorPeinAna.setText("0.0");   
    cantTintAna.setText("0");
    valorTinAna.setText("0.0"); 
    cantTotalSAna.setText("0"); 
    cantTotalRAna.setText("0.0"); 
    cantCcRob.setText("0");
    valorCcRob.setText("0.0");
    cantCdRob.setText("0");
    valorCdRob.setText("0.0"); 
    cantPeinRob.setText("0");        
    valorPeinRob.setText("0.0");   
    cantTinRob.setText("0");
    valorTinRob.setText("0.0"); 
    cantTotalSRob.setText("0"); 
    cantTotalRRob.setText("0.0"); 
    cantCcLu.setText("0");
    valorCcLu.setText("0.0");
    cantCdLu.setText("0");
    valorCdLu.setText("0.0"); 
    cantPeinLu.setText("0");        
    valorPeinLu.setText("0.0");   
    cantTinLu.setText("0");
    valorTinLu.setText("0.0"); 
    cantTotalSLu.setText("0"); 
    cantTotalRLu.setText("0.0"); 
    cantCcJo.setText("0");
    valorCcJo.setText("0.0");
    cantCdJo.setText("0");
    valorCdJo.setText("0.0"); 
    cantPeinJo.setText("0");        
    valorPeinJo.setText("0.0");   
    cantTinJo.setText("0");
    valorTinJo.setText("0.0"); 
    cantTotalSJo.setText("0"); 
    cantTotalRJo.setText("0.0");   
        
    }//GEN-LAST:event_iniciarDiaActionPerformed

    private void registrarAnitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarAnitaActionPerformed
        ana.calcularServicios();
        cantCcAna.setText(String.valueOf(ana.getNumeroCortesCaballeros()));
        valorCcAna.setText(String.valueOf(ana.getValorCortesCaballeros()));
        cantCdAna.setText(String.valueOf(ana.getNumeroCortesDamas()));
        valorCdAna.setText(String.valueOf(ana.getValorCortesDamas())); 
        cantPeinAna.setText(String.valueOf(ana.getNumeroPeinados()));        
        valorPeinAna.setText(String.valueOf(ana.getValorPeinados()));   
        cantTintAna.setText(String.valueOf(ana.getNumeroTinturas()));
        valorTinAna.setText(String.valueOf(ana.getValorTinturas())); 
        cantTotalSAna.setText(String.valueOf(ana.getTotalSevicios())); 
        cantTotalRAna.setText(String.valueOf(ana.getTotalRecaudado()));        
                
    }//GEN-LAST:event_registrarAnitaActionPerformed

    private void registrarRobertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarRobertoActionPerformed
        roberto.calcularServicios();
        cantCcRob.setText(String.valueOf(roberto.getNumeroCortesCaballeros()));
        valorCcRob.setText(String.valueOf(roberto.getValorCortesCaballeros()));
        cantCdRob.setText(String.valueOf(roberto.getNumeroCortesDamas()));
        valorCdRob.setText(String.valueOf(roberto.getValorCortesDamas())); 
        cantPeinRob.setText(String.valueOf(roberto.getNumeroPeinados()));        
        valorPeinRob.setText(String.valueOf(roberto.getValorPeinados()));   
        cantTinRob.setText(String.valueOf(roberto.getNumeroTinturas()));
        valorTinRob.setText(String.valueOf(roberto.getValorTinturas())); 
        cantTotalSRob.setText(String.valueOf(roberto.getTotalSevicios())); 
        cantTotalRRob.setText(String.valueOf(roberto.getTotalRecaudado()));     
    }//GEN-LAST:event_registrarRobertoActionPerformed

    private void registrarLucreciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarLucreciaActionPerformed
        lucrecia.calcularServicios();
        cantCcLu.setText(String.valueOf(lucrecia.getNumeroCortesCaballeros()));
        valorCcLu.setText(String.valueOf(lucrecia.getValorCortesCaballeros()));
        cantCdLu.setText(String.valueOf(lucrecia.getNumeroCortesDamas()));
        valorCdLu.setText(String.valueOf(lucrecia.getValorCortesDamas()));
        cantPeinLu.setText(String.valueOf(lucrecia.getNumeroPeinados()));
        valorPeinLu.setText(String.valueOf(lucrecia.getValorPeinados()));
        cantTinLu.setText(String.valueOf(lucrecia.getNumeroTinturas()));
        valorTinLu.setText(String.valueOf(lucrecia.getValorTinturas()));
        cantTotalSLu.setText(String.valueOf(lucrecia.getTotalSevicios())); 
        cantTotalRLu.setText(String.valueOf(lucrecia.getTotalRecaudado()));     
    }//GEN-LAST:event_registrarLucreciaActionPerformed

    private void registrarJoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarJoseActionPerformed
      jose.calcularServicios();
      cantCcJo.setText(String.valueOf(jose.getNumeroCortesCaballeros()));
      valorCcJo.setText(String.valueOf(jose.getValorCortesCaballeros())); 
      cantCdJo.setText(String.valueOf(jose.getNumeroCortesDamas()));
      valorCdJo.setText(String.valueOf(jose.getValorCortesDamas()));
      cantPeinJo.setText(String.valueOf(jose.getNumeroPeinados()));
      valorPeinJo.setText(String.valueOf(jose.getValorPeinados()));
      cantTinJo.setText(String.valueOf(jose.getNumeroTinturas()));
      valorTinJo.setText(String.valueOf(jose.getValorTinturas()));
      cantTotalSJo.setText(String.valueOf(jose.getTotalSevicios())); 
      cantTotalRJo.setText(String.valueOf(jose.getTotalRecaudado()));     
    }//GEN-LAST:event_registrarJoseActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void verTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verTotalesActionPerformed
       int totS;
       double totR;
       totS=jose.getTotalSevicios()+lucrecia.getTotalSevicios()+roberto.getTotalSevicios()+ana.getTotalSevicios();
       totR=jose.getTotalRecaudado()+lucrecia.getTotalRecaudado()+roberto.getTotalRecaudado()+ana.getTotalRecaudado();
        JOptionPane.showMessageDialog(null, "Numero Total de Servicios: "+totS+"\n"+"Total Recaudado: "+totR, "Reporte Final del dia", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_verTotalesActionPerformed

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
            java.util.logging.Logger.getLogger(Peluqueria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Peluqueria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Peluqueria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Peluqueria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Peluqueria().setVisible(true);
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cantCcAna;
    private javax.swing.JLabel cantCcJo;
    private javax.swing.JLabel cantCcLu;
    private javax.swing.JLabel cantCcRob;
    private javax.swing.JLabel cantCdAna;
    private javax.swing.JLabel cantCdJo;
    private javax.swing.JLabel cantCdLu;
    private javax.swing.JLabel cantCdRob;
    private javax.swing.JLabel cantPeinAna;
    private javax.swing.JLabel cantPeinJo;
    private javax.swing.JLabel cantPeinLu;
    private javax.swing.JLabel cantPeinRob;
    private javax.swing.JLabel cantTinJo;
    private javax.swing.JLabel cantTinLu;
    private javax.swing.JLabel cantTinRob;
    private javax.swing.JLabel cantTintAna;
    private javax.swing.JLabel cantTotalRAna;
    private javax.swing.JLabel cantTotalRJo;
    private javax.swing.JLabel cantTotalRLu;
    private javax.swing.JLabel cantTotalRRob;
    private javax.swing.JLabel cantTotalSAna;
    private javax.swing.JLabel cantTotalSJo;
    private javax.swing.JLabel cantTotalSLu;
    private javax.swing.JLabel cantTotalSRob;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    private javax.swing.JButton iniciarDia;
    private javax.swing.JPanel jPanelAna;
    private javax.swing.JPanel jPanelJose;
    private javax.swing.JPanel jPanelLucrecia;
    private javax.swing.JPanel jPanelRoberto;
    private javax.swing.JButton registrarAnita;
    private javax.swing.JButton registrarJose;
    private javax.swing.JButton registrarLucrecia;
    private javax.swing.JButton registrarRoberto;
    private javax.swing.JButton salir;
    private javax.swing.JLabel textCcAna;
    private javax.swing.JLabel textCcJo;
    private javax.swing.JLabel textCcLu;
    private javax.swing.JLabel textCcRob;
    private javax.swing.JLabel textCdAna;
    private javax.swing.JLabel textCdJo;
    private javax.swing.JLabel textCdLu;
    private javax.swing.JLabel textCdRob;
    private javax.swing.JLabel textPeinAna;
    private javax.swing.JLabel textPeinJo;
    private javax.swing.JLabel textPeinLu;
    private javax.swing.JLabel textPeinRob;
    private javax.swing.JLabel textTinAna;
    private javax.swing.JLabel textTinJo;
    private javax.swing.JLabel textTinLu;
    private javax.swing.JLabel textTinRob;
    private javax.swing.JLabel textTotalRAna;
    private javax.swing.JLabel textTotalRJo;
    private javax.swing.JLabel textTotalRLu;
    private javax.swing.JLabel textTotalRRob;
    private javax.swing.JLabel textTotalSAna;
    private javax.swing.JLabel textTotalSJo;
    private javax.swing.JLabel textTotalSLu;
    private javax.swing.JLabel textTotalSRob;
    private javax.swing.JLabel tituloAna;
    private javax.swing.JLabel tituloJose;
    private javax.swing.JLabel tituloLucrecia;
    private javax.swing.JLabel tituloPeluqueria;
    private javax.swing.JLabel tituloRoberto;
    private javax.swing.JLabel valorCcAna;
    private javax.swing.JLabel valorCcJo;
    private javax.swing.JLabel valorCcLu;
    private javax.swing.JLabel valorCcRob;
    private javax.swing.JLabel valorCdAna;
    private javax.swing.JLabel valorCdJo;
    private javax.swing.JLabel valorCdLu;
    private javax.swing.JLabel valorCdRob;
    private javax.swing.JLabel valorPeinAna;
    private javax.swing.JLabel valorPeinJo;
    private javax.swing.JLabel valorPeinLu;
    private javax.swing.JLabel valorPeinRob;
    private javax.swing.JLabel valorTinAna;
    private javax.swing.JLabel valorTinJo;
    private javax.swing.JLabel valorTinLu;
    private javax.swing.JLabel valorTinRob;
    private javax.swing.JButton verTotales;
    // End of variables declaration//GEN-END:variables

    private void restart() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
