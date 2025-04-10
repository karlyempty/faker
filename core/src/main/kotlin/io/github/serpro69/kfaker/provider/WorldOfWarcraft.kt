package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.GAMES] category.
 */
@Suppress("unused")
class WorldOfWarcraft internal constructor(fakerService: FakerService) : YamlFakeDataProvider<WorldOfWarcraft>(fakerService) {
    override val yamlCategory = YamlCategory.GAMES
    override val secondaryCategory: Category = Category.ofName("WORLD_OF_WARCRAFT")
    override val localUniqueDataProvider = LocalUniqueDataProvider<WorldOfWarcraft>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    init {
        fakerService.load(yamlCategory, secondaryCategory)
    }

    fun hero() = resolve("world_of_warcraft", "heros")
    fun quotes() = resolve("world_of_warcraft", "quotes")
    fun classNames() = resolve("world_of_warcraft", "class_names")
    fun races() = resolve("world_of_warcraft", "races")
}
