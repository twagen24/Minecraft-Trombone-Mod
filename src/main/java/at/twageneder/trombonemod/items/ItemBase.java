package at.twageneder.trombonemod.items;

import at.twageneder.trombonemod.Main;
import at.twageneder.trombonemod.util.IHasModel;
import at.twageneder.trombonemod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name){
        super.setUnlocalizedName(name);
        super.setRegistryName(name);
        super.setCreativeTab(CreativeTabs.MATERIALS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
