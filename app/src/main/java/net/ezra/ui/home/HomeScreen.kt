package net.ezra.ui.home

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_OFFERS
import net.ezra.navigation.ROUTE_ACCOUNT
import net.ezra.navigation.ROUTE_NOTIFICATIONS
import net.ezra.navigation.ROUTE_EATERY
import net.ezra.navigation.ROUTE_SHOP

import net.ezra.R
import net.ezra.navigation.ROUTE_ACCOUNT
import net.ezra.navigation.ROUTE_REGISTER
import net.ezra.navigation.ROUTE_CARD
import net.ezra.navigation.ROUTE_NOTIFICATIONS
import net.ezra.navigation.ROUTE_OFFERS
import okhttp3.internal.wait

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavHostController) {

    Scaffold(
        topBar = {
            TopAppBar(
                modifier = Modifier
                    .background(Color.Black),

                title = {
                    Text(text = "Enjoy",
                       // color = Color.White,
                        fontSize = 25.sp,
                        fontStyle = FontStyle.Italic
                    )
                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.AccountCircle, "",
                            modifier = Modifier
                               // .background(Color.White)
                                .fillMaxHeight()
                                .width(50.dp)
                                .clickable {
                                    navController.navigate(ROUTE_ACCOUNT) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                })
                        Spacer(modifier = Modifier.width(150.dp))


                    }
                },

            )
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                   ,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {



                LazyColumn {

                    item {


                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(Color.White)


                        ) {


                            Spacer(modifier = Modifier.height(10.dp))

                            LazyRow (
                                modifier = Modifier
                                    .height(150.dp)

                            ){

                                item {
                                    Card(

                                        colors = CardDefaults.cardColors(Color.Black),
                                        modifier = Modifier
                                            .width(150.dp)
                                            .height(90.dp)


                                    ) {


                                        Image(
                                            painter = painterResource(id = R.drawable.home),
                                            contentDescription = "",
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(5.dp)


                                        )
                                    }

                                    Spacer(modifier = Modifier.width(40.dp))
                                    Card(

                                        colors = CardDefaults.cardColors(Color.Black),
                                        modifier = Modifier
                                            .width(150.dp)
                                            .height(90.dp)


                                    ) {


                                        Image(
                                            painter = painterResource(id = R.drawable.hotel),
                                            contentDescription = "",
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(5.dp)


                                        )
                                    }

                                    Spacer(modifier = Modifier.width(40.dp))

                                    Card(

                                        colors = CardDefaults.cardColors(Color.Black),
                                        modifier = Modifier
                                            .width(150.dp)
                                            .height(90.dp)


                                    ) {


                                        Image(
                                            painter = painterResource(id = R.drawable.gascylinders),
                                            contentDescription = "",
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(5.dp)


                                        )
                                    }

                                    Spacer(modifier = Modifier.width(40.dp))

                                    Card(

                                        colors = CardDefaults.cardColors(Color.Black),
                                        modifier = Modifier
                                            .width(150.dp)
                                            .height(90.dp)


                                    ) {


                                        Image(
                                            painter = painterResource(id = R.drawable.card),
                                            contentDescription = "",
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(5.dp)


                                        )
                                    }

                                    Spacer(modifier = Modifier.width(40.dp))

                                    Card(

                                        colors = CardDefaults.cardColors(Color.Black),
                                        modifier = Modifier
                                            .width(150.dp)
                                            .height(90.dp)


                                    ) {


                                        Image(
                                            painter = painterResource(id = R.drawable.castrol),
                                            contentDescription = "",
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(5.dp)


                                        )
                                    }

                                    Spacer(modifier = Modifier.width(40.dp))


                                }


                            }






                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(Color.White)

                            ) {

                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(70.dp)

                                ) {
                                    Spacer(modifier = Modifier.width(8.dp))

                                    Text(text = "Quick Actions", fontSize = 20.sp)

                                    Spacer(modifier = Modifier.width(160.dp))

                                    Text(text = "Offers",

                                        fontSize = 20.sp,
                                        modifier = Modifier
                                            .clickable { navController.navigate(ROUTE_OFFERS) {
                                                popUpTo(ROUTE_HOME) { inclusive = true }
                                            } }
                                        

                                        )



                                }
                                Spacer(modifier = Modifier.width(15.dp))



                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(80.dp)
                                        .background(Color.White)

                                ) {
                                    Card {
                                        Row(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .clickable {
                                                    navController.navigate(ROUTE_CARD) {
                                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                                    }

                                                }


                                        ) {
                                            Image(
                                                painter = painterResource(id = R.drawable.card),
                                                contentDescription = "",
                                                modifier = Modifier
                                                    .width(100.dp)
                                                    .padding(0.dp)
                                            )
                                            Spacer(modifier = Modifier.width(15.dp))


                                            Text(text = "Get oil Card", fontSize = 20.sp)

                                            Spacer(modifier = Modifier.width(106.dp))

                                            Icon(
                                                imageVector = Icons.Default.ArrowForward,
                                                contentDescription = ""
                                            )


                                        }
                                    }

                                }

                                Spacer(modifier = Modifier.width(15.dp))

                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(80.dp)
                                        .background(Color.White)

                                ) {
                                    Card {
                                        Row(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .clickable {
                                                    navController.navigate(ROUTE_HOME) {
                                                        popUpTo(ROUTE_MIT) { inclusive = true }
                                                    }

                                                }


                                        ) {
                                            Image(
                                                painter = painterResource(id = R.drawable.attendant),
                                                contentDescription = "",
                                                modifier = Modifier
                                                    .width(100.dp)
                                                    .padding(0.dp)
                                            )
                                            Spacer(modifier = Modifier.width(15.dp))


                                            Text(text = "Pay at station", fontSize = 20.sp)

                                            Spacer(modifier = Modifier.width(88.dp))

                                            Icon(
                                                imageVector = Icons.Default.ArrowForward,
                                                contentDescription = ""
                                            )


                                        }
                                    }

                                }
                                Spacer(modifier = Modifier.width(15.dp))


                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(80.dp)
                                        .background(Color.White)

                                ) {
                                    Card {
                                        Row(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .clickable {
                                                    navController.navigate(ROUTE_HOME) {
                                                        popUpTo(ROUTE_MIT) { inclusive = true }
                                                    }

                                                }


                                        ) {
                                            Image(
                                                painter = painterResource(id = R.drawable.gtx),
                                                contentDescription = "",
                                                modifier = Modifier
                                                    .width(100.dp)
                                                    .padding(0.dp)
                                            )
                                            Spacer(modifier = Modifier.width(15.dp))


                                            Text(text = "Castrol", fontSize = 20.sp)

                                            Spacer(modifier = Modifier.width(145.dp))

                                            Icon(
                                                imageVector = Icons.Default.ArrowForward,
                                                contentDescription = ""
                                            )


                                        }
                                    }

                                }

                                Spacer(modifier = Modifier.width(15.dp))

                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(80.dp)
                                        .background(Color.White)

                                ) {
                                    Card {
                                        Row(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .clickable {
                                                    navController.navigate(ROUTE_HOME) {
                                                        popUpTo(ROUTE_MIT) { inclusive = true }
                                                    }

                                                }


                                        ) {
                                            Image(
                                                painter = painterResource(id = R.drawable.gascylinders),
                                                contentDescription = "",
                                                modifier = Modifier
                                                    .width(100.dp)
                                                    .padding(0.dp)
                                            )
                                            Spacer(modifier = Modifier.width(15.dp))


                                            Text(text = "Gas Delivery", fontSize = 20.sp)

                                            Spacer(modifier = Modifier.width(100.dp))

                                            Icon(
                                                imageVector = Icons.Default.ArrowForward,
                                                contentDescription = ""
                                            )


                                        }
                                    }

                                }

                                Spacer(modifier = Modifier.width(15.dp))

                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(80.dp)
                                        .background(Color.White)

                                ) {
                                    Card {
                                        Row(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .clickable {
                                                    navController.navigate(ROUTE_HOME) {
                                                        popUpTo(ROUTE_MIT) { inclusive = true }
                                                    }

                                                }


                                        ) {
                                            Image(
                                                painter = painterResource(id = R.drawable.hotel),
                                                contentDescription = "",
                                                modifier = Modifier
                                                    .width(100.dp)
                                                    .padding(0.dp)
                                            )
                                            Spacer(modifier = Modifier.width(15.dp))


                                            Text(text = "Beyond Fuel", fontSize = 20.sp)

                                            Spacer(modifier = Modifier.width(100.dp))

                                            Icon(
                                                imageVector = Icons.Default.ArrowForward,
                                                contentDescription = ""
                                            )


                                        }
                                    }

                                }


                            }


                        }


                    }

                }
            }

        },
        bottomBar = { BottomBar() }


    )




    

        }





@Composable
fun BottomBar() {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(elevation = 10.dp,

        backgroundColor = Color.White

        ) {
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home,"")
        },
            label = { Text(text = "Home") }, selected = (selectedIndex.value == 0), onClick = {
                selectedIndex.value = 0
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.List,"",
                )
        },
            label = { Text(text = "My Orders") }, selected = (selectedIndex.value == 1), onClick = {
                selectedIndex.value = 1
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Person, "",)
        },
            label = { Text(text = "My Card") }, selected = (selectedIndex.value == 2), onClick = {
                selectedIndex.value = 2
            })
    }
}







@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())

}








