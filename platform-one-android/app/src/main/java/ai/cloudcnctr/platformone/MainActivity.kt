package ai.cloudcnctr.platformone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import ai.cloudcnctr.platformone.presentation.Navigator
import ai.cloudcnctr.platformone.presentation.ui.theme.CloudCnctrTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CloudCnctrTheme {
                // TODO-FIXME MainScreen()
                Navigator()
            }
        }
    }
}