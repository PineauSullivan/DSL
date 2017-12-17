/**
 * generated by Xtext 2.10.0
 */
package org.xtext.univ.nantes.master.dsl.agenda;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TASK</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.univ.nantes.master.dsl.agenda.TASK#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.univ.nantes.master.dsl.agenda.TASK#getRefEvent <em>Ref Event</em>}</li>
 *   <li>{@link org.xtext.univ.nantes.master.dsl.agenda.TASK#getDeadline <em>Deadline</em>}</li>
 * </ul>
 *
 * @see org.xtext.univ.nantes.master.dsl.agenda.AgendaPackage#getTASK()
 * @model
 * @generated
 */
public interface TASK extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.univ.nantes.master.dsl.agenda.AgendaPackage#getTASK_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.univ.nantes.master.dsl.agenda.TASK#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Ref Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Event</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Event</em>' reference.
   * @see #setRefEvent(EVENT)
   * @see org.xtext.univ.nantes.master.dsl.agenda.AgendaPackage#getTASK_RefEvent()
   * @model
   * @generated
   */
  EVENT getRefEvent();

  /**
   * Sets the value of the '{@link org.xtext.univ.nantes.master.dsl.agenda.TASK#getRefEvent <em>Ref Event</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Event</em>' reference.
   * @see #getRefEvent()
   * @generated
   */
  void setRefEvent(EVENT value);

  /**
   * Returns the value of the '<em><b>Deadline</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deadline</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deadline</em>' attribute.
   * @see #setDeadline(String)
   * @see org.xtext.univ.nantes.master.dsl.agenda.AgendaPackage#getTASK_Deadline()
   * @model
   * @generated
   */
  String getDeadline();

  /**
   * Sets the value of the '{@link org.xtext.univ.nantes.master.dsl.agenda.TASK#getDeadline <em>Deadline</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deadline</em>' attribute.
   * @see #getDeadline()
   * @generated
   */
  void setDeadline(String value);

} // TASK