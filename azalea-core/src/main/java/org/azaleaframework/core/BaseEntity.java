package org.azaleaframework.core;

import java.io.Serializable;
import java.util.Map;

public class BaseEntity implements Serializable {

    private Map<String, Object> params;

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
}
