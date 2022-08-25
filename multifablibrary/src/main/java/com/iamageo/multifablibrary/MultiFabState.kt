package com.iamageo.multifablibrary

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

sealed class MultiFabState {

    object Collapsed : MultiFabState()
    object Expanded : MultiFabState()

    fun toggleValue() = if (isExpanded()) {
        Collapsed
    } else {
        Expanded
    }

    fun isExpanded() = this == Expanded
}

@Composable
fun rememberMultiFabState() = remember { mutableStateOf<MultiFabState>(MultiFabState.Collapsed) }