/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirestdemo.bean;

import java.util.List;

/**
 *
 * @author DELL
 */
public class RespApi {
    private ResultItunes resultItunes;
    private List<Tvmaze> resultTvmaze;

    /**
     * @return the resultItunes
     */
    public ResultItunes getResultItunes() {
        return resultItunes;
    }

    /**
     * @param resultItunes the resultItunes to set
     */
    public void setResultItunes(ResultItunes resultItunes) {
        this.resultItunes = resultItunes;
    }

    /**
     * @return the resultTvmaze
     */
    public List<Tvmaze> getResultTvmaze() {
        return resultTvmaze;
    }

    /**
     * @param resultTvmaze the resultTvmaze to set
     */
    public void setResultTvmaze(List<Tvmaze> resultTvmaze) {
        this.resultTvmaze = resultTvmaze;
    }
    
}
