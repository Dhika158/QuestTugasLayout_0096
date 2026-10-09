package com.example.praktugas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun MahasiswaCard(
    nama: String,
    alamat: String,
    telepon: String? = null,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(
                horizontal = dimensionResource(R.dimen.screen_padding),
                vertical = dimensionResource(R.dimen.card_spacing)
            ),
        shape = RoundedCornerShape(dimensionResource(R.dimen.card_radius)),
        colors = CardDefaults.cardColors(
            containerColor = backgroundColor
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.card_inner_padding)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier
                    .size(dimensionResource(R.dimen.logo_size))
                    .padding(dimensionResource(R.dimen.logo_padding))
            )
            Spacer(modifier = Modifier.width(dimensionResource(R.dimen.spacing_medium)))
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = nama,
                    fontSize = dimensionResource(R.dimen.font_size_title).value.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.white)
                )
                if (telepon != null) {
                    Text(
                        text = telepon,
                        fontSize = dimensionResource(R.dimen.font_size_subtitle).value.sp,
                        color = colorResource(R.color.white)
                    )
                }
                Text(
                    text = alamat,
                    fontSize = dimensionResource(R.dimen.font_size_subtitle).value.sp,
                    color = colorResource(R.color.yellow)
                )
            }
            Spacer(modifier = Modifier.width(dimensionResource(R.dimen.spacing_medium)))
            Image(
                painter = painterResource(R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier
                    .size(dimensionResource(R.dimen.logo_size))
                    .padding(dimensionResource(R.dimen.logo_padding))
            )
        }
    }
}

@Composable
fun ActivitasPertama(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(top = dimensionResource(R.dimen.padding_top_main))
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
