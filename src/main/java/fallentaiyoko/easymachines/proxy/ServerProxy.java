package fallentaiyoko.easymachines.proxy;

import fallentaiyoko.easymachines.*;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

import java.io.File;

public class ServerProxy {
    
    //Config instance
    public static Configuration config;
    
    public void preInit(FMLPreInitializationEvent e) {
        File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "easymachines.cfg"));
        //config.readConfig();
        
        //Initialize blocks and items here.
        //EMBlocks.init();
        //EMItems.init();
        
    }
    
    public void init(FMLInitializationEvent e) {
        NetworkRegistry.INSTANCE.registerGuiHandler(EMMain.instance, new GuiProxy());
    }
    
    public void postInit(FMLPostInitializationEvent e) {
        if (config.hasChanged()) {
            config.save();
        }
    }
    
}
