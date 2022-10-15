package ai.cloudcnctr.platformone.presentation.ui

import ai.cloudcnctr.platformone.presentation.ui.theme.DeepBlue
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

/**
 * Created by Das on 2022-10-15.
 */
@Composable
fun TabFourScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(DeepBlue),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Weather",
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
    }
}

@Composable
@Preview
fun TabFourScreenPreview() {
    TabFourScreen()
}
