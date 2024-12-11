package com.example.lightsaver.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lightsaver.R
import com.example.lightsaver.data.Status

/**
 * Build a scrollable list to display statuses.
 */

@Composable
fun StatusApp(){}

/**
 * Status is displayed using a card
 */
@Composable
fun StatusCard(
    status: Status,
    modifier: Modifier = Modifier
){
    Card(modifier = modifier) {
        Column {
            Image(
                painter = painterResource(status.imageResourceId),
                contentDescription = stringResource(status.stringResourceId),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Crop
            )
            Row(
                modifier = modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = LocalContext.current.getString(status.stringResourceId),
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.headlineSmall
                )
            }
        }
    }
}
/**
 * Preview the Status Card
 */
@Preview
@Composable
fun StatusCardPreview(){
    StatusCard(status = Status(R.string.status1,R.drawable.icons8_sunny_48))
}