package com.serafine.appbelibeli

class ShopData {
    public val data = arrayOf(
        arrayOf(
            "Razer",
            "Apa coba",
            "Rp 1.189.000",
            R.drawable.razer
        ),
        arrayOf(
            "Alienware",
            "Ha?",
            "Rp.",
            R.drawable.razer
        )
    )
    val listData: ArrayList<Shop>
        get() {
            val list = arrayListOf<Shop>()
            for (aData in data) {
                val shop = Shop()
                shop.name = aData[0] as String
                shop.desc = aData[1] as String
                shop.price = aData[2] as String
                shop.photo = aData[3] as Int

                list.add(shop)
            }
            return list
        }
}