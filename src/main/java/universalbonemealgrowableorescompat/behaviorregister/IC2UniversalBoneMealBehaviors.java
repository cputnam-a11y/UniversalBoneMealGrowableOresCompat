package universalbonemealgrowableorescompat.behaviorregister;

import com.skniro.growableores.block.GrowableICOresBlocks;
import fuzs.universalbonemeal.handler.UseBoneMealHandler;
import fuzs.universalbonemeal.world.level.block.behavior.SimpleGrowingPlantBehavior;

public class IC2UniversalBoneMealBehaviors {
    public static void registerBehaviors() {
        UseBoneMealHandler.registerBehavior(
                GrowableICOresBlocks.IC2_Aluminium_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableICOresBlocks.IC2_silver_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableICOresBlocks.IC2_Tin_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableICOresBlocks.IC2_Uranium_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
    }
}
