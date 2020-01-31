package at.twageneder.trombonemod.init;

import at.twageneder.trombonemod.models.SoundBase;
import at.twageneder.trombonemod.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

import java.util.ArrayList;
import java.util.List;

public class ModSounds {
    public static final List<SoundEvent> KEY_BINDINGS = new ArrayList<>();
    public static final SoundEvent SOUND_CHICKEN = initSound("chicken");

    private static SoundEvent initSound(String fileName) {
        return new SoundBase(new ResourceLocation(Reference.MOD_ID, fileName));
    }
}
