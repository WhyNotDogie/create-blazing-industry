package dev.dogie.create_blazing_industry.mixin;

import dev.dogie.create_blazing_industry.CreateBlazingIndustry;

import net.minecraft.client.Minecraft;

import net.minecraft.client.main.GameConfig;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MinecraftMixin {
    @Inject(method = "<init>", at = @At("TAIL"))
    private void example$init(GameConfig gameConfig, CallbackInfo ci) {
        CreateBlazingIndustry.LOGGER.info("Hello from {}", CreateBlazingIndustry.NAME);
    }
}