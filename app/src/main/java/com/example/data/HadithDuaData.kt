package com.example.data

object HadithDuaData {
    val hadiths: List<Hadith> = listOf(
        Hadith(
            id = "h1",
            title = "The Best Among You",
            text = "The best among you are those who learn the Quran and teach it to others.",
            narrator = "Uthman ibn Affan",
            source = "Sahih al-Bukhari 5027",
            category = HadithCategory.KNOWLEDGE,
            reflection = "Every quiet minute invested in understanding sacred guidance — and sharing that light with family or friends — elevates a person to the highest honor."
        ),
        Hadith(
            id = "h2",
            title = "Actions Are Judged by Intentions",
            text = "Indeed, actions are judged only by their intentions, and every person shall receive only what they sincerely intended.",
            narrator = "Umar ibn al-Khattab",
            source = "Sahih al-Bukhari 1 • Sahih Muslim 1907",
            category = HadithCategory.FAITH,
            reflection = "A sincere, noble intention transforms ordinary daily work, study, and care for others into lasting acts of devotion."
        ),
        Hadith(
            id = "h3",
            title = "The Path of Knowledge",
            text = "Whoever walks a path seeking beneficial knowledge, God will make easy for them a path to Paradise.",
            narrator = "Abu Hurairah",
            source = "Sahih Muslim 2699",
            category = HadithCategory.KNOWLEDGE,
            reflection = "Learning with humility and curiosity brings both clarity in this world and lasting spiritual peace."
        ),
        Hadith(
            id = "h4",
            title = "A Warm Smile Is Charity",
            text = "Your smiling warmly in the face of another person is counted as an act of charity.",
            narrator = "Abu Dharr",
            source = "Jami' at-Tirmidhi 1956",
            category = HadithCategory.KINDNESS,
            reflection = "Generosity does not depend on wealth; warmth, courtesy, and a welcoming presence uplift hearts every single day."
        ),
        Hadith(
            id = "h5",
            title = "Excellence of Character",
            text = "Truly, among the very best of you are those who possess the finest manners and character.",
            narrator = "Abdullah ibn Amr",
            source = "Sahih al-Bukhari 3559",
            category = HadithCategory.CHARACTER,
            reflection = "Authentic spiritual growth shines most clearly through patience, honesty, gentleness, and respect for others."
        ),
        Hadith(
            id = "h6",
            title = "Two Treasured Phrases of Praise",
            text = "Two phrases are light upon the tongue, heavy on the scale of goodness, and deeply beloved to the Most Merciful: 'Glory and praise be to God' and 'Glory be to God, the Supreme.'",
            narrator = "Abu Hurairah",
            source = "Sahih al-Bukhari 6406",
            category = HadithCategory.WORSHIP,
            reflection = "Gentle moments of remembrance throughout a busy schedule bring calm focus and gratitude to the heart."
        ),
        Hadith(
            id = "h7",
            title = "Mercy Brings Mercy",
            text = "The merciful are shown mercy by the Most Merciful. Show compassion to everyone on earth, and the One above the heavens will show compassion to you.",
            narrator = "Abdullah ibn Amr",
            source = "Sunan Abi Dawud 4941 • At-Tirmidhi 1924",
            category = HadithCategory.KINDNESS,
            reflection = "Kindness extends beyond our closest circle to neighbors, strangers, and every living creature sharing the earth."
        ),
        Hadith(
            id = "h8",
            title = "Speak Good or Keep Peace",
            text = "Whoever believes in God and the Last Day should speak words that bring goodness, or else remain peacefully silent.",
            narrator = "Abu Hurairah",
            source = "Sahih al-Bukhari 6018 • Sahih Muslim 47",
            category = HadithCategory.CHARACTER,
            reflection = "Thoughtful speech protects dignity, prevents unnecessary hurt, and fosters trust in every conversation."
        ),
        Hadith(
            id = "h9",
            title = "The Power of Daily Consistency",
            text = "The deeds most beloved to God are those practiced most consistently, even if they are small.",
            narrator = "Aisha",
            source = "Sahih al-Bukhari 6464 • Sahih Muslim 783",
            category = HadithCategory.WORSHIP,
            reflection = "Reading a few verses or offering a heartfelt prayer each day builds steady, lifelong transformation."
        ),
        Hadith(
            id = "h10",
            title = "Wishing Good for Others",
            text = "None of you truly attains complete faith until they love for others the same goodness they love for themselves.",
            narrator = "Anas ibn Malik",
            source = "Sahih al-Bukhari 13 • Sahih Muslim 45",
            category = HadithCategory.FAITH,
            reflection = "Genuine empathy frees the heart from envy and replaces comparison with joyful goodwill."
        ),
        Hadith(
            id = "h11",
            title = "True Strength Is Self-Mastery",
            text = "The truly strong person is not the one who overpowers others in strength, but the one who stays calm and masters themselves in moments of anger.",
            narrator = "Abu Hurairah",
            source = "Sahih al-Bukhari 6114",
            category = HadithCategory.CHARACTER,
            reflection = "Responding to frustration with composure and dignity is one of the highest signs of inner strength."
        ),
        Hadith(
            id = "h12",
            title = "Double Reward for Every Learner",
            text = "The one who reads the Quran with ease stands in noble company, and the one who reads while striving through difficulty receives a double reward.",
            narrator = "Aisha",
            source = "Sahih al-Bukhari 4937 • Sahih Muslim 798",
            category = HadithCategory.KNOWLEDGE,
            reflection = "Every sincere beginner should feel encouraged: earnest effort itself is deeply honored and rewarded."
        )
    )

