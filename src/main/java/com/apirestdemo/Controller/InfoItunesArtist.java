/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirestdemo.Controller;

import com.apirestdemo.bean.ResultItunes;
import com.google.gson.Gson;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class InfoItunesArtist {
    
    
    public ResultItunes getInfoArtist(String termino){
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://itunes.apple.com/search").queryParam("term", termino);
        Response response = target.request(MediaType.TEXT_PLAIN).get();
        String strItunesArtist = response.readEntity(String.class);
        Gson gson = new Gson();
        ResultItunes arrItunesArtist =  gson.fromJson(strItunesArtist, ResultItunes.class);
        
        return arrItunesArtist;
    }
    
}
