package net.kentakoong.vcoin.sounds;

import net.kentakoong.vcoin.VCoin;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PomuCoinSound {
    // public static final Identifier vcoin_sounds = new Identifier("vcoin:impomu");
    public static SoundEvent imPomu = registerSoundEvent("impomu");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(VCoin.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

    public static void registerSounds() {
        System.out.println("Registering PomuCoinSound" + VCoin.MOD_ID);
    }

}
