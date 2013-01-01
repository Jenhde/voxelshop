package com.vitco.frames;

import com.vitco.util.pref.PreferencesInterface;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Prototype for any sideview.
 */
public abstract class ModelPrototype {

    // var & setter
    protected PreferencesInterface preferences;
    @Autowired(required=true)
    public void setPreferences(PreferencesInterface preferences) {
        this.preferences = preferences;
    }

}