package fallentaiyoko.easymachines.compat;

import fallentaiyoko.easymachines.compat.waila;
import net.minecraftforge.fml.common.Loader;

public class MainCompatHandler {
    
    public static void registerWaila() {
        if (Loader.isModLoaded("Waila")) {
            WailaCompatibility.register();
        }
    }
    
}
