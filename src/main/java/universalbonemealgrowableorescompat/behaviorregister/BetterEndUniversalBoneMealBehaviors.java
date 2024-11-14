package universalbonemealgrowableorescompat.behaviorregister;

import com.skniro.growableores.block.GrowableAEOresBlocks;
import com.skniro.growableores.block.GrowableBetterEndOresBlocks;
import fuzs.universalbonemeal.handler.UseBoneMealHandler;
import fuzs.universalbonemeal.world.level.block.behavior.SimpleGrowingPlantBehavior;

public class BetterEndUniversalBoneMealBehaviors {
    public static void registerBehaviors() {
        UseBoneMealHandler.registerBehavior(
                GrowableBetterEndOresBlocks.amber_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableBetterEndOresBlocks.ender_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableBetterEndOresBlocks.thallasium_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
    }
}
