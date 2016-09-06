package org.example.components;

import org.hippoecm.hst.core.parameters.Parameter;

/**
 * Created by maheshacharya on 9/6/16.
 */
public interface TwoColumnsComponentInfo {

    @Parameter(name = "padding", defaultValue = "10px", displayName = "Padding")
    String getPadding();

    @Parameter(name = "color", defaultValue = "#ffffff", displayName = "Background Color")
    String getBackgroundColor();

}
