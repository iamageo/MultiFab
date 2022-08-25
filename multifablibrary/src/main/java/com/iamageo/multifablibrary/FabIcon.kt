package com.iamageo.multifablibrary

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable

@Immutable
interface FabIcon {

    @Stable
    val iconRes: Int

    @Stable
    val iconResAfterRotate: Int

    @Stable
    val iconRotate: Float?
}

private class FabIconImpl(
    override val iconRes: Int,
    override val iconResAfterRotate: Int,
    override val iconRotate: Float?
) : FabIcon

fun FabIcon(
    @DrawableRes iconRes: Int,
    @DrawableRes iconResAfterRotate: Int,
    iconRotate: Float? = null
): FabIcon =
    FabIconImpl(iconRes = iconRes, iconResAfterRotate = iconResAfterRotate, iconRotate = iconRotate)