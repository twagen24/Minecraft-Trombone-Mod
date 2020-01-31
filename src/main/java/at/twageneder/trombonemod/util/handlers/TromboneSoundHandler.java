package at.twageneder.trombonemod.util.handlers;

import at.twageneder.trombonemod.init.ModKeyBindings;
import at.twageneder.trombonemod.init.ModSounds;
import at.twageneder.trombonemod.util.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.apache.logging.log4j.Logger;

import static net.minecraft.client.settings.GameSettings.isKeyDown;


@Mod.EventBusSubscriber
public class TromboneSoundHandler {

    private Logger logger;
    private Minecraft mcContext = Minecraft.getMinecraft();

    public TromboneSoundHandler(Logger logger) {
        this.logger = logger;
    }

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        EntityPlayerSP player = mcContext.player;
        if(!Reference.TROMBONE_NAME_JSON.equals(player.getHeldItem(EnumHand.MAIN_HAND).getUnlocalizedName()))
            return;
        if (isKeyDown(ModKeyBindings.KEY_J)) playSound(ModSounds.SOUND_CHICKEN, player);
        // TODO else if
    }

    private void playSound(SoundEvent sound, EntityPlayerSP player) {
        logger.info("************** playSound " + sound.getSoundName());
        try {
            if (mcContext.world.isRemote)
                mcContext.world.playSound(player,
                        player.getPosition(),
                        sound,
                        SoundCategory.PLAYERS,
                        100,
                        1.0F);
        } catch (Exception e) {
            logger.error("Error playing a trombone sound!");
            e.printStackTrace();
        }
    }
}
