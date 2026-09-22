package dev.makethiswork.mobilelearningappui.components

import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.FilterAlt
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
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
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
    buttonSize: Dp = 48.dp,
    iconSize: Dp = 24.dp,
    imageVector: ImageVector = Icons.Outlined.FilterAlt,
    contentDescription: String? = null,
    iconShape: Shape = CircleShape,
    borderWidth: Dp = Dp.Hairline,
    borderColor: Color = MaterialTheme.colorScheme.outlineVariant,
    backgroundColor: Color = MaterialTheme.colorScheme.surface
) {
    IconButton(
        modifier = modifier
            .size(size = buttonSize)
            .clip(iconShape)
            .background(
                color = backgroundColor,
                shape = iconShape
            )
            .border(
                border = BorderStroke(
                    width = borderWidth,
                    color = borderColor
                ),
                shape = iconShape
            )
           ,
        onClick = onClick,
        shape = iconShape,
        enabled = isEnabled
    ) {
        Icon(
            modifier = Modifier.size(iconSize),
            imageVector = imageVector,
            contentDescription = contentDescription
        )
    }
}

@Preview(name = "Default", showBackground = true)
@Composable
private fun ChipIconItemDefaultPreview() {
    MobileLearningAppUiTheme(dynamicColor = false) {
        Surface {
            ChipIconItem(
                onClick = { },
                contentDescription = "Filter"
            )
        }
    }
}

@Preview(name = "Disabled", showBackground = true)
@Composable
private fun ChipIconItemDisabledPreview() {
    MobileLearningAppUiTheme(dynamicColor = false) {
        Surface {
            ChipIconItem(
                onClick = { },
                isEnabled = false,
                contentDescription = "Filter (disabled)"
            )
        }
    }
}

@Preview(name = "Rounded square", showBackground = true)
@Composable
private fun ChipIconItemRoundedSquarePreview() {
    MobileLearningAppUiTheme(dynamicColor = false) {
        Surface {
            ChipIconItem(
                onClick = { },
                imageVector = Icons.Outlined.Search,
                iconShape = RoundedCornerShape(12.dp),
                contentDescription = "Search"
            )
        }
    }
}

@Preview(name = "Custom size & color", showBackground = true)
@Composable
private fun ChipIconItemCustomPreview() {
    MobileLearningAppUiTheme(dynamicColor = false) {
        Surface {
            ChipIconItem(
                onClick = { },
                buttonSize = 64.dp,
                iconSize = 32.dp,
                borderWidth = 2.dp,
                borderColor = MaterialTheme.colorScheme.primary,
                backgroundColor = MaterialTheme.colorScheme.primaryContainer,
                imageVector = Icons.Outlined.FavoriteBorder,
                contentDescription = "Favorite"
            )
        }
    }
}

@Preview(
    name = "Dark theme",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
private fun ChipIconItemDarkPreview() {
    MobileLearningAppUiTheme(darkTheme = true, dynamicColor = false) {
        Surface {
            Row(
                modifier = Modifier.padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                ChipIconItem(onClick = { }, contentDescription = "Filter")
                ChipIconItem(
                    onClick = { },
                    isEnabled = false,
                    contentDescription = "Filter (disabled)"
                )
                ChipIconItem(
                    onClick = { },
                    imageVector = Icons.Outlined.Search,
                    contentDescription = "Search"
                )
            }
        }
    }
}