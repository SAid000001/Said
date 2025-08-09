package com.example.mod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;

public class ModMain implements ModInitializer {
    @Override
    public void onInitialize() {
        System.out.println("Hello, Fabric world!");
    }

    public static void increasePlayerHealth(PlayerEntity player) {
        EntityAttributeInstance healthAttribute = player.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH);
        if (healthAttribute != null) {
            healthAttribute.setBaseValue(40.0D); // 20 сердец = 40 единиц здоровья
        }
    }
}


