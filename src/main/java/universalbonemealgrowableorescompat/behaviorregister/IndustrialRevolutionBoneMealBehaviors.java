package universalbonemealgrowableorescompat.behaviorregister;

import com.skniro.growableores.block.GrowableIndustrialRevolutionOresBlocks;
import fuzs.universalbonemeal.handler.UseBoneMealHandler;
import fuzs.universalbonemeal.world.level.block.behavior.SimpleGrowingPlantBehavior;

public class IndustrialRevolutionBoneMealBehaviors {
    public static void registerBehaviors() {
        UseBoneMealHandler.registerBehavior(
                GrowableIndustrialRevolutionOresBlocks.IR_Lead_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableIndustrialRevolutionOresBlocks.IR_nikolite_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableIndustrialRevolutionOresBlocks.IR_silver_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableIndustrialRevolutionOresBlocks.IR_tin_ore_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableIndustrialRevolutionOresBlocks.IR_tungsten_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
    }
}
