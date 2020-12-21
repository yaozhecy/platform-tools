package com.cy.platform.plugin.action;

import com.cy.platform.plugin.ui.MainFrame;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class MainAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        new MainFrame();
    }
}
