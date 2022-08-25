package com.iamageo.multifablibrary

import androidx.compose.material.MaterialTheme
import androidx.compose.material.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

interface FabOption {
    val iconTint: Color

    val backgroundTint: Color

    val showLabels: Boolean
}

private class FabOptionImpl(
    override val iconTint: Color,
    override val backgroundTint: Color,
    override val showLabels: Boolean
) : FabOption

@Composable
fun FabOption(
    backgroundTint: Color = MaterialTheme.colors.secondary,
    iconTint: Color = contentColorFor(backgroundTint),
    showLabels: Boolean = false
): FabOption =
    FabOptionImpl(iconTint = iconTint, backgroundTint = backgroundTint, showLabels = showLabels)