package io.apicurio.models.v1;

import java.util.LinkedHashMap;
import java.util.Map;

import io.apicurio.models.ApiPathItem;
import io.apicurio.models.NodeImpl;

public class V1ApiPathsImpl extends NodeImpl implements V1ApiPaths {

    private Map<String, ApiPathItem> _items = new LinkedHashMap<>();

    @Override
    public void addItem(String name, ApiPathItem item) {
        this._items.put(name, item);
    }

    @Override
    public ApiPathItem removeItem(String name) {
        return this._items.remove(name);
    }
}