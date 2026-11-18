package pe.upc.urbanfix.incidencias.domain;
import java.util.List; import java.util.Optional;
import pe.upc.urbanfix.autenticacion.Tecnico;
/**
 * Patrón Strategy: define cómo se elige al técnico que atenderá una incidencia.
 * Devuelve Optional.empty() si ningún técnico está disponible.
 */
public interface IAsignacionStrategy { Optional<Tecnico> elegirTecnico(Incidencia incidencia, List<Tecnico> tecnicos); }
