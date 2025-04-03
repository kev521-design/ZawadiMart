package com.Kevin.zawadimart.ui.theme.screens.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.Kevin.zawadimart.R
import com.Kevin.zawadimart.ui.theme.neworange


@Composable
fun StartScreen(){

Column (
    modifier = Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center,
) {
    Text(text = "Zawadimart")


    Spacer(modifier = Modifier.height(20.dp))

    //Circular image
    Image(
        painter = painterResource(R.drawable.kitenge),
        contentDescription = "",
        modifier = Modifier.size(300.dp).clip(shape = CircleShape),
        contentScale = ContentScale.Crop

    )


    Spacer(modifier = Modifier.height(20.dp))


    Text(
        text = "Find your order!!",
        fontSize = 30.sp,
        fontWeight = FontWeight.ExtraBold,
        color = neworange
    )

    Spacer(modifier = Modifier.height(20.dp))

    Text(
        text = "Buy women's clothing online at best prices from Jumia Kenya. Discover our collection of the best women dresses, skirts, shoes, top for the fashionistas.",
        fontSize = 18.sp,
        textAlign = TextAlign.Center,
    )

    Spacer(modifier = Modifier.height(20.dp))

    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(neworange),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
    ) {
        Text(text = "Get started")
    }
  }

}





@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){

    StartScreen()


}