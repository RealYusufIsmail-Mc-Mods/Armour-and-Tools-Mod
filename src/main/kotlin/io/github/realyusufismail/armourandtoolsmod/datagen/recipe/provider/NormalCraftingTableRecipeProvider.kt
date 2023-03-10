/*
 * Copyright 2022 RealYusufIsmail.
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */ 
package io.github.realyusufismail.armourandtoolsmod.datagen.recipe.provider

import io.github.realyusufismail.armourandtoolsmod.core.init.BlockInit
import io.github.realyusufismail.armourandtoolsmod.core.util.name
import io.github.realyusufismail.armourandtoolsmod.datagen.recipe.MainModRecipeProvider
import io.github.realyusufismail.realyusufismailcore.recipe.YusufShapedRecipeBuilder
import io.github.realyusufismail.realyusufismailcore.recipe.YusufShapelessRecipeBuilder
import java.util.function.Consumer
import net.minecraft.data.recipes.FinishedRecipe
import net.minecraft.data.recipes.RecipeCategory
import net.minecraft.world.item.Items
import net.minecraft.world.level.block.Blocks

class NormalCraftingTableRecipeProvider(
    private val mainModRecipeProvider: MainModRecipeProvider,
    private val pWriter: Consumer<FinishedRecipe>
) : MainModRecipeProvider(mainModRecipeProvider) {

    fun build() {
        YusufShapedRecipeBuilder.shaped(
                RecipeCategory.BUILDING_BLOCKS, BlockInit.CUSTOM_ARMOUR_CRAFTING_TABLE.get())
            .define('A', Blocks.IRON_BLOCK)
            .define('B', Blocks.CRAFTING_TABLE)
            .define('C', Items.IRON_CHESTPLATE)
            .pattern("ACA")
            .pattern(" B ")
            .unlockedBy("has_item", has(Items.IRON_CHESTPLATE))
            .save(pWriter, modId("custom_armour_crafting_table_recipe"))

        addOreBlockRecipes()
    }

    private fun addOreBlockRecipes() {
        // scan BlockInit for Blocks that return OreBlockObjectHolderDelegate
        BlockInit.ORE_BLOCKS.forEach { oreBlock ->
            // create a shapeless recipe for the ore block
            YusufShapelessRecipeBuilder.shapeless(
                    RecipeCategory.BUILDING_BLOCKS, oreBlock.value.get(), 9)
                .requires(oreBlock.key.get())
                .unlockedBy("has_item", has(oreBlock.value.get()))
                .save(pWriter, modId(oreBlock.value.get().name + "_block_recipe"))
        }
    }
}
