package com.example.data

object AcademyData {
    val studyConcepts: List<StudyConcept> = listOf(
        StudyConcept(
            order = 1,
            title = "Mercy",
            subtitle = "Compassion & Grace",
            pillarGroup = "Core Attribute",
            explanation = "Mercy is the foremost attribute opening almost every chapter of the Quran. It encompasses both universal care for all creation and special tenderness toward sincere hearts.",
            quranicInsight = "Chapter 1 opens by introducing God twice through mercy before any other quality.",
            dailyPractice = "Pause once today to respond to an inconvenience with patience and gentleness."
        ),
        StudyConcept(
            order = 2,
            title = "Gratitude",
            subtitle = "Thankful Awareness",
            pillarGroup = "Heart Practice",
            explanation = "Gratitude moves beyond saying 'thank you' — it means noticing everyday blessings in health, family, and guidance, and using them to uplift others.",
            quranicInsight = "Chapter 93 concludes with a call to gratefully recognize and proclaim the blessings you have received.",
            dailyPractice = "Name three quiet blessings from today before going to sleep."
        ),
        StudyConcept(
            order = 3,
            title = "Patience",
            subtitle = "Steadfast Perseverance",
            pillarGroup = "Character",
            explanation = "Patience is active resilience: staying calm during difficulty, steadfast in doing right, and hopeful even when outcomes take time.",
            quranicInsight = "Chapter 103 names encouraging one another to patience as one of the four keys to a well-lived life.",
            dailyPractice = "Take a slow breath before replying whenever a conversation feels tense."
        ),
        StudyConcept(
            order = 4,
            title = "Sincerity",
            subtitle = "Pure Intention",
            pillarGroup = "Faith Foundation",
            explanation = "Sincerity aligns what is inside the heart with outward actions — doing good for its intrinsic worth and to please God rather than for applause.",
            quranicInsight = "The opening Prophetic teaching reminds us that every action is weighed by its underlying intention.",
            dailyPractice = "Perform one helpful act today quietly without expecting recognition."
        ),
        StudyConcept(
            order = 5,
            title = "Guidance",
            subtitle = "The Straight Path",
            pillarGroup = "Spiritual Direction",
            explanation = "Guidance is clarity of purpose — knowing what is right, having the courage to walk toward it, and asking daily for wisdom along the way.",
            quranicInsight = "In The Opening, believers ask for guidance every single day, showing that growth never stops.",
            dailyPractice = "Begin the morning by reading a short verse and asking for clarity in your decisions."
        ),
        StudyConcept(
            order = 6,
            title = "Remembrance",
            subtitle = "Mindful Presence",
            pillarGroup = "Devotion",
            explanation = "Remembrance keeps the heart grounded in gratitude, praise, and awareness of God throughout ordinary daily moments.",
            quranicInsight = "Simple phrases of praise are described as light on the tongue yet deeply weighty in value.",
            dailyPractice = "Use the Daily Remembrance counter for two calm minutes of gratitude."
        ),
        StudyConcept(
            order = 7,
            title = "Trust",
            subtitle = "Peaceful Reliance",
            pillarGroup = "Heart Practice",
            explanation = "True trust combines doing your responsible best with releasing anxious control over results that lie beyond human hands.",
            quranicInsight = "Chapter 94 repeats twice that ease walks right beside every hardship.",
            dailyPractice = "After preparing diligently for a task, recite a brief prayer of trust and let go of worry."
        ),
        StudyConcept(
            order = 8,
            title = "Kindness",
            subtitle = "Gentle Generosity",
            pillarGroup = "Character",
            explanation = "Kindness softens hard situations and turns ordinary encounters — a warm greeting, listening ear, or helping hand — into lasting charity.",
            quranicInsight = "Prophetic wisdom affirms that even a genuine smile offered to someone is an act of charity.",
            dailyPractice = "Check in on a family member, elder, or friend with a thoughtful message."
        ),
        StudyConcept(
            order = 9,
            title = "Knowledge",
            subtitle = "Lifelong Learning",
            pillarGroup = "Academy Pillar",
            explanation = "Seeking beneficial knowledge is honored as a noble lifelong journey that illuminates both faith and service to humanity.",
            quranicInsight = "Chapter 55 celebrates teaching the Quran and eloquent expression among life's highest gifts.",
            dailyPractice = "Complete one lesson or study three verses with their reflections today."
        ),
        StudyConcept(
            order = 10,
            title = "Humility",
            subtitle = "Quiet Dignity",
            pillarGroup = "Character",
            explanation = "Humility means recognizing that talent, success, and opportunity are trusts — keeping the heart grounded during both struggle and triumph.",
            quranicInsight = "Chapter 110 teaches meeting moments of great victory with praise and humble gratitude.",
            dailyPractice = "Credit someone else's contribution warmly in your work or family today."
        ),
        StudyConcept(
            order = 11,
            title = "Forgiveness",
            subtitle = "Mercy & Renewal",
            pillarGroup = "Heart Practice",
            explanation = "Seeking forgiveness renews hope after mistakes, while forgiving others releases resentment and restores peace within the soul.",
            quranicInsight = "The closing prayer of Chapter 2 asks directly for pardon, forgiveness, and mercy when we forget or err.",
            dailyPractice = "Release one lingering frustration and choose peace over resentment."
        ),
        StudyConcept(
            order = 12,
            title = "Consistency",
            subtitle = "Small Daily Steps",
            pillarGroup = "Academy Pillar",
            explanation = "Small, sustainable habits outperform rare bursts of effort. Steady daily reading and reflection gradually reshape character.",
            quranicInsight = "Prophetic wisdom teaches that the most beloved deeds are the most consistent, even when modest.",
            dailyPractice = "Set a gentle five-minute window each day for reading and reflection."
        )
    )

