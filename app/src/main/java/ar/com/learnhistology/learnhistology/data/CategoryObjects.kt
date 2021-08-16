package ar.com.learnhistology.learnhistology.data

import ar.com.learnhistology.learnhistology.R
import ar.com.learnhistology.learnhistology.view.CategoryAdapter
import ar.com.learnhistology.learnhistology.view.dig_sys_fragment

object CategoryObjects {

    val epithelial = listOf(//TODOS
        CategoryModel("1", "Epitelio cubico", R.drawable.epiteliocubico2),
        CategoryModel("2", "Epitelio cilindrico", R.drawable.cilindrico),
        CategoryModel("3", "Epitelio estratificado", R.drawable.estratificado))

    val tejidoAdiposo = listOf(
        CategoryModel("4", "Tejido adiposo", R.drawable.fat),
        CategoryModel("5", "Cartilago hialino", R.drawable.hialino),
        CategoryModel("6", "Cartilago fibroso", R.drawable.fibroso2),//sad
        CategoryModel("7", "Cartilago elastico", R.drawable.elastico2))

    val digestive = listOf(
        CategoryModel("8", "Lengua", R.drawable.lengua),
        CategoryModel("9", "Glandula parotida", R.drawable.parotida),
        CategoryModel("10", "Glandula submandibular", R.drawable.parotida),
        CategoryModel("11", "Glandula sublingual", R.drawable.parotida),
        CategoryModel("12", "Diente y encia", R.drawable.icon_happy_tooth),
        CategoryModel("13", "Esofago", R.drawable.esofago),
        CategoryModel("14", "Estomago", R.drawable.estomago),
        CategoryModel("15", "Duodeno", R.drawable._044752),
        CategoryModel("16", "Yeyuno", R.drawable._044752),
        CategoryModel("17", "Ileon", R.drawable._044752),
        CategoryModel("18", "Colon", R.drawable.colon),
        CategoryModel("19", "Apendice", R.drawable.apendice),
        CategoryModel("20", "Conducto anal", R.drawable.digestivo),
        CategoryModel("21", "Higado", R.drawable.higado),
        CategoryModel("22", "Vesicula Biliar", R.drawable.vesicula),
        CategoryModel("23", "Pancreas", R.drawable.pancreas))

    val respiratory = listOf(
        CategoryModel("24", "Mucosa olfatoria", R.drawable.bulboolfatorio),
        CategoryModel("25", "Laringe", R.drawable.laringe),
        CategoryModel("26", "Traquea", R.drawable.traquea),
        CategoryModel("27", "Bronquio y bronquiolo", R.drawable.bronquio),
        CategoryModel("28", "Bronquiolo terminal y alveolo", R.drawable.alveolo))

    val cardioVascular = listOf(
        CategoryModel("29", "Corazon", R.drawable.cardio),
        CategoryModel("30", "Arterias coronarias", R.drawable.coronarias),
        CategoryModel("31", "Aorta", R.drawable.aorta),
        CategoryModel("32", "Arterias y Venas", R.drawable.arteriasvenas),
        CategoryModel("33", "Arteriolas y linfaticos", R.drawable.linfatic),
        CategoryModel("34", "Conducto toracico", R.drawable.conductotoracico))

    val nervioso = listOf(
        CategoryModel("35", "Nervio Periferico", R.drawable._688310),
        CategoryModel("36", "Perineuro", R.drawable.perineuro),
        CategoryModel("37", "Ganglios simpaticos", R.drawable.nervioso),
        CategoryModel("37", "Cerebro", R.drawable.cerebro),
        CategoryModel("37", "Cerebelo", R.drawable.cerebelo),
        CategoryModel("38", "Medula espinal", R.drawable.medulaespinal))

    val linfatico = listOf(
        CategoryModel("37", "Amigdala palatina", R.drawable.amigdala),
        CategoryModel("38", "Ganglio linfatico", R.drawable.ganglio),
        CategoryModel("39", "Bazo", R.drawable.bazo),
        CategoryModel("40", "Timo", R.drawable.timo))

