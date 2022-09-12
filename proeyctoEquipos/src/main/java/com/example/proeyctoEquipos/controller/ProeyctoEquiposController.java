package com.example.proeyctoEquipos.controller;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proeyctoEquipos.dto.TeamDTO;
import com.example.proeyctoEquipos.service.ProeyctoEquiposServiceImpl;

/**
 * 
 * @author dario.lopez
 * @date 12/09/2022
 *
 */
@RestController
public class ProeyctoEquiposController {

	@Autowired
	ProeyctoEquiposServiceImpl proeyctoEquiposService;

	@GetMapping("/obtenerListadoEquipos")
	public List<TeamDTO> obtenerListadoEquipos() {

		return proeyctoEquiposService.obtenerEquipos();
	}

	@GetMapping("/obtenerRankingEquipos")
	public List<TeamDTO> obtenerRankingEquipos() {

		return proeyctoEquiposService.obtenerRankingEquipos();
	}

	@GetMapping("/obtenerEquiposAgrupados")
	public Map<String, List<TeamDTO>> obtenerEquiposAgrupados() {

		return proeyctoEquiposService.obtenerEquiposAgrupados();
	}

	@GetMapping("/obtenerEquiposAgrupadosYOrdenados")
	public TreeMap<String, TeamDTO> obtenerEquiposAgrupadosYOrdenados() {

		return proeyctoEquiposService.obtenerEquiposAgrupadosYOrdenados();
	}

}
