package universalbonemealgrowableorescompat.behaviorregister;

import com.skniro.growableores.block.GrowableMapleOresBlocks;
import fuzs.universalbonemeal.handler.UseBoneMealHandler;
import fuzs.universalbonemeal.world.level.block.behavior.SimpleGrowingPlantBehavior;

public class MapleBoneMealBehaviors {
    public static void registerBehaviors() {
        UseBoneMealHandler.registerBehavior(
                GrowableMapleOresBlocks.Salt_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
    }
}
