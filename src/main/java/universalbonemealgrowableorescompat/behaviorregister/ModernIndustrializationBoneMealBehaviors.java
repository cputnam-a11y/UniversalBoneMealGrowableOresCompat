package universalbonemealgrowableorescompat.behaviorregister;

import com.skniro.growableores.block.GrowableModernIndustrializationOresBlocks;
import fuzs.universalbonemeal.handler.UseBoneMealHandler;
import fuzs.universalbonemeal.world.level.block.behavior.SimpleGrowingPlantBehavior;

public class ModernIndustrializationBoneMealBehaviors {
    public static void registerBehaviors() {
        UseBoneMealHandler.registerBehavior(
                GrowableModernIndustrializationOresBlocks.MI_antimony_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableModernIndustrializationOresBlocks.MI_bauxite_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableModernIndustrializationOresBlocks.MI_iridium_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableModernIndustrializationOresBlocks.MI_lead_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableModernIndustrializationOresBlocks.MI_lignite_coal_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableModernIndustrializationOresBlocks.MI_monazite_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableModernIndustrializationOresBlocks.MI_nickel_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableModernIndustrializationOresBlocks.MI_platinum_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableModernIndustrializationOresBlocks.MI_quartz_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableModernIndustrializationOresBlocks.MI_salt_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableModernIndustrializationOresBlocks.MI_tin_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableModernIndustrializationOresBlocks.MI_titanium_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableModernIndustrializationOresBlocks.MI_tungsten_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableModernIndustrializationOresBlocks.MI_uranium_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
    }
}
