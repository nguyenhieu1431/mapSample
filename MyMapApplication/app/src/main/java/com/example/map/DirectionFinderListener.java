package com.example.map;

import java.util.List;

/**
 * Created by NGUYEN on 12/15/2016.
 */

public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}
