/**
 * generated by Xtext 2.10.0
 */
package org.xtext.univ.nantes.master.dsl.agenda.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.univ.nantes.master.dsl.agenda.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AgendaFactoryImpl extends EFactoryImpl implements AgendaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AgendaFactory init()
  {
    try
    {
      AgendaFactory theAgendaFactory = (AgendaFactory)EPackage.Registry.INSTANCE.getEFactory(AgendaPackage.eNS_URI);
      if (theAgendaFactory != null)
      {
        return theAgendaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AgendaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AgendaFactoryImpl()
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
      case AgendaPackage.MODEL: return createMODEL();
      case AgendaPackage.TYPE: return createTYPE();
      case AgendaPackage.AGENDA: return createAGENDA();
      case AgendaPackage.EVENT: return createEVENT();
      case AgendaPackage.TASK: return createTASK();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MODEL createMODEL()
  {
    MODELImpl model = new MODELImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TYPE createTYPE()
  {
    TYPEImpl type = new TYPEImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AGENDA createAGENDA()
  {
    AGENDAImpl agenda = new AGENDAImpl();
    return agenda;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EVENT createEVENT()
  {
    EVENTImpl event = new EVENTImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TASK createTASK()
  {
    TASKImpl task = new TASKImpl();
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AgendaPackage getAgendaPackage()
  {
    return (AgendaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AgendaPackage getPackage()
  {
    return AgendaPackage.eINSTANCE;
  }

} //AgendaFactoryImpl
