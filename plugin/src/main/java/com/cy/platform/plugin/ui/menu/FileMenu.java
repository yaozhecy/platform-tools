package com.cy.platform.plugin.ui.menu;

import javax.swing.*;
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
        this.add(item);
        item = new JMenuItem("打开(O)", KeyEvent.VK_O);
        this.add(item);
        item = new JMenuItem("保存(S)", KeyEvent.VK_S);
        this.add(item);
        this.addSeparator();
        item = new JMenuItem("退出(E)", KeyEvent.VK_E);
        this.add(item);
    }
}
