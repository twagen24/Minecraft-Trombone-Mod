package at.twageneder.trombonemod.util.handlers;

import at.twageneder.trombonemod.init.ModItems;
import at.twageneder.trombonemod.models.ModelInterface;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        System.out.println("************** onItemRegister");
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        System.out.println("************** onModelRegister");
        for (Item i : ModItems.ITEMS) {
            System.out.println("\t\t" + i.getUnlocalizedName());
            if (i instanceof ModelInterface) {
                ((ModelInterface) i).registerModels();
            }
        }
    }
}
