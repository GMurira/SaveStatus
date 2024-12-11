package com.example.lightsaver.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lightsaver.data.DataSource
import com.example.lightsaver.data.Status

/**
 * This is the main application screen that displays the Wa status
 */

@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        val layoutDesign = LocalLayoutDirection.current
        Surface (modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(
                start = WindowInsets.safeDrawing.asPaddingValues()
                    .calculateStartPadding(layoutDesign),
                end = WindowInsets.safeDrawing.asPaddingValues()
                    .calculateEndPadding(layoutDesign)
            ),
            )
        {
            StatusList(statusList = DataSource().loadStatus())
        }
    }
}
/**
 * A list that displays the Status instance
 */
@Composable
fun StatusList(
    statusList: List<Status>,
    modifier: Modifier = Modifier
){
    LazyColumn(modifier = modifier) {
        items(statusList){ status ->
            StatusCard(
                status = status,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreePreview(){
    HomeScreen()
}
