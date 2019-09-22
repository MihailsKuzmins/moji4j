package jp.mihailskuzmins.sugoinihongo.helpers.japanese.kanaKanjiDetectorTests

import jp.mihailskuzmins.sugoinihongo.helpers.japanese.KanaKanjiDetector
import org.amshove.kluent.shouldBeFalse
import org.amshove.kluent.shouldBeTrue
import org.junit.Test

class KanaKanjiDetectorIsKanjiShould {

	@Test
	fun `return true for kanji`() {
		KanaKanjiDetector
			.isKanji('日')
			.shouldBeTrue()
	}

	@Test
	fun `return true for iteration mark`() {
		KanaKanjiDetector
			.isKanji('々')
			.shouldBeTrue()
	}

	@Test
	fun `return false for kana`() {
		listOf('か', 'カ')
			.forEach {
				KanaKanjiDetector
					.isKanji(it)
					.shouldBeFalse()
			}
	}

	@Test
	fun `return false for romaji`() {
		KanaKanjiDetector
			.isKanji('a')
			.shouldBeFalse()
	}
}
