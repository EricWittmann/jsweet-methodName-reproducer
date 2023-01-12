package io.apicurio.models.v1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import io.apicurio.models.ApiPathItem;
import io.apicurio.models.NodeImpl;

public class V1ApiPathsImpl extends NodeImpl implements V1ApiPaths {

    private Map<String, ApiPathItem> _items = new LinkedHashMap<>();

    @Override
    public ApiPathItem getItem(String name) {
        return this._items.get(name);
    }

    @Override
    public List<ApiPathItem> getItems() {
        List<ApiPathItem> rval = new ArrayList<>();
        rval.addAll(this._items.values());
        return rval;
    }

    @Override
    public List<String> getItemNames() {
        List<String> rval = new ArrayList<>();
        rval.addAll(this._items.keySet());
        return rval;
    }

    @Override
    public void addItem(String name, ApiPathItem item) {
        this._items.put(name, item);
    }

    @Override
    public ApiPathItem removeItem(String name) {
        return this._items.remove(name);
    }

    @Override
    public V1ApiPathItem createPathItem() {
        V1ApiPathItemImpl node = new V1ApiPathItemImpl();
        node.setParent(this);
        return node;
    }
}