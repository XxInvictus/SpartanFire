package com.chaosbuffalo.spartanfire;

import com.github.alexthe666.citadel.server.item.CustomToolMaterial;
import com.github.alexthe666.iceandfire.IceAndFire;
import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import com.oblivioussp.spartanweaponry.api.trait.WeaponTrait;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Jacob on 7/20/2018.
 */
public class Utils {

    public static WeaponMaterial spartanMatFromToolMat(String name, CustomToolMaterial material,
                                                       int color1, int color2, String matName, WeaponTrait... properties){
        return new WeaponMaterial(
                name,
                SpartanFire.MODID,
                color1,
                color2,
                material.getLevel(),
                material.getUses(),
                material.getSpeed(),
                material.getAttackDamageBonus(),
                material.getEnchantmentValue(),
                new ResourceLocation(IceAndFire.MODID, matName),
                properties
        );
    }

    public static WeaponMaterial spartanMatFromToolMat(String name, CustomToolMaterial material,
                                                       int color1, int color2, String matName){
        return new WeaponMaterial(
                name,
                SpartanFire.MODID,
                color1,
                color2,
                material.getLevel(),
                material.getUses(),
                material.getSpeed(),
                material.getAttackDamageBonus(),
                material.getEnchantmentValue(),
                new ResourceLocation(IceAndFire.MODID, matName)
        );
    }
}
