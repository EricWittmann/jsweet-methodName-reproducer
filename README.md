# JSweet Issue Reproducer

* Clone this repository
* Run `build.sh`
* Observe output of `target/ts/src/io/apicurio/models/v1/V1ApiPathsImpl.ts`

The issue is that the `addItem` method has two variants.  It is generated as though
there are multiple overloaded implementations of it, but there is only one.