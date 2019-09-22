package jp.mihailskuzmins.sugoinihongo.persistence.repos.asset.kanaRepoTests

import org.amshove.kluent.shouldBeEqualTo
import org.junit.Test

class KanaRepoRomajiToKatakanaShould : KanaRepoTestsBase() {

	@Test
	fun `correctly convert from romaji to katakana`() {
		val repo = createClass()

		katakanaMap.forEach {
			repo
				.romajiToKatakana(it.key)
				.shouldBeEqualTo(it.value)
		}
	}
}
