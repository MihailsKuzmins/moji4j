package jp.mihailskuzmins.sugoinihongo.helpers.japanese.kanaKanjiDetectorTests

import jp.mihailskuzmins.sugoinihongo.helpers.japanese.KanaKanjiDetector
import org.amshove.kluent.shouldBeFalse
import org.amshove.kluent.shouldBeTrue
import org.junit.Test

class KanaKanjiDetectorHasKanaShould {

	@Test
	fun `return true for kana words`() {
		listOf("かおいる", "スーパーマーケット")
			.forEach {
				KanaKanjiDetector
					.hasKana(it)
					.shouldBeTrue()
			}
	}

	@Test
	fun `return true for kana words with kanji`() {
		listOf("例えば", "バス停")
			.forEach {
				KanaKanjiDetector
					.hasKana(it)
					.shouldBeTrue()
			}
	}

	@Test
	fun `return false for kanji word`() {
		KanaKanjiDetector
			.hasKana("日本語")
			.shouldBeFalse()
	}

	@Test
	fun `return false for romaji word`() {
		KanaKanjiDetector
			.hasKana("nihongo")
			.shouldBeFalse()
	}
}
