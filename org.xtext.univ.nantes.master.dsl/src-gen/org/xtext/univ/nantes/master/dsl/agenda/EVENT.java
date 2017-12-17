/**
 * generated by Xtext 2.10.0
 */
package org.xtext.univ.nantes.master.dsl.agenda;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EVENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.univ.nantes.master.dsl.agenda.EVENT#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.univ.nantes.master.dsl.agenda.EVENT#getContent_event <em>Content event</em>}</li>
 * </ul>
 *
 * @see org.xtext.univ.nantes.master.dsl.agenda.AgendaPackage#getEVENT()
 * @model
 * @generated
 */
public interface EVENT extends EObject
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
   * @see org.xtext.univ.nantes.master.dsl.agenda.AgendaPackage#getEVENT_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.univ.nantes.master.dsl.agenda.EVENT#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Content event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content event</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content event</em>' containment reference.
   * @see #setContent_event(CONTENT_EVENT)
   * @see org.xtext.univ.nantes.master.dsl.agenda.AgendaPackage#getEVENT_Content_event()
   * @model containment="true"
   * @generated
   */
  CONTENT_EVENT getContent_event();

  /**
   * Sets the value of the '{@link org.xtext.univ.nantes.master.dsl.agenda.EVENT#getContent_event <em>Content event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content event</em>' containment reference.
   * @see #getContent_event()
   * @generated
   */
  void setContent_event(CONTENT_EVENT value);

} // EVENT