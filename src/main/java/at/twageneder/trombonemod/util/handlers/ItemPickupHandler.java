package at.twageneder.trombonemod.util.handlers;

import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Logger;

public class ItemPickupHandler {

    private static Logger logger;

    public ItemPickupHandler(Logger logger){
        this.logger = logger;
    }

    @SubscribeEvent
    public void pickupItem(EntityItemPickupEvent event) {
       logger.info("Item picked up!");
    }

    @SubscribeEvent
    public void onPlaceEvent(BlockEvent.PlaceEvent event) {
        event.getPlayer().sendMessage(
                new TextComponentString("You placed a block : " + event.getPlacedBlock().getBlock().getLocalizedName()));
    }
}
