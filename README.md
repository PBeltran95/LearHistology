# Primer-proyecto-LearHistology

La idea de la app es estar orientada a estudiantes de medicina, particularmente de la materia de histología, cuando fui alumno me hizo falta tener a mano las imágenes para consultarlas a la hora del estudio ya sea con el microscopio en mano o cuando iba en viaje al examen, por eso, la aplicación está orientada a mostrar todas las imágenes microscópicas de cada órgano del cuerpo humano, ordenadas por categoría y de una manera amigable al usuario.

Para eso y como primer proyecto me baso sobre todo en el navigation component de Android, con un solo activity estoy almacenando 3 fragmentos y entre ellos se van informando sobre que mostrar en la pantalla siguiente para de esa manera reutilizar los fragmentos y ahorrar recursos. Con lo que se estan reciclando constantemente TODOS los elementos, logrando asi que una app con mas de 200 imagenes pese menos de 50MB con un rendimiento excelente.

https://play.google.com/store/apps/details?id=ar.com.learnhistology.learnhistology


Con la pantalla de inicio se adjuntan los distintos sistemas del cuerpo de manera amigable y siguiendo los lineamientos de material design, en lugar de utilizar botones tradicionales decidí utilizar material cardViews con botones e imágenes, les agregué el parámetro de elevation para que en la interfaz tuvieran la sombra que es tan estética.

Una vez elegida la categoría se lleva a otra subcategoría donde el usuario elige el órgano que quiere inspeccionar, y allí dependiendo siempre de que botón se presione se reutiliza el fragmento para mostrar la información y las imágenes. 

Sumado a lo previo me gustaría agregar que la aplicación cuenta con menu de opciones para así poder elegir entre modo oscuro y modo claro a gusto del usuario, así también como un botón de compartir y un intent para referirlo a la página de calificaciones de Playstore. Además, ahora la app cuenta con un botón de QUIZ con el cual lleva a unas 20 preguntas que estan basadas en preguntas reales de examenes parciales de histologia. 

Finalmente aqui debajo dejo un video de muestra con todas las funcionalidades de la App.

[![Alt text](https://img.youtube.com/vi/rNR5wN4LG04/0.jpg)](https://www.youtube.com/watch?v=rNR5wN4LG04)


##Las tecnologias utilizadas para este proyecto fueron:

-ConstraintLayout
-RecyclerView
-Corrutinas
-NavGraph
-expandableTextView
-TouchImageView de mikeOrtiz
-Viewpager
-Room
-Arquitectura MVVM
-Adservices de googlePlay services
-Glide

##Algunas capturas mas!

<img src="screen1 (1).png" width="300" height="600"><img src="screen1 (2).png" width="300" height="600">

Gracias por leer y saludos!
