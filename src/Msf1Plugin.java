/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openstreetmap.josm.plugins.msf1;

import org.openstreetmap.josm.Main;
import org.openstreetmap.josm.actions.ExtensionFileFilter;
import org.openstreetmap.josm.gui.MainMenu;
import static org.openstreetmap.josm.gui.mappaint.mapcss.ExpressionFactory.Functions.tr;
import org.openstreetmap.josm.plugins.Plugin;
import org.openstreetmap.josm.plugins.PluginInformation;

/**
 *
 * @author MSF1 @ https://github.com/MSF1
 */
public class Msf1Plugin extends Plugin {
    
    protected String name;
    public Msf1Plugin(PluginInformation info)
    {
        super(info);
        name = tr("Import MSF file");
       
        MainMenu.add(Main.main.menu.imagerySubMenu, new Msf1FileImporter());
        
        
    }
}
