/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openstreetmap.josm.plugins.msf1;

import static org.openstreetmap.josm.tools.I18n.tr;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import org.openstreetmap.josm.actions.JosmAction;
import org.openstreetmap.josm.tools.Shortcut;

/**
 *
 * @author s1525754
 */
public class Msf1FileImporter extends JosmAction {

    public Msf1FileImporter() {
        
        super(tr("Import MSF file"), "msf_import",
		    tr("Import MSF file."), 
		    Shortcut.registerShortcut("tools:msfimport", tr("Tool: {0}",tr("Import MSF file")),
		    KeyEvent.VK_F, Shortcut.ALT_CTRL_SHIFT)
		    , true);

    }
    @Override
    
    public void actionPerformed(ActionEvent e) {

		//show dialog asking to select coordinate axes and input coordinates and projection.
		LoadMSFDialog dialog = new LoadMSFDialog();
		dialog.setAlwaysOnTop(true);
		dialog.setTitle(tr("Import MSF"));
		dialog.setVisible(true);
	}

}
