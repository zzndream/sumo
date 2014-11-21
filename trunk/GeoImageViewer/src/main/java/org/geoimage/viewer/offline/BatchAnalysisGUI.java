/*
 * NURCAnalysis.java
 *
 * Created on November 17, 2008, 3:37 PM
 */
package org.geoimage.viewer.offline;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.geoimage.analysis.DetectedPixels;
import org.geoimage.analysis.KDistributionEstimation;
import org.geoimage.def.GeoImageReader;
import org.geoimage.def.SarImageReader;
import org.geoimage.factory.GeoImageReaderFactory;
import org.geoimage.impl.ENL;
import org.geoimage.utils.GeometryExtractor;
import org.geoimage.utils.IMask;
import org.geoimage.utils.IProgress;
import org.geoimage.viewer.actions.VDSAnalysisConsoleAction;
import org.geoimage.viewer.core.api.GeometricLayer;
import org.geoimage.viewer.core.factory.FactoryLayer;
import org.geoimage.viewer.core.factory.VectorIOFactory;
import org.geoimage.viewer.core.io.AbstractVectorIO;
import org.geoimage.viewer.core.io.KmlIO;
import org.geoimage.viewer.core.io.SumoXmlIOOld;
import org.geoimage.viewer.core.layers.thumbnails.ThumbnailsManager;
import org.jdesktop.application.Action;
import org.jdesktop.application.Task;

import com.keithpower.gekmlib.Document;
import com.keithpower.gekmlib.Folder;
import com.keithpower.gekmlib.Kml;
import com.keithpower.gekmlib.Link;
import com.keithpower.gekmlib.NetworkLink;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.io.WKTReader;
import com.vividsolutions.jts.io.WKTWriter;

/**
 *
 * @author  thoorfr
 */
public class BatchAnalysisGUI extends javax.swing.JFrame {

