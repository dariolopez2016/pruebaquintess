package com.example.proeyctoEquipos.controller;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.proeyctoEquipos.dto.TeamDTO;
import com.example.proeyctoEquipos.service.ProeyctoEquiposService;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.platform.runner.JUnitPlatform;

/**
 * 
 * @author dario.lopez
 * @date 12/09/2022
 *
 */

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class ProeyctoEquiposControllerTest {

	@InjectMocks
	ProeyctoEquiposController proeyctoEquiposController;

	@Mock
	ProeyctoEquiposService proeyctoEquiposService;

	@Test
	void testObtenerEquipos() {
		when(proeyctoEquiposService.obtenerEquipos()).thenReturn((List<TeamDTO>) equipoObjeto());
		List<TeamDTO> respuesta = proeyctoEquiposController.obtenerListadoEquipos();
		Assert.assertNotNull(respuesta);
	}

	private List<TeamDTO> equipoObjeto() {
		TeamDTO item1 = new TeamDTO("A","BM",1);
		TeamDTO item2 = new TeamDTO("E","RM",2);


		ArrayList<TeamDTO> respuesta = new ArrayList<>();
		respuesta.add(item1);
		respuesta.add(item2);

		return respuesta;
	}

}
