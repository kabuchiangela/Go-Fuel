package net.ezra.ui.account


import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

import net.ezra.navigation.ROUTE_ACCOUNT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_LOGIN


@Composable
fun AccountScreen(navController: NavHostController) {
 LazyColumn (
     modifier = Modifier
         .fillMaxSize()
 ){
     item {

         Row(
             modifier = Modifier
                 .fillMaxWidth()
                 .height(40.dp)
                 .padding(9.dp)
                 .clickable {
                     navController.navigate(ROUTE_HOME) {
                         popUpTo(ROUTE_ACCOUNT) { inclusive = true }
                     }
                 }
         ) {
             Spacer(modifier = Modifier.width(10.dp))

             Icon(imageVector = Icons.Default.ArrowBack, contentDescription = ""

             )

             Spacer(modifier = Modifier.width(15.dp))

             Text(text = "Settings", fontSize = 15.sp, )



         }
         Spacer(modifier = Modifier.height(20.dp))


         Text(text = "Account settings")

     Spacer(modifier = Modifier.height(20.dp))


     Card(
         modifier = Modifier
             .fillMaxWidth()
             .height(60.dp)
             .clickable {   navController.navigate(ROUTE_LOGIN) {
                 popUpTo(ROUTE_ACCOUNT) { inclusive = true }
             }}
     ) {
         Row {
             

             Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "",
             modifier = Modifier
                 .padding(10.dp)
             )

             Spacer(modifier = Modifier.width(20.dp))

             Text(text = "Account information",
                 modifier = Modifier
                     .padding(10.dp)
                 )

             Spacer(modifier = Modifier.width(108.dp))


             Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "",
                 modifier = Modifier
                     .padding(10.dp)
                 )






         }

     }

         Card(
             modifier = Modifier
                 .fillMaxWidth()
                 .height(60.dp)
         ) {
             Row {


                 Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "",
                     modifier = Modifier
                         .padding(10.dp)
                 )

                 Spacer(modifier = Modifier.width(20.dp))

                 Text(text = "Saved payment methods",
                     modifier = Modifier
                         .padding(10.dp)
                 )

                 Spacer(modifier = Modifier.width(84.dp))


                 Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "",
                     modifier = Modifier
                         .padding(10.dp)
                 )






             }

         }

         Spacer(modifier = Modifier.height(40.dp))

         Text(text = "Information Centre",)

         Spacer(modifier = Modifier.height(10.dp))









         Card(
             modifier = Modifier
                 .fillMaxWidth()
                 .height(60.dp)
         ) {
             Row {


                 Icon(imageVector = Icons.Default.Info, contentDescription = "",
                     modifier = Modifier
                         .padding(10.dp)
                 )

                 Spacer(modifier = Modifier.width(20.dp))

                 Text(text = "About Us",
                     modifier = Modifier
                         .padding(10.dp)
                 )

                 Spacer(modifier = Modifier.width(178.dp))


                 Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "",
                     modifier = Modifier
                         .padding(10.dp)
                 )






             }

         }


         Card(
             modifier = Modifier
                 .fillMaxWidth()
                 .height(60.dp)
         ) {
             Row {


                 Icon(imageVector = Icons.Default.Search, contentDescription = "",
                     modifier = Modifier
                         .padding(10.dp)
                 )

                 Spacer(modifier = Modifier.width(20.dp))

                 Text(text = "Frequently Asked Questions",
                     modifier = Modifier
                         .padding(10.dp)
                 )

                 Spacer(modifier = Modifier.width(66.dp))


                 Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "",
                     modifier = Modifier
                         .padding(10.dp)
                 )






             }

         }


         Card(
             modifier = Modifier
                 .fillMaxWidth()
                 .height(60.dp)
         ) {
             Row {


                 Icon(imageVector = Icons.Default.Share, contentDescription = "",
                     modifier = Modifier
                         .padding(10.dp)
                 )

                 Spacer(modifier = Modifier.width(20.dp))

                 Text(text = "Invite your Friend",
                     modifier = Modifier
                         .padding(10.dp)
                 )

                 Spacer(modifier = Modifier.width(132.dp))


                 Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "",
                     modifier = Modifier
                         .padding(10.dp)
                 )






             }

         }

         Spacer(modifier = Modifier.height(40.dp))

         Text(text = "Get in touch",)

         Spacer(modifier = Modifier.height(10.dp))





         Card(
             modifier = Modifier
                 .fillMaxWidth()
                 .height(60.dp)
         ) {
             Row {


                 Icon(imageVector = Icons.Default.Phone, contentDescription = "",
                     modifier = Modifier
                         .padding(10.dp)
                 )

                 Spacer(modifier = Modifier.width(20.dp))

                 Text(text = "Call Us",
                     modifier = Modifier
                         .padding(10.dp)
                 )

                 Spacer(modifier = Modifier.width(192.dp))


                 Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "",
                     modifier = Modifier
                         .padding(10.dp)
                 )






             }

         }


         Card(
             modifier = Modifier
                 .fillMaxWidth()
                 .height(60.dp)
         ) {
             Row {


                 Icon(imageVector = Icons.Default.Email, contentDescription = "",
                     modifier = Modifier
                         .padding(10.dp)
                 )

                 Spacer(modifier = Modifier.width(20.dp))

                 Text(text = "Email",
                     modifier = Modifier
                         .padding(10.dp)
                 )

                 Spacer(modifier = Modifier.width(200.dp))


                 Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "",
                     modifier = Modifier
                         .padding(10.dp)
                 )






             }

         }
         Spacer(modifier = Modifier.height(40.dp))

         Text(text = "Social media",)

         Spacer(modifier = Modifier.height(10.dp))





         Card(
             modifier = Modifier
                 .fillMaxWidth()
                 .height(60.dp)
         ) {
             Row {


                 Icon(imageVector = Icons.Default.Phone, contentDescription = "",
                     modifier = Modifier
                         .padding(10.dp)
                 )

                 Spacer(modifier = Modifier.width(20.dp))

                 Text(text = "Website",
                     modifier = Modifier
                         .padding(10.dp)
                 )

                 Spacer(modifier = Modifier.width(185.dp))


                 Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "",
                     modifier = Modifier
                         .padding(10.dp)
                 )






             }

         }


         Card(
             modifier = Modifier
                 .fillMaxWidth()
                 .height(60.dp)
         ) {
             Row {


                 Icon(imageVector = Icons.Default.Phone, contentDescription = "",
                     modifier = Modifier
                         .padding(10.dp)
                 )

                 Spacer(modifier = Modifier.width(20.dp))

                 Text(text = "Facebook",
                     modifier = Modifier
                         .padding(10.dp)
                 )

                 Spacer(modifier = Modifier.width(174.dp))


                 Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "",
                     modifier = Modifier
                         .padding(10.dp)
                 )






             }

         }


         Card(
             modifier = Modifier
                 .fillMaxWidth()
                 .height(60.dp)
         ) {
             Row {


                 Icon(imageVector = Icons.Default.Phone, contentDescription = "",
                     modifier = Modifier
                         .padding(10.dp)
                 )

                 Spacer(modifier = Modifier.width(20.dp))

                 Text(text = "X",
                     modifier = Modifier
                         .padding(10.dp)
                 )

                 Spacer(modifier = Modifier.width(228.dp))


                 Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "",
                     modifier = Modifier
                         .padding(10.dp)
                 )






             }

         }


         Card(
             modifier = Modifier
                 .fillMaxWidth()
                 .height(60.dp)
         ) {
             Row {


                 Icon(imageVector = Icons.Default.Phone, contentDescription = "",
                     modifier = Modifier
                         .padding(10.dp)
                 )

                 Spacer(modifier = Modifier.width(20.dp))

                 Text(text = "Instagram",
                     modifier = Modifier
                         .padding(10.dp)
                 )

                 Spacer(modifier = Modifier.width(174.dp))


                 Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "",
                     modifier = Modifier
                         .padding(10.dp)
                 )






             }

         }


         Card(
             modifier = Modifier
                 .fillMaxWidth()
                 .height(60.dp)
         ) {
             Row {


                 Icon(imageVector = Icons.Default.Phone, contentDescription = "",
                     modifier = Modifier
                         .padding(10.dp)
                 )

                 Spacer(modifier = Modifier.width(20.dp))

                 Text(text = "Youtube",
                     modifier = Modifier
                         .padding(10.dp)
                 )

                 Spacer(modifier = Modifier.width(184.dp))


                 Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "",
                     modifier = Modifier
                         .padding(10.dp)
                 )






             }

         }


















     }
 }







}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    AccountScreen(rememberNavController())
    
}

