package universalbonemealgrowableorescompat.behaviorregister;

import com.skniro.growableores.block.GrowablePowahOresBlocks;
import fuzs.universalbonemeal.handler.UseBoneMealHandler;
import fuzs.universalbonemeal.world.level.block.behavior.SimpleGrowingPlantBehavior;

public class PowahUniversalBoneMealBehaviors {
    public static void registerBehaviors() {
        UseBoneMealHandler.registerBehavior(
                GrowablePowahOresBlocks.Steel_Energized_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowablePowahOresBlocks.Uraninite_Ore_Dense_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowablePowahOresBlocks.Ender_Core_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowablePowahOresBlocks.Crystal_Spirited_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowablePowahOresBlocks.Crystal_Nitro_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowablePowahOresBlocks.Crystal_Niotic_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowablePowahOresBlocks.Crystal_Blazing_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
    }
}
