/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package src.main.view;

/**
 *
 * @author lococ
 */
public class panel_ver extends javax.swing.JPanel {

    /**
     * Creates new form panel_ver
     */
    public panel_ver() {
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

        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lb_id_info = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lb_nombre_info = new javax.swing.JLabel();
        lb_descipcion_info = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        lb_Entradas = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lb_Salidas = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lb_Stock = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lb_fecha_info = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(773, 573));
        setLayout(new java.awt.BorderLayout());

        jPanel8.setOpaque(false);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("Informacion De Articulo");

        lb_id_info.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_id_info.setText("ID:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel13))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(lb_id_info)))
                .addContainerGap(270, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(lb_id_info)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        add(jPanel8, java.awt.BorderLayout.PAGE_START);

        jPanel2.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);

        lb_nombre_info.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_nombre_info.setForeground(new java.awt.Color(0, 0, 204));
        lb_nombre_info.setText("Nombre: ");

        lb_descipcion_info.setText("Descripcion:");

        jPanel5.setBackground(new java.awt.Color(51, 204, 0));

        lb_Entradas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lb_Entradas.setForeground(new java.awt.Color(255, 255, 255));
        lb_Entradas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Entradas.setText("23");

        jLabel5.setBackground(new java.awt.Color(51, 160, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Numero de Entradas");
        jLabel5.setOpaque(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lb_Entradas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_Entradas)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(153, 0, 0));

        jLabel7.setBackground(new java.awt.Color(120, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Numero de Salidas");
        jLabel7.setOpaque(true);

        lb_Salidas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lb_Salidas.setForeground(new java.awt.Color(255, 255, 255));
        lb_Salidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Salidas.setText("48");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_Salidas)
                .addGap(55, 55, 55))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_Salidas)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        jPanel7.setPreferredSize(new java.awt.Dimension(139, 100));

        lb_Stock.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lb_Stock.setForeground(new java.awt.Color(0, 0, 153));
        lb_Stock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Stock.setText("15");
        lb_Stock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel9.setBackground(new java.awt.Color(220, 220, 220));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Stock");
        jLabel9.setOpaque(true);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lb_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_Stock)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        lb_fecha_info.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_fecha_info.setText("Fecha:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lb_descipcion_info)
                        .addGap(0, 477, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(lb_nombre_info)
                                        .addGap(104, 104, 104)
                                        .addComponent(lb_fecha_info)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nombre_info)
                    .addComponent(lb_fecha_info))
                .addGap(18, 18, 18)
                .addComponent(lb_descipcion_info)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(298, Short.MAX_VALUE))
        );

        add(jPanel4, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JPanel jPanel5;
    public static javax.swing.JPanel jPanel6;
    public static javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    public static javax.swing.JSeparator jSeparator1;
    public static javax.swing.JLabel lb_Entradas;
    public static javax.swing.JLabel lb_Salidas;
    public static javax.swing.JLabel lb_Stock;
    public static javax.swing.JLabel lb_descipcion_info;
    public static javax.swing.JLabel lb_fecha_info;
    public static javax.swing.JLabel lb_id_info;
    public static javax.swing.JLabel lb_nombre_info;
    // End of variables declaration//GEN-END:variables
}
