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

	public static void main(String[] args) {
		// do this only once per application
		Injector injector = new AgendaStandaloneSetup().createInjectorAndDoEMFRegistration();
		 
		// obtain a resourceset from the injector
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		 
		// load a resource by URI, in this case from the file system
		Resource resource = resourceSet.getResource(URI.createFileURI("./src/monAgenda.agenda"), true);

		//listes des événements
		List<EObject> events = new ArrayList<EObject>();

		//listes des tâches
		List<EObject> tasks = new ArrayList<EObject>();
		
		EObject preambule = null;
		
		TreeIterator<EObject> it = resource.getAllContents();
		while(it.hasNext()) {
			EObject object = it.next();
			for (EObject objectInterne : object.eContents()) {
				if(objectInterne.eClass().getName().equals("TASK")){
					tasks.add(objectInterne);
				}else if(objectInterne.eClass().getName().equals("EVENT")){
					events.add(objectInterne);
				}else if(objectInterne.eClass().getName().equals("PREAMBULE")){
					preambule = objectInterne;
				}
//					System.out.println(objectInterne.toString());
			}
		}
		String nameAgenda = (String) preambule.eGet(preambule.eClass().getEStructuralFeature("name"));
		System.out.println(nameAgenda);
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
		
		EObject content = obj.eContents().get(0);

		feature = content.eClass().getEStructuralFeature("place");
		place = (feature != null ? (String) content.eGet(feature) : "");

		feature = content.eClass().getEStructuralFeature("date");
		date = (feature != null ? (String) content.eGet(feature) : "");

		feature = content.eClass().getEStructuralFeature("start");
		start = (feature != null ? (String) content.eGet(feature) : "");

		feature = content.eClass().getEStructuralFeature("end");
		end = (feature != null ? (String) content.eGet(feature) : "");

		return name+" - place : "+place+", date : "+date+", start : "+start+", end : "+end+".";
		
	}
	
	//Fonction permettant de décrire une tâche
	public static String toStringTask(EObject obj){
		String name, deadline, relatesTo = "";
		EStructuralFeature feature;
		feature = obj.eClass().getEStructuralFeature("name");
		name = (feature != null ? (String) obj.eGet(feature) : "");

		feature = obj.eClass().getEStructuralFeature("nameEvent");
		EObject objRef = (EObject) obj.eGet(feature);
		
		feature = objRef.eClass().getEStructuralFeature("name");
		relatesTo = (feature != null ? (String) objRef.eGet(feature) : "");
		
		feature = obj.eClass().getEStructuralFeature("deadline");
		deadline = (feature != null ? (String) obj.eGet(feature) : "");
		
		return name+" - relatesTo : "+relatesTo+", deadline : "+deadline+".";
	}

}