    val duas: List<Dua> = listOf(
        Dua(
            id = "d1",
            title = "Prayer for Growing Knowledge",
            text = "My Lord, increase me in beneficial knowledge and clear understanding.",
            occasion = "Before studying or beginning a new lesson",
            reference = "Quran 20:114",
            category = DuaCategory.KNOWLEDGE,
            recommendedCount = 3
        ),
        Dua(
            id = "d2",
            title = "Knowledge, Pure Provision & Accepted Deeds",
            text = "O God, I ask You for knowledge that benefits, provision that is pure and lawful, and deeds that are sincerely accepted.",
            occasion = "At the start of the morning",
            reference = "Sunan Ibn Majah 925",
            category = DuaCategory.KNOWLEDGE,
            recommendedCount = 1
        ),
        Dua(
            id = "d3",
            title = "Clarity of Heart & Speech",
            text = "My Lord, expand my heart with confidence, make my task easy for me, and remove any hesitation from my speech so that others may clearly understand my words.",
            occasion = "Before speaking, teaching, or exams",
            reference = "Quran 20:25–28",
            category = DuaCategory.KNOWLEDGE,
            recommendedCount = 1
        ),
        Dua(
            id = "d4",
            title = "Morning Gratitude & Renewal",
            text = "We have entered a new morning and all sovereignty belongs to God. All praise is due to God alone, without partner; to Him belongs all dominion and praise, and He has power over all things.",
            occasion = "Upon waking and greeting the morning",
            reference = "Sahih Muslim 2723",
            category = DuaCategory.MORNING_EVENING,
            recommendedCount = 1
        ),
        Dua(
            id = "d5",
            title = "Contentment in Faith",
            text = "I am deeply pleased with God as my Lord, with the path of peace as my way of life, and with the Messenger as my guide.",
            occasion = "Morning and evening reflection",
            reference = "Sunan Abi Dawud 5072",
            category = DuaCategory.MORNING_EVENING,
            recommendedCount = 3
        ),
        Dua(
            id = "d6",
            title = "Seeking Protection Morning & Evening",
            text = "In the name of God, with whose name nothing on earth or in heaven can cause harm, and He is the All-Hearing, the All-Knowing.",
            occasion = "Recited three times morning and evening",
            reference = "Sunan Abi Dawud 5088 • At-Tirmidhi 3388",
            category = DuaCategory.MORNING_EVENING,
            recommendedCount = 3
        ),
        Dua(
            id = "d7",
            title = "Goodness in Both Worlds",
            text = "Our Lord, grant us goodness in this world and goodness in the Hereafter, and protect us from all harm.",
            occasion = "Comprehensive daily prayer at any hour",
            reference = "Quran 2:201",
            category = DuaCategory.GUIDANCE,
            recommendedCount = 3
        ),
        Dua(
            id = "d8",
            title = "Steadfastness of the Heart",
            text = "O Turner of hearts, keep my heart firm, serene, and steadfast upon Your truth.",
            occasion = "When seeking clarity and resilience",
            reference = "Jami' at-Tirmidhi 2140",
            category = DuaCategory.GUIDANCE,
            recommendedCount = 3
        ),
        Dua(
            id = "d9",
            title = "Relief from Anxiety & Worry",
            text = "O God, I seek refuge in You from worry and grief, from helplessness and laziness, and from being overwhelmed by burdens.",
            occasion = "During stressful or heavy days",
            reference = "Sahih al-Bukhari 6369",
            category = DuaCategory.GUIDANCE,
            recommendedCount = 3
        ),
        Dua(
            id = "d10",
            title = "Entering a Place of Prayer",
            text = "O God, open wide for me the doors of Your boundless mercy.",
            occasion = "When entering the mosque or starting prayer",
            reference = "Sahih Muslim 713",
            category = DuaCategory.PRAYER,
            recommendedCount = 1
        ),
        Dua(
            id = "d11",
            title = "Help in Remembrance & Gratitude",
            text = "O God, help me to remember You often, to give thanks to You sincerely, and to worship You in the most excellent manner.",
            occasion = "Following daily prayers",
            reference = "Sunan Abi Dawud 1522",
            category = DuaCategory.PRAYER,
            recommendedCount = 1
        ),
        Dua(
            id = "d12",
            title = "Stepping Out with Trust",
            text = "In the name of God, I place my complete trust in God, for there is no strength nor power except through God.",
            occasion = "When leaving home for work or travel",
            reference = "Sunan Abi Dawud 5095",
            category = DuaCategory.DAILY_LIFE,
            recommendedCount = 1
        ),
        Dua(
            id = "d13",
            title = "Gratitude After a Meal",
            text = "All praise is due to God, who nourished me with this meal and provided it for me without any might or power of my own.",
            occasion = "Upon finishing a meal",
            reference = "Jami' at-Tirmidhi 3458",
            category = DuaCategory.DAILY_LIFE,
            recommendedCount = 1
        ),
        Dua(
            id = "d14",
            title = "Peaceful Rest Before Sleep",
            text = "In Your name, O God, I rest for the night and in Your name I awaken to a new day.",
            occasion = "Right before going to sleep",
            reference = "Sahih al-Bukhari 6324",
            category = DuaCategory.DAILY_LIFE,
            recommendedCount = 1
        ),
        Dua(
            id = "d15",
            title = "Prayer for Parents",
            text = "My Lord, shower Your mercy and gentleness upon my parents, just as they lovingly raised and cared for me when I was small.",
            occasion = "Remembering parents with love and gratitude",
            reference = "Quran 17:24",
            category = DuaCategory.DAILY_LIFE,
            recommendedCount = 3
        )
    )
}
