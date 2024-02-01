/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.siman.creditos.service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
//import com.siman.creditos.utils.Constants;
//import com.siman.creditos.utils.ExecuteCommand;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 *
 * @author kevin_aristondo
 */
@Path("/collectorService")
public class CollectorService {
    
    @POST
    @Path("/ejecutar")
    @Produces(MediaType.APPLICATION_JSON)
    public Response ejecutar(String json) {
        /*Gson gson = new Gson();
	JsonObject jobj = gson.fromJson(json, JsonObject.class);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fechaInicio = format.format(new Date());
        try {
            String  command = "ssh"+" "+Constants.COMANDO_SSH_SERVER+" "+Constants.COMANDO_SSH_ARCHIVO_COLLECTOR+" "+jobj.get("pais").getAsString();
            ExecuteCommand executeCommand = new ExecuteCommand();
            executeCommand.exeCommand(command);
        
        } catch (Exception e) {
            return Response.status(204).entity("ERROR (collectorService:ejecutar - Exception): "+e.getMessage()+" - "+e.getCause()).build();
        }
       return Response.status(201).entity(gson.toJson(fechaInicio)).build();*/
    	return null;
    }
    
    @POST
    @Path("/ejecutarModeloCobranza")
    @Produces(MediaType.APPLICATION_JSON)
    public Response ejecutarModeloCobranza(String json) {
        /*Gson gson = new Gson();
	JsonObject jobj = gson.fromJson(json, JsonObject.class);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fechaInicio = format.format(new Date());
        String command="";
        try {
               
                command = "ssh"+" "+Constants.COMANDO_SSH_SERVER+" "+Constants.COMANDO_SSH_ARCHIVO;
                command=command+" "+jobj.get("pais").getAsString(); 
                command=command+" "+jobj.get("edadMora").getAsString();
                command=command+" "+jobj.get("ciclo").getAsString();
                command=command+" "+jobj.get("mes").getAsString();
                command=command+" "+jobj.get("diaFacturacion").getAsString();
                command=command+" "+jobj.get("producto").getAsString();
                command=command+" "+jobj.get("productos").getAsString();
                command=command+" "+jobj.get("cadena").getAsString();
                command=command+" "+jobj.get("fechaArca").getAsString();
            ExecuteCommand executeCommand = new ExecuteCommand();
            executeCommand.exeCommand(command);
        
        } catch (Exception e) {
            return Response.status(204).entity("ERROR (collectorService:ejecutar - Exception): "+e.getMessage()+" - "+e.getCause()).build();
        }
       return Response.status(201).entity(gson.toJson(command)).build();*/
    	return null;
    }
    
   
}
