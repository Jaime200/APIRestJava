/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirestdemo.bean;


/**
 *
 * @author DELL
 */
public class ItunesArtist {
          private String artistName;
  private String trackName;
  private String trackViewUrl;
  private String artworkUrl100;
  
  public ItunesArtist(){}
public String getArtistName() {
	return artistName;
}
public void setArtistName(String artistName) {
	this.artistName = artistName;
}
public String getTrackName() {
	return trackName;
}
public void setTrackName(String trackName) {
	this.trackName = trackName;
}
public String getTrackViewUrl() {
	return trackViewUrl;
}
public void setTrackViewUrl(String trackViewUrl) {
	this.trackViewUrl = trackViewUrl;
}

    /**
     * @return the artworkUrl100
     */
    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    /**
     * @param artworkUrl100 the artworkUrl100 to set
     */
    public void setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
    }
}
