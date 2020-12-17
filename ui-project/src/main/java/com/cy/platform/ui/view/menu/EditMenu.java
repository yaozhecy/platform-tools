package com.cy.platform.ui.view.menu;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * 编辑器菜单
 *
 * @author develop
 */
public class EditMenu extends JMenu {
    public EditMenu() {
        super("编辑(E)");
        this.setMnemonic(KeyEvent.VK_E);
        JMenuItem item = new JMenuItem("撤销(U)", KeyEvent.VK_U);
        item.setEnabled(false);
        this.add(item);
        this.addSeparator();
        item = new JMenuItem("剪贴(T)", KeyEvent.VK_T);
        this.add(item);
        item = new JMenuItem("复制(C)", KeyEvent.VK_C);
        this.add(item);
        this.addSeparator();
        JCheckBoxMenuItem cbMenuItem = new JCheckBoxMenuItem("自动换行");
        this.add(cbMenuItem);
    }
}
