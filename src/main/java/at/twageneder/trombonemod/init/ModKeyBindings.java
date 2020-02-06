package at.twageneder.trombonemod.init;

import at.twageneder.trombonemod.models.KeyBindingsBase;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import java.util.ArrayList;
import java.util.List;

public class ModKeyBindings {
    public static final List<KeyBinding> KEY_BINDINGS = new ArrayList<>();

    //Slide Position keys:
    public static final KeyBinding KEY_V = new KeyBindingsBase(Keyboard.KEY_V);
    public static final KeyBinding KEY_B = new KeyBindingsBase(Keyboard.KEY_B);
    public static final KeyBinding KEY_N = new KeyBindingsBase(Keyboard.KEY_N);
    public static final KeyBinding KEY_M = new KeyBindingsBase(Keyboard.KEY_M);
    public static final KeyBinding KEY_COMMA = new KeyBindingsBase(Keyboard.KEY_COMMA);
    public static final KeyBinding KEY_PERIOD = new KeyBindingsBase(Keyboard.KEY_PERIOD);
    public static final KeyBinding KEY_MINUS = new KeyBindingsBase(Keyboard.KEY_MINUS);

    //Lip Tension keys:
    public static final KeyBinding KEY_NUMPAD0 = new KeyBindingsBase(Keyboard.KEY_NUMPAD0);
    public static final KeyBinding KEY_NUMPAD1 = new KeyBindingsBase(Keyboard.KEY_NUMPAD1);
    public static final KeyBinding KEY_NUMPAD4 = new KeyBindingsBase(Keyboard.KEY_NUMPAD4);
    public static final KeyBinding KEY_NUMPAD7 = new KeyBindingsBase(Keyboard.KEY_NUMPAD7);
}
