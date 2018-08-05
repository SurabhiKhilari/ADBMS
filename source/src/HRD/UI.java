package HRD;

import com.datastax.driver.core.*;
import java.util.List;
import org.jfree.chart.*;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;
import java.awt.*;
import java.awt.event.*;
import org.jfree.chart.plot.*;
import org.jfree.data.xy.*;

public class UI extends javax.swing.JFrame {
    public static JFreeChart chart;
    public static DefaultPieDataset pieDataset;
    
    public UI() {
        initComponents();
        txtOutput.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtBmi = new javax.swing.JTextField();
        comChildren = new javax.swing.JComboBox<>();
        comRegion = new javax.swing.JComboBox<>();
        comSex = new javax.swing.JComboBox<>();
        comSmoker = new javax.swing.JComboBox<>();
        btnAnalyse = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblOutput = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtOutput = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Clustering According To:");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Health Analysis Pie Chart");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Age");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("BMI");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Children");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Region");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Sex");

        txtAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
       
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgeKeyPressed(evt);
            }
        });

        txtBmi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
       
        txtBmi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBmiKeyPressed(evt);
            }
        });

        comChildren.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comChildren.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));

        comRegion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comRegion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "northwest", "northeast", "southwest", "southeast" }));

        comSex.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female" }));

        comSmoker.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comSmoker.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "no", "yes" }));
       

        btnAnalyse.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAnalyse.setText("Analyse");
        btnAnalyse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalyseActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Belongs to cluster: ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Smoker");

        lblOutput.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("(max: 60)");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("(max: 120)");

        txtOutput.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtOutput.setForeground(new java.awt.Color(255, 0, 0));
        txtOutput.setText("Option Invalid");

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("Health Analysis Scatter Chart");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtAge)
                                .addComponent(txtBmi)
                                .addComponent(comChildren, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comRegion, 0, 148, Short.MAX_VALUE)
                                .addComponent(comSex, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(comSmoker, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAnalyse, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(comChildren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(comRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(comSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comSmoker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOutput, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAnalyse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(74, 74, 74))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel8, lblOutput});

        pack();
    }// </editor-fold>                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int[][] data ;
        int rowlen,lenght=7;
        data = new int[1440][7];
        int[] count={0,0,0};
        rowlen=1339;

        data=fetch(lenght,rowlen);

        int[] clusters = new int[rowlen];
        System.out.println("\n\n DataSet Size:= "+rowlen+"\n\n");
        clusters=KMeans.kmeans(data,lenght,rowlen,3);
        for(int i=0;i<rowlen;i++){
            System.out.println("Row->> "+i+"  CLuster->>>>>>"+clusters[i]);
            count[clusters[i]]++;
        }
        System.out.println("Cluster 1\tCluster 2\tCluster 3");
        System.out.println(count[0]+"\t\t"+count[1]+"\t\t"+count[2]);

        plotPie("", count);
    }                                        

    private void btnAnalyseActionPerformed(java.awt.event.ActionEvent evt) {                                           
       if(!validation()){
       return;
       }
        int[][] data ;
        data = new int[1440][7];
        int rowlen,lenght=7;
        int[] count={0,0,0};
        int age1=Integer.parseInt(txtAge.getText());
       float bmi1=Float.parseFloat(txtBmi.getText());
       int children1=Integer.parseInt(comChildren.getSelectedItem().toString());
       String region_name=comRegion.getSelectedItem().toString();
       String sex_name=comSex.getSelectedItem().toString();
       String smoker_type=comSmoker.getSelectedItem().toString();
       int sex1=0,region1=0,smoker1=0;
       if(sex_name.equals("male"))
           sex1=0;
       else if(sex_name.equals("female"))
           sex1=1;
       
       if(smoker_type.equals("yes"))
           smoker1=5;
       else
           smoker1=0;
       
       switch (region_name) {
            case "northeast":
                region1= 00;
                break;
            case "northwest":
                region1= 01;
                break;
            case "southwest":
                region1= 02;
                break;
            case "southeast":
                region1= 03;
                break;
            default:
                break;
        }
       rowlen=1340;
       data=fetch(lenght,rowlen);
       
       data[1339][0]=1339;
       data[1339][1]=age1*100;
       data[1339][2]=(int)bmi1*100;
       data[1339][3]=children1*500;
       data[1339][4]=region1*1000;
       data[1339][5]=sex1*1000;
       data[1339][6]=smoker1*1000;
       
       int[] clusters = new int[rowlen];
       int predictionClass;
       System.out.println("\n\n DataSet Size:= "+rowlen+"\n\n");
       clusters=KMeans.kmeans(data,lenght,rowlen,3);
       predictionClass=KNN.knn(data[1339], data, clusters, rowlen-1, lenght);
       clusters[rowlen-1]=predictionClass;
       for(int i=0;i<rowlen;i++){
           System.out.println("Row->> "+i+"  CLuster->>>>>>"+clusters[i]);
           count[clusters[i]]++;
       }
        System.out.println("Cluster 1\tCluster 2\tCluster 3");
        System.out.println(count[0]+"\t\t"+count[1]+"\t\t"+count[2]);
        if(clusters[1339]==0)
            lblOutput.setText("High Risk");
        else if(clusters[1339]==1)
            lblOutput.setText("Medium Risk");
        else if(clusters[1339]==2)
            lblOutput.setText("Low Risk");
        
      plotPie("Prediction on Test Data",count);
        
    }                                          
    
    private int[][] fetch(int lenght,int rowlen) {
        int[][] data ;
        data = new int[rowlen][lenght];
        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
        Session s = cluster.connect("Insurance");
        //s.execute("CREATE KEYSPACE Insurance WITH replication = {'class':'SimpleStrategy','replication_factor':1}; ");
        //s.execute("USE Insurance;");
        //s.execute("CREATE TABLE medical (uid int, age int, sex text, bmi float, children int, smoker text, region text, charges float, PRIMARY KEY((sex, smoker),uid));");
        ResultSet result = s.execute("SELECT * FROM medical;");
        List<Row> dataSet = result.all();
        //System.out.println(dataSet);
       
       for (int i = 0; i <= 1338; ++i) {
            ResultSet results = s.execute("SELECT * FROM medical where uid = " + i +" allow filtering;");
            dataSet=results.all();
            for(int j=0;j<lenght;j++)
                data[i][j]=00;
            for (Row row : dataSet) {
                int uid = row.getInt("uid");
                int age = row.getInt("age");
                float bmi = row.getFloat("bmi");
                float charges = row.getFloat("charges");
                int children = row.getInt("children");
                String region = row.getString("region");
                String sex = row.getString("sex");
                String smoker = row.getString("smoker");
               
                bmi*=100;
                data[i][0]=uid;
                data[i][1]=age*100;
                data[i][2]=(int)bmi;
                data[i][3]=children*500;
                switch (region) {
                    case "northeast":
                        data[i][4]= 00;
                        break;
                    case "northwest":
                        data[i][4]= 01;
                        break;
                    case "southwest":
                        data[i][4]= 02;
                        break;
                    case "southeast":
                        data[i][4]= 03;
                        break;
                    default:
                        break;
                }
                 
                 if(sex.equals("male"))
                     data[i][5]=00;
                 else if(sex.equals("female"))
                        data[i][5]=01;
                 
                if(smoker.equals("no"))
                     data[i][6]=00;
                 else if(smoker.equals("yes"))
                        data[i][6]=05;  
                
                data[i][4]*=1000;
                data[i][5]*=1000;
                data[i][6]*=1000;
            }
        }
       return data;
    }
    
    private boolean validation(){
        txtOutput.setVisible(false);
        if(txtAge.getText().length()==0 || txtBmi.getText().length()==0){
            txtOutput.setText("Please Enter Values!");
            txtOutput.setVisible(true);
            return false;
        }
        if(Integer.parseInt(txtAge.getText())>120 || Integer.parseInt(txtAge.getText())<0){
            txtOutput.setText("Age - out of Bound");
            txtOutput.setVisible(true);
            return false;
            }else if(Integer.parseInt(txtAge.getText())<15 && comSmoker.getSelectedItem().toString()=="yes"){ 
                txtOutput.setText("Options Invalid");
                txtOutput.setVisible(true);
                return false;
            }
          if(Float.parseFloat(txtBmi.getText())>60 || Float.parseFloat(txtBmi.getText())<0){
            txtOutput.setText("BMI - out of Bound");
            txtOutput.setVisible(true);
            return false;
            }
          if(Integer.parseInt(txtAge.getText())<18 && Integer.parseInt(comChildren.getSelectedItem().toString())>0) {
              txtOutput.setText("Options Invalid");
              txtOutput.setVisible(true);
              return false;
          }
          return true;
    }
    
     private void plotPie(String title,int[] count) {
          pieDataset = new DefaultPieDataset();
        
        pieDataset.setValue("High Risk" + " count: "+count[0], count[0]);
        pieDataset.setValue("Low Risk"+ " count: "+count[2], count[2]);
        pieDataset.setValue("Medium Risk"+ " count: "+count[1], count[1]);
        
        System.out.println(pieDataset);
        chart = ChartFactory.createPieChart("Health Risks Distribution\nPieChart\n"+title, pieDataset, true, true, true);
        PiePlot P = (PiePlot) chart.getPlot();
        P.setForegroundAlpha(0.5f);
        P.setDirection(Rotation.CLOCKWISE);
        P.setStartAngle(90);
        P.setSectionPaint(0, java.awt.Color.RED);
        P.setSectionPaint(1, java.awt.Color.GREEN);
        P.setSectionPaint(2, java.awt.Color.ORANGE);
        ChartFrame frame = new ChartFrame(" Health Analyser ", chart);
        frame.setVisible(true);
        frame.setFocusable(true);
        frame.setSize(500, 500);
        centreWindow(frame);
    }
    
    private void txtAgeKeyPressed(java.awt.event.KeyEvent evt) {                                  
        
        txtAge.addKeyListener(new KeyAdapter() {
                public void keyTyped(KeyEvent evt) {
                    char keyChar = evt.getKeyChar();
                    if(!(Character.isDigit(keyChar))){
                        evt.consume();
                    }
                }
        });
    }                                 

    private void txtBmiKeyPressed(java.awt.event.KeyEvent evt) {                                  

        txtBmi.addKeyListener(new KeyAdapter() {
                public void keyTyped(KeyEvent evt) {
                    char keyChar = evt.getKeyChar();
                    if(!(Character.isDigit(keyChar) || keyChar=='.')){
                        evt.consume();
                    }
                }
        });
    }                                 

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int[][] data ;
        int rowlen,lenght=7;
        data = new int[1440][7];
        int[] count={0,0,0};
        rowlen=1339;
       data=fetch(lenght,rowlen);
       
       
       int[] clusters = new int[rowlen];
       System.out.println("\n\n DataSet Size:= "+rowlen+"\n\n");
       clusters=KMeans.kmeans(data,lenght,rowlen,3);
       for(int i=0;i<rowlen;i++){
           System.out.println("Row->> "+i+"  CLuster->>>>>>"+clusters[i]);
           count[clusters[i]]++;
       }
        System.out.println("Cluster 1\tCluster 2\tCluster 3");
        System.out.println(count[0]+"\t\t"+count[1]+"\t\t"+count[2]);       
       
       XYDataset dataset = createDataset(data,clusters,rowlen,lenght,3);
       
       JFreeChart chart = ChartFactory.createScatterPlot("Health Risks Distribution\nScatter Chart\nAge Vs BMI","BMI", "Age", dataset);
    
       XYPlot P = (XYPlot) chart.getPlot();
        P.setForegroundAlpha(0.5f);
        ChartFrame frame = new ChartFrame(" Health Analyser ", chart);
        frame.setVisible(true);
        frame.setFocusable(true);
        frame.setSize(450*2, 450*2);
        centreWindow(frame);   
    }                                        

    private XYDataset createDataset(int[][] data,int[] clusters,int rowlen,int lenght,int cluster_no) {
       XYSeriesCollection dataset = new XYSeriesCollection();
       int i,j,k;
        XYSeries series1= new XYSeries("High Risk");
        XYSeries series2= new XYSeries("Medium Risk");
        XYSeries series3= new XYSeries("Low Risk");
                
        for(i=0;i<rowlen;i++) {
            XYDataItem xydi = new XYDataItem((double)data[i][2]/100, (double)data[i][1]/100);
            switch(clusters[data[i][0]]) {
                case 0:                    
                    series1.add(xydi);
                    break;
                case 1:                    
                    series2.add(xydi);
                    break;
                case 2:
                    series3.add(xydi);
                    break;
            }          
        }
        dataset.addSeries(series1);
        dataset.addSeries(series2);
        dataset.addSeries(series3);
        return dataset;
    }
    
    public static void main(String args[]) {
                try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                UI gui=new UI();
                gui.setVisible(true);
                centreWindow(gui);
            }
        });
    }
    
    public static void centreWindow(Window frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x,y);
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton btnAnalyse;
    private javax.swing.JComboBox<String> comChildren;
    private javax.swing.JComboBox<String> comRegion;
    private javax.swing.JComboBox<String> comSex;
    private javax.swing.JComboBox<String> comSmoker;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBmi;
    private javax.swing.JLabel txtOutput;
    // End of variables declaration                   
}
