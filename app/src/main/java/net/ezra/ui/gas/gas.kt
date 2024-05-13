package net.ezra.ui.home

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.widget.Toast
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_CARD
import net.ezra.navigation.ROUTE_GAS
import net.ezra.navigation.ROUTE_HOME
import net.ezra.ui.account.AccountScreen


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GasScreen( navController: NavHostController){


    Column {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .padding(9.dp)
                .clickable {
                    navController.navigate(ROUTE_GAS) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                }
        ) {
            Spacer(modifier = Modifier.width(7.dp))

            androidx.compose.material3.Icon(
                imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = ""

            )

            Spacer(modifier = Modifier.width(15.dp))

            Text(text = "Order Gas", fontSize = 20.sp)


            Spacer(modifier = Modifier.width(140.dp))

            Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "")





        }
    }



           LazyColumn {
               item {
                   Column(
                       modifier = Modifier
                           .fillMaxWidth()
                           .height(140.dp)
                   ) {
                       Row(
                           modifier = Modifier
                               .fillMaxWidth()
                               .height(120.dp)
                               .padding(2.dp)
                       ) {
                           Column{
                               Card(
                                   modifier = Modifier
                                       .width(110.dp)
                                       .height(130.dp),
                                   colors = CardDefaults.cardColors(Color(0xffffffff))

                               ) {
                                   Image(
                                       modifier = Modifier
                                           .size(150.dp, 150.dp)
                                           .background(Color.Transparent)
                                           .clip(RoundedCornerShape(16.dp)),

                                       painter = painterResource(id = R.drawable.gascylinders),
                                       contentDescription = ""
                                   )
                               }
                           }
                       }
                   }

                   Spacer(modifier = Modifier.width(25.dp))

                   Column(
                       modifier = Modifier
                           .fillMaxWidth()
                           .height(140.dp)
                   ) {
                       Row(
                           modifier = Modifier
                               .fillMaxWidth()
                               .height(120.dp)
                               .padding(2.dp)
                       ) {
                           Column{
                               Card(
                                   modifier = Modifier
                                       .width(110.dp)
                                       .height(130.dp),
                                   colors = CardDefaults.cardColors(Color(0xffffffff))

                               ) {
                                   Image(
                                       modifier = Modifier
                                           .size(150.dp, 150.dp)
                                           .background(Color.Transparent)
                                           .clip(RoundedCornerShape(16.dp)),

                                       painter = painterResource(id = R.drawable.gascylinders),
                                       contentDescription = ""
                                   )
                               }
                           }
                       }
                   }

                   Spacer(modifier = Modifier.width(25.dp))

                   Column(
                       modifier = Modifier
                           .fillMaxWidth()
                           .height(140.dp)
                   ) {
                       Row(
                           modifier = Modifier
                               .fillMaxWidth()
                               .height(120.dp)
                               .padding(2.dp)
                       ) {
                           Column{
                               Card(
                                   modifier = Modifier
                                       .width(110.dp)
                                       .height(130.dp),
                                   colors = CardDefaults.cardColors(Color(0xffffffff))

                               ) {
                                   Image(
                                       modifier = Modifier
                                           .size(150.dp, 150.dp)
                                           .background(Color.Transparent)
                                           .clip(RoundedCornerShape(16.dp)),

                                       painter = painterResource(id = R.drawable.gascylinders),
                                       contentDescription = ""
                                   )
                               }
                           }
                       }
                   }

                   Column(
                       modifier = Modifier
                           .fillMaxWidth()
                           .height(140.dp)
                   ) {
                       Row(
                           modifier = Modifier
                               .fillMaxWidth()
                               .height(120.dp)
                               .padding(2.dp)
                       ) {
                           Column{
                               Card(
                                   modifier = Modifier
                                       .width(110.dp)
                                       .height(130.dp),
                                   colors = CardDefaults.cardColors(Color(0xffffffff))

                               ) {
                                   Image(
                                       modifier = Modifier
                                           .size(150.dp, 150.dp)
                                           .background(Color.Transparent)
                                           .clip(RoundedCornerShape(16.dp)),

                                       painter = painterResource(id = R.drawable.gascylinders),
                                       contentDescription = ""
                                   )
                               }
                           }
                       }
                   }

                   Spacer(modifier = Modifier.width(25.dp))



                   Column(
                       modifier = Modifier
                           .fillMaxWidth()
                           .height(140.dp)
                   ) {
                       Row(
                           modifier = Modifier
                               .fillMaxWidth()
                               .height(120.dp)
                               .padding(2.dp)
                       ) {
                           Column{
                               Card(
                                   modifier = Modifier
                                       .width(110.dp)
                                       .height(130.dp),
                                   colors = CardDefaults.cardColors(Color(0xffffffff))

                               ) {
                                   Image(
                                       modifier = Modifier
                                           .size(150.dp, 150.dp)
                                           .background(Color.Transparent)
                                           .clip(RoundedCornerShape(16.dp)),

                                       painter = painterResource(id = R.drawable.gascylinders),
                                       contentDescription = ""
                                   )
                               }
                           }
                       }
                   }

                   Spacer(modifier = Modifier.width(25.dp))



                   Column(
                       modifier = Modifier
                           .fillMaxWidth()
                           .height(140.dp)
                   ) {
                       Row(
                           modifier = Modifier
                               .fillMaxWidth()
                               .height(120.dp)
                               .padding(2.dp)
                       ) {
                           Column{
                               Card(
                                   modifier = Modifier
                                       .width(110.dp)
                                       .height(130.dp),
                                   colors = CardDefaults.cardColors(Color(0xffffffff))

                               ) {
                                   Image(
                                       modifier = Modifier
                                           .size(150.dp, 150.dp)
                                           .background(Color.Transparent)
                                           .clip(RoundedCornerShape(16.dp)),

                                       painter = painterResource(id = R.drawable.gascylinders),
                                       contentDescription = ""
                                   )
                               }
                           }
                       }
                   }

                   Spacer(modifier = Modifier.width(25.dp))



                   Column(
                       modifier = Modifier
                           .fillMaxWidth()
                           .height(140.dp)
                   ) {
                       Row(
                           modifier = Modifier
                               .fillMaxWidth()
                               .height(120.dp)
                               .padding(2.dp)
                       ) {
                           Column{
                               Card(
                                   modifier = Modifier
                                       .width(110.dp)
                                       .height(130.dp),
                                   colors = CardDefaults.cardColors(Color(0xffffffff))

                               ) {
                                   Image(
                                       modifier = Modifier
                                           .size(150.dp, 150.dp)
                                           .background(Color.Transparent)
                                           .clip(RoundedCornerShape(16.dp)),

                                       painter = painterResource(id = R.drawable.gascylinders),
                                       contentDescription = ""
                                   )
                               }
                           }
                       }
                   }

                   Spacer(modifier = Modifier.width(25.dp))






               }
           }








































}























@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    GasScreen(rememberNavController())

}

