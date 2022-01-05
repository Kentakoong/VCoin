package net.kentakoong.vcoin.item;

import net.kentakoong.vcoin.VCoin;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PomuCoinItem {

    public static final Item POMUCOIN = registerPomuCoin("pomucoin",
            new PomuCoinAction(new Item.Settings().group(ItemGroup.MISC)));

    private static Item registerPomuCoin(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(VCoin.MOD_ID, name), item);
    }

    public static void registerItem() {
        System.out.println("Regeistering PomuCoinItem" + VCoin.MOD_ID);
    }
}