/**
 */
package argumentation.impl;

import argumentation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentationFactoryImpl extends EFactoryImpl implements ArgumentationFactory
{
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
		return new ArgumentationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationFactoryImpl()
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
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK: return createArgumentationFramework();
			case ArgumentationPackage.PERSUADER: return createPersuader();
			case ArgumentationPackage.ARGUMENT: return createArgument();
			case ArgumentationPackage.PERSUADEE: return createPersuadee();
			case ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK: return createPersuadeeArgumentationFramework();
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
		ArgumentationFrameworkImpl argumentationFramework = new ArgumentationFrameworkImpl();
		return argumentationFramework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persuader createPersuader()
	{
		PersuaderImpl persuader = new PersuaderImpl();
		return persuader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument createArgument()
	{
		ArgumentImpl argument = new ArgumentImpl();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persuadee createPersuadee()
	{
		PersuadeeImpl persuadee = new PersuadeeImpl();
		return persuadee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersuadeeArgumentationFramework createPersuadeeArgumentationFramework()
	{
		PersuadeeArgumentationFrameworkImpl persuadeeArgumentationFramework = new PersuadeeArgumentationFrameworkImpl();
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

} //ArgumentationFactoryImpl
