package com.iamageo.multifablibrary

import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test
import kotlin.test.assertSame

class MultiFabStateTest {

    @Test
    fun `Collapsed is not expanded`() {
        val state: MultiFabState = MultiFabState.Collapsed

        assertFalse(state.isExpanded())
    }

    @Test
    fun `Expanded is expanded`() {
        val state: MultiFabState = MultiFabState.Expanded

        assertTrue(state.isExpanded())
    }

    @Test
    fun `toggleValue from Collapsed goes to Expanded`() {
        val initial: MultiFabState = MultiFabState.Collapsed

        val result = initial.toggleValue()

        assertTrue(result is MultiFabState.Expanded)
    }

    @Test
    fun `toggleValue from Expanded goes to Collapsed`() {
        val initial: MultiFabState = MultiFabState.Expanded

        val result = initial.toggleValue()

        assertTrue(result is MultiFabState.Collapsed)
    }

    @Test
    fun `toggleValue twice returns original state`() {
        val initial: MultiFabState = MultiFabState.Collapsed

        val result = initial.toggleValue().toggleValue()

        assertSame(initial, result)
    }

}