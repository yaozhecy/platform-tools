package com.cy.platform.ui;

import com.alee.laf.WebLookAndFeel;
import com.alee.skin.flat.FlatSkin;
import com.cy.platform.ui.view.MainForm;

import javax.swing.*;

/**
 * Main
 *
 * @author develop
 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> WebLookAndFeel.install(FlatSkin.class));
        new MainForm().init();
    }
}
