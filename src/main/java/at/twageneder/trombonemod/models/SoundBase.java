package at.twageneder.trombonemod.models;

import at.twageneder.trombonemod.init.ModSounds;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class SoundBase extends SoundEvent {

    public SoundBase(ResourceLocation soundNameIn) {
        super(soundNameIn);
        ModSounds.KEY_BINDINGS.add(this);
    }
}
