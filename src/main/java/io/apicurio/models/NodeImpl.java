package io.apicurio.models;

public abstract class NodeImpl implements Node {

    private static int __modelIdCounter = 0;

    protected int _modelId = __modelIdCounter++;
    private Node _parent;

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

}
