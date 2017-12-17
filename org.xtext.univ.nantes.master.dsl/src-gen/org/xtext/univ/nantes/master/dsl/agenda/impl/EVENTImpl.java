/**
 * generated by Xtext 2.10.0
 */
package org.xtext.univ.nantes.master.dsl.agenda.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.univ.nantes.master.dsl.agenda.AgendaPackage;
import org.xtext.univ.nantes.master.dsl.agenda.EVENT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EVENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.univ.nantes.master.dsl.agenda.impl.EVENTImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.univ.nantes.master.dsl.agenda.impl.EVENTImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link org.xtext.univ.nantes.master.dsl.agenda.impl.EVENTImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.xtext.univ.nantes.master.dsl.agenda.impl.EVENTImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.xtext.univ.nantes.master.dsl.agenda.impl.EVENTImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EVENTImpl extends MinimalEObjectImpl.Container implements EVENT
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
   * The default value of the '{@link #getPlace() <em>Place</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlace()
   * @generated
   * @ordered
   */
  protected static final String PLACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPlace() <em>Place</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlace()
   * @generated
   * @ordered
   */
  protected String place = PLACE_EDEFAULT;

  /**
   * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected static final String DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected String date = DATE_EDEFAULT;

  /**
   * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected static final String START_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected String start = START_EDEFAULT;

  /**
   * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected static final String END_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected String end = END_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EVENTImpl()
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
    return AgendaPackage.Literals.EVENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AgendaPackage.EVENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPlace()
  {
    return place;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlace(String newPlace)
  {
    String oldPlace = place;
    place = newPlace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgendaPackage.EVENT__PLACE, oldPlace, place));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDate()
  {
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDate(String newDate)
  {
    String oldDate = date;
    date = newDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgendaPackage.EVENT__DATE, oldDate, date));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStart()
  {
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStart(String newStart)
  {
    String oldStart = start;
    start = newStart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgendaPackage.EVENT__START, oldStart, start));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd(String newEnd)
  {
    String oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgendaPackage.EVENT__END, oldEnd, end));
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
      case AgendaPackage.EVENT__NAME:
        return getName();
      case AgendaPackage.EVENT__PLACE:
        return getPlace();
      case AgendaPackage.EVENT__DATE:
        return getDate();
      case AgendaPackage.EVENT__START:
        return getStart();
      case AgendaPackage.EVENT__END:
        return getEnd();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AgendaPackage.EVENT__NAME:
        setName((String)newValue);
        return;
      case AgendaPackage.EVENT__PLACE:
        setPlace((String)newValue);
        return;
      case AgendaPackage.EVENT__DATE:
        setDate((String)newValue);
        return;
      case AgendaPackage.EVENT__START:
        setStart((String)newValue);
        return;
      case AgendaPackage.EVENT__END:
        setEnd((String)newValue);
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
      case AgendaPackage.EVENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AgendaPackage.EVENT__PLACE:
        setPlace(PLACE_EDEFAULT);
        return;
      case AgendaPackage.EVENT__DATE:
        setDate(DATE_EDEFAULT);
        return;
      case AgendaPackage.EVENT__START:
        setStart(START_EDEFAULT);
        return;
      case AgendaPackage.EVENT__END:
        setEnd(END_EDEFAULT);
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
      case AgendaPackage.EVENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AgendaPackage.EVENT__PLACE:
        return PLACE_EDEFAULT == null ? place != null : !PLACE_EDEFAULT.equals(place);
      case AgendaPackage.EVENT__DATE:
        return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
      case AgendaPackage.EVENT__START:
        return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
      case AgendaPackage.EVENT__END:
        return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
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
    result.append(", place: ");
    result.append(place);
    result.append(", date: ");
    result.append(date);
    result.append(", start: ");
    result.append(start);
    result.append(", end: ");
    result.append(end);
    result.append(')');
    return result.toString();
  }

} //EVENTImpl