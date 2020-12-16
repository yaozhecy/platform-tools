package com.cy.platform.ui.view;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 * Test
 *
 * @author develop
 */
public class MainForm {
    public void init() {
        JFrame frame = new JFrame("Java第三个GUI程序");
        frame.setSize(400, 200);
        JMenuBar jMenuBar = new JMenuBar();
        jMenuBar.add(createFileMenu());
        jMenuBar.add(createEditMenu());
        jMenuBar.setVisible(true);
        frame.setJMenuBar(jMenuBar);

        frame.setLayout(new BorderLayout());
        JLabel jl3 = new JLabel("这是放在JPanel上的标签3");
        JLabel jl4 = new JLabel("这是放在JPanel上的标签4");

        JPanel panel2 = createComponent();
        panel2.setPreferredSize(new Dimension(140, 200));
        panel2.setBorder(BorderFactory.createEtchedBorder());

        JPanel panel3 = new JPanel();
        panel3.add(jl3);
        panel3.setBorder(BorderFactory.createEtchedBorder());

        JPanel panel4 = new JPanel();
        panel4.add(jl4);
        panel4.setBorder(BorderFactory.createEtchedBorder());

        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.CENTER);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.setBounds(300, 200, 600, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JMenu createFileMenu() {
        JMenu menu = new JMenu("文件(F)");
        menu.setMnemonic(KeyEvent.VK_F);
        JMenuItem item = new JMenuItem("新建(N)", KeyEvent.VK_N);
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
        menu.add(item);
        item = new JMenuItem("打开(O)", KeyEvent.VK_O);
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
        menu.add(item);
        item = new JMenuItem("保存(S)", KeyEvent.VK_S);
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
        menu.add(item);
        menu.addSeparator();
        item = new JMenuItem("退出(E)", KeyEvent.VK_E);
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK));
        menu.add(item);
        return menu;
    }

    private JMenu createEditMenu() {
        JMenu menu = new JMenu("编辑(E)");
        menu.setMnemonic(KeyEvent.VK_E);
        JMenuItem item = new JMenuItem("撤销(U)", KeyEvent.VK_U);
        item.setEnabled(false);
        menu.add(item);
        menu.addSeparator();
        item = new JMenuItem("剪贴(T)", KeyEvent.VK_T);
        menu.add(item);
        item = new JMenuItem("复制(C)", KeyEvent.VK_C);
        menu.add(item);
        menu.addSeparator();
        JCheckBoxMenuItem cbMenuItem = new JCheckBoxMenuItem("自动换行");
        menu.add(cbMenuItem);
        return menu;
    }

    private JPanel createComponent() {
        JPanel panel = new JPanel();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("功能列表");
        root.add(new DefaultMutableTreeNode("代码生成"));
        root.add(new DefaultMutableTreeNode("知识点记录"));
        root.add(new DefaultMutableTreeNode("常用快捷件"));
        root.add(new DefaultMutableTreeNode("其它"));
        JTree tree = new JTree(root);
        panel.add(tree);
        return panel;
    }
}
