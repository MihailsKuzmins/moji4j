## Romaji and Kana Conversion

    val converter = new KanaRepo(context)

    converter.romajiToHiragana("Hiragana") // ひらがな
    converter.romajiToHiragana("Katakana") // カタカナ
    converter.romajiToHiragana("ひらがな") // hiragana
    converter.romajiToHiragana("カタカナ") // katakana

## Romaji, Kana, and Kanji Detection

    MojiDetector detector = new MojiDetector();

    detector.hasKanji("まっ暗"); // true
    detector.hasKanji("まっしろ"); // false
    detector.hasKana("ウソ付き"); // true
    detector.hasKana("東京"); // false
    detector.hasRomaji("モデル XYZ"); // true
    detector.hasRomaji("フルーツ"); // false
