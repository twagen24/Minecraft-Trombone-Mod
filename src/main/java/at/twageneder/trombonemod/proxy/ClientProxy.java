package at.twageneder.trombonemod.proxy;

import at.twageneder.trombonemod.init.ModItems;
import at.twageneder.trombonemod.util.Reference;
import at.twageneder.trombonemod.util.handlers.ItemPickupHandler;
import at.twageneder.trombonemod.util.handlers.TromboneSoundHandler;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;


public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        OBJLoader.INSTANCE.addDomain(Reference.MOD_ID);
        registerModel(ModItems.ITEM_TROMBONE);
    }

    public void registerModel(Item item){
        //twagen
        //6$&RJe/JKA5*BZ8
        ModelResourceLocation location = new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, location);
    }

    public void registerItemRenderer(Item item, int meta, String id) {
        ModelResourceLocation res = new ModelResourceLocation(item.getRegistryName(), id);
        System.out.println("---------- " + res.toString() + " ----------");
        ModelLoader.setCustomModelResourceLocation(item, meta, res);
    }

    public void registerItemPickupHandler(Logger logger) {
        MinecraftForge.EVENT_BUS.register(new ItemPickupHandler(logger));
    }

    public void registerTromboneSoundHandler(Logger logger) {
        MinecraftForge.EVENT_BUS.register(new TromboneSoundHandler(logger));
    }
}
