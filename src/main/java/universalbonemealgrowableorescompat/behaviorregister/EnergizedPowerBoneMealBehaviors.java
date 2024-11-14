package universalbonemealgrowableorescompat.behaviorregister;

import com.skniro.growableores.block.GrowableCreateOresBlocks;
import com.skniro.growableores.block.GrowableEnergizedPowerOresBlocks;
import fuzs.universalbonemeal.handler.UseBoneMealHandler;
import fuzs.universalbonemeal.world.level.block.behavior.SimpleGrowingPlantBehavior;

public class EnergizedPowerBoneMealBehaviors {
    public static void registerBehaviors() {
        UseBoneMealHandler.registerBehavior(
                GrowableEnergizedPowerOresBlocks.EP_Advanced_Alloy_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableEnergizedPowerOresBlocks.EP_Energized_Copper_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableEnergizedPowerOresBlocks.EP_Energized_Gold_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableEnergizedPowerOresBlocks.EP_Redstone_Alloy_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableEnergizedPowerOresBlocks.EP_Steel_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableEnergizedPowerOresBlocks.EP_Tin_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
    }
}
