package com.Kevin.zawadimart.ui.theme.screens.form1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.Kevin.zawadimart.R
import com.Kevin.zawadimart.ui.theme.newblack
import com.Kevin.zawadimart.ui.theme.newblue
import com.Kevin.zawadimart.ui.theme.newgrey
import com.Kevin.zawadimart.ui.theme.neworange
import com.Kevin.zawadimart.ui.theme.newpink
import com.Kevin.zawadimart.ui.theme.newwhite


@Composable
fun Form1Screen(navController: NavHostController) {


Column (
   modifier = Modifier
       .fillMaxSize()
       .verticalScroll(rememberScrollState())
){



    //Card
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp),

        shape = RoundedCornerShape(bottomStart = 40.dp,  bottomEnd = 60.dp),
        colors = CardDefaults.cardColors(newblue),


        ) {

        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center){

         Row {
             Image(
                 painter = painterResource(R.drawable.shopping),
                 contentDescription = "",
                 modifier = Modifier
                     .size(100.dp)
                     .padding(start = 50.dp)
             )

             Text(
                 text = "Logo App",
                 color = newwhite,
                 fontSize = 30.sp,
                 modifier = Modifier.padding(start = 10.dp, top = 35.dp)
             )
         }


            Image(
                painter = painterResource(R.drawable.img_6),
                contentDescription = "",
                modifier = Modifier
                    .size(200.dp)
                    .padding(start = 5.dp, top = 30.dp)
            )


        }


    }


            Text(text = "The most worthy",
                fontSize = 30.sp,
                color = newblack,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 70.dp, top = 50.dp)
                )


            Text(text = " Grocery App",
                fontSize = 30.sp,
                color = newblack,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 80.dp)
                )

            Spacer(modifier = Modifier.height(10.dp))

            //variables
            var username by remember { mutableStateOf("") }
            var password by remember { mutableStateOf("") }
            //endvariables


            //username
            TextField(
                value = username,
                onValueChange = { username = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),

                label = { Text(
                    text = "Username",
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(start = 120.dp),

                )},

                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

            )
            //end
            Spacer(modifier = Modifier.height(10.dp))

            //password
            TextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),

                label = { Text(
                    text = "Password",
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(start = 120.dp)
                )},

                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

            )
            //end
            Spacer(modifier = Modifier.height(10.dp))


            Button(
                onClick = {
                },
                colors = ButtonDefaults.buttonColors(neworange),
                shape = RoundedCornerShape(30.dp),
                modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            ) {
                Text(
                    text = "REGISTER",
                    fontWeight = FontWeight.ExtraBold,
                )
            }

            Spacer(modifier = Modifier.height(60.dp))

            Text(text = "Already Are members? Log in",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center

                )









}


}





@Preview(showBackground = true)
@Composable
fun Form1ScreenPreview(){


    Form1Screen(rememberNavController())


}