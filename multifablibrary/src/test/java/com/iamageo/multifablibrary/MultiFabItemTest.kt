package com.iamageo.multifablibrary

import androidx.compose.ui.graphics.Color
import junit.framework.TestCase.assertEquals
import org.junit.Test

class MultiFabItemTest {

    @Test
    fun `MultiFabItem holds data correctly`() {
        val iconRes = 123
        val label = "Teste"
        val color = Color.Red

        val item = MultiFabItem(
            icon = iconRes,
            label = label,
            labelColor = color
        )

        assertEquals(iconRes, item.icon)
        assertEquals(label, item.label)
        assertEquals(color, item.labelColor)
    }

}