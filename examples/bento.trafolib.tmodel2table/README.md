
# Graph to Table

This component generically transforms a model, in the form of a graph,
into a table.

The concept represents a kind of graph/table, so that it is visualized
in the following way:

	class Graph {
		ref RowHeaderNode[+] rows;
		ref ColumnHeaderNode[+] cols;
	}

	|--------------------------------------|
	| aTitle     | col1.title | col2.title |
	|---------------------------------------
	| row1.title | value(1,1) | value(1,2) |
	| row2.title | value(2,1) | value(2,2) |
	|--------------------------------------|



## Related components

There are graph to table components easier to bind, since they provide fixed 
column lengths, though they might not be appropriate for all scenarios. 
If the number of columns is fixed, use TableX2, TableX3, and so on.