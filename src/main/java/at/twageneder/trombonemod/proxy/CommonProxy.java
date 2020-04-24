package at.twageneder.trombonemod.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
    }

    public void registerItemRenderer(Item item, int meta, String id) {
    }

    public void registerItemPickupHandler(Logger logger) {
    }

    public void registerTromboneSoundHandler(Logger logger) {
    }
}
