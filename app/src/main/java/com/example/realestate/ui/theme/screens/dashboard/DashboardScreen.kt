package com.example.realestate.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.realestate.R
import com.example.realestate.navigation.ADD_PRODUCTS_URL
import com.example.realestate.navigation.ROUT_ABOUT
import com.example.realestate.navigation.ROUT_DETAIL
import com.example.realestate.navigation.ROUT_HOME
import com.example.realestate.navigation.ROUT_INTENT
import com.example.realestate.navigation.ROUT_PROPERTY
import com.example.realestate.navigation.ROUT_SIGNUP
import com.example.realestate.navigation.ROUT_SPLASH
import com.example.realestate.ui.theme.Lime20

@Composable
fun DashboardScreen(navController: NavController){

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(40.dp))

        Image(
            painter = painterResource(id = com.example.realestate.R.drawable.img_2),
            contentDescription = "home",
            modifier = Modifier.size(200.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Manage your properties with ease",
            fontSize = 25.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(20.dp))

        Column (modifier = Modifier.verticalScroll(rememberScrollState())){

            //Main card
            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .height(700.dp),
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),

            ) {

                //Row1
                Row (modifier = Modifier.padding(20.dp)){
                    Card (
                        modifier = Modifier
                            .clickable { navController.navigate(ROUT_HOME) }
                            .width(160.dp)
                            .height(180.dp),
                        elevation = CardDefaults.cardElevation(10.dp)
                    ) {
                        Column () {
                            Spacer(modifier = Modifier.height(20.dp))
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.img3),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(120.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(0.02.dp))

                            Text(
                                text = "Home",
                                fontSize = 20.sp,
                                color = Color.Black,
                                modifier = Modifier
                                    .fillMaxWidth(),
                                textAlign = TextAlign.Center,
                            )

                        }

                    }

                    Spacer(modifier = Modifier.width(20.dp))

                    Card (
                        modifier = Modifier
                            .clickable { navController.navigate(ROUT_INTENT) }
                            .width(160.dp)
                            .height(180.dp),
                        elevation = CardDefaults.cardElevation(10.dp)
                    ) {
                        Column () {
                            Spacer(modifier = Modifier.height(20.dp))
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.img5),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(120.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(0.02.dp))

                            Text(
                                text = "Details",
                                fontSize = 20.sp,
                                color = Color.Black,
                                modifier = Modifier
                                    .fillMaxWidth(),
                                textAlign = TextAlign.Center,
                            )

                        }

                    }
                }

                //End of row1

                //Row2
                Row (modifier = Modifier.padding(20.dp)){
                    Card (
                        modifier = Modifier
                            .clickable { navController.navigate(ROUT_SIGNUP) }
                            .width(160.dp)
                            .height(180.dp),
                        elevation = CardDefaults.cardElevation(10.dp)
                    ) {
                        Column () {
                            Spacer(modifier = Modifier.height(20.dp))
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_2),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(120.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(0.02.dp))

                            Text(
                                text = "Signup",
                                fontSize = 20.sp,
                                color = Color.Black,
                                modifier = Modifier
                                    .fillMaxWidth(),
                                textAlign = TextAlign.Center,
                            )

                        }

                    }
                    Spacer(modifier = Modifier.width(20.dp))

                    Card (
                        modifier = Modifier
                            .clickable { navController.navigate(ROUT_SPLASH) }
                            .width(160.dp)
                            .height(180.dp),
                        elevation = CardDefaults.cardElevation(10.dp)
                    ) {
                        Column () {
                            Spacer(modifier = Modifier.height(20.dp))
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.img4),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(120.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(0.02.dp))

                            Text(
                                text = "Splash",
                                fontSize = 20.sp,
                                color = Color.Black,
                                modifier = Modifier
                                    .fillMaxWidth(),
                                textAlign = TextAlign.Center,
                            )

                        }

                    }
                }
                //End of row2

                //Row3
                Row (modifier = Modifier.padding(20.dp)){
                    Card (
                        modifier = Modifier
                            .clickable { navController.navigate(ROUT_PROPERTY) }
                            .width(160.dp)
                            .height(180.dp),
                        elevation = CardDefaults.cardElevation(10.dp)
                    ) {
                        Column () {
                            Spacer(modifier = Modifier.height(20.dp))
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.img2),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(120.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(0.02.dp))

                            Text(
                                text = "Properties",
                                fontSize = 20.sp,
                                color = Color.Black,
                                modifier = Modifier
                                    .fillMaxWidth(),
                                textAlign = TextAlign.Center,
                            )

                        }

                    }
                    Spacer(modifier = Modifier.width(20.dp))

                    Card (
                        modifier = Modifier
                            .clickable { navController.navigate(ADD_PRODUCTS_URL) }
                            .width(160.dp)
                            .height(180.dp),
                        elevation = CardDefaults.cardElevation(10.dp)
                    ) {
                        Column () {
                            Spacer(modifier = Modifier.height(20.dp))
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.img1),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(120.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(0.02.dp))

                            Text(
                                text = "About",
                                fontSize = 20.sp,
                                color = Color.Black,
                                modifier = Modifier
                                    .fillMaxWidth(),
                                textAlign = TextAlign.Center,
                            )

                        }

                    }
                }
                //End of row3

            }
            //End of main card

        }
    }
}

@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}
