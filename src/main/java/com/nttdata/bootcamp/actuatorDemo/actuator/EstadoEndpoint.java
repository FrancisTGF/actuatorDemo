package com.nttdata.bootcamp.actuatorDemo.actuator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;


public class EstadoEndpoint {
	
	private List<String> listado =new ArrayList<>();
	
	@ReadOperation
	public List<String> estados(){
		return listado;
		
	}
	@WriteOperation
	public void writeOperation(@Selector String estadoNuevo){
		listado.add(estadoNuevo);
		
	}
	@DeleteOperation
	public void deleteOperation(@Selector String estadoBorrar){
		listado.remove(estadoBorrar);
		
	}
	
	
}
