package at.twageneder.trombonemod.init;

import at.twageneder.trombonemod.models.ItemBase;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<>();
    public static final Item ITEM_TROMBONE = new ItemBase("trombone");
    public static final Item ITEM_MOUTH_PIECE = new ItemBase("mouth_piece");
}
