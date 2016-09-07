package org.example.components;

import org.hippoecm.hst.core.parameters.FieldGroup;
import org.hippoecm.hst.core.parameters.FieldGroupList;
import org.hippoecm.hst.core.parameters.Parameter;

/**
 * Created by maheshacharya on 9/6/16.
 */
@FieldGroupList({
        @FieldGroup(
                titleKey = "Container Attributes",
                value = {"title",
                        "padding",
                        "backgroundColor",

                }
        )

})
public interface ContainerComponentInfo {

    @Parameter(name = "title", defaultValue = "", displayName = "Title")
    String getTitle();

    @Parameter(name = "padding", defaultValue = "0px", displayName = "Padding")
    String getPadding();

    @Parameter(name = "backgroundColor", defaultValue = "#ffffff", displayName = "Background Color")
    String getBackgroundColor();


}
