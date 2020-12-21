package com.cy.platform.plugin.ui.panel;

import javax.swing.*;
import java.awt.*;

/**
 * 主模板
 *
 * @author develop
 */
public class MainPanel extends JPanel {
    CardLayout cardLayout = new CardLayout();

    public MainPanel() {
        this.setLayout(cardLayout);
        JPanel jPanel1 = new JPanel();
        jPanel1.add(new JLabel("代码生成"));
        JPanel jPanel2 = new JPanel();
        jPanel2.add(new JLabel("数据管理"));
        add(jPanel1, "p1");
        add(jPanel2, "p2");
        cardLayout.show(this, "p2");
        this.validate();
    }

    public void changePanel(String panel) {
        cardLayout.show(this, panel);
    }
}
