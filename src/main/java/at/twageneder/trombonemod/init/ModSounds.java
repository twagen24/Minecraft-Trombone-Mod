package at.twageneder.trombonemod.init;

import at.twageneder.trombonemod.models.SoundBase;
import at.twageneder.trombonemod.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

import java.util.ArrayList;
import java.util.List;

public class ModSounds {
    public static final List<SoundEvent> KEY_BINDINGS = new ArrayList<>();

    //Trombone Sounds:
    public static final SoundEvent SOUND_F = initSound("f");
    public static final SoundEvent SOUND_GES = initSound("ges");
    public static final SoundEvent SOUND_G = initSound("g");
    public static final SoundEvent SOUND_AS = initSound("as");
    public static final SoundEvent SOUND_A = initSound("a");
    public static final SoundEvent SOUND_B = initSound("b");
    public static final SoundEvent SOUND_H = initSound("h");
    public static final SoundEvent SOUND_C0 = initSound("c0");
    public static final SoundEvent SOUND_DES0 = initSound("des0");
    public static final SoundEvent SOUND_D0 = initSound("d0");
    public static final SoundEvent SOUND_ES0 = initSound("es0");
    public static final SoundEvent SOUND_E0 = initSound("e0");
    public static final SoundEvent SOUND_F0 = initSound("f0");
    public static final SoundEvent SOUND_GES0 = initSound("ges0");
    public static final SoundEvent SOUND_G0 = initSound("g0");
    public static final SoundEvent SOUND_AS0 = initSound("as0");
    public static final SoundEvent SOUND_A0 = initSound("a0");
    public static final SoundEvent SOUND_B0 = initSound("b0");
    public static final SoundEvent SOUND_H0 = initSound("h0");
    public static final SoundEvent SOUND_C1 = initSound("c1");
    public static final SoundEvent SOUND_DES1 = initSound("des1");
    public static final SoundEvent SOUND_D1 = initSound("d1");
    public static final SoundEvent SOUND_ES1 = initSound("es1");
    public static final SoundEvent SOUND_E1 = initSound("e1");
    public static final SoundEvent SOUND_F1 = initSound("f1");

    //Mouthpiece Sounds:
    public static final SoundEvent SOUND_BUZZ1 = initSound("buzz1");
    public static final SoundEvent SOUND_BUZZ2 = initSound("buzz2");
    public static final SoundEvent SOUND_BUZZ3 = initSound("buzz3");

    private static SoundEvent initSound(String fileName) {
        return new SoundBase(new ResourceLocation(Reference.MOD_ID, fileName));
    }
}
