## Romaji and Kana Conversion

    val converter = new KanaRepo(context)

    converter.romajiToHiragana("Hiragana") // ひらがな
    converter.romajiToKatakana("Katakana") // カタカナ
    converter.kanaToRomaji("ひらがな") // hiragana
    converter.kanaToRomaji("カタカナ") // katakana

## Romaji, Kana, and Kanji Detection

    val detector = new KanaKanjiDetector();

    detector.hasKanji("まっ暗") // true
    detector.hasKanji("まっしろ") // false
    detector.hasKana("ウソ付き") // true
    detector.hasKana("東京") // false
    detector.hasRomaji("モデル XYZ") // true
    detector.hasRomaji("フルーツ") // false
