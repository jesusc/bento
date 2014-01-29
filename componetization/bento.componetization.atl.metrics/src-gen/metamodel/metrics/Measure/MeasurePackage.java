/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metamodel.metrics.Measure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see metamodel.metrics.Measure.MeasureFactory
 * @model kind="package"
 * @generated
 */
public interface MeasurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Measure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://atl/zoo/measure";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "measure";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MeasurePackage eINSTANCE = metamodel.metrics.Measure.impl.MeasurePackageImpl.init();

	/**
	 * The meta object id for the '{@link metamodel.metrics.Measure.impl.RootMeasureSetImpl <em>Root Measure Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.metrics.Measure.impl.RootMeasureSetImpl
	 * @see metamodel.metrics.Measure.impl.MeasurePackageImpl#getRootMeasureSet()
	 * @generated
	 */
	int ROOT_MEASURE_SET = 0;

	/**
	 * The feature id for the '<em><b>Model Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_MEASURE_SET__MODEL_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_MEASURE_SET__CATEGORIES = 1;

	/**
	 * The feature id for the '<em><b>Measure Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_MEASURE_SET__MEASURE_SETS = 2;

	/**
	 * The number of structural features of the '<em>Root Measure Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_MEASURE_SET_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link metamodel.metrics.Measure.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.metrics.Measure.impl.CategoryImpl
	 * @see metamodel.metrics.Measure.impl.MeasurePackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DESC = 1;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__METRICS = 2;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ROOT = 3;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link metamodel.metrics.Measure.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.metrics.Measure.impl.MetricImpl
	 * @see metamodel.metrics.Measure.impl.MeasurePackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__DESC = 1;

	/**
	 * The feature id for the '<em><b>Preferred Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__PREFERRED_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Category</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__CATEGORY = 3;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link metamodel.metrics.Measure.impl.MeasureSetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.metrics.Measure.impl.MeasureSetImpl
	 * @see metamodel.metrics.Measure.impl.MeasurePackageImpl#getMeasureSet()
	 * @generated
	 */
	int MEASURE_SET = 3;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_SET__ELEMENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_SET__ELEMENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Measures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_SET__MEASURES = 2;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_SET__ROOT = 3;

	/**
	 * The feature id for the '<em><b>Subsets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_SET__SUBSETS = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_SET__PARENT = 5;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_SET_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link metamodel.metrics.Measure.impl.MeasureImpl <em>Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.metrics.Measure.impl.MeasureImpl
	 * @see metamodel.metrics.Measure.impl.MeasurePackageImpl#getMeasure()
	 * @generated
	 */
	int MEASURE = 4;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__METRIC = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__OWNER = 1;

	/**
	 * The number of structural features of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link metamodel.metrics.Measure.impl.IntegerMeasureImpl <em>Integer Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.metrics.Measure.impl.IntegerMeasureImpl
	 * @see metamodel.metrics.Measure.impl.MeasurePackageImpl#getIntegerMeasure()
	 * @generated
	 */
	int INTEGER_MEASURE = 5;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_MEASURE__METRIC = MEASURE__METRIC;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_MEASURE__OWNER = MEASURE__OWNER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_MEASURE__VALUE = MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_MEASURE_FEATURE_COUNT = MEASURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link metamodel.metrics.Measure.impl.DoubleMeasureImpl <em>Double Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.metrics.Measure.impl.DoubleMeasureImpl
	 * @see metamodel.metrics.Measure.impl.MeasurePackageImpl#getDoubleMeasure()
	 * @generated
	 */
	int DOUBLE_MEASURE = 6;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_MEASURE__METRIC = MEASURE__METRIC;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_MEASURE__OWNER = MEASURE__OWNER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_MEASURE__VALUE = MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_MEASURE_FEATURE_COUNT = MEASURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link metamodel.metrics.Measure.impl.PercentageMeasureImpl <em>Percentage Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.metrics.Measure.impl.PercentageMeasureImpl
	 * @see metamodel.metrics.Measure.impl.MeasurePackageImpl#getPercentageMeasure()
	 * @generated
	 */
	int PERCENTAGE_MEASURE = 7;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_MEASURE__METRIC = MEASURE__METRIC;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_MEASURE__OWNER = MEASURE__OWNER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_MEASURE__VALUE = MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Percentage Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_MEASURE_FEATURE_COUNT = MEASURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link metamodel.metrics.Measure.ModelKind <em>Model Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.metrics.Measure.ModelKind
	 * @see metamodel.metrics.Measure.impl.MeasurePackageImpl#getModelKind()
	 * @generated
	 */
	int MODEL_KIND = 8;

	/**
	 * The meta object id for the '{@link metamodel.metrics.Measure.ElementKind <em>Element Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.metrics.Measure.ElementKind
	 * @see metamodel.metrics.Measure.impl.MeasurePackageImpl#getElementKind()
	 * @generated
	 */
	int ELEMENT_KIND = 9;


	/**
	 * Returns the meta object for class '{@link metamodel.metrics.Measure.RootMeasureSet <em>Root Measure Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Measure Set</em>'.
	 * @see metamodel.metrics.Measure.RootMeasureSet
	 * @generated
	 */
	EClass getRootMeasureSet();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.metrics.Measure.RootMeasureSet#getModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Type</em>'.
	 * @see metamodel.metrics.Measure.RootMeasureSet#getModelType()
	 * @see #getRootMeasureSet()
	 * @generated
	 */
	EAttribute getRootMeasureSet_ModelType();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel.metrics.Measure.RootMeasureSet#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see metamodel.metrics.Measure.RootMeasureSet#getCategories()
	 * @see #getRootMeasureSet()
	 * @generated
	 */
	EReference getRootMeasureSet_Categories();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel.metrics.Measure.RootMeasureSet#getMeasureSets <em>Measure Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Sets</em>'.
	 * @see metamodel.metrics.Measure.RootMeasureSet#getMeasureSets()
	 * @see #getRootMeasureSet()
	 * @generated
	 */
	EReference getRootMeasureSet_MeasureSets();

	/**
	 * Returns the meta object for class '{@link metamodel.metrics.Measure.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see metamodel.metrics.Measure.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.metrics.Measure.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel.metrics.Measure.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.metrics.Measure.Category#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see metamodel.metrics.Measure.Category#getDesc()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Desc();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel.metrics.Measure.Category#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metrics</em>'.
	 * @see metamodel.metrics.Measure.Category#getMetrics()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Metrics();

	/**
	 * Returns the meta object for the container reference '{@link metamodel.metrics.Measure.Category#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Root</em>'.
	 * @see metamodel.metrics.Measure.Category#getRoot()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Root();

	/**
	 * Returns the meta object for class '{@link metamodel.metrics.Measure.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see metamodel.metrics.Measure.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.metrics.Measure.Metric#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel.metrics.Measure.Metric#getName()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Name();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.metrics.Measure.Metric#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see metamodel.metrics.Measure.Metric#getDesc()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Desc();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.metrics.Measure.Metric#getPreferredValue <em>Preferred Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preferred Value</em>'.
	 * @see metamodel.metrics.Measure.Metric#getPreferredValue()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_PreferredValue();

	/**
	 * Returns the meta object for the container reference '{@link metamodel.metrics.Measure.Metric#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Category</em>'.
	 * @see metamodel.metrics.Measure.Metric#getCategory()
	 * @see #getMetric()
	 * @generated
	 */
	EReference getMetric_Category();

	/**
	 * Returns the meta object for class '{@link metamodel.metrics.Measure.MeasureSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see metamodel.metrics.Measure.MeasureSet
	 * @generated
	 */
	EClass getMeasureSet();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.metrics.Measure.MeasureSet#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Name</em>'.
	 * @see metamodel.metrics.Measure.MeasureSet#getElementName()
	 * @see #getMeasureSet()
	 * @generated
	 */
	EAttribute getMeasureSet_ElementName();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.metrics.Measure.MeasureSet#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Type</em>'.
	 * @see metamodel.metrics.Measure.MeasureSet#getElementType()
	 * @see #getMeasureSet()
	 * @generated
	 */
	EAttribute getMeasureSet_ElementType();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel.metrics.Measure.MeasureSet#getMeasures <em>Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measures</em>'.
	 * @see metamodel.metrics.Measure.MeasureSet#getMeasures()
	 * @see #getMeasureSet()
	 * @generated
	 */
	EReference getMeasureSet_Measures();

	/**
	 * Returns the meta object for the container reference '{@link metamodel.metrics.Measure.MeasureSet#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Root</em>'.
	 * @see metamodel.metrics.Measure.MeasureSet#getRoot()
	 * @see #getMeasureSet()
	 * @generated
	 */
	EReference getMeasureSet_Root();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel.metrics.Measure.MeasureSet#getSubsets <em>Subsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subsets</em>'.
	 * @see metamodel.metrics.Measure.MeasureSet#getSubsets()
	 * @see #getMeasureSet()
	 * @generated
	 */
	EReference getMeasureSet_Subsets();

	/**
	 * Returns the meta object for the container reference '{@link metamodel.metrics.Measure.MeasureSet#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see metamodel.metrics.Measure.MeasureSet#getParent()
	 * @see #getMeasureSet()
	 * @generated
	 */
	EReference getMeasureSet_Parent();

	/**
	 * Returns the meta object for class '{@link metamodel.metrics.Measure.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure</em>'.
	 * @see metamodel.metrics.Measure.Measure
	 * @generated
	 */
	EClass getMeasure();

	/**
	 * Returns the meta object for the reference '{@link metamodel.metrics.Measure.Measure#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric</em>'.
	 * @see metamodel.metrics.Measure.Measure#getMetric()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Metric();

	/**
	 * Returns the meta object for the container reference '{@link metamodel.metrics.Measure.Measure#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see metamodel.metrics.Measure.Measure#getOwner()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Owner();

	/**
	 * Returns the meta object for class '{@link metamodel.metrics.Measure.IntegerMeasure <em>Integer Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Measure</em>'.
	 * @see metamodel.metrics.Measure.IntegerMeasure
	 * @generated
	 */
	EClass getIntegerMeasure();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.metrics.Measure.IntegerMeasure#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel.metrics.Measure.IntegerMeasure#getValue()
	 * @see #getIntegerMeasure()
	 * @generated
	 */
	EAttribute getIntegerMeasure_Value();

	/**
	 * Returns the meta object for class '{@link metamodel.metrics.Measure.DoubleMeasure <em>Double Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Measure</em>'.
	 * @see metamodel.metrics.Measure.DoubleMeasure
	 * @generated
	 */
	EClass getDoubleMeasure();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.metrics.Measure.DoubleMeasure#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel.metrics.Measure.DoubleMeasure#getValue()
	 * @see #getDoubleMeasure()
	 * @generated
	 */
	EAttribute getDoubleMeasure_Value();

	/**
	 * Returns the meta object for class '{@link metamodel.metrics.Measure.PercentageMeasure <em>Percentage Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Percentage Measure</em>'.
	 * @see metamodel.metrics.Measure.PercentageMeasure
	 * @generated
	 */
	EClass getPercentageMeasure();

	/**
	 * Returns the meta object for the attribute '{@link metamodel.metrics.Measure.PercentageMeasure#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel.metrics.Measure.PercentageMeasure#getValue()
	 * @see #getPercentageMeasure()
	 * @generated
	 */
	EAttribute getPercentageMeasure_Value();

	/**
	 * Returns the meta object for enum '{@link metamodel.metrics.Measure.ModelKind <em>Model Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Model Kind</em>'.
	 * @see metamodel.metrics.Measure.ModelKind
	 * @generated
	 */
	EEnum getModelKind();

	/**
	 * Returns the meta object for enum '{@link metamodel.metrics.Measure.ElementKind <em>Element Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Kind</em>'.
	 * @see metamodel.metrics.Measure.ElementKind
	 * @generated
	 */
	EEnum getElementKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MeasureFactory getMeasureFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link metamodel.metrics.Measure.impl.RootMeasureSetImpl <em>Root Measure Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.metrics.Measure.impl.RootMeasureSetImpl
		 * @see metamodel.metrics.Measure.impl.MeasurePackageImpl#getRootMeasureSet()
		 * @generated
		 */
		EClass ROOT_MEASURE_SET = eINSTANCE.getRootMeasureSet();

		/**
		 * The meta object literal for the '<em><b>Model Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOT_MEASURE_SET__MODEL_TYPE = eINSTANCE.getRootMeasureSet_ModelType();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_MEASURE_SET__CATEGORIES = eINSTANCE.getRootMeasureSet_Categories();

		/**
		 * The meta object literal for the '<em><b>Measure Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_MEASURE_SET__MEASURE_SETS = eINSTANCE.getRootMeasureSet_MeasureSets();

		/**
		 * The meta object literal for the '{@link metamodel.metrics.Measure.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.metrics.Measure.impl.CategoryImpl
		 * @see metamodel.metrics.Measure.impl.MeasurePackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__DESC = eINSTANCE.getCategory_Desc();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__METRICS = eINSTANCE.getCategory_Metrics();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__ROOT = eINSTANCE.getCategory_Root();

		/**
		 * The meta object literal for the '{@link metamodel.metrics.Measure.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.metrics.Measure.impl.MetricImpl
		 * @see metamodel.metrics.Measure.impl.MeasurePackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__NAME = eINSTANCE.getMetric_Name();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__DESC = eINSTANCE.getMetric_Desc();

		/**
		 * The meta object literal for the '<em><b>Preferred Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__PREFERRED_VALUE = eINSTANCE.getMetric_PreferredValue();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC__CATEGORY = eINSTANCE.getMetric_Category();

		/**
		 * The meta object literal for the '{@link metamodel.metrics.Measure.impl.MeasureSetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.metrics.Measure.impl.MeasureSetImpl
		 * @see metamodel.metrics.Measure.impl.MeasurePackageImpl#getMeasureSet()
		 * @generated
		 */
		EClass MEASURE_SET = eINSTANCE.getMeasureSet();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE_SET__ELEMENT_NAME = eINSTANCE.getMeasureSet_ElementName();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE_SET__ELEMENT_TYPE = eINSTANCE.getMeasureSet_ElementType();

		/**
		 * The meta object literal for the '<em><b>Measures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_SET__MEASURES = eINSTANCE.getMeasureSet_Measures();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_SET__ROOT = eINSTANCE.getMeasureSet_Root();

		/**
		 * The meta object literal for the '<em><b>Subsets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_SET__SUBSETS = eINSTANCE.getMeasureSet_Subsets();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_SET__PARENT = eINSTANCE.getMeasureSet_Parent();

		/**
		 * The meta object literal for the '{@link metamodel.metrics.Measure.impl.MeasureImpl <em>Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.metrics.Measure.impl.MeasureImpl
		 * @see metamodel.metrics.Measure.impl.MeasurePackageImpl#getMeasure()
		 * @generated
		 */
		EClass MEASURE = eINSTANCE.getMeasure();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__METRIC = eINSTANCE.getMeasure_Metric();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__OWNER = eINSTANCE.getMeasure_Owner();

		/**
		 * The meta object literal for the '{@link metamodel.metrics.Measure.impl.IntegerMeasureImpl <em>Integer Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.metrics.Measure.impl.IntegerMeasureImpl
		 * @see metamodel.metrics.Measure.impl.MeasurePackageImpl#getIntegerMeasure()
		 * @generated
		 */
		EClass INTEGER_MEASURE = eINSTANCE.getIntegerMeasure();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_MEASURE__VALUE = eINSTANCE.getIntegerMeasure_Value();

		/**
		 * The meta object literal for the '{@link metamodel.metrics.Measure.impl.DoubleMeasureImpl <em>Double Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.metrics.Measure.impl.DoubleMeasureImpl
		 * @see metamodel.metrics.Measure.impl.MeasurePackageImpl#getDoubleMeasure()
		 * @generated
		 */
		EClass DOUBLE_MEASURE = eINSTANCE.getDoubleMeasure();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_MEASURE__VALUE = eINSTANCE.getDoubleMeasure_Value();

		/**
		 * The meta object literal for the '{@link metamodel.metrics.Measure.impl.PercentageMeasureImpl <em>Percentage Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.metrics.Measure.impl.PercentageMeasureImpl
		 * @see metamodel.metrics.Measure.impl.MeasurePackageImpl#getPercentageMeasure()
		 * @generated
		 */
		EClass PERCENTAGE_MEASURE = eINSTANCE.getPercentageMeasure();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERCENTAGE_MEASURE__VALUE = eINSTANCE.getPercentageMeasure_Value();

		/**
		 * The meta object literal for the '{@link metamodel.metrics.Measure.ModelKind <em>Model Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.metrics.Measure.ModelKind
		 * @see metamodel.metrics.Measure.impl.MeasurePackageImpl#getModelKind()
		 * @generated
		 */
		EEnum MODEL_KIND = eINSTANCE.getModelKind();

		/**
		 * The meta object literal for the '{@link metamodel.metrics.Measure.ElementKind <em>Element Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.metrics.Measure.ElementKind
		 * @see metamodel.metrics.Measure.impl.MeasurePackageImpl#getElementKind()
		 * @generated
		 */
		EEnum ELEMENT_KIND = eINSTANCE.getElementKind();

	}

} //MeasurePackage
