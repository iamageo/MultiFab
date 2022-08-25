package com.iamageo.multifablibrary

import androidx.annotation.DrawableRes

interface FabIcon {
    val iconRes: Int
    val iconResAfterRotate: Int
    val iconRotate: Float?
}

private class FabIconImpl(
    override val iconRes: Int,
    override val iconResAfterRotate: Int,
    override val iconRotate: Float?
) : FabIcon

fun FabIcon(@DrawableRes iconRes: Int,@DrawableRes iconResAfterRotate: Int, iconRotate: Float? = null): FabIcon =
    FabIconImpl(iconRes = iconRes, iconResAfterRotate = iconResAfterRotate, iconRotate = iconRotate)