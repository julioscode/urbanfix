# UrbanFix – backend core (implementación de referencia)
Módulos M1 (autenticación) y M2 (incidencias) con sus colaboradores de M4 y del núcleo.
Patrones: State, Strategy, Observer, Adapter, Factory Method. Pruebas: `mvn test`.
Ramas: `main` (estable), `develop` (integración), `feature/<historia>`. Commits: Conventional Commits.

Demostración del flujo principal (compilar y ejecutar):

    mvn -q compile
    java -cp target/classes pe.upc.urbanfix.demo.DemoFlujoPrincipal
