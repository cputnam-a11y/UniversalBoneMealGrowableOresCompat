package universalbonemealgrowableorescompat.behaviorregister;

import com.skniro.growableores.block.GrowableBetterNetherOresBlocks;
import com.skniro.growableores.block.GrowableCreateOresBlocks;
import fuzs.universalbonemeal.handler.UseBoneMealHandler;
import fuzs.universalbonemeal.world.level.block.behavior.SimpleGrowingPlantBehavior;

public class CreateUniversalBoneMealBehaviors {
    public static void registerBehaviors() {
        UseBoneMealHandler.registerBehavior(
                GrowableCreateOresBlocks.C_Andesite_Alloy_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableCreateOresBlocks.C_Brass_Ingot_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableCreateOresBlocks.C_Polished_Rose_Quartz_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableCreateOresBlocks.C_Zinc_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
    }
}
