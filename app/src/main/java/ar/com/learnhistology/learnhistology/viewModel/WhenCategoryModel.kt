package ar.com.learnhistology.learnhistology.viewModel

import ar.com.learnhistology.learnhistology.data.CategoryModel

class WhenCategoryModel {
    fun buttonKey(categoryModel:CategoryModel):String {
        var button = ""
        when (categoryModel.CategoryName) {
            //Epitelio
            "Epitelio cubico" -> button = "1"
            "Epitelio cilindrico" -> button = "2"
            "Epitelio estratificado" -> button = "3"

            //Adiposo y conectivo
            "Tejido adiposo" -> button = "4"
            "Cartilago hialino" -> button = "5"
            "Cartilago fibroso" -> button = "6"
            "Cartilago elastico" -> button = "7"

            //Digestivo
            "Lengua" -> button = "8"
            "Glandula parotida" -> button = "8"
            "Glandula submandibular" -> button = "9"
            "Glandula sublingual" -> button = "10"
            "Diente y encia" -> button = "11"
            "Esofago" -> button = "12"
            "Estomago" -> button = "13"
            "Duodeno" -> button = "14"
            "Yeyuno" -> button = "15"
            "Ileon" -> button = "16"
            "Colon" -> button = "17"
            "Apendice" -> button = "18"
            "Conducto anal" -> button = "19"
            "Higado" -> button = "20"
            "Vesicula Biliar" -> button = "21"
            "Pancreas" -> button = "22"

            //Respiratorio
            "Mucosa olfatoria" -> button = "23"
            "Laringe" -> button = "24"
            "Traquea" -> button = "25"
            "Bronquio y bronquiolo" -> button = "26"
            "Bronquiolo terminal y alveolo" -> button = "27"

            //Cardiovascular
            "Corazon" -> button = "28"
            "Arterias coronarias" -> button = "29"
            "Aorta" -> button = "30"
            "Arterias y Venas" -> button = "31"
            "Arteriolas y linfaticos" -> button = "32"
            "Conducto toracico" -> button = "33"

            //Nervioso
            "Nervio Periferico" -> button = "34"
            "Perineuro" -> button = "35"
            "Ganglios simpaticos" -> button = "36"
            "Cerebro" -> button = "37"
            "Cerebelo" -> button = "38"
            "Medula espinal" -> button = "39"
            //Linfatico
            "Amigdala palatina" -> button = "40"
            "Ganglio linfatico" -> button = "41"
            "Bazo" -> button = "42"
            "Timo" -> button = "43"
            //Endocrino
            "Hipofisis" -> button = "44"
            "Glandula pineal" -> button = "45"
            "Tiroides" -> button = "46"
            "Paratiroides" -> button = "47"
            "Suprarrenal" -> button = "48"

            //Oseo
            "Tejido Oseo" -> button = "49"
            "Osificacion endocondral" -> button = "50"
            "Osificacion intramembranosa" -> button = "51"
            "Eritrocitos y granulocitos" -> button = "52"
            "Agranulocitos y medula osea" -> button = "53"
            "Eritropoyesis y granulopoyesis" -> button = "54"

            //Urinario
            "Riñon" -> button = "55"
            "Ureter" -> button = "56"
            "Vejiga Urinaria" -> button = "57"
            "Uretra" -> button = "58"

            //Reproductor
            "Testiculo" -> button = "59"
            "Ovario" -> button = "60"
            "Epididimo y conductillos" -> button = "61"
            "Cuerpo luteo" -> button = "62"
            "Cordon espermatico" -> button = "63"
            "Trompa uterina" -> button = "64"
            "Cuerpo del pene" -> button = "65"
            "Placenta" -> button = "66"
            "Prostata" -> button = "67"
            "Cordon umbilical" -> button = "68"
            "Vesicula seminal" -> button = "69"
            "Vagina y vulva" -> button = "70"
            "Pezon" -> button = "71"
            "Glandula mamaria" -> button = "72"

            //Muscular
            "Musculo esqueletico" -> button = "73"
            "Union musculo tendinosa" -> button = "74"
            "Union neuromuscular" -> button = "75"
            "Musculo cardiaco" -> button = "76"
            "Musculo liso" -> button = "77"

            //Ojo y oido
            "Segmento anterior del ojo" -> button = "78"
            "Esclera, cornea y cristalino" -> button = "79"
            "S. posterior del ojo" -> button = "80"
            "Oido" -> button = "81"
            "Organo de corti" -> button = "82"

            //Tegumentario
            "Piel gruesa" -> button = "83"
            "Piel fina" -> button = "84"
            "Glandulas sudoriparas" -> button = "85"
            "Glandulas cebaceas" -> button = "86"
            "Foliculo piloso y uña" -> button = "87"


        }
        return button
    }
}