package com.example.data

data class Ayah(
    val numberInSurah: Int,
    val text: String,
    val studyNote: String
)

enum class RevelationType(val label: String) {
    MECCAN("Meccan Period"),
    MEDINAN("Medinan Period")
}

data class Surah(
    val number: Int,
    val englishTitle: String,
    val classicName: String,
    val revelationType: RevelationType,
    val totalVersesInQuran: Int,
    val isCompleteInApp: Boolean = true,
    val showOpeningInvocation: Boolean = true,
    val introduction: String,
    val ayahs: List<Ayah>
)

enum class HadithCategory(val label: String) {
    ALL("All"),
    FAITH("Faith"),
    CHARACTER("Character"),
    KNOWLEDGE("Knowledge"),
    WORSHIP("Devotion"),
    KINDNESS("Kindness")
}

data class Hadith(
    val id: String,
    val title: String,
    val text: String,
    val narrator: String,
    val source: String,
    val category: HadithCategory,
    val reflection: String
)

enum class DuaCategory(val label: String) {
    ALL("All"),
    MORNING_EVENING("Morning & Evening"),
    PRAYER("Prayer & Mosque"),
    DAILY_LIFE("Daily Life"),
    GUIDANCE("Guidance & Peace"),
    KNOWLEDGE("Knowledge")
}

data class Dua(
    val id: String,
    val title: String,
    val text: String,
    val occasion: String,
    val reference: String,
    val category: DuaCategory,
    val recommendedCount: Int = 1
)

data class StudyConcept(
    val order: Int,
    val title: String,
    val subtitle: String,
    val pillarGroup: String,
    val explanation: String,
    val quranicInsight: String,
    val dailyPractice: String
)

data class LessonExample(
    val quote: String,
    val reference: String,
    val takeaway: String
)

data class StudyLesson(
    val id: String,
    val number: Int,
    val title: String,
    val categoryTag: String,
    val level: String,
    val summary: String,
    val explanation: String,
    val keyPoints: List<String>,
    val examples: List<LessonExample>
)

data class QuizQuestion(
    val id: String,
    val topic: String,
    val question: String,
    val featuredQuote: String? = null,
    val options: List<String>,
    val correctIndex: Int,
    val explanation: String
)

data class UserProgress(
    val lastReadSurahNumber: Int = 1,
    val bookmarkedAyahKeys: Set<String> = emptySet(),
    val bookmarkedHadithIds: Set<String> = emptySet(),
    val bookmarkedDuaIds: Set<String> = emptySet(),
    val studiedSurahNumbers: Set<Int> = emptySet(),
    val completedLessonIds: Set<String> = emptySet(),
    val counterValue: Int = 0,
    val counterTarget: Int = 33,
    val totalRemembranceCount: Int = 0,
    val bestQuizScore: Int = 0,
    val readingFontSizeSp: Float = 18f,
    val showStudyNotes: Boolean = true,
    val isDarkMode: Boolean = false
)
