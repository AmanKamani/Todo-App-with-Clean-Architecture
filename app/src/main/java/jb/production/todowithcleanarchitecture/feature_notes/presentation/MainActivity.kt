package jb.production.todowithcleanarchitecture.feature_notes.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import jb.production.todowithcleanarchitecture.ui.theme.TodoWithCleanArchitectureTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TodoWithCleanArchitectureTheme {
            }
        }
    }
}