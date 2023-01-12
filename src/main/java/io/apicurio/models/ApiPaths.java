package io.apicurio.models;

public interface ApiPaths extends Node, MappedNode<ApiPathItem> {

    public ApiPathItem createPathItem();
}