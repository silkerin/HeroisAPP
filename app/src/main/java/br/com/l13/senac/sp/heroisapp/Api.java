package br.com.l13.senac.sp.heroisapp;

public class Api {

                                                //↓ ou ip da maquina ou ip do webservice
    private static final String ROOT_URL = "http://10.23.49.27:8080/TI87php/HeroApi/v1/Api.php?apicall=";

    public static final String URL_CREATE_HERO = ROOT_URL + "createhero";
    public static final String URL_READ_HEROES = ROOT_URL + "getheroes";
    public static final String URL_UPDATE_HERO = ROOT_URL + "updatehero";
    public static final String URL_DELETE_HERO = ROOT_URL + "deletehero&id=";



}
