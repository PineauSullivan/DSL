/**
 * generated by Xtext 2.10.0
 */
package org.xtext.univ.nantes.master.dsl.agenda.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.univ.nantes.master.dsl.agenda.AGENDA;
import org.xtext.univ.nantes.master.dsl.agenda.AgendaPackage;
import org.xtext.univ.nantes.master.dsl.agenda.EVENT;
import org.xtext.univ.nantes.master.dsl.agenda.TASK;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AGENDA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.univ.nantes.master.dsl.agenda.impl.AGENDAImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.univ.nantes.master.dsl.agenda.impl.AGENDAImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.univ.nantes.master.dsl.agenda.impl.AGENDAImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.xtext.univ.nantes.master.dsl.agenda.impl.AGENDAImpl#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AGENDAImpl extends TYPEImpl implements AGENDA
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected EList<EVENT> event;

  /**
   * The cached value of the '{@link #getTask() <em>Task</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTask()
   * @generated
   * @ordered
   */
  protected EList<TASK> task;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AGENDAImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AgendaPackage.Literals.AGENDA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgendaPackage.AGENDA__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgendaPackage.AGENDA__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EVENT> getEvent()
  {
    if (event == null)
    {
      event = new EObjectContainmentEList<EVENT>(EVENT.class, this, AgendaPackage.AGENDA__EVENT);
    }
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TASK> getTask()
  {
    if (task == null)
    {
      task = new EObjectContainmentEList<TASK>(TASK.class, this, AgendaPackage.AGENDA__TASK);
    }
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AgendaPackage.AGENDA__EVENT:
        return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
      case AgendaPackage.AGENDA__TASK:
        return ((InternalEList<?>)getTask()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AgendaPackage.AGENDA__NAME:
        return getName();
      case AgendaPackage.AGENDA__DESCRIPTION:
        return getDescription();
      case AgendaPackage.AGENDA__EVENT:
        return getEvent();
      case AgendaPackage.AGENDA__TASK:
        return getTask();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AgendaPackage.AGENDA__NAME:
        setName((String)newValue);
        return;
      case AgendaPackage.AGENDA__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case AgendaPackage.AGENDA__EVENT:
        getEvent().clear();
        getEvent().addAll((Collection<? extends EVENT>)newValue);
        return;
      case AgendaPackage.AGENDA__TASK:
        getTask().clear();
        getTask().addAll((Collection<? extends TASK>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AgendaPackage.AGENDA__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AgendaPackage.AGENDA__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case AgendaPackage.AGENDA__EVENT:
        getEvent().clear();
        return;
      case AgendaPackage.AGENDA__TASK:
        getTask().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AgendaPackage.AGENDA__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AgendaPackage.AGENDA__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case AgendaPackage.AGENDA__EVENT:
        return event != null && !event.isEmpty();
      case AgendaPackage.AGENDA__TASK:
        return task != null && !task.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //AGENDAImpl
