package com.iamageo.multifablibrary

import junit.framework.TestCase.assertEquals
import org.junit.Test
import kotlin.test.assertNull

class FabIconTest {

    @Test
    fun `FabIcon factory creates instance with correct values`() {
        val iconRes = 1
        val iconResAfterRotate = 2
        val rotate = 45f

        val fabIcon = FabIcon(
            iconRes = iconRes,
            iconResAfterRotate = iconResAfterRotate,
            iconRotate = rotate
        )

        assertEquals(iconRes, fabIcon.iconRes)
        assertEquals(iconResAfterRotate, fabIcon.iconResAfterRotate)
        assertEquals(rotate, fabIcon.iconRotate)
    }

    @Test
    fun `FabIcon factory default rotation is null`() {
        val fabIcon = FabIcon(
            iconRes = 1,
            iconResAfterRotate = 2
        )

        assertNull(fabIcon.iconRotate)
    }

}