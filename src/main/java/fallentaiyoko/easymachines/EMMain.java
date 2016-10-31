package fallentaiyoko.easymachines;


import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.apache.logging.log4j.Logger;

import java.io.File;
/**
 *
 * @author sarah
 */
@SuppressWarnings("javadoc")
@Mod(modid = EMMain.MODID, version = EMMain.VERSION, name = EMMain.NAME)
public class EMMain {
    public static final String MODID = "easymachines";
    public static final String VERSION = "0.0.1a";
    public static final String NAME = "Easy Machines";
    public static final String SERVER_PROXY = "fallentaiyoko.easymachines.ServerProxy";
    public static final String CLIENT_PROXY = "fallentaiyoko.easymachines.ClientProxy";
    
    private File config;
    private String configDir;
    
    
    @Instance(EMMain.MODID)
    public static EMMain instance;
    
    public static Logger logger;
    
    @SidedProxy(clientSide = EMMain.CLIENT_PROXY, serverSide = EMMain.SERVER_PROXY)
    //private static ServerProxy proxy;
    
    public static final CreativeTabs tabEMBlocks = new CreativeTabs("EMBlocks") {
        @Override
        @SideOnly(net.minecraftforge.fml.relauncher.Side.CLIENT)
        public Item getTabIconItem() {
            //todo: select tab icon item and change it here
            return Item.getItemFromBlock(Blocks.SEA_LANTERN);
        }
    };
    
    public static final CreativeTabs tabEMItems = new CreativeTabs("EMItems") {
        @Override
        @SideOnly(net.minecraftforge.fml.relauncher.Side.CLIENT)
        public Item getTabIconItem() {
            //todo: select a tab icon and change it here
            return Items.EMERALD;
        }
    };
    
}
