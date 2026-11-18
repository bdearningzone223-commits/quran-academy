package com.example.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.automirrored.rounded.ArrowForward
import androidx.compose.material.icons.automirrored.rounded.VolumeUp
import androidx.compose.material.icons.outlined.BookmarkBorder
import androidx.compose.material.icons.rounded.Bookmark
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material.icons.rounded.Stop
import androidx.compose.material.icons.rounded.TextDecrease
import androidx.compose.material.icons.rounded.TextIncrease
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.R
import com.example.data.Ayah
import com.example.data.QuranData
import com.example.data.Surah
import com.example.data.UserProgress
import com.example.ui.components.EditorialQuoteText
import com.example.ui.components.OpeningInvocationBanner
import com.example.ui.components.OrnamentalDivider
import com.example.ui.components.RubElHizbBadge
import com.example.ui.components.ShareUtils

private enum class ChapterFilter(val label: String) {
    ALL("All Chapters"),
    COMPLETE("Complete"),
    STUDIED("Studied"),
    BOOKMARKED("Bookmarked")
}

@Composable
fun QuranListScreen(
    userProgress: UserProgress,
    onSelectSurah: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    var searchQuery by remember { mutableStateOf("") }
    var selectedFilter by remember { mutableStateOf(ChapterFilter.ALL) }

    val filteredSurahs = remember(searchQuery, selectedFilter, userProgress) {
        QuranData.surahs.filter { surah ->
            val matchesQuery = searchQuery.isBlank() ||
                surah.englishTitle.contains(searchQuery, ignoreCase = true) ||
                surah.classicName.contains(searchQuery, ignoreCase = true) ||
                surah.introduction.contains(searchQuery, ignoreCase = true) ||
                surah.number.toString() == searchQuery.trim()
            val matchesFilter = when (selectedFilter) {
                ChapterFilter.ALL -> true
                ChapterFilter.COMPLETE -> surah.isCompleteInApp
                ChapterFilter.STUDIED -> surah.number in userProgress.studiedSurahNumbers
                ChapterFilter.BOOKMARKED -> userProgress.bookmarkedAyahKeys.any {
                    it.startsWith("${surah.number}:")
                }
            }
            matchesQuery && matchesFilter
        }
    }

    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .widthIn(max = 720.dp),
            contentPadding = PaddingValues(horizontal = 18.dp, vertical = 10.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            item {
                Text(
                    text = "Read essential chapters in clear English with concise reflection notes and audio playback.",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }

            item {
                OutlinedTextField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .testTag("quran_search_input"),
                    placeholder = { Text(stringResource(R.string.search_surahs)) },
                    leadingIcon = { Icon(Icons.Rounded.Search, contentDescription = null) },
                    trailingIcon = {
                        if (searchQuery.isNotEmpty()) {
                            IconButton(onClick = { searchQuery = "" }) {
                                Icon(Icons.Rounded.Close, contentDescription = "Clear search")
                            }
                        }
                    },
                    singleLine = true,
                    shape = MaterialTheme.shapes.medium,
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = MaterialTheme.colorScheme.surface,
                        unfocusedContainerColor = MaterialTheme.colorScheme.surface
                    )
                )
            }

            item {
                LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    items(ChapterFilter.entries) { filter ->
                        FilterChip(
                            selected = selectedFilter == filter,
                            onClick = { selectedFilter = filter },
                            label = { Text(filter.label) },
                            colors = FilterChipDefaults.filterChipColors(
                                selectedContainerColor = MaterialTheme.colorScheme.primary,
                                selectedLabelColor = MaterialTheme.colorScheme.onPrimary
                            )
                        )
                    }
                }
            }

            if (filteredSurahs.isEmpty()) {
                item {
                    Surface(
                        modifier = Modifier.fillMaxWidth(),
                        shape = MaterialTheme.shapes.medium,
                        color = MaterialTheme.colorScheme.surfaceContainerLow
                    ) {
                        Column(
                            modifier = Modifier.padding(28.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            Text(
                                text = "No chapters match this filter",
                                style = MaterialTheme.typography.titleMedium,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                            Text(
                                text = "Try clearing your search or bookmarking a verse inside any chapter.",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
            } else {
                items(filteredSurahs, key = { it.number }) { surah ->
                    val isStudied = surah.number in userProgress.studiedSurahNumbers
                    val bookmarkCount = userProgress.bookmarkedAyahKeys.count {
                        it.startsWith("${surah.number}:")
                    }
                    SurahListCard(
                        surah = surah,
                        isStudied = isStudied,
                        bookmarkCount = bookmarkCount,
                        onClick = { onSelectSurah(surah.number) }
                    )
                }
            }

            item { Spacer(modifier = Modifier.height(16.dp)) }
        }
    }
}

@Composable
private fun SurahListCard(
    surah: Surah,
    isStudied: Boolean,
    bookmarkCount: Int,
    onClick: () -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .clip(MaterialTheme.shapes.medium)
            .clickable(onClick = onClick)
            .testTag("surah_card_${surah.number}"),
        shape = MaterialTheme.shapes.medium,
        color = MaterialTheme.colorScheme.surface,
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 14.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.weight(1f)
            ) {
                RubElHizbBadge(numberText = "${surah.number}", size = 44.dp)
                Spacer(modifier = Modifier.width(14.dp))
                Column(verticalArrangement = Arrangement.spacedBy(3.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = surah.englishTitle,
                            style = MaterialTheme.typography.titleMedium,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        if (isStudied) {
                            Spacer(modifier = Modifier.width(6.dp))
                            Icon(
                                imageVector = Icons.Rounded.CheckCircle,
                                contentDescription = "Studied",
                                tint = MaterialTheme.colorScheme.primary,
                                modifier = Modifier.size(16.dp)
                            )
                        }
                    }
                    Text(
                        text = surah.classicName,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "${surah.revelationType.label} • ${surah.ayahs.size} verses",
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.tertiary
                        )
                        if (bookmarkCount > 0) {
                            Text(
                                text = "• $bookmarkCount saved",
                                style = MaterialTheme.typography.labelSmall,
                                color = MaterialTheme.colorScheme.primary
                            )
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            Icon(
                imageVector = Icons.AutoMirrored.Rounded.ArrowForward,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.size(18.dp)
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SurahDetailScreen(
    surahNumber: Int,
    userProgress: UserProgress,
    speakingId: String?,
    onBack: () -> Unit,
    onToggleAyahBookmark: (Int, Int) -> Unit,
    onToggleSurahStudied: (Int) -> Unit,
    onAdjustReadingFont: (Float) -> Unit,
    onToggleStudyNotes: () -> Unit,
    onSpeakAyah: (String, String) -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val surah = remember(surahNumber) { QuranData.getSurahByNumber(surahNumber) }
    val isStudied = surah.number in userProgress.studiedSurahNumbers

    Column(modifier = modifier.fillMaxSize()) {
        TopAppBar(
            title = {
                Column {
                    Text(
                        text = surah.englishTitle,
                        style = MaterialTheme.typography.titleLarge,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        text = "${surah.classicName} • ${surah.revelationType.label}",
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            },
            navigationIcon = {
                IconButton(
                    onClick = onBack,
                    modifier = Modifier.testTag("surah_detail_back_button")
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Rounded.ArrowBack,
                        contentDescription = stringResource(R.string.cd_back)
                    )
                }
            },
            actions = {
                IconButton(
                    onClick = { onAdjustReadingFont(-1.5f) },
                    modifier = Modifier.testTag("decrease_font_button")
                ) {
                    Icon(
                        imageVector = Icons.Rounded.TextDecrease,
                        contentDescription = stringResource(R.string.cd_decrease_font)
                    )
                }
                IconButton(
                    onClick = { onAdjustReadingFont(1.5f) },
                    modifier = Modifier.testTag("increase_font_button")
                ) {
                    Icon(
                        imageVector = Icons.Rounded.TextIncrease,
                        contentDescription = stringResource(R.string.cd_increase_font)
                    )
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.background
            )
        )

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.TopCenter
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .widthIn(max = 720.dp),
                contentPadding = PaddingValues(horizontal = 18.dp, vertical = 10.dp),
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                item {
                    Surface(
                        modifier = Modifier.fillMaxWidth(),
                        shape = MaterialTheme.shapes.large,
                        color = MaterialTheme.colorScheme.surface,
                        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant)
                    ) {
                        Column(
                            modifier = Modifier.padding(18.dp),
                            verticalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Surface(
                                    shape = RoundedCornerShape(50),
                                    color = MaterialTheme.colorScheme.tertiaryContainer
                                ) {
                                    Text(
                                        text = "Chapter ${surah.number}",
                                        style = MaterialTheme.typography.labelMedium,
                                        color = MaterialTheme.colorScheme.onTertiaryContainer,
                                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp)
                                    )
                                }
                                Text(
                                    text = "${surah.ayahs.size} verses",
                                    style = MaterialTheme.typography.labelMedium,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }
                            Text(
                                text = surah.introduction,
                                style = MaterialTheme.typography.bodyMedium,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                FilterChip(
                                    selected = userProgress.showStudyNotes,
                                    onClick = onToggleStudyNotes,
                                    label = { Text("Study Notes") },
                                    modifier = Modifier.testTag("toggle_study_notes_chip")
                                )
                                FilterChip(
                                    selected = isStudied,
                                    onClick = { onToggleSurahStudied(surah.number) },
                                    label = { Text(if (isStudied) "Studied" else "Mark Studied") },
                                    leadingIcon = {
                                        Icon(
                                            imageVector = Icons.Rounded.CheckCircle,
                                            contentDescription = null,
                                            modifier = Modifier.size(16.dp)
                                        )
                                    },
                                    modifier = Modifier.testTag("toggle_surah_studied_chip")
                                )
                            }
                        }
                    }
                }

                if (surah.showOpeningInvocation) {
                    item { OpeningInvocationBanner() }
                }

                items(surah.ayahs, key = { "${surah.number}:${it.numberInSurah}" }) { ayah ->
                    val ayahKey = "${surah.number}:${ayah.numberInSurah}"
                    val isBookmarked = ayahKey in userProgress.bookmarkedAyahKeys
                    val speechKey = "ayah_$ayahKey"
                    val isSpeaking = speakingId == speechKey

                    AyahCard(
                        surah = surah,
                        ayah = ayah,
                        readingFontSizeSp = userProgress.readingFontSizeSp,
                        showStudyNotes = userProgress.showStudyNotes,
                        isBookmarked = isBookmarked,
                        isSpeaking = isSpeaking,
                        onToggleBookmark = { onToggleAyahBookmark(surah.number, ayah.numberInSurah) },
                        onListen = {
                            onSpeakAyah(
                                speechKey,
                                "${surah.englishTitle}, verse ${ayah.numberInSurah}. ${ayah.text}"
                            )
                        },
                        onShare = {
                            ShareUtils.shareText(
                                context,
                                "${surah.englishTitle} (${surah.number}:${ayah.numberInSurah})",
                                "\"${ayah.text}\"\n\nReflection: ${ayah.studyNote}\n— Quran ${surah.number}:${ayah.numberInSurah}"
                            )
                        }
                    )
                }

                item { Spacer(modifier = Modifier.height(24.dp)) }
            }
        }
    }
}

@Composable
private fun AyahCard(
    surah: Surah,
    ayah: Ayah,
    readingFontSizeSp: Float,
    showStudyNotes: Boolean,
    isBookmarked: Boolean,
    isSpeaking: Boolean,
    onToggleBookmark: () -> Unit,
    onListen: () -> Unit,
    onShare: () -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .testTag("ayah_card_${surah.number}_${ayah.numberInSurah}"),
        shape = MaterialTheme.shapes.medium,
        color = MaterialTheme.colorScheme.surface,
        border = BorderStroke(
            width = if (isBookmarked) 1.5.dp else 1.dp,
            color = if (isBookmarked) MaterialTheme.colorScheme.tertiary else MaterialTheme.colorScheme.outlineVariant
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    RubElHizbBadge(
                        numberText = "${ayah.numberInSurah}",
                        size = 36.dp
                    )
                    Text(
                        text = "Verse ${ayah.numberInSurah}",
                        style = MaterialTheme.typography.labelLarge,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    IconButton(onClick = onListen) {
                        Icon(
                            imageVector = if (isSpeaking) Icons.Rounded.Stop else Icons.AutoMirrored.Rounded.VolumeUp,
                            contentDescription = stringResource(
                                if (isSpeaking) R.string.cd_stop_audio else R.string.cd_listen
                            ),
                            tint = if (isSpeaking) MaterialTheme.colorScheme.tertiary else MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                    IconButton(onClick = onToggleBookmark) {
                        Icon(
                            imageVector = if (isBookmarked) Icons.Rounded.Bookmark else Icons.Outlined.BookmarkBorder,
                            contentDescription = stringResource(R.string.cd_bookmark),
                            tint = if (isBookmarked) MaterialTheme.colorScheme.tertiary else MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                    IconButton(onClick = onShare) {
                        Icon(
                            imageVector = Icons.Rounded.Share,
                            contentDescription = stringResource(R.string.cd_share),
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }

            EditorialQuoteText(
                text = ayah.text,
                fontSize = readingFontSizeSp.sp,
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier.fillMaxWidth()
            )

            if (showStudyNotes) {
                OrnamentalDivider()
                Surface(
                    shape = MaterialTheme.shapes.small,
                    color = MaterialTheme.colorScheme.surfaceContainerLow
                ) {
                    Text(
                        text = ayah.studyNote,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 14.dp, vertical = 10.dp)
                    )
                }
            }
        }
    }
}
