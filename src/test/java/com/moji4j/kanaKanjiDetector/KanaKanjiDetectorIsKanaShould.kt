package jp.mihailskuzmins.sugoinihongo.helpers.japanese.kanaKanjiDetectorTests

import jp.mihailskuzmins.sugoinihongo.helpers.japanese.KanaKanjiDetector
import org.amshove.kluent.shouldBeFalse
import org.amshove.kluent.shouldBeTrue
import org.junit.Test

class KanaKanjiDetectorIsKanaShould {

	@Test
	fun `return true for katakana and hiragana`() {
		listOf('か', 'カ')
			.forEach {
				KanaKanjiDetector
					.isKana(it)
					.shouldBeTrue()
			}
	}

	@Test
	fun `return false for kanji`() {
		KanaKanjiDetector
			.isKana('日')
			.shouldBeFalse()
	}

	@Test
	fun `return false for romaji`() {
		KanaKanjiDetector
			.isKana('a')
			.shouldBeFalse()
	}
}
