/*
 * PreferencesDialog.java
 *
 * Created on August 12, 2008, 4:26 PM
 */
package org.geoimage.viewer.widget;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import org.geoimage.viewer.core.configuration.Preferences;
import org.jdesktop.application.Action;

/**
 *
 * @author  leforth
 */
public class PreferencesDialog extends javax.swing.JFrame {

    EntityManagerFactory emf;
    List<Preferences> prefs;

    /** Creates new form PreferencesDialog */
    public PreferencesDialog() {
        initComponents();
        emf = Persistence.createEntityManagerFactory("GeoImageViewerPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createNamedQuery("Preferences.findAll");
        prefs = q.getResultList();
        em.close();

        setTitle("SUMO Preferences");
        initTable();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Form"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setName("jTable1"); // NOI18N
        jScrollPane1.setViewportView(jTable1);

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(org.geoimage.viewer.core.GeoImageViewer.class).getContext().getResourceMap(PreferencesDialog.class);
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(org.geoimage.viewer.core.GeoImageViewer.class).getContext().getActionMap(PreferencesDialog.class, this);
        jButton2.setAction(actionMap.get("exit")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
                    .addComponent(jButton2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PreferencesDialog().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        TableModel tableModel = new TableModel() {

            public int getRowCount() {
                return prefs.size();
            }

            public int getColumnCount() {
                return 2;
            }

            public String getColumnName(int columnIndex) {
                if (columnIndex == 0) {
                    return "Preference Name";
                }
                if (columnIndex == 1) {
                    return "Preference Value";
                }
                return "Column Error";
            }

            public Class<?> getColumnClass(int columnIndex) {
                return String.class;
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return columnIndex == 1;
            }

            public Object getValueAt(int rowIndex, int columnIndex) {
                Preferences p = prefs.get(rowIndex);
                if (columnIndex == 0) {
                    return p.getName();
                } else if (columnIndex == 1) {
                    return p.getValue();
                }
                return null;
            }

            public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
                if (columnIndex == 1) {
                    if (aValue instanceof String) {
                        Preferences p=prefs.get(rowIndex);
                        p.setValue((String) aValue);
                        EntityManager em = emf.createEntityManager();
                        em.getTransaction().begin();
                        em.persist(em.merge(p));
                        em.getTransaction().commit();
                        em.close();
                    }
                }
            }

            public void addTableModelListener(TableModelListener l) {
            }

            public void removeTableModelListener(TableModelListener l) {
            }
        };

        jTable1.setModel(tableModel);
    }

    @Action
    public void exit() {
        dispose();
    }
}
