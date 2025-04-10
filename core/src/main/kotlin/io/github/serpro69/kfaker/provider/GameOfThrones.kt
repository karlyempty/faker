package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.GAME_OF_THRONES] category.
 */
@Suppress("unused")
class GameOfThrones internal constructor(fakerService: FakerService) : YamlFakeDataProvider<GameOfThrones>(fakerService) {
    override val yamlCategory = YamlCategory.GAME_OF_THRONES
    override val localUniqueDataProvider = LocalUniqueDataProvider<GameOfThrones>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    init {
        fakerService.load(yamlCategory)
    }

    fun characters() = resolve("characters")
    fun houses() = resolve("houses")
    fun cities() = resolve("cities")
    fun quotes() = resolve("quotes")
    fun dragons() = resolve("dragons")
}
