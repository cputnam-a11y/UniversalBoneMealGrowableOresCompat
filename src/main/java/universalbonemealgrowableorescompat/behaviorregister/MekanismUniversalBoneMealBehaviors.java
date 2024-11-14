package universalbonemealgrowableorescompat.behaviorregister;

import com.skniro.growableores.block.GrowableMekanismOresBlocks;
import fuzs.universalbonemeal.handler.UseBoneMealHandler;
import fuzs.universalbonemeal.world.level.block.behavior.SimpleGrowingPlantBehavior;

public class MekanismUniversalBoneMealBehaviors {
    public static void registerBehaviors() {
            UseBoneMealHandler.registerBehavior(
                GrowableMekanismOresBlocks.MEK_Fluorite_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
            UseBoneMealHandler.registerBehavior(
                GrowableMekanismOresBlocks.MEK_Lead_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
            UseBoneMealHandler.registerBehavior(
                GrowableMekanismOresBlocks.MEK_Osmium_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
            UseBoneMealHandler.registerBehavior(
                GrowableMekanismOresBlocks.MEK_Tin_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
            UseBoneMealHandler.registerBehavior(
                GrowableMekanismOresBlocks.MEK_Uranium_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
            UseBoneMealHandler.registerBehavior(
                GrowableMekanismOresBlocks.MEK_Steel_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
            UseBoneMealHandler.registerBehavior(
                GrowableMekanismOresBlocks.MEK_Refined_Obsidian_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
            UseBoneMealHandler.registerBehavior(
                GrowableMekanismOresBlocks.MEK_Refined_Glowstone_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
            UseBoneMealHandler.registerBehavior(
                GrowableMekanismOresBlocks.MEK_Bronze_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
    }
}
