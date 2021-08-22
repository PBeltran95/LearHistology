package ar.com.learnhistology.learnhistology.viewModel

import ar.com.learnhistology.learnhistology.data.CategoryModel

class WhenCategoryModel {
    fun getButton(name: String):String {
        var button = ""
        when (name) {
            //Epitelio
            "Epitelios" -> button = "1"
            "Tejido conectivo laxo" -> button = "2"
            "Tejido conectivo denso" -> button = "3"

            //Adiposo y cartilaginoso
            "Tejido adiposo" -> button = "4"
            "Cartilago hialino" -> button = "5"
            "Cartilago fibroso" -> button = "6"
            "Cartilago elastico" -> button = "7"

            //Digestivo
            "Lengua" -> button = "8"
            "Glandula parotida" -> button = "9"
            "Glandula submandibular" -> button = "10"
            "Glandula sublingual" -> button = "11"
            "Diente y encia" -> button = "12"
            "Esofago" -> button = "13"
            "Estomago" -> button = "14"
            "Duodeno" -> button = "15"
            "Yeyuno" -> button = "16"
            "Ileon" -> button = "17"
            "Colon" -> button = "18"
            "Apendice" -> button = "19"
            "Conducto anal" -> button = "20"
            "Higado" -> button = "21"
            "Vesicula Biliar" -> button = "22"
            "Pancreas" -> button = "23"

            //Respiratorio
            "Mucosa olfatoria" -> button = "24"
            "Laringe" -> button = "25"
            "Traquea" -> button = "26"
            "Bronquio y bronquiolo" -> button = "27"
            "Bronquiolo terminal y alveolo" -> button = "28"

            //Cardiovascular
            "Corazon" -> button = "29"
            "Arterias coronarias" -> button = "30"
            "Aorta" -> button = "31"
            "Arterias y Venas" -> button = "32"
            "Arteriolas y linfaticos" -> button = "33"
            "Conducto toracico" -> button = "34"

            //Nervioso
            "Nervio Periferico" -> button = "35"
            "Perineuro" -> button = "36"
            "Ganglios simpaticos" -> button = "37"
            "Cerebro" -> button = "38"
            "Cerebelo" -> button = "39"
            "Medula espinal" -> button = "40"
            //Linfatico
            "Amigdala palatina" -> button = "41"
            "Ganglio linfatico" -> button = "42"
            "Bazo" -> button = "43"
            "Timo" -> button = "44"
            //Endocrino
            "Hipofisis" -> button = "45"
            "Glandula pineal" -> button = "46"
            "Tiroides" -> button = "47"
            "Paratiroides" -> button = "48"
            "Suprarrenal" -> button = "49"

            //Oseo
            "Tejido Oseo" -> button = "50"
            "Osificacion endocondral" -> button = "51"
            "Osificacion intramembranosa" -> button = "52"
            "Eritrocitos y granulocitos" -> button = "53"
            "Agranulocitos y medula osea" -> button = "54"
            "Eritropoyesis y granulopoyesis" -> button = "55"

            //Urinario
            "Riñon" -> button = "56"
            "Ureter" -> button = "57"
            "Vejiga Urinaria" -> button = "58"
            "Uretra" -> button = "59"

            //Reproductor
            "Testiculo" -> button = "60"
            "Ovario" -> button = "61"
            "Epididimo y conductillos" -> button = "62"
            "Cuerpo luteo" -> button = "63"
            "Cordon espermatico" -> button = "64"
            "Trompa uterina" -> button = "65"
            "Cuerpo del pene" -> button = "66"
            "Placenta" -> button = "67"
            "Prostata" -> button = "68"
            "Cordon umbilical" -> button = "69"
            "Vesicula seminal" -> button = "70"
            "Vagina y vulva" -> button = "71"
            "Pezon" -> button = "72"
            "Glandula mamaria" -> button = "73"

            //Muscular
            "Musculo esqueletico" -> button = "74"
            "Union musculo tendinosa" -> button = "75"
            "Union neuromuscular" -> button = "76"
            "Musculo cardiaco" -> button = "77"
            "Musculo liso" -> button = "78"

            //Ojo y oido
            "Segmento anterior del ojo" -> button = "79"
            "Esclera, cornea y cristalino" -> button = "80"
            "S. posterior del ojo" -> button = "81"
            "Oido" -> button = "82"
            "Organo de corti" -> button = "83"

            //Tegumentario
            "Piel gruesa" -> button = "84"
            "Piel fina" -> button = "85"
            "Glandulas sudoriparas" -> button = "86"
            "Glandulas cebaceas" -> button = "87"
            "Foliculo piloso y uña" -> button = "88"
        }
        return button
    }
}