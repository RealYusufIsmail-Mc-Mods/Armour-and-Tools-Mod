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
package io.github.realyusufismail.armourandtoolsmod.core.blocks.armour

import io.github.realyusufismail.armourandtoolsmod.core.init.RecipeTypeInit
import net.minecraft.world.item.crafting.Recipe
import net.minecraft.world.item.crafting.RecipeType

interface CustomArmourCraftingTableRecipe : Recipe<CustomArmourCraftingTableContainer> {
    override fun getType(): RecipeType<*> {
        return RecipeTypeInit.ARMOUR_CRAFTING.get()
    }
}
