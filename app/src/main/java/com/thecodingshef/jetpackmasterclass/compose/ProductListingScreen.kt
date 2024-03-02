package com.thecodingshef.jetpackmasterclass.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.thecodingshef.jetpackmasterclass.R
import com.thecodingshef.jetpackmasterclass.ui.theme.bold20
import com.thecodingshef.jetpackmasterclass.ui.theme.normal14


@Preview
@Composable
fun ProductListingScreen() {


//    LazyColumn(
//        verticalArrangement = Arrangement.spacedBy(12.dp),
//        modifier = Modifier
//            .background(Color.White)
//            .padding(20.dp)
//    ) {
//        items(5) {
//            ProductCard()
//        }
//    }


    LazyVerticalGrid(
        columns = GridCells.Fixed(2), content = {

            items(10) {
                ProductCard()
            }
        }, contentPadding = PaddingValues(12.dp), modifier = Modifier.background(Color.White),
        verticalArrangement = Arrangement.spacedBy(14.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    )


}

@Preview(showBackground = true)
@Composable
fun ProductCard() {

//    Card(
//        shape = RoundedCornerShape(8.dp),
//        elevation = CardDefaults.cardElevation(8.dp)
//    ) {
//        Column(
//            horizontalAlignment = Alignment.CenterHorizontally,
//            modifier = Modifier
//                .fillMaxWidth()
//                .background(Color.White)
//                .padding(20.dp),
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.shoe),
//                contentDescription = "product image",
//                modifier = Modifier.size(120.dp),
//                contentScale = ContentScale.Fit
//            )
//            Text(text = "Nike", style = MaterialTheme.typography.bold20.copy(color = Color.Black))
//            Text(text = "Black Soni yellow, Air jester", style = MaterialTheme.typography.normal14)
//
//            Text(text = "$96", style = MaterialTheme.typography.bold20.copy(color = Color.Black))
//        }
//    }


    ///
    Card(
        shape = RoundedCornerShape(8.dp), elevation = CardDefaults.cardElevation(8.dp)
    ) {

        ConstraintLayout(
            modifier = Modifier
                .background(Color.White)
                .padding(20.dp)

        ) {

            val (productImage, name, description, price) = createRefs()

            Image(
                painter = painterResource(id = R.drawable.shoe),
                contentDescription = "product image",
                modifier = Modifier
                    .size(120.dp)
                    .constrainAs(productImage) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        bottom.linkTo(name.top)
                    },
                contentScale = ContentScale.Fit
            )

            Text(text = "Nike",
                style = MaterialTheme.typography.bold20.copy(color = Color.Black),
                modifier = Modifier.constrainAs(name) {
                    top.linkTo(parent.bottom, margin = 8.dp)
                    start.linkTo(parent.start)
                    bottom.linkTo(description.top)
                })

            Text(
                text = "Black Soni yellow, Air jesterjukhnajksnhajks,dhnkas",
                style = MaterialTheme.typography.normal14,
                modifier = Modifier.constrainAs(description) {
                    top.linkTo(name.bottom, margin = 8.dp)
                    start.linkTo(parent.start)
                    bottom.linkTo(price.top)
                },
                maxLines = 3,
                overflow = TextOverflow.Ellipsis
            )

            Text(text = "$96",
                style = MaterialTheme.typography.normal14.copy(color = Color.Black),
                modifier = Modifier.constrainAs(price) {
                    top.linkTo(description.bottom, margin = 4.dp)
                    start.linkTo(parent.start)
                    bottom.linkTo(parent.bottom)
                })


        }
    }


}