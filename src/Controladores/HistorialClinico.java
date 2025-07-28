package Controladores;

import DAOs.DaoCita;
import DAOs.DaoConsulta;
import DAOs.DaoMascota;
import DAOs.DaoVacuna;
import DAOs.DaoVeterinario;
import DTOs.CitaDTO;
import DTOs.ConsultaDTO;
import DTOs.MascotaDTO;
import DTOs.VacunaDTO;
import DTOs.VeterinarioDTO;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class HistorialClinico {
    
    private final DaoCita daoCita;
    private final DaoVacuna daoVacuna;
    private final DaoConsulta daoConsulta;
    private final DaoVeterinario daoVeterinario;
    private final DaoMascota daoMascota;
    
    private final DateTimeFormatter fechaFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private final DateTimeFormatter horaFormatter = DateTimeFormatter.ofPattern("HH:mm");
    
    public HistorialClinico(DaoCita daoCita, DaoVacuna daoVacuna, 
                                  DaoConsulta daoConsulta, DaoVeterinario daoVeterinario,
                                  DaoMascota daoMascota) {
        this.daoCita = daoCita;
        this.daoVacuna = daoVacuna;
        this.daoConsulta = daoConsulta;
        this.daoVeterinario = daoVeterinario;
        this.daoMascota = daoMascota;
    }

    public String obtenerHistorialClinico(int idMascota) {
        StringBuilder historial = new StringBuilder();
        
        MascotaDTO mascotaDTO = daoMascota.buscarMascota(idMascota);
        if (mascotaDTO == null) {
            return "No se encontró información de la mascota.";
        }
        
        historial.append("╔════════════════════════════════════════════════════════════╗\n");
        historial.append("║               HISTORIAL CLÍNICO VETERINARIO                ║\n");
        historial.append("╚════════════════════════════════════════════════════════════╝\n\n");
        
        historial.append("📋 DATOS DE LA MASCOTA\n");
        historial.append("─────────────────────────────────────────\n");
        historial.append("• Nombre: ").append(mascotaDTO.getNombre()).append("\n");
        historial.append("• Especie: ").append(mascotaDTO.getEspecie()).append("\n");
        historial.append("• Raza: ").append(mascotaDTO.getRaza()).append("\n");
        historial.append("• Edad: ").append(mascotaDTO.getEdad()).append(" años\n");
        historial.append("• Peso: ").append(mascotaDTO.getPeso()).append(" kg\n");
        historial.append("• ID: ").append(mascotaDTO.getIdMascota()).append("\n\n");
        
        ArrayList<CitaDTO> citas = daoCita.obtenerCitasPorMascota(idMascota);
        if (!citas.isEmpty()) {
            historial.append("📅 CITAS\n");
            historial.append("─────────────────────────────────────────\n");
            
            citas.sort((c1, c2) -> c2.getFecha().compareTo(c1.getFecha()));
            
            for (CitaDTO citaDTO : citas) {
                historial.append(formatearDetalleCita(citaDTO)).append("\n");
            }
            historial.append("\n");
        }
        
        ArrayList<ConsultaDTO> consultas = daoConsulta.obtenerConsultasPorMascota(idMascota);
        if (!consultas.isEmpty()) {
            historial.append("🏥 CONSULTAS\n");
            historial.append("─────────────────────────────────────────\n");
            
            consultas.sort((c1, c2) -> c2.getFecha().compareTo(c1.getFecha()));
            
            for (ConsultaDTO consultaDTO : consultas) {
                historial.append(formatearDetalleConsulta(consultaDTO)).append("\n");
            }
            historial.append("\n");
        }
        
        ArrayList<VacunaDTO> vacunas = daoVacuna.obtenerVacunasPorMascota(idMascota);
        if (!vacunas.isEmpty()) {
            historial.append("💉 VACUNAS\n");
            historial.append("─────────────────────────────────────────\n");
            
            vacunas.sort((v1, v2) -> v2.getFecha().compareTo(v1.getFecha()));
            
            for (VacunaDTO vacunaDTO : vacunas) {
                historial.append(formatearDetalleVacuna(vacunaDTO)).append("\n");
            }
        }
        
        if (citas.isEmpty() && consultas.isEmpty() && vacunas.isEmpty()) {
            historial.append("\n⚠️ No se encontraron registros clínicos para esta mascota.\n");
        }
        
        historial.append("\n─────────────────────────────────────────\n");
        historial.append("Historial generado el: ").append(
            java.time.LocalDateTime.now().format(
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")
            )
        );
        
        return historial.toString();
    }

    private String formatearDetalleCita(CitaDTO citaDTO) {
        StringBuilder detalle = new StringBuilder();
        
        VeterinarioDTO veterinario = null;
        if (citaDTO.getIdVeterinario() > 0) {
            veterinario = daoVeterinario.buscarVeterinario(citaDTO.getIdVeterinario());
        }
        
        detalle.append("• Cita #").append(citaDTO.getIdCita()).append(" - ");
        detalle.append(citaDTO.getFecha().format(fechaFormatter)).append(" ");
        detalle.append(citaDTO.getHoraCita().format(horaFormatter)).append("\n");
        
        detalle.append("  Veterinario: ");
        detalle.append(veterinario != null ? veterinario.getNombre() : "No asignado").append("\n");
        
        detalle.append("  Estado: ");
        if (citaDTO.isAtendida()) {
            detalle.append("✓ Atendida");
            if (citaDTO.getIdConsulta() > 0) {
                detalle.append(" (Ver consulta #").append(citaDTO.getIdConsulta()).append(")");
            }
        } else {
            detalle.append("⏳ Pendiente");
        }
        detalle.append("\n");
        
        detalle.append("  Motivo: ").append(citaDTO.getDescripcion()).append("\n");
        
        return detalle.toString();
    }

    private String formatearDetalleConsulta(ConsultaDTO consultaDTO) {
        StringBuilder detalle = new StringBuilder();
        
        VeterinarioDTO veterinario = null;
        if (consultaDTO.getIdVeterinario() > 0) {
            veterinario = daoVeterinario.buscarVeterinario(consultaDTO.getIdVeterinario());
        }
        
        detalle.append("• Consulta #").append(consultaDTO.getIdConsulta()).append(" - ");
        detalle.append(consultaDTO.getFecha().format(fechaFormatter)).append("\n");
        
        detalle.append("  Veterinario: ");
        detalle.append(veterinario != null ? veterinario.getNombre() : "No especificado").append("\n");
        
        if (consultaDTO.getIdCita() > 0) {
            detalle.append("  Relacionada con cita #").append(consultaDTO.getIdCita()).append("\n");
        }
        
        detalle.append("  Motivo: ").append(consultaDTO.getDescripcion()).append("\n");
        
        if (consultaDTO.getDiagnostico() != null && !consultaDTO.getDiagnostico().isEmpty()) {
            detalle.append("  Diagnóstico: ").append(consultaDTO.getDiagnostico()).append("\n");
        }
        
        if (consultaDTO.getTratamiento() != null && !consultaDTO.getTratamiento().isEmpty()) {
            detalle.append("  Tratamiento: ").append(consultaDTO.getTratamiento()).append("\n");
        }
        
        return detalle.toString();
    }
 
    private String formatearDetalleVacuna(VacunaDTO vacunaDTO) {
        StringBuilder detalle = new StringBuilder();
        
        VeterinarioDTO veterinario = null;
        if (vacunaDTO.getIdVacuna() > 0) {
            veterinario = daoVeterinario.buscarVeterinario(vacunaDTO.getIdVacuna());
        }
        
        detalle.append("• ").append(vacunaDTO.getFecha().format(fechaFormatter)).append(" - ");
        detalle.append(vacunaDTO.getTipoVacuna()).append("\n");
        
        detalle.append("  Aplicada por: ");
        detalle.append(veterinario != null ? veterinario.getNombre() : "No especificado").append("\n");
        
        if (vacunaDTO.getDescripcion() != null && !vacunaDTO.getDescripcion().isEmpty()) {
            detalle.append("  Observaciones: ").append(vacunaDTO.getDescripcion()).append("\n");
        }
        
        return detalle.toString();
    }

    public String obtenerResumenHistorial(int idMascota) {
        MascotaDTO mascotaDTO = daoMascota.buscarMascota(idMascota);
        if (mascotaDTO == null) {
            return "No se encontró información de la mascota.";
        }
        
        int totalCitas = daoCita.obtenerCitasPorMascota(idMascota).size();
        int totalConsultas = daoConsulta.obtenerConsultasPorMascota(idMascota).size();
        int totalVacunas = daoVacuna.obtenerVacunasPorMascota(idMascota).size();
        
        StringBuilder resumen = new StringBuilder();
        resumen.append("Resumen de ").append(mascotaDTO.getNombre()).append(":\n");
        resumen.append("• Total de citas: ").append(totalCitas).append("\n");
        resumen.append("• Total de consultas: ").append(totalConsultas).append("\n");
        resumen.append("• Total de vacunas: ").append(totalVacunas).append("\n");
        
        return resumen.toString();
    }
}
