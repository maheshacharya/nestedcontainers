package org.example.components;

import org.hippoecm.hst.component.support.bean.BaseHstComponent;
import org.hippoecm.hst.core.component.HstComponentException;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.core.parameters.ParametersInfo;

/**
 * Created by maheshacharya on 9/6/16.
 */
@ParametersInfo(type = TwoColumnsComponentInfo.class)
public class TwoColumnsComponent extends BaseHstComponent {
    @Override
    public void doBeforeRender(HstRequest request, HstResponse response) throws HstComponentException {
        super.doBeforeRender(request, response);
        TwoColumnsComponentInfo info = getComponentParametersInfo(request);
        request.setAttribute("info", info);
    }
}
