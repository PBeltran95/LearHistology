package ar.com.learnhistology.learnhistology.data

import ar.com.learnhistology.learnhistology.R
import ar.com.learnhistology.learnhistology.data.models.CategoryModel
import ar.com.learnhistology.learnhistology.data.models.QuestionModel

object CategoryObjects {


    val epithelial = listOf(//Implementar Room para que cada objeto venga de una DB
        CategoryModel("1", "Epitelios", R.drawable.epiteliocubico2),
        CategoryModel("2", "Tejido conectivo laxo", R.drawable.conectivo_icon),
        CategoryModel("3", "Tejido conectivo denso", R.drawable.denso)
    )

    val tejidoAdiposo = listOf(
        CategoryModel("4", "Tejido adiposo", R.drawable.fat),
        CategoryModel("5", "Cartilago hialino", R.drawable.hialino),
        CategoryModel("6", "Cartilago fibroso", R.drawable.fibroso2),//sad
        CategoryModel("7", "Cartilago elastico", R.drawable.elastico2)
    )

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
        CategoryModel("23", "Pancreas", R.drawable.pancreas)
    )

    val respiratory = listOf(
        CategoryModel("24", "Mucosa olfatoria", R.drawable.bulboolfatorio),
        CategoryModel("25", "Laringe", R.drawable.laringe),
        CategoryModel("26", "Traquea", R.drawable.traquea),
        CategoryModel("27", "Bronquio y bronquiolo", R.drawable.bronquio),
        CategoryModel("28", "Bronquiolo terminal y alveolo", R.drawable.alveolo_1)
    )

    val cardioVascular = listOf(
        CategoryModel("29", "Corazon", R.drawable.cardio),
        CategoryModel("30", "Arterias coronarias", R.drawable.coronarias),
        CategoryModel("31", "Aorta", R.drawable.aorta),
        CategoryModel("32", "Arterias y Venas", R.drawable.arteriasvenas),
        CategoryModel("33", "Arteriolas y linfaticos", R.drawable.linfatic),
        CategoryModel("34", "Conducto toracico", R.drawable.conductotoracico)
    )

    val nervioso = listOf(
        CategoryModel("35", "Nervio Periferico", R.drawable._688310),
        CategoryModel("36", "Perineuro", R.drawable.perineuro_1),
        CategoryModel("37", "Ganglios simpaticos", R.drawable.nervioso),
        CategoryModel("38", "Cerebro", R.drawable.cerebro),
        CategoryModel("39", "Cerebelo", R.drawable.cerebelo),
        CategoryModel("40", "Medula espinal", R.drawable.medulaespinal)
    )

    val linfatico = listOf(
        CategoryModel("41", "Amigdala palatina", R.drawable.amigdala),
        CategoryModel("42", "Ganglio linfatico", R.drawable.ganglio),
        CategoryModel("43", "Bazo", R.drawable.bazo),
        CategoryModel("44", "Timo", R.drawable.timo)
    )

    val endocrino = listOf(
        CategoryModel("45", "Hipofisis", R.drawable.hipotalamo),
        CategoryModel("46", "Glandula pineal", R.drawable.pineal),
        CategoryModel("47", "Tiroides", R.drawable.tiroides),
        CategoryModel("48", "Paratiroides", R.drawable.paratiroides),
        CategoryModel("49", "Suprarrenal", R.drawable.suprarrenal)
    )

    val sistemaOseo = listOf(
        CategoryModel("50", "Tejido Oseo", R.drawable.images),
        CategoryModel("51", "Osificacion endocondral", R.drawable.endocondral),
        CategoryModel("52", "Osificacion intramembranosa", R.drawable.endocondral),
        CategoryModel("53", "Eritrocitos y granulocitos", R.drawable.eritrocito),
        CategoryModel("54", "Agranulocitos y medula osea", R.drawable.medulaosea),
        CategoryModel("55", "Eritropoyesis y granulopoyesis", R.drawable.eritropoyesis)
    )

    val sisUrinario = listOf(
        CategoryModel("56", "Riñon", R.drawable.suprarrenal),
        CategoryModel("57", "Ureter", R.drawable.ureter2),//asdas
        CategoryModel("58", "Vejiga Urinaria", R.drawable.vejiga),
        CategoryModel("59", "Uretra", R.drawable.uretra)
    )

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
        CategoryModel("73", "Glandula mamaria", R.drawable.glandulamamaria)
    )

    val muscular = listOf(
        CategoryModel("74", "Musculo esqueletico", R.drawable.muscle),
        CategoryModel("75", "Union musculo tendinosa", R.drawable.tendon2),//asdasd
        CategoryModel("76", "Union neuromuscular", R.drawable.unionneuromuscular),
        CategoryModel("77", "Musculo cardiaco", R.drawable.musculocardiaco),
        CategoryModel("78", "Musculo liso", R.drawable.liso)
    )

    val eyeAndEar = listOf(
        CategoryModel("79", "Segmento anterior del ojo", R.drawable.eye),
        CategoryModel("80", "Esclera, cornea y cristalino", R.drawable.cornea__cristalino),
        CategoryModel("81", "S. posterior del ojo", R.drawable.posterioreye),
        CategoryModel("82", "Oido", R.drawable.oreja),//asdas
        CategoryModel("83", "Organo de corti", R.drawable.organ_of_corti)
    )

    val tegumentary = listOf(
        CategoryModel("84", "Piel gruesa", R.drawable.piel_gruesa),
        CategoryModel("85", "Piel fina", R.drawable.pielfina),
        CategoryModel("86", "Glandulas sudoriparas", R.drawable.skin),
        CategoryModel("87", "Glandulas cebaceas", R.drawable.sudoripara),
        CategoryModel("88", "Foliculo piloso y uña", R.drawable.skin)
    )

    val questions = listOf(
        QuestionModel(1, "El cordón umbilical contiene:",
            "Dos arterias y una vena rodeados por cartílago elástico ",
            "Dos venas y una arteria rodeados por tejido conjuntivo laxo",
            "Dos venas y una arteria rodeados por gelatina de Warthon",
            "Dos arterias y una vena rodeados por gelatina de Warthon ",  4),
        QuestionModel(2, "Los conductos de Volkman:",
            "Forma parte de los conductos de Havers",
            "Interconecta los conductos de Havers ",
            "No se relaciona con el tejido óseo",
            "No existen",  2),
        QuestionModel(3, "¿Respecto al tejido cartilaginoso cuál de estas es la afirmación correcta?",
            "El tejido cartilaginoso es un tejido conjuntivo especializado, con baja capilaridad, irrigado escasamente y tiene una matriz de fibras colágenas y GAGs. ",
            "El tejido cartilaginoso elástico es el componente cartilaginoso de las diartrosis (articulaciones muy móviles).",
            "La matriz del cartílago es rica en agrecano-hialuronano y GAGs para permitir su nutrición e hidratación.",
            "Los condrocitos son células con un metabolismo elevado, con alta capacidad de realizar varias mitosis y encargadas de mantener la matriz cartilaginosa.",
            1),
        QuestionModel(4, "Las células secretoras de una glándula están sostenidas por una estructura del tejido conectivo llamada:",
            "Trabécula",
            "Parénquima",
            "Serosa",
            "Estroma ",  4),
        QuestionModel(5, "Páncreas endocrino: secreción y ubicación de las células:",
            "El componente endocrino NO se encuentra en los islotes de Langerhans y secretan principalmente insulina, glucagón, somatostatina, polipéptido pancreático, péptido intestinal vasoactivo, secretina, la motilina, y la sustancia P.",
            "El componente endocrino NO se encuentra en los islotes de Langerhans y secretan principalmente glucagón, somatostatina , secretina, la motilina, y la sustancia P.",
            "El componente endocrino se encuentra en los islotes de Langerhans y secretan principalmente insulina, glucagón, somatostatina, polipéptido pancreático, péptido intestinal vasoactivo, secretina, la motilina, y la sustancia P. ",
            "El componente endocrino se encuentra en los islotes de Langerhans y secretan principalmente insulina, glucagón, somatostatina, polipéptido pancreático, péptido intestinal vasoactivo, y la sustancia P.",
            3),
        QuestionModel(6, "El colágeno más predominante en el cuerpo humano es:",
            "Colágeno tipo VII",
            "Colágeno tipo V",
            "Colágeno tipo III",
            "Colágeno tipo I ",  4),
        QuestionModel(7, "En un corte histológico de Lengua se pueden describir las siguientes papilas:",
            "Filiformes, fungiformes, caliciformes y gigantes.",
            "Filiformes, fungiformes, caliciformes y foliadas.",
            "Fungiformes, caliciformes.",
            "Filiformes, foliadas y caliciformes.",  2),
        QuestionModel(8, "¿Qué tipo de ácinos tienen las glándulas parótidas?",
            "Contienen ácinos serosos. ",
            "Contienen ácinos mixtos.",
            "Contienen ácinos mucosos.",
            "No contienen.",  1),
        QuestionModel(9, "La función de un epitelio estratificado es:",
            "Absorción y comunicación.",
            "Barrido y protección",
            "Transporte, absorción y secreción. ",
            "Protección y cierto grado de impermeabilización. ",  4),
        QuestionModel(10, "El epitelio de la glándula fúndica tiene cuatro tipos de células:",
            "Celulas mucosas del cuello, células oxifilicas, pinealocitos, células parietales, células principales, células enteroendocrinas y células madre.",
            "Células granulares, mastocitos y células madre.",
            "Principales, las células mucosas del cuello, células parietales, células principales, células enteroendocrinas y células madre. ",
            "Células principales, las células mucosas del cuello, células parietales, células principales y células madre.",
            3),
        QuestionModel(11, "Las glándulas de Brunner secretan:",
            "Moco acido", "Liquido lubricante","Enzimas digestivas",
            "Moco alcalino ",  4),
        QuestionModel(12, "¿Teniendo en cuenta su función, cómo es el epitelio traqueal?  ",
            "Epitelio de transición", "Pseudoestrateficado cilíndrico ciliado. ","Estratificado plano",
            "Epitelio cilíndrico estratificado.",  2),
        QuestionModel(13, "¿Por qué tipos celulares está compuesto el epitelio alveolar??",
            "Neumocitos tipo I y II. ", "Epitelio cubico simple.",
            "Neumocitos tipo I, II y III.", "Ninguna.",  1),
        QuestionModel(14, "¿En qué se diferencian las arterias de las venas?",
            "Unas se dibujan azules y otras rojas.", "Por la túnica adventicia",
            "Por la túnica intima", "Por la túnica media ",  4),
        QuestionModel(15, "Indique el orden de las capas celulares de la corteza cerebral:",
            "Capa molecular, capa granulosa interna, capa granulosa externa, capa piramidal externa, capa piramidal interna y capa multiforme.",
            "Capa granulosa interna, capa molecular capa granulosa externa, capa piramidal externa, capa piramidal interna y capa multiforme.",
            "Capa molecular, capa granulosa externa, capa piramidal externa, capa granulosa interna, capa piramidal interna y capa multiforme. ",
            "Capa multiforme, piramidal interna, granulosa interna, capa piramidal externa, capa granulosa externa y capa molecular.",  3),
        QuestionModel(16, "¿Que contiene la pulpa blanca del bazo? ",
            "Gran cantidad de tejido conjuntivo",
            "Gran cantidad de tejido conjuntivo laxo.",
            "Tejido adiposo.",
            "Gran cantidad de linfocitos. ",  4),
        QuestionModel(17, "¿Qué tipo de epitelio reviste la mucosa uretral?",
            "Epitelio estratificado plano.", "Epitelio de transición. ",
            "Epitelio estratificado cubico.", "Epitelio cubico simple.",  2),
        QuestionModel(18, "En que capas se organizan las glándulas prostáticas:",
            "Mucosa, submucosa y periférica. ",
            "Mucosa, submucosa, muscular y adventicia.",
            "Mucosa, submucosa.",
            "Mucosa, submucosa, muscular circular, muscular longitudinal y periférica. ",  1),
        QuestionModel(19, "¿Porque se caracteriza el tejido conjuntivo laxo?",
            "Por una proporción baja de fibras de colágeno y elastina, pero alta de células. ",
            "Por una proporción alta de células. Estas células normalmente son condrocitos, y células de defensa.",
            "Por una proporción baja de células y abundante matriz.",
            "Por una proporción alta de células en una matriz de fibras de colágeno delgadas y escasas. " +
                    "Estas células normalmente son fibroblastos, y células de defensa.",  4),
        QuestionModel(20, "¿Dónde se pueden hallar los folículos primordiales en el ovario?",
            "En la medula ovárica", "En la túnica albugínea","En la corteza", "En la submucosa",  3),
        QuestionModel(21, "", "",
            "","", "",  3)
    )
}