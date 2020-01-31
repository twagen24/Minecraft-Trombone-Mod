package at.twageneder.trombonemod;

import at.twageneder.trombonemod.proxy.CommonProxy;
import at.twageneder.trombonemod.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
    private static Logger logger;

    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {
        logger.info("Mod initialised:\t" + Reference.NAME);
        proxy.registerItemPickupHandler(logger);
        proxy.registerTromboneSoundHandler(logger);
    }

    @Mod.EventHandler
    public static void postInit(FMLInitializationEvent event) {

    }
}

