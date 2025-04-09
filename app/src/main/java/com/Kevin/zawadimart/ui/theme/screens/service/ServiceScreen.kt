package com.Kevin.zawadimart.ui.theme.screens.service

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
import com.Kevin.zawadimart.ui.theme.neworange
import com.Kevin.zawadimart.ui.theme.newpink


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ServiceScreen(navController: NavHostController) {



    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {
            TopAppBar(
                title = { Text("Contact") },
                navigationIcon = {
                    IconButton(onClick = { /* Handle back/nav */ }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = newpink,
                    titleContentColor = Color.Black,
                    navigationIconContentColor = Color.White
                )
            )
        },//end TopApp bar

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = newpink,
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
            ) {


                //Main Contents of the page

                Spacer(modifier = Modifier.height(20.dp))

                //Searchbar

                var search by remember { mutableStateOf("")}
                OutlinedTextField(
                    value = search,
                    onValueChange = { search = it },
                    modifier = Modifier.fillMaxWidth().padding(start =20.dp, end = 20.dp ),
                    leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "")},
                    placeholder = { Text(text = "Search...")}
                )
                //End of Searchbar


                Spacer(modifier = Modifier.height(20.dp))

                Image(
                    painter = painterResource(R.drawable.pink1),
                    contentDescription = "blouse",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth,

                )
                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = "Services available",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,


                )

                Spacer(modifier = Modifier.height(20.dp))

                //Row
                Row (
                    modifier = Modifier.padding(start = 20.dp)
                )
                {


                    Image(
                        painter = painterResource(R.drawable.pink),
                        contentDescription = "blouse",
                        modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                        contentScale = ContentScale.FillWidth
                    )

                    Spacer(modifier = Modifier.width(40.dp))


                    Column {
                        Text(
                            text = "Ladies outfits",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.ExtraBold,
                        )
                        Text(
                            text = "Ksh 6000",
                            fontSize = 15.sp,
                            textDecoration = TextDecoration.LineThrough,
                        )
                        Text(
                            text = "Price : 6000",
                            fontSize = 15.sp,

                            )
                        Row {
                            Icon(
                                imageVector = Icons.Default.Star, contentDescription = "",
                                tint = newpink
                            )

                            Icon(
                                imageVector = Icons.Default.Star, contentDescription = "",
                                tint = newpink
                            )
                            Icon(
                                imageVector = Icons.Default.Star, contentDescription = "",
                                tint = newpink
                            )
                            Icon(
                                imageVector = Icons.Default.Star, contentDescription = "",
                                tint = newpink
                            )
                            Icon(
                                imageVector = Icons.Default.Star, contentDescription = "",
                                tint = newpink
                            )
                        }


                        Button(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(neworange),
                            shape = RoundedCornerShape(10.dp),

                            ) {
                            Text(text = "Contact us")
                        }
                    }
                }
                //End of row











            }//end of content




        }
    )

    //End of scaffold








}





@Preview(showBackground = true)
@Composable
fun ServiceScreenPreview(){


    ServiceScreen(rememberNavController())


}