package universalbonemealgrowableorescompat.behaviorregister;

import com.skniro.growableores.block.GrowableAEOresBlocks;
import com.skniro.growableores.block.GrowableAdAstraOresBlocks;
import fuzs.universalbonemeal.handler.UseBoneMealHandler;
import fuzs.universalbonemeal.world.level.block.behavior.SimpleGrowingPlantBehavior;

public class AEUniversalBoneMealBehaviors {
    public static void registerBehaviors() {
        UseBoneMealHandler.registerBehavior(
                GrowableAEOresBlocks.certus_quartz_crystal_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableAEOresBlocks.fluix_crystal_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
    }
}
