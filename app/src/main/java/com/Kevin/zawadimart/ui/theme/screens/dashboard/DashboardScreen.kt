package com.Kevin.zawadimart.ui.theme.screens.dashboard

import android.inputmethodservice.Keyboard
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.Kevin.zawadimart.R
import com.Kevin.zawadimart.navigation.ROUT_ABOUT
import com.Kevin.zawadimart.navigation.ROUT_FORM1
import com.Kevin.zawadimart.navigation.ROUT_HOME
import com.Kevin.zawadimart.navigation.ROUT_ITEM
import com.Kevin.zawadimart.ui.theme.newpink
import com.Kevin.zawadimart.ui.theme.newwhite


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavHostController) {

    Column (modifier = Modifier
        .fillMaxSize()
        .background(newpink)
        .verticalScroll(rememberScrollState())
    ){

        Box {

            //Card
            Card(
                modifier = Modifier.fillMaxWidth().height(300.dp),
                shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
                colors = CardDefaults.cardColors(newwhite),


                ) {

                TopAppBar(
                    title = { Text(text = "Dashboard section") },
                    navigationIcon = {
                        IconButton(onClick ={} ) {
                            Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                        }
                    },

                    )

            }//End of Card

            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .align(alignment = Alignment.BottomCenter)
                    .padding(start = 20.dp, end = 20.dp)
                    .offset(y = 90.dp)
            ){


                Column(modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {

                    Text(text = "Welcome to ZawadiMall",
                        fontSize = 30.sp,
                        color = newpink,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.ExtraBold,

                    )
                }



            }


        }
        //End of Box


        Spacer(modifier = Modifier.height(100.dp))


        //Row1
        Row (modifier = Modifier.padding(start = 20.dp)
        ){
            //Card1
            Card (
                modifier = Modifier
                    .width(150.dp)
                    .height(180.dp)
                    .clickable{navController.navigate(ROUT_HOME)}
            ){

        Column (
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Image(
                painter = painterResource(R.drawable.home),
                contentDescription = "blouse",
                modifier = Modifier.size(100.dp),
            )

              Text(text = "Home", fontSize = 15.sp)

            }

            }
            //end of card1

            Spacer(modifier = Modifier.width(20.dp))

            //Card2
            Card (
                modifier = Modifier
                    .width(150.dp).
                    height(180.dp)
                    .clickable{navController.navigate(ROUT_ABOUT)}
            ){

                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.about),
                        contentDescription = "blouse",
                        modifier = Modifier.size(100.dp),
                    )

                    Text(text = "About", fontSize = 15.sp)

                }

            }
            //end of card2

        }

        //End Of Row1


        Spacer(modifier = Modifier.height(30.dp))

        //Row2
        Row (modifier = Modifier.padding(start = 20.dp)
        ){

            //Card1
            Card (
                modifier = Modifier
                    .width(150.dp)
                    .height(180.dp)
                    .clickable{navController.navigate(ROUT_FORM1)}
            ){

                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.contact),
                        contentDescription = "blouse",
                        modifier = Modifier.size(100.dp),
                    )

                    Text(text = "Contact", fontSize = 15.sp)

                }

            }
            //end of card1

            Spacer(modifier = Modifier.width(20.dp))

            //Card2
            Card (
                modifier = Modifier
                    .width(150.dp)
                    .height(180.dp)
                    .clickable{navController.navigate(ROUT_ITEM)}
            ){

                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.products),
                        contentDescription = "blouse",
                        modifier = Modifier.size(100.dp),
                    )

                    Text(text = "Products", fontSize = 15.sp)

                }

            }
            //end of card2

        }

        //End Of Row2





    }

    }












@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){


    DashboardScreen(rememberNavController())


}