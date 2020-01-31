package at.twageneder.trombonemod.proxy;

import at.twageneder.trombonemod.util.handlers.ItemPickupHandler;
import at.twageneder.trombonemod.util.handlers.TromboneSoundHandler;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import org.apache.logging.log4j.Logger;


public class ClientProxy extends CommonProxy {
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }

    public void registerItemPickupHandler(Logger logger) {
        MinecraftForge.EVENT_BUS.register(new ItemPickupHandler(logger));
    }

    public void registerTromboneSoundHandler(Logger logger) {
        MinecraftForge.EVENT_BUS.register(new TromboneSoundHandler(logger));
    }
}
