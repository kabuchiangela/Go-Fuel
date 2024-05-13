package net.ezra.ui.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_HOME

import net.ezra.R
import net.ezra.navigation.ROUTE_ACCOUNT
import net.ezra.navigation.ROUTE_CARD

@Composable
fun CardScreen(navController: NavHostController) {
   Column(

       modifier = Modifier
           .fillMaxSize()
   ) {
       Box (
           modifier = Modifier
               .fillMaxSize()


       ) {
           Image(painter = painterResource(id = R.drawable.black),
                modifier = Modifier
                    .fillMaxSize()

               ,
               contentScale = ContentScale.Crop,
               contentDescription = "",

               )
           Column {
               Row(
                   modifier = Modifier
                       .fillMaxWidth()
                       .height(40.dp)
                       .padding(9.dp)
                       .clickable {
                           navController.navigate(ROUTE_CARD) {
                               popUpTo(ROUTE_HOME) { inclusive = true }
                           }
                       }
               ) {
                   Spacer(modifier = Modifier.width(7.dp))

                   Icon(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = ""

                   )

                   Spacer(modifier = Modifier.width(15.dp))


               }

               
               Spacer(modifier = Modifier.height(30.dp))

               Row {
                   Text(text = "Explore",
                       fontSize = 40.sp,
                       color = Color.White




                   )

               }
               Row {
                   Text(text = "Your",
                       fontSize = 40.sp,
                       color = Color.White
                   )

               }
               Row {
                   Text(text = "Get Oil Card",
                       fontSize = 40.sp,
                       color = Color.White
                   )

               }
               Spacer(modifier = Modifier.height(20.dp))
               Row {
                   Text(text = "Get access to additional features once you link your Get Oil Card",

                       fontSize = 22.sp,
                       color = Color.White
                       
                       )

               }
               Spacer(modifier = Modifier.height(400.dp))


              Row {

                  Button(onClick = {},
                      //colors = ButtonDefaults.buttonColors(backgroundColor = Color.DarkGray),
                      shape = RoundedCornerShape(10.dp)) {
                      Text(text = "Link Card")
                  }
                  Spacer(modifier = Modifier.width(120.dp))

                  Button(onClick = {},
                     // colors = ButtonDefaults.buttonColors(backgroundColor = Color.DarkGray),
                      shape = RoundedCornerShape(10.dp)) {
                      Text(text = "Apply Now")
                  }

                      

              }
               


           }
       }


   }







}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    CardScreen(rememberNavController())
}

