package dev.mayaqq.estrogen.datagen;

import dev.mayaqq.estrogen.datagen.loottables.EstrogenLootTables;
import dev.mayaqq.estrogen.datagen.recipes.create.*;
import dev.mayaqq.estrogen.datagen.recipes.estrogen.EstrogenCentrifugingRecipes;
import dev.mayaqq.estrogen.datagen.recipes.minecraft.EstrogenCraftingRecipes;
import dev.mayaqq.estrogen.datagen.tags.EstrogenTags;
import dev.mayaqq.estrogen.datagen.translations.EstrogenTranslations;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;


public class EstrogenDatagen implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fdg) {
        FabricDataGenerator.Pack pack = fdg.createPack();
        // recipes
        pack.addProvider(EstrogenCentrifugingRecipes::new);
        pack.addProvider(EstrogenCraftingRecipes::new);
        pack.addProvider(EstrogenCompactingRecipes::new);
        pack.addProvider(EstrogenEmptyingRecipes::new);
        pack.addProvider(EstrogenFillingRecipes::new);
        pack.addProvider(EstrogenMillingRecipes::new);
        pack.addProvider(EstrogenSandpaperPolishingRecipes::new);
        pack.addProvider(EstrogenMixingRecipes::new);
        pack.addProvider(EstrogenSequencedAssemblyRecipes::new);

        // tags
        pack.addProvider(EstrogenTags.ItemTags::new);
        pack.addProvider(EstrogenTags.BlockTags::new);
        pack.addProvider(EstrogenTags.FluidTags::new);
        pack.addProvider(EstrogenTags.EntityTypeTags::new);

        // Lang
        pack.addProvider(EstrogenTranslations.EnUs::new);
        pack.addProvider(EstrogenTranslations.FrFr::new);

        // Loot Tables
        pack.addProvider(EstrogenLootTables::new);
    }
}
