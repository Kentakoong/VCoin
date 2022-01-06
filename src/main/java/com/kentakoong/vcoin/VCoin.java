package com.kentakoong.vcoin;

import com.kentakoong.vcoin.item.PomuCoinItem;
import com.kentakoong.vcoin.sounds.PomuCoinSound;

import net.fabricmc.api.ModInitializer;

public class VCoin implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "vcoin";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		PomuCoinSound.registerSounds();
		PomuCoinItem.registerItem();

		System.out.println("Finished Initializing");
	}
}