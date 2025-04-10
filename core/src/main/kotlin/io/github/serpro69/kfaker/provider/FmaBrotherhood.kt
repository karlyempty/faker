@file:Suppress("unused")

package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.FMA_BROTHERHOOD] category.
 */
class FmaBrotherhood internal constructor(fakerService: FakerService) :
    YamlFakeDataProvider<FmaBrotherhood>(fakerService) {
    override val yamlCategory = YamlCategory.FMA_BROTHERHOOD
    override val localUniqueDataProvider = LocalUniqueDataProvider<FmaBrotherhood>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    init {
        fakerService.load(yamlCategory)
    }

    fun characters(): String = resolve("characters")
    fun cities(): String = resolve("cities")
    fun countries(): String = resolve("countries")
}
