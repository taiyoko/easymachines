package fallentaiyoko.easymachines.proxy;

//import fallentaiyoko.easymachines.EMBlocks;
//import fallentaiyoko.easymachines.EMItems;
import fallentaiyoko.easymachines.EMMain;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends ServerProxy {
    
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        
        //EMBlocks.initModels();
        //EMItems.initModels();
    }
    
    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
        
        //Do I need this?
       // EMBlocks.initItemModels();
    }
}
