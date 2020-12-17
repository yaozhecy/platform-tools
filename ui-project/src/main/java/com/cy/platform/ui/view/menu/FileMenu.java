package com.cy.platform.ui.view.menu;

import javax.swing.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 * 文件菜单
 *
 * @author develop
 */
public class FileMenu extends JMenu {

    public FileMenu() {
        super("文件(F)");
        this.setMnemonic(KeyEvent.VK_F);
        JMenuItem item = new JMenuItem("新建(N)", KeyEvent.VK_N);
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
        this.add(item);
        item = new JMenuItem("打开(O)", KeyEvent.VK_O);
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
        this.add(item);
        item = new JMenuItem("保存(S)", KeyEvent.VK_S);
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
        this.add(item);
        this.addSeparator();
        item = new JMenuItem("退出(E)", KeyEvent.VK_E);
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK));
        this.add(item);
    }
}