    val endocrino = listOf(
        CategoryModel("41", "Hipofisis", R.drawable.hipotalamo),
        CategoryModel("42", "Glandula pineal", R.drawable.pineal),
        CategoryModel("43", "Tiroides", R.drawable.tiroides),
        CategoryModel("44", "Paratiroides", R.drawable.paratiroides),
        CategoryModel("45", "Suprarrenal", R.drawable.suprarrenal))

    val sistemaOseo = listOf(
        CategoryModel("46", "Tejido Oseo", R.drawable.images),
        CategoryModel("47", "Osificacion endocondral", R.drawable.endocondral),
        CategoryModel("48", "Osificacion intramembranosa", R.drawable.endocondral),
        CategoryModel("49", "Eritrocitos y granulocitos", R.drawable.eritrocito),
        CategoryModel("50", "Agranulocitos y medula osea", R.drawable.medulaosea),
        CategoryModel("51", "Eritropoyesis y granulopoyesis", R.drawable.eritropoyesis))

    val sisUrinario = listOf(
        CategoryModel("52", "Riñon", R.drawable.suprarrenal),
        CategoryModel("53", "Ureter", R.drawable.ureter2),//asdas
        CategoryModel("54", "Vejiga Urinaria", R.drawable.vejiga),
        CategoryModel("55", "Uretra", R.drawable.uretra))

    val sisReproductor = listOf(
        CategoryModel("56", "Testiculo", R.drawable.testicuilo),
        CategoryModel("57", "Ovario", R.drawable.ovario),
        CategoryModel("58", "Epididimo y conductillos", R.drawable.epididimo),
        CategoryModel("59", "Cuerpo luteo", R.drawable.cuerpoluteojpg),
        CategoryModel("60", "Cordon espermatico", R.drawable.epididimo),
        CategoryModel("61", "Trompa uterina", R.drawable.trompafalopio),
        CategoryModel("62", "Cuerpo del pene", R.drawable.peneicon2), //asdas
        CategoryModel("63", "Placenta", R.drawable.placenta),
        CategoryModel("64", "Prostata", R.drawable.prostata),
        CategoryModel("65", "Cordon umbilical", R.drawable.cordonumbilical),
        CategoryModel("66", "Vesicula seminal", R.drawable.epididimo),//asasda
        CategoryModel("67", "Vagina y vulva", R.drawable.ovario),
        CategoryModel("68", "Pezon", R.drawable.pezon),
        CategoryModel("69", "Glandula mamaria", R.drawable.glandulamamaria))

    val muscular = listOf(
        CategoryModel("70", "Musculo esqueletico", R.drawable.muscle),
        CategoryModel("71", "Union musculo tendinosa", R.drawable.tendon2),//asdasd
        CategoryModel("72", "Union neuromuscular", R.drawable.unionneuromuscular),
        CategoryModel("73", "Musculo cardiaco", R.drawable.musculocardiaco),
        CategoryModel("74", "Musculo liso", R.drawable.liso))

    val eyeAndEar = listOf(
        CategoryModel("75", "Segmento anterior del ojo", R.drawable.eye),
        CategoryModel("76", "Esclera, cornea y cristalino", R.drawable.cornea__cristalino),
        CategoryModel("77", "S. posterior del ojo", R.drawable.posterioreye),
        CategoryModel("78", "Oido", R.drawable.oreja),//asdas
        CategoryModel("79", "Organo de corti", R.drawable.organ_of_corti))

    val tegumentary = listOf(
        CategoryModel("80", "Piel gruesa", R.drawable.piel_gruesa),
        CategoryModel("81", "Piel fina", R.drawable.pielfina),
        CategoryModel("82", "Glandulas sudoriparas", R.drawable.skin),
        CategoryModel("83", "Glandulas cebaceas", R.drawable.sudoripara),
        CategoryModel("84", "Foliculo piloso y uña", R.drawable.skin))
}