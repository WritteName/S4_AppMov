package com.example.s4_appmov

object cuestionario {
    val Preguntas = arrayOf( // []
        "¿Qué es un Activity en Android?",
        "Una actividad Android fue lanzada y luego otra fue abierta encima de ella. ¿En qué estado se encuentra la actividad anterior?",
        "¿En qué archivo se define la interfaz gráfica?",
        "¿Qué patrón de arquitectura es recomendado por Google para apps Android?",
        "¿Qué función cumple AndroidManifest.xml?",
        "¿Qué archivo define las dependencias del proyecto?",
        "¿Por qué se recomienda usar Fragments en lugar de múltiples Activities para navegar dentro de una sola pantalla?",
        "¿Cuál es el ciclo de vida correcto de una actividad?",
        "¿Qué lenguaje se usa comúnmente para desarrollar en Android?",
        "¿Qué clase se usa para detectar cambios de red?"
    )

    val Alternativas = arrayOf( // [][]
        arrayOf("Un archivo de imagen","Una pantalla de la app","Un archivo de texto","Un botón"),
        arrayOf("Running","Resumed","Paused","Destroyed"),
        arrayOf("AndroidManifest.xml","build.gradle","activity_main.xml","strings.xml"),
        arrayOf("MVP","MVVM","MVC","Singleton"),
        arrayOf("Almacenar imágenes","Configurar diseño","Declarar componentes de la app","Controlar colores"),
        arrayOf("res/layout","gradle.properties","build.gradle","MainActivity.kt"),
        arrayOf("Los Fragments no requieren layouts","Los Fragments no pueden ser gestionados dinámicamente","Permiten una navegación más ligera y reutilizable dentro de una misma Activity","Los Fragments son más rápidos en compilar"),
        arrayOf("onStart → onCreate → onResume","onCreate → onStart → onResume","onResume → onPause → onCreate","onCreate → onResume → onStart"),
        arrayOf("C++","Kotlin","Swift","PHP"),
        arrayOf("NetworkChecker","NetworkMonitor","BroadcastReceiver","Service")
    )

    val Respuestas = arrayOf( // []
        "Una pantalla de la app",
        "Paused",
        "activity_main.xml",
        "MVVM",
        "Declarar componentes de la app",
        "build.gradle",
        "Permiten una navegación más ligera y reutilizable dentro de una misma Activity",
        "onCreate → onStart → onResume",
        "Kotlin",
        "Service"
    )
}