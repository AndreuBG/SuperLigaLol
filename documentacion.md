# ESports LOL

## Clases

### Equipo
- Nombre
- Tag
- Lista titulares
- Lista reservas
- Entrenador
### Jugador
- Nombre
- Apellido
- Nickname
- Edad
- Rol
- Nacionalidad
### Entrenador
- Nombre
- Apellido
- Edad
### Jornada
- Numero
- Lista partidas
### Clasificacion
- Ranking equipos
### Partida
- Equipo1
- Lista jugadoresEquipo1
- Equipo2
- Lista jugadoresEquipo2
- Ganador
- Diferencia de oro
### Playoffs


```plantuml
@startuml


class Equipo {
    - Nombre: String
    - Siglas: String
    - Lista titulares: List<Jugador>
    - Lista reservas: List<Jugador>
    - Entrenador: Entrenador
}

class Jugador {
    - Nombre: String
    - Sueldo: Float
    - Edad: Int
    - PosicionMasUsada: String
    - Nacionalidad: String
}

class Entrenador {
    - Nombre: String
    - Sueldo: Float
    - Edad: Int
}

class Jornada {
    - Numero: Int
    - Lista partidas: List<Partida>
}

class Clasificacion {
    - Ranking equipos: List<Equipo>
}

class Partida {
    - Equipo1: Equipo
    - Lista jugadoresEquipo1: List<Jugador>
    - Equipo2: Equipo
    - Lista jugadoresEquipo2: List<Jugador>
    - Ganador: Equipo
    - Diferencia de oro: Float
}

Equipo "1" -- "11" Jugador : tiene >
Equipo "1" -- "1" Entrenador : dirige >
Jornada "1" -- "*" Partida : contiene >
Clasificacion "1" -- "*" Equipo : clasifica >
Partida "1" -- "1" Equipo : equipo1 >
Partida "1" -- "1" Equipo : equipo2 >
Partida "1" -- "1" Equipo : ganador >
Partida "1" -- "*" Jugador : jugadoresEquipo1 >
Partida "1" -- "*" Jugador : jugadoresEquipo2 >

@enduml
```