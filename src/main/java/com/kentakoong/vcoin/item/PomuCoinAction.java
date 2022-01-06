package com.kentakoong.vcoin.item;

import com.kentakoong.vcoin.sounds.PomuCoinSound;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class PomuCoinAction extends Item {
    public PomuCoinAction(Settings item$Settings_1) {
        super(item$Settings_1);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity PlayerEntity, Hand hand) {
        PlayerEntity.playSound(PomuCoinSound.imPomu, 1.0F, 1.0F);
        System.out.println("Played Sound");
        return new TypedActionResult<ItemStack>(ActionResult.SUCCESS,
                PlayerEntity.getStackInHand(hand));
    }
}
