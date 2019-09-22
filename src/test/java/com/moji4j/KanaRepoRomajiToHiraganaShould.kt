package jp.mihailskuzmins.sugoinihongo.persistence.repos.asset.kanaRepoTests

import org.amshove.kluent.shouldBeEqualTo
import org.junit.Test

class KanaRepoRomajiToHiraganaShould : KanaRepoTestsBase() {

	@Test
	fun `correctly convert from romaji to hiragana`() {
		val repo = createClass()

		hiraganaMap.forEach {
			repo
				.romajiToHiragana(it.key)
				.shouldBeEqualTo(it.value)
		}
	}
}
