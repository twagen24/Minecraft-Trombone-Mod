package at.twageneder.trombonemod.util.handlers;

import at.twageneder.trombonemod.init.ModKeyBindings;
import at.twageneder.trombonemod.init.ModSounds;
import at.twageneder.trombonemod.util.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.apache.logging.log4j.Logger;

import static net.minecraft.client.settings.GameSettings.isKeyDown;


@Mod.EventBusSubscriber
public class TromboneSoundHandler {

    private Logger logger;
    private Minecraft mcContext;
    private SoundHandler soundHandler;

    public TromboneSoundHandler(Logger logger) {
        this.logger = logger;
        this.mcContext = Minecraft.getMinecraft();
        this.soundHandler = mcContext.getSoundHandler();
    }

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        EntityPlayerSP player = mcContext.player;
        if (Reference.TROMBONE_NAME_JSON.equals(player.getHeldItem(EnumHand.MAIN_HAND).getUnlocalizedName())) {
            if (isKeyDown(ModKeyBindings.KEY_NUMPAD0)) playLowSound(player);
            else if (isKeyDown(ModKeyBindings.KEY_NUMPAD1)) playMediumSound(player);
            else if (isKeyDown(ModKeyBindings.KEY_NUMPAD4)) playHighSound(player);
            else if (isKeyDown(ModKeyBindings.KEY_NUMPAD7)) playVeryHighSound(player);
            else playNormalSound(player);
        } else if (Reference.MOUTH_PIECE_NAME_JSON.equals(player.getHeldItem(EnumHand.MAIN_HAND).getUnlocalizedName())) {
            playBuzzSound(player);
        }
    }

    private void playLowSound(EntityPlayerSP player) {
        if (isKeyDown(ModKeyBindings.KEY_V)) playSound(ModSounds.SOUND_B, player);
        else if (isKeyDown(ModKeyBindings.KEY_B)) playSound(ModSounds.SOUND_A, player);
        else if (isKeyDown(ModKeyBindings.KEY_N)) playSound(ModSounds.SOUND_AS, player);
        else if (isKeyDown(ModKeyBindings.KEY_M)) playSound(ModSounds.SOUND_G, player);
        else if (isKeyDown(ModKeyBindings.KEY_COMMA)) playSound(ModSounds.SOUND_GES, player);
        else if (isKeyDown(ModKeyBindings.KEY_PERIOD)) playSound(ModSounds.SOUND_F, player);
    }

    private void playNormalSound(EntityPlayerSP player) {
        if (isKeyDown(ModKeyBindings.KEY_V)) playSound(ModSounds.SOUND_F0, player);
        else if (isKeyDown(ModKeyBindings.KEY_B)) playSound(ModSounds.SOUND_E0, player);
        else if (isKeyDown(ModKeyBindings.KEY_N)) playSound(ModSounds.SOUND_ES0, player);
        else if (isKeyDown(ModKeyBindings.KEY_M)) playSound(ModSounds.SOUND_D0, player);
        else if (isKeyDown(ModKeyBindings.KEY_COMMA)) playSound(ModSounds.SOUND_DES0, player);
        else if (isKeyDown(ModKeyBindings.KEY_PERIOD)) playSound(ModSounds.SOUND_C0, player);
        else if (isKeyDown(ModKeyBindings.KEY_MINUS)) playSound(ModSounds.SOUND_H, player);
    }

    private void playMediumSound(EntityPlayerSP player) {
        if (isKeyDown(ModKeyBindings.KEY_V)) playSound(ModSounds.SOUND_B0, player);
        else if (isKeyDown(ModKeyBindings.KEY_B)) playSound(ModSounds.SOUND_A0, player);
        else if (isKeyDown(ModKeyBindings.KEY_N)) playSound(ModSounds.SOUND_AS0, player);
        else if (isKeyDown(ModKeyBindings.KEY_M)) playSound(ModSounds.SOUND_G0, player);
        else if (isKeyDown(ModKeyBindings.KEY_COMMA)) playSound(ModSounds.SOUND_GES0, player);
    }

    private void playHighSound(EntityPlayerSP player) {
        if (isKeyDown(ModKeyBindings.KEY_V)) playSound(ModSounds.SOUND_D1, player);
        else if (isKeyDown(ModKeyBindings.KEY_B)) playSound(ModSounds.SOUND_DES1, player);
        else if (isKeyDown(ModKeyBindings.KEY_N)) playSound(ModSounds.SOUND_C1, player);
        else if (isKeyDown(ModKeyBindings.KEY_M)) playSound(ModSounds.SOUND_H0, player);
    }

    private void playVeryHighSound(EntityPlayerSP player) {
        if (isKeyDown(ModKeyBindings.KEY_V)) playSound(ModSounds.SOUND_F1, player);
        else if (isKeyDown(ModKeyBindings.KEY_B)) playSound(ModSounds.SOUND_E1, player);
        else if (isKeyDown(ModKeyBindings.KEY_N)) playSound(ModSounds.SOUND_ES1, player);
    }

    private void playBuzzSound(EntityPlayerSP player) {
        if (isKeyDown(ModKeyBindings.KEY_V) ||
                isKeyDown(ModKeyBindings.KEY_B) ||
                isKeyDown(ModKeyBindings.KEY_N) ||
                isKeyDown(ModKeyBindings.KEY_M) ||
                isKeyDown(ModKeyBindings.KEY_COMMA) ||
                isKeyDown(ModKeyBindings.KEY_PERIOD))
            playSound(Math.random() < 0.5 ? ModSounds.SOUND_BUZZ1 : ModSounds.SOUND_BUZZ2, player);
        else if (isKeyDown(ModKeyBindings.KEY_MINUS)) playSound(ModSounds.SOUND_BUZZ3, player);
    }

    private void playSound(SoundEvent sound, EntityPlayerSP player) {
        logger.info("************** playSound " + sound.getSoundName());
        try {
            soundHandler.stopSounds();
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

    @SubscribeEvent
    public void onRenderGameOverlay(RenderGameOverlayEvent event){
//        ResourceLocation resourceLocation = new ResourceLocation("trombonemod:textures/items/trombone.png");
//        mcContext.renderEngine.bindTexture(resourceLocation);
//        mcContext.ingameGUI.drawTexturedModalRect(50,50, 0,0,50,50);
    }
}
