package at.twageneder.trombonemod.models;

import at.twageneder.trombonemod.Main;
import at.twageneder.trombonemod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements ModelInterface {

    public ItemBase(String name) {
        super.setUnlocalizedName(name);
        super.setRegistryName(name);
        super.setCreativeTab(CreativeTabs.MATERIALS);
        super.setMaxStackSize(1);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
