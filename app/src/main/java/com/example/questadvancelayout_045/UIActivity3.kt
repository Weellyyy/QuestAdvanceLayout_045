package com.example.questadvancelayout_045

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UIKetiga(modifier: Modifier) {
    Column (
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(R.color.black))
            .padding(horizontal = 24.dp, vertical = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        val gambar = painterResource(R.drawable.emyukk)
        Image(
            painter = gambar,
            contentDescription = "EMYUUU",
            modifier = modifier
                .size(110.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Row (
            modifier= Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
            val iconspacing = 16.dp
            Image(
                painter = painterResource(R.drawable.fb),
                contentDescription = null,
                modifier= Modifier
                    .size(30.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(iconspacing))
            Image(
                painter = painterResource(R.drawable.ig),
                contentDescription = null,
                modifier = Modifier
                    .size(30.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(iconspacing))
            Image(
                painter = painterResource(R.drawable.x),
                contentDescription = null,
                modifier = Modifier
                    .size(30.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(iconspacing))
            Image(
                painter = painterResource(R.drawable.tt),
                contentDescription = null,
                modifier = Modifier
                    .size(30.dp)
                    .clip(CircleShape)
            )
        }
        Text(
            text = stringResource(R.string.tim),
            color = colorResource(R.color.white),
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.akun),
            color = colorResource(R.color.white),
            fontSize = 20.sp
        )
        Text(
            text = stringResource(R.string.kocak),
            color = colorResource(R.color.white),
            fontSize = 20.sp,
            textAlign = TextAlign.Center
        )

    }

}
