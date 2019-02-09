package com.vee.petclinic;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

@Route
@Theme(value = Lumo.class)
@PWA(name = "Vaadin Pet Clinic", shortName = "Pet Clinic")
public class MainView extends FlexLayout implements RouterLayout {
	
	private static final long serialVersionUID = 1L;
	
	public MainView() {
		add(new Label("Pet Clinic !!"));
	}
	
}
