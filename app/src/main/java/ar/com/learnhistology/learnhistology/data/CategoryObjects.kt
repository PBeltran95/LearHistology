package ar.com.learnhistology.learnhistology.data

import ar.com.learnhistology.learnhistology.R

 object CategoryObjects {


    val epithelial = listOf(//TODOS
        CategoryModel("1", "Epitelios", R.drawable.epiteliocubico2),
        CategoryModel("2", "Tejido conectivo laxo", R.drawable.conectivo_icon),
        CategoryModel("3", "Tejido conectivo denso", R.drawable.denso))

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
        CategoryModel("28", "Bronquiolo terminal y alveolo", R.drawable.alveolo_1))

    val cardioVascular = listOf(
        CategoryModel("29", "Corazon", R.drawable.cardio),
        CategoryModel("30", "Arterias coronarias", R.drawable.coronarias),
        CategoryModel("31", "Aorta", R.drawable.aorta),
        CategoryModel("32", "Arterias y Venas", R.drawable.arteriasvenas),
        CategoryModel("33", "Arteriolas y linfaticos", R.drawable.linfatic),
        CategoryModel("34", "Conducto toracico", R.drawable.conductotoracico))

    val nervioso = listOf(
        CategoryModel("35", "Nervio Periferico", R.drawable._688310),
        CategoryModel("36", "Perineuro", R.drawable.perineuro_1),
        CategoryModel("37", "Ganglios simpaticos", R.drawable.nervioso),
        CategoryModel("38", "Cerebro", R.drawable.cerebro),
        CategoryModel("39", "Cerebelo", R.drawable.cerebelo),
        CategoryModel("40", "Medula espinal", R.drawable.medulaespinal))

    val linfatico = listOf(
        CategoryModel("41", "Amigdala palatina", R.drawable.amigdala),
        CategoryModel("42", "Ganglio linfatico", R.drawable.ganglio),
        CategoryModel("43", "Bazo", R.drawable.bazo),
        CategoryModel("44", "Timo", R.drawable.timo))

    val endocrino = listOf(
        CategoryModel("45", "Hipofisis", R.drawable.hipotalamo),
        CategoryModel("46", "Glandula pineal", R.drawable.pineal),
        CategoryModel("47", "Tiroides", R.drawable.tiroides),
        CategoryModel("48", "Paratiroides", R.drawable.paratiroides),
        CategoryModel("49", "Suprarrenal", R.drawable.suprarrenal))

    val sistemaOseo = listOf(
        CategoryModel("50", "Tejido Oseo", R.drawable.images),
        CategoryModel("51", "Osificacion endocondral", R.drawable.endocondral),
        CategoryModel("52", "Osificacion intramembranosa", R.drawable.endocondral),
        CategoryModel("53", "Eritrocitos y granulocitos", R.drawable.eritrocito),
        CategoryModel("54", "Agranulocitos y medula osea", R.drawable.medulaosea),
        CategoryModel("55", "Eritropoyesis y granulopoyesis", R.drawable.eritropoyesis))

    val sisUrinario = listOf(
        CategoryModel("56", "Riñon", R.drawable.suprarrenal),
        CategoryModel("57", "Ureter", R.drawable.ureter2),//asdas
        CategoryModel("58", "Vejiga Urinaria", R.drawable.vejiga),
        CategoryModel("59", "Uretra", R.drawable.uretra))

    val sisReproductor = listOf(
        CategoryModel("60", "Testiculo", R.drawable.testicuilo),
        CategoryModel("61", "Ovario", R.drawable.ovario),
        CategoryModel("62", "Epididimo y conductillos", R.drawable.epididimo),
        CategoryModel("63", "Cuerpo luteo", R.drawable.cuerpoluteojpg),
        CategoryModel("64", "Cordon espermatico", R.drawable.epididimo),
        CategoryModel("65", "Trompa uterina", R.drawable.trompafalopio),
        CategoryModel("66", "Cuerpo del pene", R.drawable.peneicon2), //asdas
        CategoryModel("67", "Placenta", R.drawable.placenta),
        CategoryModel("68", "Prostata", R.drawable.prostata),
        CategoryModel("69", "Cordon umbilical", R.drawable.cordonumbilical),
        CategoryModel("70", "Vesicula seminal", R.drawable.epididimo),//asasda
        CategoryModel("71", "Útero 1", R.drawable.ovario),
        CategoryModel("72", "Útero 2", R.drawable.trompafalopio),
        CategoryModel("73", "Glandula mamaria", R.drawable.glandulamamaria))

    val muscular = listOf(
        CategoryModel("74", "Musculo esqueletico", R.drawable.muscle),
        CategoryModel("75", "Union musculo tendinosa", R.drawable.tendon2),//asdasd
        CategoryModel("76", "Union neuromuscular", R.drawable.unionneuromuscular),
        CategoryModel("77", "Musculo cardiaco", R.drawable.musculocardiaco),
        CategoryModel("78", "Musculo liso", R.drawable.liso))

    val eyeAndEar = listOf(
        CategoryModel("79", "Segmento anterior del ojo", R.drawable.eye),
        CategoryModel("80", "Esclera, cornea y cristalino", R.drawable.cornea__cristalino),
        CategoryModel("81", "S. posterior del ojo", R.drawable.posterioreye),
        CategoryModel("82", "Oido", R.drawable.oreja),//asdas
        CategoryModel("83", "Organo de corti", R.drawable.organ_of_corti))

    val tegumentary = listOf(
        CategoryModel("84", "Piel gruesa", R.drawable.piel_gruesa),
        CategoryModel("85", "Piel fina", R.drawable.pielfina),
        CategoryModel("86", "Glandulas sudoriparas", R.drawable.skin),
        CategoryModel("87", "Glandulas cebaceas", R.drawable.sudoripara),
        CategoryModel("88", "Foliculo piloso y uña", R.drawable.skin))

    val questions = listOf(
        QuestionModel(1, "Cuanto es 2+2", "1", "2","3", "4",  4),
        QuestionModel(2, "Cuanto es 2+3", "1", "5","3", "4",  2),
        QuestionModel(3, "Cuanto es 2+4", "6", "2","3", "4",  1),
        QuestionModel(4, "Cuanto es 2+5", "1", "2","3", "7",  4),
        QuestionModel(5, "Cuanto es 2+6", "1", "2","8", "4",  3),
        QuestionModel(6, "Cuanto es 2+2", "1", "2","3", "4",  4),
        QuestionModel(7, "Cuanto es 2+3", "1", "5","3", "4",  2),
        QuestionModel(8, "Cuanto es 2+4", "6", "2","3", "4",  1),
        QuestionModel(9, "Cuanto es 2+5", "1", "2","3", "7",  4),
        QuestionModel(10, "Cuanto es 2+6", "1", "2","8", "4",  3),
        QuestionModel(11, "Cuanto es 2+2", "1", "2","3", "4",  4),
        QuestionModel(12, "Cuanto es 2+3", "1", "5","3", "4",  2),
        QuestionModel(13, "Cuanto es 2+4", "6", "2","3", "4",  1),
        QuestionModel(14, "Cuanto es 2+5", "1", "2","3", "7",  4),
        QuestionModel(15, "Cuanto es 2+6", "1", "2","8", "4",  3),
        QuestionModel(16, "Cuanto es 2+2", "1", "2","3", "4",  4),
        QuestionModel(17, "Cuanto es 2+3", "1", "5","3", "4",  2),
        QuestionModel(18, "Cuanto es 2+4", "6", "2","3", "4",  1),
        QuestionModel(19, "Cuanto es 2+5", "1", "2","3", "7",  4),
        QuestionModel(20, "Cuanto es 2+6", "1", "2","8", "4",  3),
        QuestionModel(21, "", "", "","", "",  3))
}