package jp.mihailskuzmins.sugoinihongo.helpers.japanese.kanaKanjiDetectorTests

import jp.mihailskuzmins.sugoinihongo.helpers.japanese.KanaKanjiDetector
import org.amshove.kluent.shouldBeFalse
import org.amshove.kluent.shouldBeTrue
import org.junit.Test

class KanaKanjiDetectorHasRomajiShould {

	@Test
	fun `return true for romaji word`() {
		KanaKanjiDetector
			.hasRomaji("nihongo")
			.shouldBeTrue()
	}

	@Test
	fun `return false for kana words`() {
		listOf("コレクション", "きゅうりょう")
			.forEach {
				KanaKanjiDetector
					.hasRomaji(it)
					.shouldBeFalse()
			}
	}

	@Test
	fun `return false for kanji word`() {
		KanaKanjiDetector
			.hasRomaji("日本語")
			.shouldBeFalse()
	}
}
