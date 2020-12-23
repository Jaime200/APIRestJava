/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirestdemo.Controller;

import com.apirestdemo.bean.Tvmaze;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author DELL
 */
public class InforTvmaze {
     public List<Tvmaze> getInfoTvmaze(String termino){
         try {
              if(termino.length() >0){
      Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://api.tvmaze.com/search/shows").queryParam("q", termino);
        Response response = target.request(MediaType.TEXT_PLAIN).get();
        String strTvmaze = response.readEntity(String.class);
        Gson gson = new Gson();
         java.lang.reflect.Type listType = new TypeToken<List<Tvmaze>>()
                {
                }.getType();
        
        List<Tvmaze> arrTvmaze = new ArrayList<Tvmaze>();
         arrTvmaze =  gson.fromJson(strTvmaze, listType);
         //http://api.tvmaze.com/search/shows?q=girls
         
         return arrTvmaze;
     }
         } catch (Exception e) {
             return null;
         }
         
    
     
     return null;
       
     }
}
