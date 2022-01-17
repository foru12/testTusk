package com.example.testtusk
import android.os.Binder
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.widget.GridLayout
import android.widget.LinearLayout
import com.bumptech.glide.Glide
import com.example.testtusk.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var imageurl : String
    private val imageIdList = listOf(R.drawable.adadasawe,
        R.drawable.asasasas,
        R.drawable.ass,
        R.drawable.dfdf,
        R.drawable.fg,
        R.drawable.original,
        R.drawable.sfdhgsdd,
        R.drawable.scale_1200,

    )
    private var counter = 0

     private val adapters = Adapter()
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()


    }
    private fun init(){
        binding.apply{
            ResView.layoutManager = GridLayoutManager(this@MainActivity,2)
            ResView.adapter = adapters
            for (i in imageIdList) {
                if (counter > imageIdList.size) {counter = 0}
                    val image = image(imageIdList[counter])
                    adapters.addimage(image)
                    counter++
            }



        }
    }
    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        outState.putString(KEY_IMAGE_URL,imageurl)
    }
    companion object {
        const val KEY_IMAGE_URL = "KEY_IMAGE_URL"
        val imagelist = listOf(
            "http://fototips.ru/wp-content/uploads/2011/12/landscape_03.jpg",
            "http://fototips.ru/wp-content/uploads/2011/12/landscape_02.jpg",
            "http://www.art-portrets.ru/pict6/peyzaj-s-tserkovyu.jpg",
            "http://www.art-vernissage.ru/media/picture/28/osenvstaromparke.jpg",
            "https://img-fotki.yandex.ru/get/47606/67000176.32f/0_bc7c5_1a726f4c_XL.jpg",
            "https://wpapers.ru/wallpapers/nature/Autumn/9991/PREV_%D0%9A%D1%80%D0%B0%D1%81%D0%B8%D0%B2%D1%8B%D0%B9-%D0%BE%D1%81%D0%B5%D0%BD%D0%BD%D0%B8%D0%B9-%D0%BF%D0%B5%D0%B9%D0%B7%D0%B0%D0%B6.jpg",
            "http://cdn-tn.fishki.net/26/upload/post/201506/08/1560136/gora-shasta-v-kalifornii-ssha.jpg",
            "http://www.fotolandscape.com/wp-content/uploads/2014/10/013.jpg",
            "https://s-media-cache-ak0.pinimg.com/736x/ea/ef/72/eaef72c16646993346a43892b54bedee.jpg",
            "http://fotoprirodi.narod.ru/images/gory/gory24.jpg",
            "http://img0.liveinternet.ru/images/attach/c/2//71/413/71413156_WindowsLiveWriter_a070158a2e19_E7F6_RRSRRRRyoR_RRRRRRRyo_3_d6da9e5c44da4bb59e4927dc951c43df.jpg",
            "https://s-media-cache-ak0.pinimg.com/736x/1a/7c/b3/1a7cb3c34b2f7210846f7ddc98f9f99f.jpg"
        )
    }
}
