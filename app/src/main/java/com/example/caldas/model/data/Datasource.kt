package com.example.caldas.model.data

import com.example.caldas.R
import com.example.caldas.model.Caldas


class Datasource {

    fun loadCaldas(): List<Caldas> {
        return listOf<Caldas>(
            Caldas(R.string.caldas1, R.drawable.manizales),
            Caldas(R.string.caldas2, R.drawable.parquelosnevados),
            Caldas(R.string.caldas3, R.drawable.zonacentro),
            Caldas(R.string.caldas4, R.drawable.zonaoriente),
            Caldas(R.string.caldas5, R.drawable.salamina),


            )
    }
}







