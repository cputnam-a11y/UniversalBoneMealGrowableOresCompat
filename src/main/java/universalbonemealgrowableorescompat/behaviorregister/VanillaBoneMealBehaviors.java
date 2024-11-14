package universalbonemealgrowableorescompat.behaviorregister;

import com.skniro.growableores.block.GrowableVanillaOresBlocks;
import fuzs.universalbonemeal.handler.UseBoneMealHandler;
import fuzs.universalbonemeal.world.level.block.behavior.SimpleGrowingPlantBehavior;

public class VanillaBoneMealBehaviors {
    public static void registerBehaviors() {
        UseBoneMealHandler.registerBehavior(
                GrowableVanillaOresBlocks.Iron_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );

        UseBoneMealHandler.registerBehavior(
                GrowableVanillaOresBlocks.Coal_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );

        UseBoneMealHandler.registerBehavior(
                GrowableVanillaOresBlocks.Emerald_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );

        UseBoneMealHandler.registerBehavior(
                GrowableVanillaOresBlocks.Gold_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );

        UseBoneMealHandler.registerBehavior(
                GrowableVanillaOresBlocks.Redstone_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );

        UseBoneMealHandler.registerBehavior(
                GrowableVanillaOresBlocks.Nether_Quartz_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );

        UseBoneMealHandler.registerBehavior(
                GrowableVanillaOresBlocks.Lapis_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );

        UseBoneMealHandler.registerBehavior(
                GrowableVanillaOresBlocks.Diamond_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );

        UseBoneMealHandler.registerBehavior(
                GrowableVanillaOresBlocks.Copper_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );

        UseBoneMealHandler.registerBehavior(
                GrowableVanillaOresBlocks.Blaze_Rod_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );

        UseBoneMealHandler.registerBehavior(
                GrowableVanillaOresBlocks.Ender_Pearl_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );

        UseBoneMealHandler.registerBehavior(
                GrowableVanillaOresBlocks.Netherite_Ingot_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableVanillaOresBlocks.Clay_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );

        UseBoneMealHandler.registerBehavior(
                GrowableVanillaOresBlocks.Slime_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );

        UseBoneMealHandler.registerBehavior(
                GrowableVanillaOresBlocks.Nether_Star_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );

        UseBoneMealHandler.registerBehavior(
                GrowableVanillaOresBlocks.Glowstone_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );

        UseBoneMealHandler.registerBehavior(
                GrowableVanillaOresBlocks.Bone_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );

        UseBoneMealHandler.registerBehavior(
                GrowableVanillaOresBlocks.Egg_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );

        UseBoneMealHandler.registerBehavior(
                GrowableVanillaOresBlocks.Feather_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );

        UseBoneMealHandler.registerBehavior(
                GrowableVanillaOresBlocks.Wool_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
    }
}
