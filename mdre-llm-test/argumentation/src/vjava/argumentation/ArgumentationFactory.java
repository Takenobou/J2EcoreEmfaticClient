/**
 */
package argumentation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentationFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ArgumentationFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ArgumentationFactory INSTANCE = argumentation.ArgumentationFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArgumentationFactory init()
	{
		try
		{
			ArgumentationFactory theArgumentationFactory = (ArgumentationFactory)EPackage.Registry.INSTANCE.getEFactory(ArgumentationPackage.eNS_URI);
			if (theArgumentationFactory != null)
			{
				return theArgumentationFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArgumentationFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationFactory()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK: return (EObject)createArgumentationFramework();
			case ArgumentationPackage.PERSUADER: return (EObject)createPersuader();
			case ArgumentationPackage.ARGUMENT: return (EObject)createArgument();
			case ArgumentationPackage.PERSUADEE: return (EObject)createPersuadee();
			case ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK: return (EObject)createPersuadeeArgumentationFramework();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationFramework createArgumentationFramework()
	{
		ArgumentationFramework argumentationFramework = new ArgumentationFramework();
		return argumentationFramework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persuader createPersuader()
	{
		Persuader persuader = new Persuader();
		return persuader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument createArgument()
	{
		Argument argument = new Argument();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persuadee createPersuadee()
	{
		Persuadee persuadee = new Persuadee();
		return persuadee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersuadeeArgumentationFramework createPersuadeeArgumentationFramework()
	{
		PersuadeeArgumentationFramework persuadeeArgumentationFramework = new PersuadeeArgumentationFramework();
		return persuadeeArgumentationFramework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationPackage getArgumentationPackage()
	{
		return (ArgumentationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArgumentationPackage getPackage()
	{
		return ArgumentationPackage.eINSTANCE;
	}

} //ArgumentationFactory
/**
 */
package argumentation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentationFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ArgumentationFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ArgumentationFactory INSTANCE = argumentation.ArgumentationFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArgumentationFactory init()
	{
		try
		{
			ArgumentationFactory theArgumentationFactory = (ArgumentationFactory)EPackage.Registry.INSTANCE.getEFactory(ArgumentationPackage.eNS_URI);
			if (theArgumentationFactory != null)
			{
				return theArgumentationFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArgumentationFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationFactory()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK: return (EObject)createArgumentationFramework();
			case ArgumentationPackage.PERSUADER: return (EObject)createPersuader();
			case ArgumentationPackage.ARGUMENT: return (EObject)createArgument();
			case ArgumentationPackage.PERSUADEE: return (EObject)createPersuadee();
			case ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK: return (EObject)createPersuadeeArgumentationFramework();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationFramework createArgumentationFramework()
	{
		ArgumentationFramework argumentationFramework = new ArgumentationFramework();
		return argumentationFramework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persuader createPersuader()
	{
		Persuader persuader = new Persuader();
		return persuader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument createArgument()
	{
		Argument argument = new Argument();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persuadee createPersuadee()
	{
		Persuadee persuadee = new Persuadee();
		return persuadee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersuadeeArgumentationFramework createPersuadeeArgumentationFramework()
	{
		PersuadeeArgumentationFramework persuadeeArgumentationFramework = new PersuadeeArgumentationFramework();
		return persuadeeArgumentationFramework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationPackage getArgumentationPackage()
	{
		return (ArgumentationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArgumentationPackage getPackage()
	{
		return ArgumentationPackage.eINSTANCE;
	}

} //ArgumentationFactory
/**
 */
package argumentation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentationFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ArgumentationFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ArgumentationFactory INSTANCE = argumentation.ArgumentationFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArgumentationFactory init()
	{
		try
		{
			ArgumentationFactory theArgumentationFactory = (ArgumentationFactory)EPackage.Registry.INSTANCE.getEFactory(ArgumentationPackage.eNS_URI);
			if (theArgumentationFactory != null)
			{
				return theArgumentationFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArgumentationFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationFactory()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK: return (EObject)createArgumentationFramework();
			case ArgumentationPackage.PERSUADER: return (EObject)createPersuader();
			case ArgumentationPackage.ARGUMENT: return (EObject)createArgument();
			case ArgumentationPackage.PERSUADEE: return (EObject)createPersuadee();
			case ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK: return (EObject)createPersuadeeArgumentationFramework();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationFramework createArgumentationFramework()
	{
		ArgumentationFramework argumentationFramework = new ArgumentationFramework();
		return argumentationFramework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persuader createPersuader()
	{
		Persuader persuader = new Persuader();
		return persuader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument createArgument()
	{
		Argument argument = new Argument();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persuadee createPersuadee()
	{
		Persuadee persuadee = new Persuadee();
		return persuadee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersuadeeArgumentationFramework createPersuadeeArgumentationFramework()
	{
		PersuadeeArgumentationFramework persuadeeArgumentationFramework = new PersuadeeArgumentationFramework();
		return persuadeeArgumentationFramework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationPackage getArgumentationPackage()
	{
		return (ArgumentationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArgumentationPackage getPackage()
	{
		return ArgumentationPackage.eINSTANCE;
	}

} //ArgumentationFactory
