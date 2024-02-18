package com.company.sample2.view.legalperson

import com.company.sample2.entity.LegalPerson
import com.company.sample2.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.*

@Route(value = "legalPersons", layout = MainView::class)
@ViewController("LegalPerson.list")
@ViewDescriptor("legal-person-list-view.xml")
@LookupComponent("legalPersonsDataGrid")
@DialogMode(width = "64em")
class LegalPersonListView : StandardListView<LegalPerson>() {
}
