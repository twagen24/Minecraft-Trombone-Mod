package at.twageneder.trombonemod.models;

import at.twageneder.trombonemod.init.ModKeyBindings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

public class KeyBindingsBase extends KeyBinding implements ModelInterface {

    public KeyBindingsBase(int key) {
        super("key " + Keyboard.getKeyName(key), key, "trombone");
        ModKeyBindings.KEY_BINDINGS.add(this);
    }

    @Override
    public void registerModels() {
        ClientRegistry.registerKeyBinding(this);
    }
}
