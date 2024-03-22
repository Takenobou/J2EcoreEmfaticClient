/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public class RelationalMetaModelFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalMetaModelFactory init()
	{
		try
		{
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null)
			{
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelFactory()
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
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema()
	{
		RelationalSchema relationalSchema = new RelationalSchema();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable()
	{
		RelationalTable relationalTable = new RelationalTable();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalForeignKey createRelationalForeignKey()
	{
		RelationalForeignKey relationalForeignKey = new RelationalForeignKey();
		return relationalForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalMetaModelPackage getRelationalMetaModelPackage()
	{
		return (RelationalMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalMetaModelPackage getPackage()
	{
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactory
