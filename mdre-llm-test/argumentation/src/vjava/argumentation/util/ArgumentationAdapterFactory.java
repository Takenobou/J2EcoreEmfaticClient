/**
 */
package argumentation.util;

import argumentation.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see argumentation.ArgumentationPackage
 * @generated
 */
public class ArgumentationAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArgumentationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = ArgumentationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentationSwitch<Adapter> modelSwitch =
		new ArgumentationSwitch<Adapter>()
		{
			@Override
			public Adapter caseArgumentationFramework(ArgumentationFramework object)
			{
				return createArgumentationFrameworkAdapter();
			}
			@Override
			public Adapter casePersuader(Persuader object)
			{
				return createPersuaderAdapter();
			}
			@Override
			public Adapter caseArgument(Argument object)
			{
				return createArgumentAdapter();
			}
			@Override
			public Adapter casePersuadee(Persuadee object)
			{
				return createPersuadeeAdapter();
			}
			@Override
			public Adapter casePersuadeeArgumentationFramework(PersuadeeArgumentationFramework object)
			{
				return createPersuadeeArgumentationFrameworkAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link argumentation.ArgumentationFramework <em>Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.ArgumentationFramework
	 * @generated
	 */
	public Adapter createArgumentationFrameworkAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.Persuader <em>Persuader</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.Persuader
	 * @generated
	 */
	public Adapter createPersuaderAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.Argument
	 * @generated
	 */
	public Adapter createArgumentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.Persuadee <em>Persuadee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.Persuadee
	 * @generated
	 */
	public Adapter createPersuadeeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.PersuadeeArgumentationFramework <em>Persuadee Argumentation Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.PersuadeeArgumentationFramework
	 * @generated
	 */
	public Adapter createPersuadeeArgumentationFrameworkAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //ArgumentationAdapterFactory
/**
 */
package argumentation.util;

import argumentation.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see argumentation.ArgumentationPackage
 * @generated
 */
public class ArgumentationAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArgumentationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = ArgumentationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentationSwitch<Adapter> modelSwitch =
		new ArgumentationSwitch<Adapter>()
		{
			@Override
			public Adapter caseArgumentationFramework(ArgumentationFramework object)
			{
				return createArgumentationFrameworkAdapter();
			}
			@Override
			public Adapter casePersuader(Persuader object)
			{
				return createPersuaderAdapter();
			}
			@Override
			public Adapter caseArgument(Argument object)
			{
				return createArgumentAdapter();
			}
			@Override
			public Adapter casePersuadee(Persuadee object)
			{
				return createPersuadeeAdapter();
			}
			@Override
			public Adapter casePersuadeeArgumentationFramework(PersuadeeArgumentationFramework object)
			{
				return createPersuadeeArgumentationFrameworkAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link argumentation.ArgumentationFramework <em>Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.ArgumentationFramework
	 * @generated
	 */
	public Adapter createArgumentationFrameworkAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.Persuader <em>Persuader</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.Persuader
	 * @generated
	 */
	public Adapter createPersuaderAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.Argument
	 * @generated
	 */
	public Adapter createArgumentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.Persuadee <em>Persuadee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.Persuadee
	 * @generated
	 */
	public Adapter createPersuadeeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.PersuadeeArgumentationFramework <em>Persuadee Argumentation Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.PersuadeeArgumentationFramework
	 * @generated
	 */
	public Adapter createPersuadeeArgumentationFrameworkAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //ArgumentationAdapterFactory
/**
 */
package argumentation.util;

import argumentation.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see argumentation.ArgumentationPackage
 * @generated
 */
public class ArgumentationAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArgumentationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = ArgumentationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentationSwitch<Adapter> modelSwitch =
		new ArgumentationSwitch<Adapter>()
		{
			@Override
			public Adapter caseArgumentationFramework(ArgumentationFramework object)
			{
				return createArgumentationFrameworkAdapter();
			}
			@Override
			public Adapter casePersuader(Persuader object)
			{
				return createPersuaderAdapter();
			}
			@Override
			public Adapter caseArgument(Argument object)
			{
				return createArgumentAdapter();
			}
			@Override
			public Adapter casePersuadee(Persuadee object)
			{
				return createPersuadeeAdapter();
			}
			@Override
			public Adapter casePersuadeeArgumentationFramework(PersuadeeArgumentationFramework object)
			{
				return createPersuadeeArgumentationFrameworkAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link argumentation.ArgumentationFramework <em>Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.ArgumentationFramework
	 * @generated
	 */
	public Adapter createArgumentationFrameworkAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.Persuader <em>Persuader</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.Persuader
	 * @generated
	 */
	public Adapter createPersuaderAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.Argument
	 * @generated
	 */
	public Adapter createArgumentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.Persuadee <em>Persuadee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.Persuadee
	 * @generated
	 */
	public Adapter createPersuadeeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.PersuadeeArgumentationFramework <em>Persuadee Argumentation Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.PersuadeeArgumentationFramework
	 * @generated
	 */
	public Adapter createPersuadeeArgumentationFrameworkAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //ArgumentationAdapterFactory
