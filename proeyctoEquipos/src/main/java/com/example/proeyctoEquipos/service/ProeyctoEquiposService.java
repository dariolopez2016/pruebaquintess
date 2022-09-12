package com.example.proeyctoEquipos.service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.example.proeyctoEquipos.dto.TeamDTO;

public interface ProeyctoEquiposService {

	public List<TeamDTO> obtenerEquipos();

	public List<TeamDTO> obtenerRankingEquipos();

	public Map<String, List<TeamDTO>> obtenerEquiposAgrupados();
	public TreeMap<String, TeamDTO>  obtenerEquiposAgrupadosYOrdenados();

}
