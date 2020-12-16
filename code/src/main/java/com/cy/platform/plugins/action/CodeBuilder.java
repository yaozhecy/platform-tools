package com.cy.platform.plugins.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

public class CodeBuilder extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Messages.showInfoMessage("Hello IDEA", "Hello");
    }
}
