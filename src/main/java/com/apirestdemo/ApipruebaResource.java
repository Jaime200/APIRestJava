/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirestdemo;

import com.apirestdemo.Controller.InfoItunesArtist;
import com.apirestdemo.Controller.InforTvmaze;
import com.apirestdemo.bean.RespApi;
import com.apirestdemo.bean.ResultItunes;
import com.apirestdemo.bean.Tvmaze;
import com.google.gson.Gson;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author DELL
 */
@Path("apiprueba")
public class ApipruebaResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ApipruebaResource
     */
    public ApipruebaResource() {
    }

    /**
     * Retrieves representation of an instance of com.apirestdemo.ApipruebaResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
     public Response getJson(@QueryParam("termino") String termino) {
        System.out.println(termino);
        try {
        
            //Obteniendo informacion de Itunes
         InfoItunesArtist infoItunesArtist = new InfoItunesArtist();
         ResultItunes arrItunesArtist = infoItunesArtist.getInfoArtist(termino);
         
         
         //Obteniendo informacion de tv
         InforTvmaze infoTvmaze = new InforTvmaze();
         List<Tvmaze> arrTvmaze =  infoTvmaze.getInfoTvmaze(termino);
         
         //Obtener informacion de SOAP
         
         
         //Consolidandolo en un modelo
         RespApi respAPi = new RespApi();
         respAPi.setResultItunes(arrItunesArtist);
         respAPi.setResultTvmaze(arrTvmaze);
         
        Gson gson = new Gson();
        String jsonString = gson.toJson(respAPi);
        //return jsonString;
        return Response.ok(jsonString).header("Access-Control-Allow-Origin", "*").build();
        } catch (Exception e) {
            return Response.serverError().build();
        }
            
            
        
    }

    /**
     * PUT method for updating or creating an instance of ApipruebaResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
