package universalbonemealgrowableorescompat.behaviorregister;

import com.skniro.growableores.block.GrowableAdAstraOresBlocks;
import fuzs.universalbonemeal.handler.UseBoneMealHandler;
import fuzs.universalbonemeal.world.level.block.behavior.SimpleGrowingPlantBehavior;

public class AdAstraUniversalBoneMealBehaviors {
    public static void registerBehaviors() {
        UseBoneMealHandler.registerBehavior(
                GrowableAdAstraOresBlocks.AD_Ostrum_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableAdAstraOresBlocks.AD_Ice_Shard_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableAdAstraOresBlocks.AD_Cheese_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableAdAstraOresBlocks.AD_Desh_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableAdAstraOresBlocks.AD_Calorite_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
    }
}
