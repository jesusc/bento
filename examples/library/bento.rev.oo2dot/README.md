
# OO to Dot

Transform an object oriented model into a visualization using the DOT language.

## Related components

The component has been created by **reverse engineering** transformations
from the KM32DOT example of the ATL zoo.

## Issues

The original transformation does not handle conflicts with DOT keywords.
For instance, to visualize UML, there is a conflict with the keyword Node.

There is a rule conflict, between ClassWithSupertypesGeneralizationsDrawn2Node and ClassWithSupertypesGeneralizationsNotDrawn2Node.

It seems that the serializer has a bug dealing with '\\n', which is generated
as '\n', thus provoking the incorrect generation of dot files (see getAttributes, getOperations, getDataTypeHeader)