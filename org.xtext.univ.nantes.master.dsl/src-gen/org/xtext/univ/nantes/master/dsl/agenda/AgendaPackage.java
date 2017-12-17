/**
 * generated by Xtext 2.10.0
 */
package org.xtext.univ.nantes.master.dsl.agenda;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.xtext.univ.nantes.master.dsl.agenda.AgendaFactory
 * @model kind="package"
 * @generated
 */
public interface AgendaPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "agenda";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/univ/nantes/master/dsl/Agenda";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "agenda";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AgendaPackage eINSTANCE = org.xtext.univ.nantes.master.dsl.agenda.impl.AgendaPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.univ.nantes.master.dsl.agenda.impl.AGENDAImpl <em>AGENDA</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.univ.nantes.master.dsl.agenda.impl.AGENDAImpl
   * @see org.xtext.univ.nantes.master.dsl.agenda.impl.AgendaPackageImpl#getAGENDA()
   * @generated
   */
  int AGENDA = 0;

  /**
   * The feature id for the '<em><b>Pream</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENDA__PREAM = 0;

  /**
   * The feature id for the '<em><b>Contenu</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENDA__CONTENU = 1;

  /**
   * The number of structural features of the '<em>AGENDA</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENDA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.univ.nantes.master.dsl.agenda.impl.PREAMBULEImpl <em>PREAMBULE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.univ.nantes.master.dsl.agenda.impl.PREAMBULEImpl
   * @see org.xtext.univ.nantes.master.dsl.agenda.impl.AgendaPackageImpl#getPREAMBULE()
   * @generated
   */
  int PREAMBULE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREAMBULE__NAME = 0;

  /**
   * The number of structural features of the '<em>PREAMBULE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREAMBULE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.univ.nantes.master.dsl.agenda.impl.CONTENUImpl <em>CONTENU</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.univ.nantes.master.dsl.agenda.impl.CONTENUImpl
   * @see org.xtext.univ.nantes.master.dsl.agenda.impl.AgendaPackageImpl#getCONTENU()
   * @generated
   */
  int CONTENU = 2;

  /**
   * The feature id for the '<em><b>Desc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENU__DESC = 0;

  /**
   * The feature id for the '<em><b>Evta</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENU__EVTA = 1;

  /**
   * The number of structural features of the '<em>CONTENU</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENU_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.univ.nantes.master.dsl.agenda.impl.DESCRIPTIONImpl <em>DESCRIPTION</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.univ.nantes.master.dsl.agenda.impl.DESCRIPTIONImpl
   * @see org.xtext.univ.nantes.master.dsl.agenda.impl.AgendaPackageImpl#getDESCRIPTION()
   * @generated
   */
  int DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__DESCRIPTION = 0;

  /**
   * The number of structural features of the '<em>DESCRIPTION</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.univ.nantes.master.dsl.agenda.impl.EVENTS_OR_TASKSImpl <em>EVENTS OR TASKS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.univ.nantes.master.dsl.agenda.impl.EVENTS_OR_TASKSImpl
   * @see org.xtext.univ.nantes.master.dsl.agenda.impl.AgendaPackageImpl#getEVENTS_OR_TASKS()
   * @generated
   */
  int EVENTS_OR_TASKS = 4;

  /**
   * The feature id for the '<em><b>Event or task</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENTS_OR_TASKS__EVENT_OR_TASK = 0;

  /**
   * The number of structural features of the '<em>EVENTS OR TASKS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENTS_OR_TASKS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.univ.nantes.master.dsl.agenda.impl.EVENTImpl <em>EVENT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.univ.nantes.master.dsl.agenda.impl.EVENTImpl
   * @see org.xtext.univ.nantes.master.dsl.agenda.impl.AgendaPackageImpl#getEVENT()
   * @generated
   */
  int EVENT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Content event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__CONTENT_EVENT = 1;

  /**
   * The number of structural features of the '<em>EVENT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.univ.nantes.master.dsl.agenda.impl.CONTENT_EVENTImpl <em>CONTENT EVENT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.univ.nantes.master.dsl.agenda.impl.CONTENT_EVENTImpl
   * @see org.xtext.univ.nantes.master.dsl.agenda.impl.AgendaPackageImpl#getCONTENT_EVENT()
   * @generated
   */
  int CONTENT_EVENT = 6;

  /**
   * The feature id for the '<em><b>Place</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_EVENT__PLACE = 0;

  /**
   * The feature id for the '<em><b>Data</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_EVENT__DATA = 1;

  /**
   * The feature id for the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_EVENT__START = 2;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_EVENT__END = 3;

  /**
   * The number of structural features of the '<em>CONTENT EVENT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_EVENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.univ.nantes.master.dsl.agenda.impl.TASKImpl <em>TASK</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.univ.nantes.master.dsl.agenda.impl.TASKImpl
   * @see org.xtext.univ.nantes.master.dsl.agenda.impl.AgendaPackageImpl#getTASK()
   * @generated
   */
  int TASK = 7;

  /**
   * The feature id for the '<em><b>Event or task</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__EVENT_OR_TASK = EVENTS_OR_TASKS__EVENT_OR_TASK;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__NAME = EVENTS_OR_TASKS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__NAME_EVENT = EVENTS_OR_TASKS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Deadline</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__DEADLINE = EVENTS_OR_TASKS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>TASK</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = EVENTS_OR_TASKS_FEATURE_COUNT + 3;


  /**
   * Returns the meta object for class '{@link org.xtext.univ.nantes.master.dsl.agenda.AGENDA <em>AGENDA</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AGENDA</em>'.
   * @see org.xtext.univ.nantes.master.dsl.agenda.AGENDA
   * @generated
   */
  EClass getAGENDA();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.univ.nantes.master.dsl.agenda.AGENDA#getPream <em>Pream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pream</em>'.
   * @see org.xtext.univ.nantes.master.dsl.agenda.AGENDA#getPream()
   * @see #getAGENDA()
   * @generated
   */
  EReference getAGENDA_Pream();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.univ.nantes.master.dsl.agenda.AGENDA#getContenu <em>Contenu</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Contenu</em>'.
   * @see org.xtext.univ.nantes.master.dsl.agenda.AGENDA#getContenu()
   * @see #getAGENDA()
   * @generated
   */
  EReference getAGENDA_Contenu();

  /**
   * Returns the meta object for class '{@link org.xtext.univ.nantes.master.dsl.agenda.PREAMBULE <em>PREAMBULE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PREAMBULE</em>'.
   * @see org.xtext.univ.nantes.master.dsl.agenda.PREAMBULE
   * @generated
   */
  EClass getPREAMBULE();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.univ.nantes.master.dsl.agenda.PREAMBULE#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.univ.nantes.master.dsl.agenda.PREAMBULE#getName()
   * @see #getPREAMBULE()
   * @generated
   */
  EAttribute getPREAMBULE_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.univ.nantes.master.dsl.agenda.CONTENU <em>CONTENU</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CONTENU</em>'.
   * @see org.xtext.univ.nantes.master.dsl.agenda.CONTENU
   * @generated
   */
  EClass getCONTENU();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.univ.nantes.master.dsl.agenda.CONTENU#getDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Desc</em>'.
   * @see org.xtext.univ.nantes.master.dsl.agenda.CONTENU#getDesc()
   * @see #getCONTENU()
   * @generated
   */
  EReference getCONTENU_Desc();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.univ.nantes.master.dsl.agenda.CONTENU#getEvta <em>Evta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Evta</em>'.
   * @see org.xtext.univ.nantes.master.dsl.agenda.CONTENU#getEvta()
   * @see #getCONTENU()
   * @generated
   */
  EReference getCONTENU_Evta();

  /**
   * Returns the meta object for class '{@link org.xtext.univ.nantes.master.dsl.agenda.DESCRIPTION <em>DESCRIPTION</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DESCRIPTION</em>'.
   * @see org.xtext.univ.nantes.master.dsl.agenda.DESCRIPTION
   * @generated
   */
  EClass getDESCRIPTION();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.univ.nantes.master.dsl.agenda.DESCRIPTION#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.univ.nantes.master.dsl.agenda.DESCRIPTION#getDescription()
   * @see #getDESCRIPTION()
   * @generated
   */
  EAttribute getDESCRIPTION_Description();

  /**
   * Returns the meta object for class '{@link org.xtext.univ.nantes.master.dsl.agenda.EVENTS_OR_TASKS <em>EVENTS OR TASKS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EVENTS OR TASKS</em>'.
   * @see org.xtext.univ.nantes.master.dsl.agenda.EVENTS_OR_TASKS
   * @generated
   */
  EClass getEVENTS_OR_TASKS();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.univ.nantes.master.dsl.agenda.EVENTS_OR_TASKS#getEvent_or_task <em>Event or task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Event or task</em>'.
   * @see org.xtext.univ.nantes.master.dsl.agenda.EVENTS_OR_TASKS#getEvent_or_task()
   * @see #getEVENTS_OR_TASKS()
   * @generated
   */
  EReference getEVENTS_OR_TASKS_Event_or_task();

  /**
   * Returns the meta object for class '{@link org.xtext.univ.nantes.master.dsl.agenda.EVENT <em>EVENT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EVENT</em>'.
   * @see org.xtext.univ.nantes.master.dsl.agenda.EVENT
   * @generated
   */
  EClass getEVENT();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.univ.nantes.master.dsl.agenda.EVENT#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.univ.nantes.master.dsl.agenda.EVENT#getName()
   * @see #getEVENT()
   * @generated
   */
  EAttribute getEVENT_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.univ.nantes.master.dsl.agenda.EVENT#getContent_event <em>Content event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Content event</em>'.
   * @see org.xtext.univ.nantes.master.dsl.agenda.EVENT#getContent_event()
   * @see #getEVENT()
   * @generated
   */
  EReference getEVENT_Content_event();

  /**
   * Returns the meta object for class '{@link org.xtext.univ.nantes.master.dsl.agenda.CONTENT_EVENT <em>CONTENT EVENT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CONTENT EVENT</em>'.
   * @see org.xtext.univ.nantes.master.dsl.agenda.CONTENT_EVENT
   * @generated
   */
  EClass getCONTENT_EVENT();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.univ.nantes.master.dsl.agenda.CONTENT_EVENT#getPlace <em>Place</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Place</em>'.
   * @see org.xtext.univ.nantes.master.dsl.agenda.CONTENT_EVENT#getPlace()
   * @see #getCONTENT_EVENT()
   * @generated
   */
  EAttribute getCONTENT_EVENT_Place();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.univ.nantes.master.dsl.agenda.CONTENT_EVENT#getData <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Data</em>'.
   * @see org.xtext.univ.nantes.master.dsl.agenda.CONTENT_EVENT#getData()
   * @see #getCONTENT_EVENT()
   * @generated
   */
  EAttribute getCONTENT_EVENT_Data();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.univ.nantes.master.dsl.agenda.CONTENT_EVENT#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start</em>'.
   * @see org.xtext.univ.nantes.master.dsl.agenda.CONTENT_EVENT#getStart()
   * @see #getCONTENT_EVENT()
   * @generated
   */
  EAttribute getCONTENT_EVENT_Start();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.univ.nantes.master.dsl.agenda.CONTENT_EVENT#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End</em>'.
   * @see org.xtext.univ.nantes.master.dsl.agenda.CONTENT_EVENT#getEnd()
   * @see #getCONTENT_EVENT()
   * @generated
   */
  EAttribute getCONTENT_EVENT_End();

  /**
   * Returns the meta object for class '{@link org.xtext.univ.nantes.master.dsl.agenda.TASK <em>TASK</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TASK</em>'.
   * @see org.xtext.univ.nantes.master.dsl.agenda.TASK
   * @generated
   */
  EClass getTASK();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.univ.nantes.master.dsl.agenda.TASK#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.univ.nantes.master.dsl.agenda.TASK#getName()
   * @see #getTASK()
   * @generated
   */
  EAttribute getTASK_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.univ.nantes.master.dsl.agenda.TASK#getNameEvent <em>Name Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name Event</em>'.
   * @see org.xtext.univ.nantes.master.dsl.agenda.TASK#getNameEvent()
   * @see #getTASK()
   * @generated
   */
  EReference getTASK_NameEvent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.univ.nantes.master.dsl.agenda.TASK#getDeadline <em>Deadline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deadline</em>'.
   * @see org.xtext.univ.nantes.master.dsl.agenda.TASK#getDeadline()
   * @see #getTASK()
   * @generated
   */
  EAttribute getTASK_Deadline();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AgendaFactory getAgendaFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.univ.nantes.master.dsl.agenda.impl.AGENDAImpl <em>AGENDA</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.univ.nantes.master.dsl.agenda.impl.AGENDAImpl
     * @see org.xtext.univ.nantes.master.dsl.agenda.impl.AgendaPackageImpl#getAGENDA()
     * @generated
     */
    EClass AGENDA = eINSTANCE.getAGENDA();

    /**
     * The meta object literal for the '<em><b>Pream</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENDA__PREAM = eINSTANCE.getAGENDA_Pream();

    /**
     * The meta object literal for the '<em><b>Contenu</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENDA__CONTENU = eINSTANCE.getAGENDA_Contenu();

    /**
     * The meta object literal for the '{@link org.xtext.univ.nantes.master.dsl.agenda.impl.PREAMBULEImpl <em>PREAMBULE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.univ.nantes.master.dsl.agenda.impl.PREAMBULEImpl
     * @see org.xtext.univ.nantes.master.dsl.agenda.impl.AgendaPackageImpl#getPREAMBULE()
     * @generated
     */
    EClass PREAMBULE = eINSTANCE.getPREAMBULE();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREAMBULE__NAME = eINSTANCE.getPREAMBULE_Name();

    /**
     * The meta object literal for the '{@link org.xtext.univ.nantes.master.dsl.agenda.impl.CONTENUImpl <em>CONTENU</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.univ.nantes.master.dsl.agenda.impl.CONTENUImpl
     * @see org.xtext.univ.nantes.master.dsl.agenda.impl.AgendaPackageImpl#getCONTENU()
     * @generated
     */
    EClass CONTENU = eINSTANCE.getCONTENU();

    /**
     * The meta object literal for the '<em><b>Desc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENU__DESC = eINSTANCE.getCONTENU_Desc();

    /**
     * The meta object literal for the '<em><b>Evta</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENU__EVTA = eINSTANCE.getCONTENU_Evta();

    /**
     * The meta object literal for the '{@link org.xtext.univ.nantes.master.dsl.agenda.impl.DESCRIPTIONImpl <em>DESCRIPTION</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.univ.nantes.master.dsl.agenda.impl.DESCRIPTIONImpl
     * @see org.xtext.univ.nantes.master.dsl.agenda.impl.AgendaPackageImpl#getDESCRIPTION()
     * @generated
     */
    EClass DESCRIPTION = eINSTANCE.getDESCRIPTION();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPTION__DESCRIPTION = eINSTANCE.getDESCRIPTION_Description();

    /**
     * The meta object literal for the '{@link org.xtext.univ.nantes.master.dsl.agenda.impl.EVENTS_OR_TASKSImpl <em>EVENTS OR TASKS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.univ.nantes.master.dsl.agenda.impl.EVENTS_OR_TASKSImpl
     * @see org.xtext.univ.nantes.master.dsl.agenda.impl.AgendaPackageImpl#getEVENTS_OR_TASKS()
     * @generated
     */
    EClass EVENTS_OR_TASKS = eINSTANCE.getEVENTS_OR_TASKS();

    /**
     * The meta object literal for the '<em><b>Event or task</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENTS_OR_TASKS__EVENT_OR_TASK = eINSTANCE.getEVENTS_OR_TASKS_Event_or_task();

    /**
     * The meta object literal for the '{@link org.xtext.univ.nantes.master.dsl.agenda.impl.EVENTImpl <em>EVENT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.univ.nantes.master.dsl.agenda.impl.EVENTImpl
     * @see org.xtext.univ.nantes.master.dsl.agenda.impl.AgendaPackageImpl#getEVENT()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEVENT();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__NAME = eINSTANCE.getEVENT_Name();

    /**
     * The meta object literal for the '<em><b>Content event</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__CONTENT_EVENT = eINSTANCE.getEVENT_Content_event();

    /**
     * The meta object literal for the '{@link org.xtext.univ.nantes.master.dsl.agenda.impl.CONTENT_EVENTImpl <em>CONTENT EVENT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.univ.nantes.master.dsl.agenda.impl.CONTENT_EVENTImpl
     * @see org.xtext.univ.nantes.master.dsl.agenda.impl.AgendaPackageImpl#getCONTENT_EVENT()
     * @generated
     */
    EClass CONTENT_EVENT = eINSTANCE.getCONTENT_EVENT();

    /**
     * The meta object literal for the '<em><b>Place</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT_EVENT__PLACE = eINSTANCE.getCONTENT_EVENT_Place();

    /**
     * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT_EVENT__DATA = eINSTANCE.getCONTENT_EVENT_Data();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT_EVENT__START = eINSTANCE.getCONTENT_EVENT_Start();

    /**
     * The meta object literal for the '<em><b>End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT_EVENT__END = eINSTANCE.getCONTENT_EVENT_End();

    /**
     * The meta object literal for the '{@link org.xtext.univ.nantes.master.dsl.agenda.impl.TASKImpl <em>TASK</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.univ.nantes.master.dsl.agenda.impl.TASKImpl
     * @see org.xtext.univ.nantes.master.dsl.agenda.impl.AgendaPackageImpl#getTASK()
     * @generated
     */
    EClass TASK = eINSTANCE.getTASK();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__NAME = eINSTANCE.getTASK_Name();

    /**
     * The meta object literal for the '<em><b>Name Event</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__NAME_EVENT = eINSTANCE.getTASK_NameEvent();

    /**
     * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__DEADLINE = eINSTANCE.getTASK_Deadline();

  }

} //AgendaPackage
