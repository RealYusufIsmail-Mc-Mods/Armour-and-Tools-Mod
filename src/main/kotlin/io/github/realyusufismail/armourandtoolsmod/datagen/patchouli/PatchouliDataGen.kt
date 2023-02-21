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
package io.github.realyusufismail.armourandtoolsmod.datagen.patchouli

import com.khanhpham.patchoulidatagen.bookelement.BookCategory
import com.khanhpham.patchoulidatagen.bookelement.BookElement
import com.khanhpham.patchoulidatagen.bookelement.BookEntry
import com.khanhpham.patchoulidatagen.bookelement.BookHeader
import com.khanhpham.patchoulidatagen.provider.PatchouliBookProvider
import io.github.realyusufismail.armourandtoolsmod.MOD_ID
import java.util.function.Consumer
import net.minecraft.data.DataGenerator
import net.minecraft.network.chat.Component
import net.minecraft.world.item.Items
import net.minecraftforge.common.data.ExistingFileHelper

class PatchouliDataGen(dataGen: DataGenerator, fileHelper: ExistingFileHelper) :
    PatchouliBookProvider(dataGen, fileHelper, "ArmourAndToolsRecipes", MOD_ID) {
    override fun buildPages(consumer: Consumer<BookElement>?) {
        val header: BookHeader =
            BookHeader.Builder.header()
                .enableI18n()
                .setBookComponent(
                    modid,
                    translate("armourandtoolsmod_book.name"),
                    translate("armourandtoolsmod_book.landing_text"))
                .build(consumer)

        val armourCategory: BookCategory =
            BookCategory.Builder.category()
                .bookHeader(header)
                .setDisplay(
                    Component.translatable("armour_category"),
                    Component.translatable("armour_category.desc"),
                    Items.DIAMOND_CHESTPLATE)
                .save(consumer, "armour_category")

        val toolsCategory: BookCategory =
            BookCategory.Builder.category()
                .bookHeader(header)
                .setDisplay(
                    Component.translatable("tools_category"),
                    Component.translatable("tools_category.desc"),
                    Items.DIAMOND_PICKAXE)
                .save(consumer, "tools_category")

        BookEntry.setup()
            .category(armourCategory)
            .display("Armour Entry", Items.DIAMOND_CHESTPLATE)
            .build(consumer, "armour_entry")

        BookEntry.setup()
            .category(toolsCategory)
            .display("Tools Entry", Items.DIAMOND_PICKAXE)
            .build(consumer, "tools_entry")
    }

    private fun translate(key: String): Component {
        return Component.translatable(key)
    }
}
