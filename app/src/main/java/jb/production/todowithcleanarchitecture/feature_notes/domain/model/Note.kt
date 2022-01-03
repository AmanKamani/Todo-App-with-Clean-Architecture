package jb.production.todowithcleanarchitecture.feature_notes.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import jb.production.todowithcleanarchitecture.ui.theme.BabyBlue
import jb.production.todowithcleanarchitecture.ui.theme.LightGreen
import jb.production.todowithcleanarchitecture.ui.theme.RedOrange
import jb.production.todowithcleanarchitecture.ui.theme.RedPink
import jb.production.todowithcleanarchitecture.ui.theme.Violet

@Entity(tableName = "NOTE")
data class Note(
    val title: String,
    val description: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}