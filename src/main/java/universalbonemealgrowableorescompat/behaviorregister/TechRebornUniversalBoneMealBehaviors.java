package universalbonemealgrowableorescompat.behaviorregister;

import com.skniro.growableores.block.GrowableTechRebornOresBlocks;
import fuzs.universalbonemeal.handler.UseBoneMealHandler;
import fuzs.universalbonemeal.world.level.block.behavior.SimpleGrowingPlantBehavior;

public class TechRebornUniversalBoneMealBehaviors {
    public static void registerBehaviors() {
        UseBoneMealHandler.registerBehavior(
                GrowableTechRebornOresBlocks.cinnabar_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableTechRebornOresBlocks.galena_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableTechRebornOresBlocks.iridium_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableTechRebornOresBlocks.lead_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableTechRebornOresBlocks.peridot_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableTechRebornOresBlocks.pyrite_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableTechRebornOresBlocks.ruby_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableTechRebornOresBlocks.sapphire_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableTechRebornOresBlocks.sheldonite_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableTechRebornOresBlocks.silver_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableTechRebornOresBlocks.sodalite_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableTechRebornOresBlocks.sphalerite_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableTechRebornOresBlocks.tin_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableTechRebornOresBlocks.tungsten_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableTechRebornOresBlocks.bauxite_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
    }
}
