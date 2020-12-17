package com.cy.platform.ui.view;

import com.cy.platform.ui.view.menu.EditMenu;
import com.cy.platform.ui.view.menu.FileMenu;
import com.cy.platform.ui.view.panel.BootPanel;
import com.cy.platform.ui.view.panel.MainPanel;
import com.cy.platform.ui.view.panel.MenuPanel;

import javax.swing.*;
import java.awt.*;

/**
 * 主界面
 *
 * @author develop
 */
public class MainFrame extends JFrame {
    private MainPanel mainPanel;

    public MainFrame() {
        //定义frame
        super("工具控制台");
        this.setLayout(new BorderLayout());
        this.setBounds(300, 200, 600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //设置MenuBar
        JMenuBar jMenuBar = new JMenuBar();
        jMenuBar.add(new FileMenu());
        jMenuBar.add(new EditMenu());
        jMenuBar.setVisible(true);
        this.setJMenuBar(jMenuBar);

        //设置面板
        this.add(new MenuPanel(this), BorderLayout.WEST);
        mainPanel = new MainPanel();
        this.add(mainPanel, BorderLayout.CENTER);
        this.add(new BootPanel(), BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public void changePanel(String panel) {
        mainPanel.changePanel(panel);
    }
}
