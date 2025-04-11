package com.Kevin.zawadimart.ui.theme.screens.form1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.Kevin.zawadimart.ui.theme.newblack
import com.Kevin.zawadimart.ui.theme.newpink
import com.Kevin.zawadimart.ui.theme.newwhite


@Composable
fun Form1Screen(navController: NavHostController) {


Column(modifier = Modifier
        .fillMaxSize()
        .height(180.dp)
        .verticalScroll(rememberScrollState())

) {


    //Card
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(500.dp),

        shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
        colors = CardDefaults.cardColors(newblack),


        ) {


        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {

            Text(text = "Welcome to ZawadiMall",
                fontSize = 30.sp,
                color = newwhite,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.ExtraBold,

                )
        }

    }//End of Card


    //Card
    Card(
        modifier = Modifier.fillMaxWidth().height(300.dp),
        shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
        colors = CardDefaults.cardColors(newpink),


        ) {



    }//End of Card



}













}





@Preview(showBackground = true)
@Composable
fun Form1ScreenPreview(){


    Form1Screen(rememberNavController())


}