package at.twageneder.trombonemod.init;

import at.twageneder.trombonemod.models.KeyBindingsBase;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

import java.util.ArrayList;
import java.util.List;

public class ModKeyBindings {
    public static final List<KeyBinding> KEY_BINDINGS = new ArrayList<>();
    public static final KeyBinding KEY_J = new KeyBindingsBase(Keyboard.KEY_J);
}
