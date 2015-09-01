package com.tormentaLabs.riobus.googlemap.utils;

import org.androidannotations.annotations.EBean;

/**
 * Created by limazix on 01/09/15.
 */
@EBean
public class RioBusGoogleMapUtils {

    public static boolean isValidString(String entry) {
        return !(entry == null || entry.equals("") || entry.trim().equals(""));
    }
}
