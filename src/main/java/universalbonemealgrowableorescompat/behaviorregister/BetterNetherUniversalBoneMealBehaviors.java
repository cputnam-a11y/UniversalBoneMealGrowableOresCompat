package universalbonemealgrowableorescompat.behaviorregister;

import com.skniro.growableores.block.GrowableBetterEndOresBlocks;
import com.skniro.growableores.block.GrowableBetterNetherOresBlocks;
import fuzs.universalbonemeal.handler.UseBoneMealHandler;
import fuzs.universalbonemeal.world.level.block.behavior.SimpleGrowingPlantBehavior;

public class BetterNetherUniversalBoneMealBehaviors {
    public static void registerBehaviors() {
        UseBoneMealHandler.registerBehavior(
                GrowableBetterNetherOresBlocks.BN_Cincinnasite_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableBetterNetherOresBlocks.BN_Nether_Ruby_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
    }
}
