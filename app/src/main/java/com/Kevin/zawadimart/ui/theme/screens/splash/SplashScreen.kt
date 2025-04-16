package com.Kevin.zawadimart.ui.theme.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.Kevin.zawadimart.R
import com.Kevin.zawadimart.navigation.ROUTE_LOGIN
import com.Kevin.zawadimart.navigation.ROUT_START
import com.Kevin.zawadimart.ui.theme.newpink
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavHostController) {


     //Navigation

val coroutine = rememberCoroutineScope()
    coroutine.launch {
        delay(2000)
        navController.navigate(ROUTE_LOGIN)
    }
    //end of Navigation



    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(newpink),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {



        Image(
            painter = painterResource(R.drawable.home),
            contentDescription = "blouse",
            modifier = Modifier.size(300.dp)
        )



    }




}


@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){


    SplashScreen(rememberNavController())


}