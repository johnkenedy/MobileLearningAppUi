package dev.makethiswork.mobilelearningappui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FilterAlt
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.makethiswork.mobilelearningappui.ui.theme.MobileLearningAppUiTheme

@Composable
fun ChipIconItem(
    onClickItem: () -> Unit,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
    iconSize: Dp = 40.dp,
    imageVector: ImageVector = Icons.Outlined.FilterAlt,
    contentDescription: String? = null,
    iconShape: Shape = CircleShape,
    borderWidth: Dp = Dp.Hairline,
    borderColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f),
    backgroundColor: Color = MaterialTheme.colorScheme.surface
) {
    IconButton(
        modifier = modifier
            .clip(iconShape)
            .border(
                border = BorderStroke(
                    width = borderWidth,
                    color = borderColor
                )
            )
            .background(color = backgroundColor)
            .size(size = iconSize),
        onClick = onClickItem,
        shape = iconShape,
        enabled = isEnabled
    ) {
        Icon(
            imageVector = imageVector,
            contentDescription = contentDescription
        )
    }
}

@Preview
@Composable
private fun ChipIconItemPreview() {
    MobileLearningAppUiTheme {
        ChipIconItem(
            onClickItem = { }
        )
    }
}