    val studyLessons: List<StudyLesson> = listOf(
        StudyLesson(
            id = "t1",
            number = 1,
            title = "How to Read the Quran Reflectively",
            categoryTag = "Quran Study",
            level = "Foundation",
            summary = "A calm, four-step method for turning daily reading into deep personal understanding.",
            explanation = "Reading the Quran is meant to be unhurried and personal. Rather than rushing through pages, pausing over a short chapter allows its message of mercy, accountability, and hope to speak directly to daily life.",
            keyPoints = listOf(
                "Begin quietly with the Opening Invocation to center your focus.",
                "Read a small passage (3 to 7 verses) slowly rather than skimming.",
                "Ask two reflection questions: What does this teach about God? How does it guide my actions today?",
                "Revisit favorite chapters regularly so their lessons settle naturally in memory."
            ),
            examples = listOf(
                LessonExample(
                    "For truly, alongside hardship comes ease.",
                    "Chapter 94:5 • The Relief",
                    "Pause on repeated promises like this one whenever a day feels overwhelming."
                ),
                LessonExample(
                    "By the passing of time, surely humanity is in loss, except those who believe and do righteous deeds…",
                    "Chapter 103:1–3 • The Declining Day",
                    "Notice how a three-verse chapter offers a complete blueprint for a purposeful life."
                )
            )
        ),
        StudyLesson(
            id = "t2",
            number = 2,
            title = "Understanding Meccan & Medinan Chapters",
            categoryTag = "Quran Structure",
            level = "Foundation",
            summary = "Discover why shorter chapters focus on inner faith while later chapters guide community life.",
            explanation = "Chapters of the Quran are traditionally grouped into two historical periods: Meccan (revealed during the first thirteen years) and Medinan (revealed over the following ten years). Knowing a chapter's context illuminates its tone and focus.",
            keyPoints = listOf(
                "Meccan chapters are often poetic and concise, focusing on the Oneness of God, gratitude, patience, and purpose.",
                "Medinan chapters often address community ethics, compassion, law, and collective responsibility.",
                "Short Meccan chapters like The Morning Brightness and The Opening are ideal starting points for new learners."
            ),
            examples = listOf(
                LessonExample(
                    "Your Lord has neither forsaken you nor grown displeased with you.",
                    "Chapter 93:3 • Meccan Period",
                    "Classic Meccan comfort strengthening the heart during seasons of trial."
                ),
                LessonExample(
                    "God does not burden any soul beyond its capacity.",
                    "Chapter 2:286 • Medinan Period",
                    "Balances ethical responsibility with deep reassurance of Divine fairness."
                )
            )
        ),
        StudyLesson(
            id = "t3",
            number = 3,
            title = "Introduction to Prophetic Hadith",
            categoryTag = "Hadith Sciences",
            level = "Foundation",
            summary = "How authentic Prophetic sayings were preserved and how they illuminate daily ethics.",
            explanation = "Hadith literature preserves the recorded words, gentle habits, and practical guidance of the Prophet. Classical scholars verified narrations rigorously through unbroken chains of trustworthy narrators before compiling trusted collections.",
            keyPoints = listOf(
                "Every Hadith entry lists both the Companion who narrated it and the authenticated collection (such as Sahih al-Bukhari or Sahih Muslim).",
                "Hadith turns broad Quranic principles — like mercy, honesty, and prayer — into vivid everyday examples.",
                "Always read a narration alongside its context and practical reflection."
            ),
            examples = listOf(
                LessonExample(
                    "Indeed, actions are judged only by their intentions.",
                    "Narrated by Umar ibn al-Khattab • Sahih al-Bukhari 1",
                    "Scholars placed this teaching first because sincerity underpins every noble effort."
                ),
                LessonExample(
                    "The best among you are those who learn the Quran and teach it.",
                    "Narrated by Uthman ibn Affan • Sahih al-Bukhari 5027",
                    "Encourages lifelong learning and generous sharing of beneficial wisdom."
                )
            )
        ),
        StudyLesson(
            id = "t4",
            number = 4,
            title = "The Art & Etiquette of Daily Dua",
            categoryTag = "Supplication",
            level = "Foundation",
            summary = "Making heartfelt prayer a calm, natural conversation throughout your day.",
            explanation = "Dua means calling out sincerely to God with hope, gratitude, and humility. While prophetic prayers offer timeless wording, you can always pour out your heart in clear English at any moment.",
            keyPoints = listOf(
                "Begin by praising God and acknowledging His blessings before presenting your request.",
                "Pray with presence of heart, certainty of hope, and patience in timing.",
                "Include prayers for parents, family, teachers, and everyone facing hardship.",
                "Anchor prayers to natural daily transitions: waking up, meals, leaving home, and bedtime."
            ),
            examples = listOf(
                LessonExample(
                    "My Lord, increase me in beneficial knowledge.",
                    "Quran 20:114",
                    "A concise, powerful prayer to open every study session."
                ),
                LessonExample(
                    "Our Lord, grant us goodness in this world and goodness in the Hereafter.",
                    "Quran 2:201",
                    "One of the most comprehensive prayers embracing both present well-being and eternal peace."
                )
            )
        ),
        StudyLesson(
            id = "t5",
            number = 5,
            title = "Building a Sustainable Daily Routine",
            categoryTag = "Personal Growth",
            level = "Intermediate",
            summary = "Simple, realistic habits to stay connected to Quran, Hadith, and Dua every day.",
            explanation = "Lasting spiritual growth grows from gentle rhythm rather than perfectionism. Even ten focused minutes divided across morning and evening can transform your sense of calm and clarity.",
            keyPoints = listOf(
                "Morning (3 min): Recite one morning prayer and read the Verse of the Day.",
                "Midday (2 min): Reflect on one Prophetic teaching and practice a small act of kindness.",
                "Evening (5 min): Read one short chapter, review a study concept, and close with gratitude before sleep."
            ),
            examples = listOf(
                LessonExample(
                    "The deeds most beloved to God are those practiced most consistently, even if they are small.",
                    "Narrated by Aisha • Sahih al-Bukhari 6464",
                    "Consistency is the secret behind every lasting habit."
                )
            )
        ),
        StudyLesson(
            id = "t6",
            number = 6,
            title = "Character & Compassion in Action",
            categoryTag = "Applied Ethics",
            level = "Intermediate",
            summary = "Translating study into calm speech, self-control, and generous care for others.",
            explanation = "The true measure of sacred learning is how it shapes our character at home, at work, and with strangers. Knowledge blossoms when it makes us more patient, truthful, and merciful.",
            keyPoints = listOf(
                "Guard speech: choose words that encourage, clarify, and heal rather than wound.",
                "Practice composure: true strength shows up in staying calm when provoked.",
                "Honor parents and support the vulnerable with warmth and respect."
            ),
            examples = listOf(
                LessonExample(
                    "Show compassion to everyone on earth, and the One above the heavens will show compassion to you.",
                    "Sunan Abi Dawud 4941",
                    "Compassion is the clearest reflection of living wisdom."
                )
            )
        )
    )

