package io.apicurio.models;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class NodeImpl implements Node {

    private static int __modelIdCounter = 0;

    protected int _modelId = __modelIdCounter++;
    private Node _parent;
    private Map<String, Object> _attributes;

    @Override
    public Node parent() {
        return this._parent;
    }

    public void setParent(Node parent) {
        this._parent = parent;
    }

    @Override
    public int modelId() {
        return this._modelId;
    }

    @Override
    public Object getNodeAttribute(String attributeName) {
        if (this._attributes != null) {
            return this._attributes.get(attributeName);
        } else {
            return null;
        }
    }

    @Override
    public void setNodeAttribute(String attributeName, Object attributeValue) {
        if (this._attributes == null) {
            this._attributes = new HashMap<>();
        }
        this._attributes.put(attributeName, attributeValue);
    }

    @Override
    public Collection<String> getNodeAttributeNames() {
        if (this._attributes != null) {
            return this._attributes.keySet();
        } else {
            return Collections.emptyList();
        }
    }

    @Override
    public void clearNodeAttributes() {
        if (this._attributes != null) {
            this._attributes.clear();
        }
    }

}
