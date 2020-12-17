package com.cy.platform.ui.view.panel;

import com.cy.platform.ui.view.MainFrame;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * 菜单面板
 *
 * @author develop
 */
public class MenuPanel extends JPanel {
    private MainFrame mainFrame;

    public MenuPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        this.setPreferredSize(new Dimension(140, 200));
        this.setBorder(BorderFactory.createEtchedBorder());
        this.setBackground(Color.WHITE);
        this.add(createComponent());
    }

    private JTree createComponent() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("功能列表");
        DefaultMutableTreeNode codeNode = new DefaultMutableTreeNode("代码生成");
        root.add(codeNode);

        root.add(new DefaultMutableTreeNode("知识点记录"));
        root.add(new DefaultMutableTreeNode("常用快捷件"));
        root.add(new DefaultMutableTreeNode("其它"));
        JTree jTree = new JTree(root);
        jTree.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                int selRow = jTree.getRowForLocation(e.getX(), e.getY());
                TreePath selPath = jTree.getPathForLocation(e.getX(), e.getY());
                if (selRow != -1 && selPath != null) {
                    DefaultMutableTreeNode treeNode = (DefaultMutableTreeNode) selPath.getLastPathComponent();
                    if (e.getClickCount() == 1) {
                        switch (treeNode.toString()) {
                            case "代码生成":
                                mainFrame.changePanel("p1");
                                break;
                            case "":
                                break;
                            default:
                        }
                    }
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        return jTree;
    }
}
