package com.cy.platform.plugins.action;

import com.cy.platform.plugins.view.MainForm;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class CodeBuilder extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        new MainForm();
    }
}