    /** Creates new form NURCAnalysis */
    public BatchAnalysisGUI() {
        initComponents();
        try {
            tryCatalog();
        } catch (Exception ex) {
            Logger.getLogger(BatchAnalysisGUI.class.getName()).log(Level.WARNING, "No Image in Catalog");
        }
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
        jList1 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(org.geoimage.viewer.core.GeoImageViewer.class).getContext().getResourceMap(BatchAnalysisGUI.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setName("jList1"); // NOI18N
        jScrollPane1.setViewportView(jList1);

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jTextField1.setText(resourceMap.getString("jTextField1.text")); // NOI18N
        jTextField1.setName("jTextField1"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jTextField2.setText(resourceMap.getString("jTextField2.text")); // NOI18N
        jTextField2.setName("jTextField2"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jTextField3.setText(resourceMap.getString("jTextField3.text")); // NOI18N
        jTextField3.setName("jTextField3"); // NOI18N

        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(org.geoimage.viewer.core.GeoImageViewer.class).getContext().getActionMap(BatchAnalysisGUI.class, this);
        jButton2.setAction(actionMap.get("runAnalysis")); // NOI18N
        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N

        jProgressBar1.setName("jProgressBar1"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        jProgressBar2.setName("jProgressBar2"); // NOI18N

        jCheckBox1.setText(resourceMap.getString("jCheckBox1.text")); // NOI18N
        jCheckBox1.setName("jCheckBox1"); // NOI18N

        jButton3.setAction(actionMap.get("createKML")); // NOI18N
        jButton3.setText(resourceMap.getString("jButton3.text")); // NOI18N
        jButton3.setName("jButton3"); // NOI18N

        jMenuBar1.setName("jMenuBar1"); // NOI18N

        jMenu1.setText(resourceMap.getString("jMenu1.text")); // NOI18N
        jMenu1.setName("jMenu1"); // NOI18N

        jMenuItem2.setAction(actionMap.get("OpenH2Catalog")); // NOI18N
        jMenuItem2.setName("jMenuItem2"); // NOI18N
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAction(actionMap.get("openDirectory")); // NOI18N
        jMenuItem3.setName("jMenuItem3"); // NOI18N
        jMenu1.add(jMenuItem3);

        jMenuItem1.setAction(actionMap.get("quit")); // NOI18N
        jMenuItem1.setName("jMenuItem1"); // NOI18N
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(44, 44, 44)
                        .addComponent(jButton1))
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(10, 10, 10)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    final JFileChooser fc = new JFileChooser(jTextField3.getText());
    fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                jTextField3.setText(fc.getSelectedFile().getAbsolutePath());
            }
        });
    }
}//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new BatchAnalysisGUI().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(BatchAnalysisGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    @Action
    public Task runAnalysis() {
        return new RunAnalysisTask(org.jdesktop.application.Application.getInstance(org.geoimage.viewer.core.GeoImageViewer.class));
    }

    private void tryCatalog() throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:h2:~/.sumo/SUMO_DB;AUTO_SERVER=TRUE", "sa", "");
        Statement stat = conn.createStatement();
        List<File> readFiles = new ArrayList<File>();

        String sql = "SELECT * FROM CATALOGUE";
        ResultSet res = stat.executeQuery(sql);
        Geometry imageGeom = null;
        WKTReader wktr = new WKTReader();
        while (res.next()) {
            imageGeom = wktr.read(res.getString("GEOM"));
            String fileName = res.getString("IMAGENAME");
            File f = new File(fileName);
            readFiles.add(f);
        }
        jList1.removeAll();
        jList1.setListData(readFiles.toArray());
    }

    private class RunAnalysisTask extends org.jdesktop.application.Task<Object, Void> {

        private double thresh = 1.5;
        private double buffer = 30;
        private String output = "E:/NURCAnalysis/";
        private List<File> selectedFiles = new ArrayList<File>();
        private boolean createThumbs = false;

        RunAnalysisTask(org.jdesktop.application.Application app) {
            super(app);
            try {
                thresh = Double.parseDouble(jTextField1.getText());
            } catch (Exception e) {
            }
            try {
                buffer = Double.parseDouble(jTextField2.getText());
            } catch (Exception e) {
            }
            output = jTextField3.getText();
            for (Object o : jList1.getSelectedValues()) {
                selectedFiles.add((File) o);
            }
            createThumbs = jCheckBox1.isSelected();
            jList1.setSelectedIndices(new int[0]);
            jProgressBar2.setMaximum(selectedFiles.size() - 1);
            jProgressBar2.setValue(0);

        }

        @Override
        protected Object doInBackground() {
            for (final File f : selectedFiles) {
                SwingUtilities.invokeLater(new Runnable() {

                    public void run() {
                        jLabel4.setName(f.getAbsolutePath());
                        //jProgressBar1.setString(f.getAbsolutePath());
                        jProgressBar2.setValue(selectedFiles.indexOf(f) + 1);

                        jList1.setSelectedValue(f, true);
                    }
                });
                try {
                    runAnalysis(f);
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "the Analysis of " + f.getAbsolutePath() + " encountered an error. Doing next Image...", "Error in the analysis", JOptionPane.ERROR_MESSAGE);
                }
            }
            return null;  // return your result
        }

        @Override
        protected void succeeded(Object result) {
            JOptionPane.showMessageDialog(null, "Analysis done!", "Message", JOptionPane.INFORMATION_MESSAGE);
        }

        class progress implements IProgress {

            private boolean done = false;
            private int max;
            private int current;
            private String mess;

            public boolean isIndeterminate() {
                return false;
            }

            public boolean isDone() {
                return done;
            }

            public int getMaximum() {
                return max;
            }

            public int getCurrent() {
                return current;
            }

            public String getMessage() {
                return mess;
            }

            public void setCurrent(int i) {
                current = i;
                SwingUtilities.invokeLater(new Runnable() {

                    public void run() {
                        jProgressBar1.setValue(current);
                    }
                });
            }

            public void setMaximum(int size) {
                max = size;
                SwingUtilities.invokeLater(new Runnable() {

                    public void run() {
                        jProgressBar1.setMaximum(max - 1);
                    }
                });
            }

            public void setMessage(String string) {
                mess = string;
                SwingUtilities.invokeLater(new Runnable() {

                    public void run() {
                        jProgressBar1.setString(mess);
                    }
                });
            }

            public void setIndeterminate(final boolean value) {
                SwingUtilities.invokeLater(new Runnable() {

                    public void run() {
                        jProgressBar1.setIndeterminate(value);
                    }
                });
            }

            public void setDone(boolean value) {
                done = value;
            }
        }

        private void runAnalysis(File f) {
            if (new File(output + "/" + f.getParentFile().getName()).exists()) {
                return;
            }
            GeoImageReader gir = GeoImageReaderFactory.createReaderForName(f.getAbsolutePath()).get(0);
            if (!(gir instanceof SarImageReader)) {
                return;
            }
            URL url;
            //System.out.println(url);
            Map config = new HashMap();
            url = this.getClass().getResource("/org/geoimage/viewer/core/resources/shapefile/Global GSHHS Land Mask.shp");
            config.put("url", url);
            AbstractVectorIO shpio = VectorIOFactory.createVectorIO(VectorIOFactory.SIMPLE_SHAPEFILE, config);
            GeometricLayer mask = shpio.read(gir);

            IMask[] masks = new IMask[1];
            if (mask != null) {
                masks[0]=FactoryLayer.createBufferedLayer("mask",  mask.getGeometryType(), buffer,gir,mask);
            }
            for (int i = 0; i < gir.getNBand(); i++) {
                gir.setBand(i);
                org.geoimage.analysis.VDSAnalysis vds = new org.geoimage.analysis.VDSAnalysis((SarImageReader) gir, masks, ENL.getFromGeoImageReader((SarImageReader) gir), (float) thresh, (float) thresh, (float) thresh, (float) thresh, new progress());
                vds.run(new KDistributionEstimation(ENL.getFromGeoImageReader((SarImageReader)gir)));
                DetectedPixels pixels = vds.getPixels();
                pixels.agglomerate();
                pixels.computeBoatsAttributes();
                GeometricLayer gl = VDSAnalysisConsoleAction.createGeometricLayer(gir, pixels);
                gl.setName("VDSAnalysis_" + gir.getBandName(i).replace("/", ""));
                //Map config2 = new HashMap();
                new File(output + "/" + f.getParentFile().getName()).mkdirs();
                //config2.put(GenericCSVIO.CONFIG_FILE, output + "/" + f.getParentFile().getName() + "/" + gl.getName() + ".csv");
                //VectorIO csv = VectorIO.createVectorIO(VectorIO.GENERIC_CSV, config2, gir);
                // csv.save(gl, "EPSG:4326");
                config.put(KmlIO.CONFIG_FILE, output + "/" + f.getParentFile().getName() + "/" + gl.getName() + ".sumo.kmz");
                AbstractVectorIO kmzio = VectorIOFactory.createVectorIO(VectorIOFactory.KML, config);
                kmzio.save(gl, "EPSG:4326",gir);
                if (createThumbs && gl.getGeometries().size() < 200) {
                    ThumbnailsManager tm = new ThumbnailsManager(output + "/" + f.getParentFile().getName() + "/band" + i + "/");
                    tm.createThumbnailsDir(gl, "id", gir, new progress());
                } else {
                    Map config2 = new HashMap();
                    config2.put(SumoXmlIOOld.CONFIG_FILE, output + "/" + f.getParentFile().getName() + "/" + gl.getName() + ".sumo.xml");
                    AbstractVectorIO csv = VectorIOFactory.createVectorIO(VectorIOFactory.SUMO_OLD, config2);
                    csv.save(gl, "EPSG:4326",gir);
                }
            }
            gir.dispose();

        }
    }

    private void createMasterKML(String output) {
        List<File> files = new ArrayList<File>();
        for (File f : new File(output).listFiles()) {
            if (f.isDirectory()) {
                for (File kmz : f.listFiles()) {
                    if (kmz.getName().endsWith(".kmz")) {
                        files.add(kmz);
                    }
                }
            }
        }

        Kml kml = new Kml();
        Document doc = new Document();
        kml.addDocument(doc);
        //create the main folder
        Folder rootFolder = new Folder();

        rootFolder.setName("Analysed Images");
        doc.addFolder(rootFolder);
        Folder image = new Folder();
        image.setName("");
        for (File f : files) {
            image = null;
            for (Folder folder : rootFolder.getFolders()) {
                if (f.getParentFile().getName().equals(folder.getName())) {
                    image = folder;
                }
            }
            if (image == null) {
                image = new Folder();
                image.setName(f.getParentFile().getName());
                //TimeStamp ts = new TimeStamp();
                //ts.setWhen(createTimeStamp(f.getParentFile().getName()));
                //image.addTimeStamp(ts);
                rootFolder.addFolder(image);
            }
            Folder band = new Folder();
            band.setName("band " + image.getFolders().length);
            NetworkLink nl = new NetworkLink();
            Link l = new Link();
            l.setHref(f.getAbsolutePath());
            nl.addLink(l);
            band.addNetworkLink(nl);
            image.addFolder(band);

        }

        FileWriter fis;
        try {
            fis = new FileWriter(output + "/master.kml");
            fis.write(kml.toKML());
            fis.flush();
            fis.close();
        } catch (Exception ex) {
            Logger.getLogger(BatchAnalysisGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private String createTimeStamp(String nurcimagename) {
        String out = "";
        System.out.println(nurcimagename);
        String[] temp = nurcimagename.split("_");
        String date = temp[5];
        String time = temp[6];
        date = date.substring(0, 4) + "-" + date.substring(4, 6) + "-" + date.substring(6, 8);
        time = time.substring(0, 2) + ":" + time.substring(2, 4) + ":" + time.substring(4, 6);
        out = date + "T" + time + "Z";
        return out;

    }

    @Action
    public Task createKML() {
        return new CreateKMLTask(org.jdesktop.application.Application.getInstance(org.geoimage.viewer.core.GeoImageViewer.class));

    }

    private class CreateKMLTask extends org.jdesktop.application.Task<Object, Void> {

        private String output;

        CreateKMLTask(org.jdesktop.application.Application app) {
            super(app);
            output = jTextField3.getText();
        }

        @Override
        protected Object doInBackground() {
            createMasterKML(output);
            return null;  // return your result
        }

        @Override
        protected void succeeded(Object result) {
            if (JOptionPane.showConfirmDialog(null, "Do you want to open the kml master file?") == JOptionPane.YES_OPTION) {
                try {
                    Desktop.getDesktop().open(new File(output + "/master.kml"));
                } catch (IOException ex) {
                    Logger.getLogger(BatchAnalysisGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Action
    public void OpenH2Catalog() throws Exception {
        final JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if (fc.showOpenDialog(null) != JFileChooser.APPROVE_OPTION) {
            return;
        }
        Connection conn = DriverManager.getConnection("jdbc:h2:" + fc.getSelectedFile().getAbsolutePath().replace(".db", "")+";AUTO_SERVER=TRUE", "sa", "");
        Statement stat = conn.createStatement();
        final List<File> readFiles = new ArrayList<File>();

        String sql = "SELECT * FROM CATALOGUE";
        ResultSet res = stat.executeQuery(sql);
        Geometry imageGeom = null;
        WKTReader wktr = new WKTReader();
        while (res.next()) {
            imageGeom = wktr.read(res.getString("GEOM"));
            String fileName = res.getString("IMAGENAME");
            File f = new File(fileName);
            readFiles.add(f);
        }
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                jList1.removeAll();
                jList1.setListData(readFiles.toArray());
            }
        });
    }

    protected List<File> getFiles(File root, long big, long low) {
        Vector<File> out = new Vector<File>();
        if (!root.isDirectory()) {
            out.add(root);
            return out;
        } else {
            for (File f : root.listFiles()) {
                if (f.isDirectory()) {
                    out.addAll(getFiles(f, big, low));
                } else {
                    if (f.length() < big && f.length() > low) {
                        out.add(f);
                    }
                }
            }
        }
        return out;
    }

    @Action
    public void openDirectory() {

        final JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (fc.showOpenDialog(null) != JFileChooser.APPROVE_OPTION) {
            return;
        }
        List<File> files = getFiles(fc.getSelectedFile(), 5000000000l, 50000000l);
        final List<File> readFiles = new ArrayList<File>();
        Connection conn = null;
        Statement stat = null;
        try {
            conn = DriverManager.getConnection("jdbc:h2:~/.sumo/SUMO_DB;AUTO_SERVER=TRUE", "sa", "");
            stat = conn.createStatement();
            stat.execute("DROP TABLE IF EXISTS CATALOGUE");
            String sql = "CREATE TABLE CATALOGUE(IMAGENAME VARCHAR PRIMARY KEY, REPOSITORY VARCHAR, IMAGETYPE VARCHAR,GEOM VARCHAR, DATE_CREATION TIMESTAMP)";
            stat.execute(sql);
        } catch (Exception ex) {
            Logger.getLogger(BatchAnalysisGUI.class.getName()).log(Level.WARNING, null, ex);
            return;
        }

        for (File f : files) {
            GeoImageReader gir = GeoImageReaderFactory.createReaderForName(f.getAbsolutePath()).get(0);
            if (gir != null) {
                String sql = "SELECT * FROM CATALOGUE WHERE IMAGENAME = '" + f.getAbsolutePath() + "'";
                try {
                    ResultSet res = stat.executeQuery(sql);
                    if (res.next()) { //file is in the database
                        long time = res.getTimestamp("DATE_CREATION").getTime();
                        long time2 = f.lastModified();
                        String lastMod = new Timestamp(f.lastModified()).toString();
                        if (time == time2) {//file not modified since last visit
                            readFiles.add(f);
                        } else {
                            sql = "UPDATE CATALOGUE SET DATE_CREATION = '" + lastMod + "' WHERE IMAGENAME='" + f.getAbsolutePath() + "'";
                            stat.executeUpdate(sql);
                            readFiles.add(f);
                        }
                        continue;
                    } else {
                        String name = f.getAbsolutePath();
                        //System.out.println(path + "\\" + name);
                        Geometry geom = GeometryExtractor.getFrame(gir);
                        WKTWriter wktw = new WKTWriter();
                        String wkt = wktw.write(geom);

                        //update the catalogue file list
                        String lastMod = new Timestamp(f.lastModified()).toString();
                        //sql = "SELECT * FROM CATALOGUE WHERE IMAGENAME = '" + name + "'";
                        //res = stat.executeQuery(sql);
                        //if (!res.first()) { //file not in the database
                        sql = "INSERT INTO CATALOGUE VALUES('" + name + "','NO REPOSITORY','" + gir.getFormat() + "','" + wkt + "','" + lastMod + "')";
                        stat.executeUpdate(sql);
                        gir.dispose();
                        readFiles.add(f);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                gir.dispose();
            }
        }
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(BatchAnalysisGUI.class.getName()).log(Level.WARNING, null, ex);
        }

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                jList1.removeAll();
                jList1.setListData(readFiles.toArray());
            }
        });


    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
