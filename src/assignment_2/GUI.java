package assignment_2;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
    }

    public void timeStart() {
        startTime  = System.nanoTime();
    }
    
    public long timeStop() {
        endTime = System.nanoTime();
        return (endTime - startTime)/1000000;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        DijkstraButton = new javax.swing.JButton();
        DijkstraPriorityQueueButton = new javax.swing.JButton();
        DijkstraCustomPriorityQueueButton = new javax.swing.JButton();
        OutgoingEdgesButton = new javax.swing.JButton();
        EdgeExistButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        VertexExistsButton = new javax.swing.JButton();
        TimeLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        LoadButton = new javax.swing.JMenuItem();
        DijkstraMenuItem = new javax.swing.JMenu();
        DijkstraHelp = new javax.swing.JMenuItem();
        DijkstraPriorityQueueHelp = new javax.swing.JMenuItem();
        DijkstraCustomPriorityQueueHelp = new javax.swing.JMenuItem();
        PrintAllShortestPathsFromASourceHelp = new javax.swing.JMenuItem();
        OutgoingEdgesHelp = new javax.swing.JMenuItem();
        EdgeExistHelp = new javax.swing.JMenuItem();
        VertexExistHelp = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel1.setText("Please load a file into the graph.");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        DijkstraButton.setText("Dijkstra");
        DijkstraButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DijkstraButtonActionPerformed(evt);
            }
        });

        DijkstraPriorityQueueButton.setText("Dijkstra Priority Queue");
        DijkstraPriorityQueueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DijkstraPriorityQueueButtonActionPerformed(evt);
            }
        });

        DijkstraCustomPriorityQueueButton.setText("Dijkstra Custom Min Heap");
        DijkstraCustomPriorityQueueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DijkstraCustomPriorityQueueButtonActionPerformed(evt);
            }
        });

        OutgoingEdgesButton.setText("Outgoing Edges From A Vertex");
        OutgoingEdgesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutgoingEdgesButtonActionPerformed(evt);
            }
        });

        EdgeExistButton.setText("Does An Edge Exist?");
        EdgeExistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdgeExistButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Type your request here, then press the appropriate button. Refer to the help menu if help is required.");

        VertexExistsButton.setText("Does A Vertex Exist?");
        VertexExistsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VertexExistsButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        LoadButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        LoadButton.setText("Load File");
        LoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadButtonActionPerformed(evt);
            }
        });
        jMenu1.add(LoadButton);

        DijkstraMenuItem.setText("Help");

        DijkstraHelp.setText("Dijkstra");
        DijkstraHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DijkstraHelpActionPerformed(evt);
            }
        });
        DijkstraMenuItem.add(DijkstraHelp);

        DijkstraPriorityQueueHelp.setText("Dijkstra Priority Queue");
        DijkstraPriorityQueueHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DijkstraPriorityQueueHelpActionPerformed(evt);
            }
        });
        DijkstraMenuItem.add(DijkstraPriorityQueueHelp);

        DijkstraCustomPriorityQueueHelp.setText("Dijkstra Custom Min Heap");
        DijkstraCustomPriorityQueueHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DijkstraCustomPriorityQueueHelpActionPerformed(evt);
            }
        });
        DijkstraMenuItem.add(DijkstraCustomPriorityQueueHelp);

        PrintAllShortestPathsFromASourceHelp.setText("Print Shortest Paths From Source Vertex");
        PrintAllShortestPathsFromASourceHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintAllShortestPathsFromASourceHelpActionPerformed(evt);
            }
        });
        DijkstraMenuItem.add(PrintAllShortestPathsFromASourceHelp);

        OutgoingEdgesHelp.setText("Outgoing Edges Of A Vertex");
        OutgoingEdgesHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutgoingEdgesHelpActionPerformed(evt);
            }
        });
        DijkstraMenuItem.add(OutgoingEdgesHelp);

        EdgeExistHelp.setText("Does An Edge Exist?");
        EdgeExistHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdgeExistHelpActionPerformed(evt);
            }
        });
        DijkstraMenuItem.add(EdgeExistHelp);

        VertexExistHelp.setText("Does A Vertex Exist?");
        VertexExistHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VertexExistHelpActionPerformed(evt);
            }
        });
        DijkstraMenuItem.add(VertexExistHelp);

        jMenu1.add(DijkstraMenuItem);
        jMenu1.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DijkstraButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DijkstraPriorityQueueButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DijkstraCustomPriorityQueueButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OutgoingEdgesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(EdgeExistButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VertexExistsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TimeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DijkstraButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DijkstraPriorityQueueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DijkstraCustomPriorityQueueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OutgoingEdgesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EdgeExistButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VertexExistsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadButtonActionPerformed
        JFileChooser chooser = new JFileChooser("./");                                          // Set file chooser to root directory of project.
        FileNameExtensionFilter filter = new FileNameExtensionFilter("xml files (*.xml)", "xml", "graphml files (*graphml)", "graphml");
        chooser.setDialogTitle("Open Graph File");
        chooser.setFileFilter(filter);                                                          // Set selected file filter.

        int returned = chooser.showOpenDialog(this);                                            // Open file chooser window.
        
        if(returned == JFileChooser.APPROVE_OPTION && !fileLoaded) {                            // If a file is chosen.
            File file = chooser.getSelectedFile();                                              // Store the file.
            jLabel1.setText(" Reading in " + file.getName() + " to DirectedGraph...");
            g.readInFile(file.getName());                                                       // Read file into Graph.
            jLabel1.setText(" Reading in " + file.getName() + " complete!");
            fileLoaded = true;                                                                  // Set loaded flag.
            g.printGraph();                                                                     // Print graph in jTextArea1.   
        } else if (returned == JFileChooser.APPROVE_OPTION && fileLoaded) {                     // Display error window if user attempts to load multiple files.
            JOptionPane.showMessageDialog(frame, "A file is already loaded! Please restart the program to load another file.", "Warning", JOptionPane.WARNING_MESSAGE);
        }   
        
    }//GEN-LAST:event_LoadButtonActionPerformed

    private void DijkstraHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DijkstraHelpActionPerformed
        // Dijkstra menu action.
        JFrame frame = new JFrame();
        String message = "The 'Dijkstra' button can be used to execute the Dijkstra algorithm on the graph inorder to find the shortest \n"
                       + "path from a source node to all other nodes. To utilise this functionality, enter a source node name, i.e. a number, \n"
                       + "in the center text area, then press the 'Dijkstra' button. You may notice a speed difference between the 'Dijkstra' \n"
                       + "algorithm, the 'DijkstraPriorityQueue' and 'DijkstraCustomMinHeap' buttons with larger graphs. This is because \n"
                       + "different data structures are used within the algorithm.";
        JOptionPane.showMessageDialog(frame.getComponent(0), message);      
    }//GEN-LAST:event_DijkstraHelpActionPerformed

    private void OutgoingEdgesHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutgoingEdgesHelpActionPerformed
        // Outgoing Edges help button action.
        JFrame frame = new JFrame();
        String message = "To print the list of outgoing edges from a vertex, enter the name of the vertex, i.e. a number, in the center text \n"
                       + "area then press the 'Outgoing Edges From A Vertex Button'. The list of outgoing edges will be printed in the lower \n"
                       + "text area.";
        JOptionPane.showMessageDialog(frame.getComponent(0), message);   
    }//GEN-LAST:event_OutgoingEdgesHelpActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void DijkstraButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DijkstraButtonActionPerformed
        // Dijkstra Button action.
        String start = jTextField1.getText();
        if(!fileLoaded) {
            JOptionPane.showMessageDialog(frame, "You must load a file into the graph first!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if(start.length() == 0) {
            JOptionPane.showMessageDialog(frame, "You must enter a start vertex in the middle text area!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (!g.hasVertex(jTextField1.getText())) {
            JOptionPane.showMessageDialog(frame, "That vertex does not exist! Please enter a valid vertex.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            timeStart();
            g.dijkstra(new Vertex(start));
            TimeLabel.setText("Run time: " + timeStop() + "ms");
            g.printDistances();
        }       
    }//GEN-LAST:event_DijkstraButtonActionPerformed

    private void DijkstraPriorityQueueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DijkstraPriorityQueueButtonActionPerformed
        // Dijkstra Priority Queue button action.
        String start = jTextField1.getText();
        
        if(!fileLoaded) {
            JOptionPane.showMessageDialog(frame, "You must load a file into the graph first!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if(start.length() == 0) {
            JOptionPane.showMessageDialog(frame, "You must enter a start vertex in the middle text area!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (!g.hasVertex(jTextField1.getText())) {
            JOptionPane.showMessageDialog(frame, "That vertex does not exist! Please enter a valid vertex.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            timeStart();
            g.dijkstraPriorityQueue(new Vertex(start));
            TimeLabel.setText("Run time: " + timeStop() + "ms");
            g.printDistances();
        }    
    }//GEN-LAST:event_DijkstraPriorityQueueButtonActionPerformed

    private void OutgoingEdgesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutgoingEdgesButtonActionPerformed
        // Outgoing Edges button action.
        String start = jTextField1.getText();
        
        if(!fileLoaded) {
            JOptionPane.showMessageDialog(frame, "You must load a file into the graph first!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if(start.length() == 0) {
            JOptionPane.showMessageDialog(frame, "You must enter a vertex to find the outgoing edges \nfor in the middle text area!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (!g.hasVertex(jTextField1.getText())) {
            JOptionPane.showMessageDialog(frame, "That vertex does not exist! Please enter a valid vertex.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            g.printOutgoingEdges(start);
        }  
    }//GEN-LAST:event_OutgoingEdgesButtonActionPerformed

    private void DijkstraPriorityQueueHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DijkstraPriorityQueueHelpActionPerformed
        // Dijkstra Priority Queue help button action.
        JFrame frame = new JFrame();
        String message = "The 'DijkstraProirotyQueue' button can be used to execute the Dijkstra algorithm, utilising a priority queue, on \n"
                       + "the graph inorder to find the shortest path from a source vertex to all other verticies. To utilise this functionality,  \n"
                       + "enter a source vertex name, i.e. a number, in the center text area, then press the 'DijkstraPriorityQueue' button. You \n"
                       + "may notice a speed difference between the 'Dijkstra' algorithm, the 'DijkstraPriorityQueue' and 'DijkstraCustomMinHeap' \n "
                       + "buttons with larger graphs. This is because different data structures are used within the algorithm.";
        JOptionPane.showMessageDialog(frame.getComponent(0), message);  
    }//GEN-LAST:event_DijkstraPriorityQueueHelpActionPerformed

    private void PrintAllShortestPathsFromASourceHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintAllShortestPathsFromASourceHelpActionPerformed
        // Print Shortest Paths From A Source Vertex help button action.
        JFrame frame = new JFrame();
        String message = "To print the shortest paths from a source vertex to all other verticies, just enter the source vertex, i.e. a number \n"
                       + "in the center text area then use either the 'Dijkstra', 'DijkstraPriorityQueue' or the 'DijkstraCustomPriorityQueue' \n"
                       + "buttons to execute the Dijkstra algorithm on the graph. This will automatically print the shortest paths from a vertex \n"
                       + "to all other verticies in the graph, in the lower text area.";
        JOptionPane.showMessageDialog(frame.getComponent(0), message);  
    }//GEN-LAST:event_PrintAllShortestPathsFromASourceHelpActionPerformed

    private void DijkstraCustomPriorityQueueHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DijkstraCustomPriorityQueueHelpActionPerformed
        // Dijkstra Custom MinHeap help button action.
        JFrame frame = new JFrame();
        String message = "The 'DijkstraCustomMinHeap' button can be used to execute the Dijkstra algorithm, utilising a custom Min Heap, on \n"
                       + "the graph inorder to find the shortest path from a source vertex to all other verticies. To utilise this functionality,  \n"
                       + "enter a source vertex name, i.e. a number, in the center text area, then press the 'DijkstraCustomMinHeap' button. You \n"
                       + "may notice a speed difference between the 'Dijkstra' algorithm, the 'DijkstraPriorityQueue' and 'DijkstraCustomMinHeap' \n "
                       + "buttons with larger graphs. This is because different data structures are used within the algorithm.";
        JOptionPane.showMessageDialog(frame.getComponent(0), message); 
    }//GEN-LAST:event_DijkstraCustomPriorityQueueHelpActionPerformed

    private void VertexExistHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VertexExistHelpActionPerformed
        // Vertex exists help button.
        JFrame frame = new JFrame();
        String message = "In order to determine if a vertex exists in the graph, enter a vertex name, i.e. a number, into the center text area \n"
                       + "then press the 'Does A Vertex Exist Button'. The answer will be displayed in the lower text area.";
        JOptionPane.showMessageDialog(frame.getComponent(0), message); 
    }//GEN-LAST:event_VertexExistHelpActionPerformed

    private void EdgeExistHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdgeExistHelpActionPerformed
        // Does An Edge Exist help button action.
        JFrame frame = new JFrame();
        String message = "In order to determine if an edge exists, enter the source and target vertex names, i.e. 2 numbers seperated by a space, \n"
                       + "in the center text area, then press the 'Does An Edge Exist button. The answer will be displayed in the lower text area.";
        JOptionPane.showMessageDialog(frame.getComponent(0), message); 
    }//GEN-LAST:event_EdgeExistHelpActionPerformed

    private void EdgeExistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdgeExistButtonActionPerformed
       // Edge exists button action.
        String[] start = jTextField1.getText().split(" ");
        
        if(!fileLoaded) {
            JOptionPane.showMessageDialog(frame, "You must load a file into the graph first!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if(start.length == 0) {
            JOptionPane.showMessageDialog(frame, "You must enter a source vertex and a target vertex inorder\nto determine if an edge exists!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            if(g.hasEdge(start[0], start[1])) { jTextArea2.append("The edge exists.\n"); }
            else { jTextArea2.append("The edge does not exist.\n"); }
        }       
    }//GEN-LAST:event_EdgeExistButtonActionPerformed

    private void VertexExistsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VertexExistsButtonActionPerformed
        // Does vertex exist button action.
        String start = jTextField1.getText();
        
        if(!fileLoaded) {
            JOptionPane.showMessageDialog(frame, "You must load a file into the graph first!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if(start.length() == 0) {
            JOptionPane.showMessageDialog(frame, "You must enter a start vertex in the middle text area!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            if(g.hasVertex(start)) { jTextArea2.append("The vertex " + start + " does exist.\n"); }
            else { jTextArea2.append("The vertex " + start + " does not exist.\n"); }
        }      
    }//GEN-LAST:event_VertexExistsButtonActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void DijkstraCustomPriorityQueueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DijkstraCustomPriorityQueueButtonActionPerformed
        // DijkstraCustomMinHeap button action.
        String start = jTextField1.getText();
        
        if(!fileLoaded) {
            JOptionPane.showMessageDialog(frame, "You must load a file into the graph first!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if(start.length() == 0) {
            JOptionPane.showMessageDialog(frame, "You must enter a start vertex in the middle text area!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (!g.hasVertex(jTextField1.getText())) {
            JOptionPane.showMessageDialog(frame, "That vertex does not exist! Please enter a valid vertex.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            timeStart();
            g.customDijkstraMinHeap(new Vertex(start));
            TimeLabel.setText("Run time: " + timeStop() + "ms");
            g.printDistances();
        }
    }//GEN-LAST:event_DijkstraCustomPriorityQueueButtonActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DijkstraButton;
    private javax.swing.JButton DijkstraCustomPriorityQueueButton;
    private javax.swing.JMenuItem DijkstraCustomPriorityQueueHelp;
    private javax.swing.JMenuItem DijkstraHelp;
    private javax.swing.JMenu DijkstraMenuItem;
    private javax.swing.JButton DijkstraPriorityQueueButton;
    private javax.swing.JMenuItem DijkstraPriorityQueueHelp;
    private javax.swing.JButton EdgeExistButton;
    private javax.swing.JMenuItem EdgeExistHelp;
    private javax.swing.JMenuItem LoadButton;
    private javax.swing.JButton OutgoingEdgesButton;
    private javax.swing.JMenuItem OutgoingEdgesHelp;
    private javax.swing.JMenuItem PrintAllShortestPathsFromASourceHelp;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JMenuItem VertexExistHelp;
    private javax.swing.JButton VertexExistsButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    public static javax.swing.JTextArea jTextArea1;
    public static javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    private boolean fileLoaded = false;
    private Graph g = new AdjacencyListDirectedGraph();
    private final JFrame frame = new JFrame();
    private long startTime, endTime;
    
}
