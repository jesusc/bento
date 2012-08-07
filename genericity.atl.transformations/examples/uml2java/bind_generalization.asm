<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="java2uml"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="Class"/>
		<constant value="UML"/>
		<constant value="name"/>
		<constant value="__initname"/>
		<constant value="J.registerHelperAttribute(SS):V"/>
		<constant value="superclasses"/>
		<constant value="__initsuperclasses"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="9:16-9:25"/>
		<constant value="11:16-11:25"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchbind_Class_UMLClass():V"/>
		<constant value="__exec__"/>
		<constant value="bind_Class_UMLClass"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applybind_Class_UMLClass(NTransientLink;):V"/>
		<constant value="__matchbind_Class_UMLClass"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="j"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="c"/>
		<constant value="UMLClass"/>
		<constant value="Concrete"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="6:7-6:28"/>
		<constant value="__applybind_Class_UMLClass"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="link"/>
		<constant value="MUML!Class;"/>
		<constant value="0"/>
		<constant value="umlName"/>
		<constant value="9:47-9:51"/>
		<constant value="9:47-9:59"/>
		<constant value="generalizations"/>
		<constant value="reference"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="12:2-12:6"/>
		<constant value="12:2-12:22"/>
		<constant value="12:36-12:37"/>
		<constant value="12:36-12:47"/>
		<constant value="12:2-12:48"/>
		<constant value="g"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<push arg="14"/>
			<push arg="15"/>
			<findme/>
			<push arg="16"/>
			<push arg="17"/>
			<pcall arg="18"/>
			<push arg="14"/>
			<push arg="15"/>
			<findme/>
			<push arg="19"/>
			<push arg="20"/>
			<pcall arg="18"/>
			<getasm/>
			<push arg="21"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="22"/>
			<getasm/>
			<pcall arg="23"/>
		</code>
		<linenumbertable>
			<lne id="24" begin="16" end="18"/>
			<lne id="25" begin="22" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="26" begin="0" end="36"/>
		</localvariabletable>
	</operation>
	<operation name="27">
		<context type="6"/>
		<parameters>
			<parameter name="28" type="4"/>
		</parameters>
		<code>
			<load arg="28"/>
			<getasm/>
			<get arg="3"/>
			<call arg="29"/>
			<if arg="30"/>
			<getasm/>
			<get arg="1"/>
			<load arg="28"/>
			<call arg="31"/>
			<dup/>
			<call arg="32"/>
			<if arg="33"/>
			<load arg="28"/>
			<call arg="34"/>
			<goto arg="35"/>
			<pop/>
			<load arg="28"/>
			<goto arg="36"/>
			<push arg="37"/>
			<push arg="8"/>
			<new/>
			<load arg="28"/>
			<iterate/>
			<store arg="38"/>
			<getasm/>
			<load arg="38"/>
			<call arg="39"/>
			<call arg="40"/>
			<enditerate/>
			<call arg="41"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="42" begin="23" end="27"/>
			<lve slot="0" name="26" begin="0" end="29"/>
			<lve slot="1" name="43" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="44">
		<context type="6"/>
		<parameters>
			<parameter name="28" type="4"/>
			<parameter name="38" type="45"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="28"/>
			<call arg="31"/>
			<load arg="28"/>
			<load arg="38"/>
			<call arg="46"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="26" begin="0" end="6"/>
			<lve slot="1" name="43" begin="0" end="6"/>
			<lve slot="2" name="16" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="47">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="48"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="26" begin="0" end="1"/>
		</localvariabletable>
	</operation>
	<operation name="49">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="50"/>
			<call arg="51"/>
			<iterate/>
			<store arg="28"/>
			<getasm/>
			<load arg="28"/>
			<pcall arg="52"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="42" begin="5" end="8"/>
			<lve slot="0" name="26" begin="0" end="9"/>
		</localvariabletable>
	</operation>
	<operation name="53">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="14"/>
			<push arg="15"/>
			<findme/>
			<push arg="54"/>
			<call arg="55"/>
			<iterate/>
			<store arg="28"/>
			<getasm/>
			<get arg="1"/>
			<push arg="56"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="50"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="58"/>
			<load arg="28"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="60"/>
			<push arg="61"/>
			<push arg="62"/>
			<new/>
			<pcall arg="63"/>
			<pusht/>
			<pcall arg="64"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="65" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="58" begin="6" end="26"/>
			<lve slot="0" name="26" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="66">
		<context type="6"/>
		<parameters>
			<parameter name="28" type="67"/>
		</parameters>
		<code>
			<load arg="28"/>
			<push arg="58"/>
			<call arg="68"/>
			<store arg="38"/>
			<load arg="28"/>
			<push arg="60"/>
			<call arg="69"/>
			<store arg="70"/>
			<load arg="70"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="65" begin="8" end="9"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="60" begin="7" end="9"/>
			<lve slot="2" name="58" begin="3" end="9"/>
			<lve slot="0" name="26" begin="0" end="9"/>
			<lve slot="1" name="71" begin="0" end="9"/>
		</localvariabletable>
	</operation>
	<operation name="17">
		<context type="72"/>
		<parameters>
		</parameters>
		<code>
			<load arg="73"/>
			<get arg="74"/>
		</code>
		<linenumbertable>
			<lne id="75" begin="0" end="0"/>
			<lne id="76" begin="0" end="1"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="26" begin="0" end="1"/>
		</localvariabletable>
	</operation>
	<operation name="20">
		<context type="72"/>
		<parameters>
		</parameters>
		<code>
			<push arg="37"/>
			<push arg="8"/>
			<new/>
			<load arg="73"/>
			<get arg="77"/>
			<iterate/>
			<store arg="28"/>
			<load arg="28"/>
			<get arg="78"/>
			<call arg="79"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="80" begin="3" end="3"/>
			<lne id="81" begin="3" end="4"/>
			<lne id="82" begin="7" end="7"/>
			<lne id="83" begin="7" end="8"/>
			<lne id="84" begin="0" end="10"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="85" begin="6" end="9"/>
			<lve slot="0" name="26" begin="0" end="10"/>
		</localvariabletable>
	</operation>
</asm>
