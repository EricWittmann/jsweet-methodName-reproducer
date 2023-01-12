package io.apicurio.models;

import java.util.Collection;

public interface Node {

    public int modelId();
    public Node parent();
    public Object getNodeAttribute(String attributeName);
    public void setNodeAttribute(String attributeName, Object attributeValue);
    public Collection<String> getNodeAttributeNames();
    public void clearNodeAttributes();

}