    val quizQuestions: List<QuizQuestion> = listOf(
        QuizQuestion(
            id = "q1",
            topic = "Quran",
            question = "Which chapter is known as 'The Opening' and is recited in every daily prayer?",
            options = listOf("Pure Sincerity (Ch. 112)", "The Opening (Ch. 1)", "The Declining Day (Ch. 103)", "Mankind (Ch. 114)"),
            correctIndex = 1,
            explanation = "Chapter 1, 'The Opening', begins the Quran and summarizes praise, devotion, and a daily plea for guidance."
        ),
        QuizQuestion(
            id = "q2",
            topic = "Hadith",
            question = "According to the well-known teaching in Sahih al-Bukhari 1, how are all actions judged?",
            options = listOf("By public praise", "Only by their sincere intentions", "By how quickly they finish", "By wealth spent"),
            correctIndex = 1,
            explanation = "Narrated by Umar ibn al-Khattab, this foundational teaching reminds us that sincere intention gives every deed its true worth."
        ),
        QuizQuestion(
            id = "q3",
            topic = "Dua",
            question = "Which concise Quranic prayer is especially recommended before studying or learning?",
            featuredQuote = "“My Lord, increase me in beneficial knowledge.”",
            options = listOf("Quran 20:114", "Quran 108:1", "Quran 113:1", "Quran 106:4"),
            correctIndex = 0,
            explanation = "Chapter 20, verse 114 teaches believers to ask continually for growth in beneficial knowledge."
        ),
        QuizQuestion(
            id = "q4",
            topic = "Hadith",
            question = "In the narration of Uthman ibn Affan, who are described as 'the best among you'?",
            options = listOf(
                "Those who travel the farthest",
                "Those who learn the Quran and teach it to others",
                "Those who speak the loudest",
                "Those who collect the most books"
            ),
            correctIndex = 1,
            explanation = "Learning sacred guidance and generously sharing it with others holds the highest honor (Sahih al-Bukhari 5027)."
        ),
        QuizQuestion(
            id = "q5",
            topic = "Quran",
            question = "Which chapter repeats twice the reassuring promise: 'Truly, alongside hardship comes ease'?",
            featuredQuote = "“For truly, alongside hardship comes ease.”",
            options = listOf("The Night of Decree", "The Relief (Ch. 94)", "Divine Support", "The Daybreak"),
            correctIndex = 1,
            explanation = "Chapter 94 ('The Relief', verses 5–6) assures believers twice that ease accompanies every hardship."
        ),
        QuizQuestion(
            id = "q6",
            topic = "Quran",
            question = "Which celebrated verse of Chapter 2 affirms that neither drowsiness nor sleep ever overtakes God?",
            options = listOf("Chapter 2, Verse 1", "Chapter 2, Verse 183", "The Verse of the Throne (2:255)", "Chapter 2, Verse 282"),
            correctIndex = 2,
            explanation = "The Verse of the Throne (2:255) beautifully describes God's eternal life, knowledge, and tireless care over the heavens and earth."
        ),
        QuizQuestion(
            id = "q7",
            topic = "Hadith",
            question = "According to Prophetic wisdom narrated by Aisha, which deeds are most beloved to God?",
            options = listOf(
                "Deeds done only once a year",
                "Deeds performed only in large crowds",
                "Those practiced most consistently, even if small",
                "Only lengthy deeds"
            ),
            correctIndex = 2,
            explanation = "Steady, sustainable daily habits are cherished most because they nurture lasting growth."
        ),
        QuizQuestion(
            id = "q8",
            topic = "Quran",
            question = "In Chapter 103 ('The Declining Day'), what are the four qualities of those who truly succeed?",
            options = listOf(
                "Wealth, fame, speed, and power",
                "Faith, righteous deeds, encouraging truth, and encouraging patience",
                "Silence, isolation, travel, and debate",
                "Poetry, trade, architecture, and astronomy"
            ),
            correctIndex = 1,
            explanation = "Chapter 103 outlines faith, righteous action, mutual counsel in truth, and mutual counsel in patience."
        ),
        QuizQuestion(
            id = "q9",
            topic = "Hadith",
            question = "How does the Hadith in Sahih al-Bukhari 6114 define a truly strong person?",
            options = listOf(
                "One who wins every argument",
                "One who stays calm and controls themselves in anger",
                "One who never asks for help",
                "One who speaks the fastest"
            ),
            correctIndex = 1,
            explanation = "Inner strength is demonstrated through composure, patience, and self-mastery during moments of anger."
        ),
        QuizQuestion(
            id = "q10",
            topic = "Quran",
            question = "Which chapter is treasured as equivalent in meaning to one-third of the Quran?",
            options = listOf("Pure Sincerity (Ch. 112)", "The Abundance (Ch. 108)", "The Daybreak (Ch. 113)", "Gratitude for Security (Ch. 106)"),
            correctIndex = 0,
            explanation = "Chapter 112 ('Pure Sincerity') concisely expresses the absolute Oneness and perfection of God."
        )
    )
}
