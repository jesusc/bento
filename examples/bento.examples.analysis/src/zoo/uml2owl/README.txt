
* Solved manually:
1. Replaced UML!uml:: => UML!
2. No class CLass found in meta-model UML. 39:20-39:29 => Class
   Caused by: genericity.compiler.atl.analyser.ErrorModel$NoRecoverableError: No class CLass found in meta-model UML. 38:46-38:55
   
3. Commented out, because a matched rue needs a to!

--rule SlotClass2Statement {
--	from
--		s : UML!Slot (
--			-- Property Type is Class
--			s.definingFeature.type.oclIsTypeOf(UML!Class)
--			or
--			s.definingFeature.type.oclIsTypeOf(UML!Enumeration)
--		)
--	do {
--		for( i in s.value ) {
--			thisModule.createStatement( s, i );
--		}
--	}
--} 

