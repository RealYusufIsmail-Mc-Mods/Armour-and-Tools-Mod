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
package io.github.realyusufismail.armourandtoolsmod.datagen.texture

import io.github.realyusufismail.armourandtoolsmod.MOD_ID
import io.github.realyusufismail.armourandtoolsmod.core.init.ItemInit
import io.github.realyusufismail.armourandtoolsmod.core.util.name
import net.minecraft.data.PackOutput
import net.minecraft.world.item.Item
import net.minecraftforge.client.model.generators.ItemModelProvider
import net.minecraftforge.common.data.ExistingFileHelper

class ModItemStateProvider(output: PackOutput, exFileHelper: ExistingFileHelper) :
    ItemModelProvider(output, MOD_ID, exFileHelper) {

    override fun registerModels() {
        item(ItemInit.RUBY.get())
        item(ItemInit.SAPPHIRE.get())
        item(ItemInit.GRAPHITE.get())
        item(ItemInit.AQUMARINE.get())
        item(ItemInit.RAINBOW.get())

        // raw ores
        item(ItemInit.RAW_RUBY.get())
        item(ItemInit.RAW_SAPPHIRE.get())
        item(ItemInit.RAW_GRAPHITE.get())
        item(ItemInit.RAW_AQUMARINE.get())
        item(ItemInit.RAW_RAINBOW.get())
    }

    private fun tool(item: Item) {
        val name = item.name
        getBuilder(name)
            .parent(getExistingFile(mcLoc("item/handheld")))
            .texture("layer0", "item/$name")
    }

    private fun item(item: Item) {
        val name = item.name
        getBuilder(name)
            .parent(getExistingFile(mcLoc("item/generated")))
            .texture("layer0", "item/$name")
    }
}
