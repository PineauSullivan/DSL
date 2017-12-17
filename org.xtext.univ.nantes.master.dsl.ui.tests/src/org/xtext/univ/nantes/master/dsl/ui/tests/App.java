package org.xtext.univ.nantes.master.dsl.ui.tests;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtext.univ.nantes.master.dsl.AgendaStandaloneSetup;

import com.google.inject.Injector;

public class App {

	public static List<EObject> agendas = new ArrayList<EObject>();

	public static void main(String[] args) {
		//listes des agendas
		
		//Charge monAgenda1.agenda
		AjoutAgenda("./src/monAgenda1.agenda");
		//Charge monAgenda2.agenda
		AjoutAgenda("./src/monAgenda2.agenda");
		//Charge monAgenda3.agenda
		AjoutAgenda("./src/monAgenda3.agenda");
		//Charge monAgenda4.agenda
		AjoutAgenda("./src/monAgenda4.agenda");
		//Charge monAgenda5.agenda
		AjoutAgenda("./src/monAgenda5.agenda");

		
		for(EObject agenda : agendas){
			affichageAgenda(agenda);
		}
	}

	public static void AjoutAgenda(String namefile){
		// do this only once per application
		Injector injector = new AgendaStandaloneSetup().createInjectorAndDoEMFRegistration();
		 
		// obtain a resourceset from the injector
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		 
		// load a resource by URI, in this case from the file system
		Resource resource = resourceSet.getResource(URI.createFileURI(namefile), true);;
		
		TreeIterator<EObject> its = resource.getAllContents();
		while(its.hasNext()) {
			EObject object = its.next();
			for (EObject objectInterne : object.eContents()) {
				if(objectInterne.eClass().getName().equals("AGENDA")){
					agendas.add(objectInterne);
				}
			}
		}
	}
	
	//Affichage d'un agenda
	public static void affichageAgenda(EObject agenda){
		//listes des événements
		List<EObject> events = new ArrayList<EObject>();

		//listes des tâches
		List<EObject> tasks = new ArrayList<EObject>();
		for (EObject objectInterne : agenda.eContents()) {
			if(objectInterne.eClass().getName().equals("TASK")){
				tasks.add(objectInterne);
			}else if(objectInterne.eClass().getName().equals("EVENT")){
				events.add(objectInterne);
			}
			//permet de tous afficher pour débugger
			//System.out.println(objectInterne.toString());
		}

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		String nameAgenda = (String) agenda.eGet(agenda.eClass().getEStructuralFeature("name"));
		System.out.println("Nom de l'agenda : "+nameAgenda);
		String descriptionAgenda = (String) agenda.eGet(agenda.eClass().getEStructuralFeature("description"));
		System.out.println("Description : "+descriptionAgenda);
		System.out.println("----------------------------------------");
		System.out.println();
	
		System.out.println("List "+events.size()+" events :");
		for(EObject obj:events){
			System.out.println(toStringEvent(obj));
		}
		System.out.println("----------------------------------------");
		System.out.println();
		
		
		System.out.println("List "+tasks.size()+" tasks :");
		for(EObject obj:tasks){
			System.out.println(toStringTask(obj));
		}
		System.out.println("----------------------------------------");
		System.out.println();

	}
	
	//Fonction permettant de décrire un événement
	public static String toStringEvent(EObject obj){
		String name, place, date, start, end;
		EStructuralFeature feature;
		
		feature = obj.eClass().getEStructuralFeature("name");
		name = (feature != null ? (String) obj.eGet(feature) : "");
		
		feature = obj.eClass().getEStructuralFeature("place");
		place = (feature != null ? (String) obj.eGet(feature) : "");

		feature = obj.eClass().getEStructuralFeature("date");
		date = (feature != null ? (String) obj.eGet(feature) : "");

		feature = obj.eClass().getEStructuralFeature("start");
		start = (feature != null ? (String) obj.eGet(feature) : "");

		feature = obj.eClass().getEStructuralFeature("end");
		end = (feature != null ? (String) obj.eGet(feature) : "");

		return name+" - place : "+place+", date : "+date+", start : "+start+", end : "+end+".";
		
	}
	
	//Fonction permettant de décrire une tâche
	public static String toStringTask(EObject obj){
		String name, deadline, relatesTo = "";
		EStructuralFeature feature;
		feature = obj.eClass().getEStructuralFeature("name");
		name = (feature != null ? (String) obj.eGet(feature) : "");

		feature = obj.eClass().getEStructuralFeature("refEvent");
		EObject objRef = (EObject) obj.eGet(feature);
		
		if(objRef!=null){
			feature = objRef.eClass().getEStructuralFeature("name");
			relatesTo = (feature != null ? (String) objRef.eGet(feature) : "");
		}else{
			relatesTo="Pas de référence";
		}
		
		feature = obj.eClass().getEStructuralFeature("deadline");
		deadline = (feature != null ? (String) obj.eGet(feature) : "");
		
		return name+" - relatesTo : "+relatesTo+", deadline : "+deadline+".";
	}

}
