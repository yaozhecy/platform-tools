package com.cy.platform.plugins.view;

import javax.swing.*;
import java.awt.*;

public class MainForm {
    private JButton Button1;
    private JButton Button2;
    private JPanel zheg;

    public MainForm() {
        //父窗体
        JFrame jFrame = new JFrame("青青河边草");
        // 初始化JFrame窗口
        jFrame.setLocation(800, 300);
        jFrame.setSize(600, 500);
        jFrame.setBackground(Color.darkGray);
        jFrame.setResizable(true);
        jFrame.setVisible(true);
    }
}
