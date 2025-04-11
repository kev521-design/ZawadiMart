package com.Kevin.zawadimart.ui.theme.screens.personal

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.Kevin.zawadimart.R
import com.Kevin.zawadimart.navigation.ROUT_HOME
import com.Kevin.zawadimart.ui.theme.newblue
import com.Kevin.zawadimart.ui.theme.newgreen
import com.Kevin.zawadimart.ui.theme.newgrey
import com.Kevin.zawadimart.ui.theme.neworange
import com.Kevin.zawadimart.ui.theme.newpink
import com.Kevin.zawadimart.ui.theme.newwhite


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PersonalScreen(navController: NavHostController) {





    //Scaffold
    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {
        },//end TopApp bar

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = newwhite,
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("Home") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
                    label = { Text("Favorites") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    label = { Text("Profile") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )


                NavigationBarItem(
                    icon = { Icon(Icons.Default.Info, contentDescription = "Info") },
                    label = { Text("Info") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )


            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = newpink,
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
//End of FloatingActionButton


        //Content

        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
            ) {


                //Main Contents of the page

                Spacer(modifier = Modifier.height(40.dp))


     Text(
         text = "Hey Sammantha",
         fontSize = 20.sp,
         fontWeight = FontWeight.ExtraBold,
         modifier = Modifier
             .fillMaxWidth()
             .padding(start = 30.dp)
     )

                Spacer(modifier = Modifier.height(25.dp))

                Text(
                    text = "Here are your projects",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 30.dp)
                )

                Spacer(modifier = Modifier.height(25.dp))


            //ROW
             Row (
                 modifier = Modifier
                     .padding(start = 20.dp)
                     .horizontalScroll(rememberScrollState())

             ){


                 //Card1
                 Card (
                     modifier = Modifier.width(150.dp).height(180.dp)
                 ){

                     Column (
                         modifier = Modifier
                             .fillMaxSize()
                             .background(newblue),

                         horizontalAlignment = Alignment.CenterHorizontally,
                         verticalArrangement = Arrangement.Center,


                     ){
                         Image(
                             painter = painterResource(R.drawable.contact),
                             contentDescription = "blouse",
                             modifier = Modifier.size(50.dp),
                         )

                         Spacer(modifier = Modifier.height(25.dp))

                         Text(
                             text = "Crypto Currency Landing Page",
                             fontSize = 15.sp,
                         )


                     }

                 }
                 //end of card1

                 Spacer(modifier = Modifier.width(25.dp))

                 //Card2
                 Card (
                     modifier = Modifier.width(150.dp).height(180.dp)
                 ){

                     Column (
                         modifier = Modifier
                             .fillMaxSize()
                             .background(neworange),
                         horizontalAlignment = Alignment.CenterHorizontally,
                         verticalArrangement = Arrangement.Center,

                         ){
                         Image(
                             painter = painterResource(R.drawable.contact),
                             contentDescription = "blouse",
                             modifier = Modifier.size(50.dp),
                         )

                         Spacer(modifier = Modifier.height(25.dp))

                         Text(
                             text = "Crypto Currency Landing Page",
                             fontSize = 15.sp,
                         )


                     }

                 }
                 //end of card2


                 Spacer(modifier = Modifier.width(25.dp))

                 //Card3
                 Card (
                     modifier = Modifier.width(150.dp).height(180.dp)
                 ){

                     Column (
                         modifier = Modifier
                             .fillMaxSize()
                             .background(newgreen),
                         horizontalAlignment = Alignment.CenterHorizontally,
                         verticalArrangement = Arrangement.Center,

                         ){
                         Image(
                             painter = painterResource(R.drawable.contact),
                             contentDescription = "blouse",
                             modifier = Modifier.size(50.dp),
                         )

                         Spacer(modifier = Modifier.height(25.dp))

                         Text(
                             text = "Crypto Currency Landing Page",
                             fontSize = 15.sp,
                         )


                     }

                 }
                 //end of card3


             }//end row


                Spacer(modifier = Modifier.height(150.dp))



                //Card
                Card(
                    modifier = Modifier.fillMaxWidth().height(300.dp),
                    colors = CardDefaults.cardColors(newgrey),



                    ) {


                       Card(
                           modifier = Modifier
                               .fillMaxWidth()
                               .padding(start = 30.dp, end = 30.dp, top = 30.dp)
                               .height(70.dp)

                       ) {


                            Row (
                                modifier = Modifier
                                    .background(newwhite)
                            ){

                                Image(
                                    painter = painterResource(R.drawable.video),
                                    contentDescription = "blouse",
                                    modifier = Modifier.size(100.dp),
                                )


                                   Column(

                                   ) {
                                       Text(
                                           text = "NDA review for website project",
                                           fontSize = 15.sp,
                                           modifier = Modifier
                                               .fillMaxWidth()
                                               .padding(start = 15.dp, top = 20.dp)

                                       )


                                       Text(
                                           text = "Tonight ",
                                           fontSize = 15.sp,
                                           modifier = Modifier
                                               .fillMaxWidth()
                                               .padding(start = 20.dp)

                                       )




                                   }


                            }



                       }


                        }


                }//End of Card




            }//end of content






    )

    //End of scaffold












}




@Preview(showBackground = true)
@Composable
fun PersonalScreenPreview(){


    PersonalScreen(rememberNavController())


}