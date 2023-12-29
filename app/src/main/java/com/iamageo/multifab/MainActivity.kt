package com.iamageo.multifab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.iamageo.multifab.ui.theme.MultiFabTheme
import com.iamageo.multifablibrary.FabIcon
import com.iamageo.multifablibrary.FabOption
import com.iamageo.multifablibrary.MultiFabItem
import com.iamageo.multifablibrary.MultiFloatingActionButton

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MultiFabTheme {
                Scaffold(
                    backgroundColor = Color.Black,
                    floatingActionButton = {
                        MultiFloatingActionButton(
                            fabIcon = FabIcon(
                                iconRes = R.drawable.ic_baseline_add_24,
                                iconResAfterRotate = R.drawable.ic_baseline_remove_24,
                                iconRotate = 180f
                            ),
                            fabOption = FabOption(
                                iconTint = Color.Blue,
                                showLabels = true,
                                backgroundTint = Color.White,
                            ),
                            itemsMultiFab = listOf(
                                MultiFabItem(
                                    icon = R.drawable.ic_baseline_add_24,
                                    label = "first",
                                    labelColor = Color.White
                                ),
                                MultiFabItem(
                                    icon = R.drawable.ic_baseline_add_24,
                                    label = "second",
                                    labelColor = Color.White
                                ),
                            ),
                            onFabItemClicked = { println(it) },
                            fabTitle = "MultiFloatActionButton",
                            showFabTitle = false
                        )
                    }
                ) { paddingValues ->
                    Column(modifier = Modifier
                        .fillMaxSize().padding(paddingValues),) {}
                }
            }
        }
    }
}