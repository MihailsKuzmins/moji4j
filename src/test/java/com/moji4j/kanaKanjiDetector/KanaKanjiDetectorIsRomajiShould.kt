package jp.mihailskuzmins.sugoinihongo.helpers.japanese.kanaKanjiDetectorTests

import jp.mihailskuzmins.sugoinihongo.helpers.japanese.KanaKanjiDetector
import org.amshove.kluent.shouldBeFalse
import org.amshove.kluent.shouldBeTrue
import org.junit.Test

class KanaKanjiDetectorIsRomajiShould {

	@Test
	fun `return true for english lowercase letters`() {
		('a'..'z')
			.forEach {
				KanaKanjiDetector
					.isRomaji(it)
					.shouldBeTrue()
			}
	}

	@Test
	fun `return true for english uppercase letters`() {
		('A'..'Z')
			.forEach {
				KanaKanjiDetector
					.isRomaji(it)
					.shouldBeTrue()
			}
	}

	@Test
	fun `return false for kana, kanji or symbols`() {
		listOf('@', 'か', '日')
			.forEach {
				KanaKanjiDetector
					.isRomaji(it)
					.shouldBeFalse()
			}
	}
}
